// 제어문 (if, if~else)

/*
 코틀린 특성
 1) 정적 타입 지정 언어   var a:Int=10, var a=10
 2) 간결성, 실용성, 안정성  ==> 자바 (JVM기반)
 3) 상호운영성 (호환이 좋다(자바 라이브러리를 import해서 사용할 수 있다))
 */

// import java.util.*

// 제어문
// if,when(switch),for,while
fun main(args:Array<String>) {
	/*var a=10
	var b=20
	var c=max(a,b)
	
	println("max=$c")
	
	var d=30
	var e=50
	var k=max1(d,e)
	
	println("max1=$k")*/
	
	var score=85
	var jumsu=hakjum(score)
	
	println("score=$score,jumsu=$jumsu 학점")
}

// fun 함수명(매개변수) => void 함수명(매개변수)
// fun 함수명(매개변수):데이터형 => 리턴형이 존재 
fun max(a:Int,b:Int):Int {
	var c:Int
	if(a>b)
		c=a
	else
		c=b
	return c
}


// 함수 => 변수와 같은 역할
fun max1(a:Int,b:Int):Int=if(a>b) a else b
fun max2(a:Int,b:Int)=if(a>b) a else b



fun hakjum(a:Int):Char {
	var c:Char='A'
	if(a>=90)
		c='A'
	else if(a>=80)
		c='B'
	else if(a>=70)
		c='C'
	else if(a>=60)
		c='D'
	else
		c='F'
	return c
}


