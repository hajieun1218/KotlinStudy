/*
	절차적 언어(function) ==> 객체지향 언어(class)
 
 1) 클래스 선언
 	= 매개변수가 없는 경우
 		(자바)
 		public class A {
			// public A() {}
		}
 		A a=new A()
 		
 		(코틀린)
 		class A {
			
		}
 		val a=A()
 
 		자바는 객체 생성시에 new를 사용한다
 		코틀린은 new를 사용하지 않는다
	 		List<String> list=new ArrayList<String>();
	 		var List=ArrayList<String>()
 
 	= 매개변수 존재
 		class A(var name:String)
 		var a=A("")
 		
 		class A {
			constructor(name:String) {
			}
 		}
 
 2) 객체 생성
 	var a=A("")
 
 3) 멤버변수의 초기화
 	(자바)
 	public class Sawon{
		private String name;
 		private String dept;
 		private String job;
 		public Sawon(String name,String dept,String job) {
			this.name=name;
 			this.dept=dept;
 			this.job=job;
		}
 		=> getter, setter
	}
 
 	(코틀린)
 	class Sawon(var name:String, var dept:String, var job:String) {
		
	}
 	var s:Sawon("홍길동","개발부","사원")
 	s.name="심청이"
	s.dept="영업부"
 	s.job="대리"
 
 	* 접근지정어
 		public : 모든 클래스에 접근 가능 (생략이 가능)
 			var a:String="" <-- public 생략
 		private : 자신의 클래스에서만 사용이 가능
 		protected : 상속 받은 클래스까지 사용이 가능
 		internal : 같은 모듈(폴더)안에 존재하는 모든 클래스에서 사용이 가능 
 
 4) VO만드는 방법
 5) 오버라이딩, 상속
 
 */

class Sawon {
	constructor(name:String, dept:String, job:String) { // 지역변수
		println("이름:"+name)
		println("부서:$dept")
		println("직위:$job")
	} 
}

class Sawon2(var name:String, var dept:String, var job:String) {} // 멤버변수

class Sawon3 {
	var name:String=""  // public 생략
	var dept:String=""
	var job:String=""
}

// main이 class안에 있지 않다
fun main(args:Array<String>) {
	var sa=Sawon("홍길동","개발부","사원")
	println("==================")
	var sa2=Sawon2("심청이","개발부","과장")
	println("이름:"+sa2.name)
	println("부서:"+sa2.dept)
	println("직위:"+sa2.job)
	println("==================")
	var sa3=Sawon3()
	sa3.name="춘향이"
	sa3.dept="개발부"
	sa3.job="대리"
	println("이름:"+sa3.name)
	println("부서:"+sa3.dept)
	println("직위:"+sa3.job)
	
}
