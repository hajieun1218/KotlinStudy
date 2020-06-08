interface A {
	fun a()
}

interface B {
	fun b()
}

open class C {
	open fun c() {
		println("C:c() Call...")
	}
}

open class D {
	// open안하면 있는 그대로 사용, open 하면 오버라이드 해서 수정 가능
	fun d() {
		println("D:d() Call...")
	}
}

// 클래스는 단일상속, 인터페이스는 다중상속 가능
class E:C(),A,B {
	override fun c() {
		println("E:c() Call...")
	}

	override fun a() {
		println("E:a() Call...")
	}

	override fun b() {
		println("E:b() Call...")
	}

}

fun main(args:Array<String>) {
	var e:E=E()
	e.c()
	e.a()
	e.b()
}