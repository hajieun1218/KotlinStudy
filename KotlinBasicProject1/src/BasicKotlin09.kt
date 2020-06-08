// 인터페이스

interface Runable{
	// 무조건 구현해야하는 함수
	fun run()
	
	// default 함수
	// 필요한 클래스에서만 구현을 할 수 있게
	fun test() {
		println("Runable:test() Call...")
	}
}

class Human:Runable {
	override fun run() {
		println("Human:run() Call...")
	}
}

class Human2:Runable {
	override fun run() {
		println("Human2:run() Call...")
	}
}

fun main(args:Array<String>) {
	var h=Human()
	h.run()
	h.test()
}