// ����, ����ȯ
// updown ����

import java.util.*

// ��Ʋ�� => �ڹ��� ���̺귯���� �ʿ�ø��� ���� ���� ��� ����
/*
 �Լ�
  = �������� �ִ� ���
 	fun �Լ���(�Ű�����):��������{} => ():Int, ():String, ():Array, ...
  = �������� ���� ���
 	fun �Լ���(�Ű�����){} => void
 */

fun main(args:Array<String>) {
	var temp=(Math.random()*100)+1
	var com=temp.toInt() // ����ȯ    toDouble(), toString()
//	println("com=$com") 
	
	var scan=Scanner(System.`in`)
	while(true) {
		print("1~100���� ���� �Է�: ")
		var i=scan.nextInt()
		if(i<0 || i>100) {
			println("1~100 ������ ������ �Է��ϼ���!!")
			continue
		}
		
		if(i<com) {
			println("�Է°����� ū ���� �Է��ϼ���")
		}
		else if(i>com) {
			println("�Է°����� ���� ���� �Է��ϼ���")
		}
		else {
			println("Game Over!!")
			break
		}
		
	}
}

