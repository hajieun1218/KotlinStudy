class AA {
	val a:String=""
	val b:String?=null
	val c:BB?=null
	// class �ʱⰪ �� �� null���� �ַ��� �տ� ?�� �ٿ����Ѵ�
}

class BB {
	
}

fun main(args:Array<String>) {
	val foods:List<String> = listOf("���","��","����")
	for(f in foods) {
		println(f)
	}
	
	// �������� ���� ����
	val foods2=mutableListOf("��","����","���") 
	foods2.add("��")
	foods2.removeAt(0)
	foods2[1]="����"
	for(f in foods2) {
		println(f)
	}
}