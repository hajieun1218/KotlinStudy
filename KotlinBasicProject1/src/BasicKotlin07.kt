/*
	������ ���(function) ==> ��ü���� ���(class)
 
 1) Ŭ���� ����
 	= �Ű������� ���� ���
 		(�ڹ�)
 		public class A {
			// public A() {}
		}
 		A a=new A()
 		
 		(��Ʋ��)
 		class A {
			
		}
 		val a=A()
 
 		�ڹٴ� ��ü �����ÿ� new�� ����Ѵ�
 		��Ʋ���� new�� ������� �ʴ´�
	 		List<String> list=new ArrayList<String>();
	 		var List=ArrayList<String>()
 
 	= �Ű����� ����
 		class A(var name:String)
 		var a=A("")
 		
 		class A {
			constructor(name:String) {
			}
 		}
 
 2) ��ü ����
 	var a=A("")
 
 3) ��������� �ʱ�ȭ
 	(�ڹ�)
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
 
 	(��Ʋ��)
 	class Sawon(var name:String, var dept:String, var job:String) {
		
	}
 	var s:Sawon("ȫ�浿","���ߺ�","���")
 	s.name="��û��"
	s.dept="������"
 	s.job="�븮"
 
 	* ����������
 		public : ��� Ŭ������ ���� ���� (������ ����)
 			var a:String="" <-- public ����
 		private : �ڽ��� Ŭ���������� ����� ����
 		protected : ��� ���� Ŭ�������� ����� ����
 		internal : ���� ���(����)�ȿ� �����ϴ� ��� Ŭ�������� ����� ���� 
 
 4) VO����� ���
 5) �������̵�, ���
 
 */

class Sawon {
	constructor(name:String, dept:String, job:String) { // ��������
		println("�̸�:"+name)
		println("�μ�:$dept")
		println("����:$job")
	} 
}

class Sawon2(var name:String, var dept:String, var job:String) {} // �������

class Sawon3 {
	var name:String=""  // public ����
	var dept:String=""
	var job:String=""
}

// main�� class�ȿ� ���� �ʴ�
fun main(args:Array<String>) {
	var sa=Sawon("ȫ�浿","���ߺ�","���")
	println("==================")
	var sa2=Sawon2("��û��","���ߺ�","����")
	println("�̸�:"+sa2.name)
	println("�μ�:"+sa2.dept)
	println("����:"+sa2.job)
	println("==================")
	var sa3=Sawon3()
	sa3.name="������"
	sa3.dept="���ߺ�"
	sa3.job="�븮"
	println("�̸�:"+sa3.name)
	println("�μ�:"+sa3.dept)
	println("����:"+sa3.job)
	
}
