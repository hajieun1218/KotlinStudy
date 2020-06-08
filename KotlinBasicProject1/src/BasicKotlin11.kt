class AA {
	val a:String=""
	val b:String?=null
	val c:BB?=null
	// class 초기값 줄 때 null값을 주려면 앞에 ?를 붙여야한다
}

class BB {
	
}

fun main(args:Array<String>) {
	val foods:List<String> = listOf("사과","배","수박")
	for(f in foods) {
		println(f)
	}
	
	// 데이터형 생략 가능
	val foods2=mutableListOf("밥","국수","라면") 
	foods2.add("떡")
	foods2.removeAt(0)
	foods2[1]="생선"
	for(f in foods2) {
		println(f)
	}
}