// 랜덤, 형변환
// updown 게임

import java.util.*

// 코틀린 => 자바의 라이브러리를 필요시마다 변경 없이 사용 가능
/*
 함수
  = 리턴형이 있는 경우
 	fun 함수명(매개변수):데이터형{} => ():Int, ():String, ():Array, ...
  = 리턴형이 없는 경우
 	fun 함수명(매개변수){} => void
 */

fun main(args:Array<String>) {
	var temp=(Math.random()*100)+1
	var com=temp.toInt() // 형변환    toDouble(), toString()
//	println("com=$com") 
	
	var scan=Scanner(System.`in`)
	while(true) {
		print("1~100까지 정수 입력: ")
		var i=scan.nextInt()
		if(i<0 || i>100) {
			println("1~100 사이의 정수를 입력하세요!!")
			continue
		}
		
		if(i<com) {
			println("입력값보다 큰 값을 입력하세요")
		}
		else if(i>com) {
			println("입력값보다 작은 값을 입력하세요")
		}
		else {
			println("Game Over!!")
			break
		}
		
	}
}

