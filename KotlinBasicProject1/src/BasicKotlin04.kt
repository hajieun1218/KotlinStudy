// for��, foreach��

fun main(args:Array<String>) {
	forTest5()
}

// for
// 1~10
fun forTest1() {
	for(i in 1..10)
		println("i=$i")
}

// 1~9 (10���� X)
fun forTest2() {
	for(i in 1 until(10))
		println("i=$i")
}

// 1~10 (2�� ����)
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
	var names=arrayOf("ȫ�浿","��û��","������","�ڹ���","�����")
	for(item in names) {
		println(item)
	}
}