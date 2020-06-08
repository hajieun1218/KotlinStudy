/*
 	상속을 내리는 클래스 ==> open class
 	상속을 받아서 함수를 재정의 ==> 상속내린 클래스 open fun
 */

open class Saram{
	var name:String=""
	var sex:String=""
	var addr:String=""
	
	open fun myData() {
		println("Saram: myData() Call...")
	}
}

class Member:Saram() {

	// 클래스 안에 function을 정의
	fun dataPrint() {
		name="홍길동"
		sex="남자"
		addr="서울"
	}
	
	override fun myData() {
		println("Member: myData() Call...")
	}
}

fun main(args:Array<String>) {
	var mem:Member=Member()
	mem.dataPrint()
	println(mem.name)
	println(mem.sex)
	println(mem.addr)
	mem.myData()
}