/*
 	����� ������ Ŭ���� ==> open class
 	����� �޾Ƽ� �Լ��� ������ ==> ��ӳ��� Ŭ���� open fun
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

	// Ŭ���� �ȿ� function�� ����
	fun dataPrint() {
		name="ȫ�浿"
		sex="����"
		addr="����"
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