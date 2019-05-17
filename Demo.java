interface I{}
class A{}
class B extends A implements I{}
class Demo{
	public static void main(String []args){
	A a = new B(); //upcasting
	I i = new B(); // upcasting
	Object o = new B(); // upcasting

	 A obj = new A();
	 B b = (B)obj;// downcasting
	}
}