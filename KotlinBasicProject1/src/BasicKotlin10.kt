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
	// open���ϸ� �ִ� �״�� ���, open �ϸ� �������̵� �ؼ� ���� ����
	fun d() {
		println("D:d() Call...")
	}
}

// Ŭ������ ���ϻ��, �������̽��� ���߻�� ����
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