// static members flow using JVM( virtual OS)
// added some comments

class Test{
	static{
		Test.a = Test.fun();
	}
	static int a = 70;
	public static void main(String[] args) {
		System.out.println("inside main, a = "+Test.a); // 150
	}
	static{
		Test.a = Test.a + Test.fun();
	}
	static int fun(){
		Test.a= 50;
		return Test.fun1();
	}
	static int fun1(){
		System.out.println("inside fun1, a = "+Test.a);
		return Test.a + 30;
	}
/*	static int a= Test.fun();
	public static void main(String[] args) {
		System.out.println("inside main, a = "+Test.a);
	}
	static{
		System.out.println(" inside static block, a = "+ (a + fun1()) );
		a = a + 20;
	}
	static int fun(){
		a = a + 50;
		return Test.fun1();
	}
	static int fun1(){
		System.out.println( a );
		return a - 30;
	}
	
D:\codes>java Test
50
20
 inside static block, a = 10
inside main, a = 40

*/
	/*
	static{											// 1
		int a = 20; 
		Test.a = a + Test.a; // 20 + 0 = 20, so test.a is 20 
	}
	public static void main(String[] args) {		// 4
		int a = 20;
		a= Test.a + a;		// 60 + 20 = 80
		Test.a = a + Test.a; // 80 + 60 = 140
		System.out.println("a value is "+ Test.a );
	}
	static int a = 10;	// a=0;	during loadig		// 2 , now test.a is 10
	static{											// 3 , after execution of static block ,now a is 60
		Test.a = a + Test.a; // 10 + 10 = 20
		a = Test.a + a + a ; // 60
	}*/

	/*
	static{
		System.out.println(Test.a); // 0
		a= initialize(); // 200
	}
	static int a = 100; // 100 
	public static void main(String[] args) {
		System.out.println(Test.a); // 300
	}
	static{
		System.out.println(Test.a); // 100
		a= initialize(); // 300
	}
	static int initialize(){
		return a + 200;
	}
	// output-  0		100 	300	 */

}