// switch => when

fun main(args:Array<String>) {
	/*var sex=3
	var s=sexCheck(sex)
	
	println("s=$s")*/
	
	var i=3
	numberSelect(i)
}

fun sexCheck(sex:Int):String {
	var s:String=""
	when(sex) {
		1->s="남자"
		2->s="여자"
		3->s="남자"
		4->s="여자"
	}
	return s
}


fun numberSelect(a:Int) {
	when(a) {
		1->println("1을 선택")
		2,3->println("2와3을 선택")
		in 4..7->println("4~7까지 선택")
		// 8,9->println("8,9 선택")
		!in 1..7->println("8,9 선택")
	}
}