// ��� (if, if~else)

/*
 ��Ʋ�� Ư��
 1) ���� Ÿ�� ���� ���   var a:Int=10, var a=10
 2) ���Ἲ, �ǿ뼺, ������  ==> �ڹ� (JVM���)
 3) ��ȣ��� (ȣȯ�� ����(�ڹ� ���̺귯���� import�ؼ� ����� �� �ִ�))
 */

// import java.util.*

// ���
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
	
	println("score=$score,jumsu=$jumsu ����")
}

// fun �Լ���(�Ű�����) => void �Լ���(�Ű�����)
// fun �Լ���(�Ű�����):�������� => �������� ���� 
fun max(a:Int,b:Int):Int {
	var c:Int
	if(a>b)
		c=a
	else
		c=b
	return c
}


// �Լ� => ������ ���� ����
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


