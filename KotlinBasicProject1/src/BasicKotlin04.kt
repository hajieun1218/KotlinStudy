// for문, foreach문

fun main(args:Array<String>) {
	forTest5()
}

// for
// 1~10
fun forTest1() {
	for(i in 1..10)
		println("i=$i")
}

// 1~9 (10포함 X)
fun forTest2() {
	for(i in 1 until(10))
		println("i=$i")
}

// 1~10 (2씩 증가)
fun forTest3() {
	for(i in 1..10 step(2))
		println("i=$i")
}

// 10~1 
// 10..1 (X)
fun forTest4() {
	for(i in 10 downTo(1))
		println("i=$i")
}



// forEach
fun forTest5() {
	var names=arrayOf("홍길동","심청이","춘향이","박문수","김두한")
	for(item in names) {
		println(item)
	}
}