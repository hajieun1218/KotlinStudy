/*
< 코틀린에서 사용하는 데이터형 >
 	1) 숫자형
 		정수
 			Byte (1byte => 8bit)
 			Short (2byte => 16bit)
 			Int (4byte => 32bit)
 			Long (8byte => 64bit)
 		실수
 			Double (64bit)
 			Float (32bit)
 	2) 문자형
 		문자 : Char => ''
 		문자열 : String => ""
 	3) 논리형
 		Boolean => true/false
 
 < 변수 설정 >
 	1) 상수
 		val
 	2) 변수
 		var
 	ex)
 		자바
 			int a=10;
			final int b=20;
 		==================
 		코틀린
 			var a=10
	 		var a:Int=10
	 		val b:Int=20
 			val b=20
 
 		코틀린 => front (javascript 중심)
 		var, val ==> 자동 변환 함수
 	
 	##### 배열
 		val numbers:Array<Int>=arrayOf(1,2,3,4,5)
 			=> numbers[0], ...
 
 < 연산자 >
 	산술연산자 (+,-,*,/,%)
 	논리연산자 (&&,||)
 	대입연산자 (=)
 	비교연산자 (==,!=,<,>,<=,>=)
 
 < 제어문 >
 < 함수 >
 < 클래스 >
 < 인터페이스 >
 */


// 메인함수
// public static void main(String[] args)
fun main(args:Array<String>) {
	val a:Int=100
	var b=200
	var c:Int
	c=300
	
	println("a=$a,b=$b,c=$c")
	
	var s:String="Hello Kotlin"
	var cc='A'
	var d=10.5
	var bb=true
	var f:Float=10.5f
	
	println("s=$s,cc=$cc,d=$d,bb=$bb,f=$f")
} 








