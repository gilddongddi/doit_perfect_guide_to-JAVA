//�پ��� �����ڸ� ����� �پ��� ��ü ���� ���
package sec03_constructor.EX02_ConstructorOverloading;

class A{
	A(){										//������ �����ε�
		System.out.println("ù ��° ������");
	}
	A(int a){
		System.out.println("�� ��° ������");
	}
	A(int a, int b){
		System.out.println("�� ��° ������");
	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(3);
		A a3 = new A(3,5);
	}
}