/*
< ��Ʋ������ ����ϴ� �������� >
 	1) ������
 		����
 			Byte (1byte => 8bit)
 			Short (2byte => 16bit)
 			Int (4byte => 32bit)
 			Long (8byte => 64bit)
 		�Ǽ�
 			Double (64bit)
 			Float (32bit)
 	2) ������
 		���� : Char => ''
 		���ڿ� : String => ""
 	3) ����
 		Boolean => true/false
 
 < ���� ���� >
 	1) ���
 		val
 	2) ����
 		var
 	ex)
 		�ڹ�
 			int a=10;
			final int b=20;
 		==================
 		��Ʋ��
 			var a=10
	 		var a:Int=10
	 		val b:Int=20
 			val b=20
 
 		��Ʋ�� => front (javascript �߽�)
 		var, val ==> �ڵ� ��ȯ �Լ�
 	
 	##### �迭
 		val numbers:Array<Int>=arrayOf(1,2,3,4,5)
 			=> numbers[0], ...
 
 < ������ >
 	��������� (+,-,*,/,%)
 	�������� (&&,||)
 	���Կ����� (=)
 	�񱳿����� (==,!=,<,>,<=,>=)
 
 < ��� >
 < �Լ� >
 < Ŭ���� >
 < �������̽� >
 */


// �����Լ�
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








