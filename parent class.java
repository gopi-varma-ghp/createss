can I access parent class properties and behaviours using parent class reference ?
yes we can access parent class properties and behaviour using parent class reference in declare inside method or variable
package com.school1;
 class A {
	int a=10;
	public void method1() {
	System.out.println("parent");
	}
 }
class B extends  A {
	public void method2() {
		System.out.println("child 1");
	}
}
public class Parent{
	public static void main(String[] args) {
		A a=new A ();
		a.method1();
		
	}
	
	
	}
	





can I access parent class properties and behaviours using child class reference ?



package com.school1;
 class dog {
	int a=10;
	public void method1() {
	System.out.println("parent dog");
	}
 }
class puppy extends  dog {
	public void method2() {
		System.out.println("child 1");
	}
}
public class Parent{
	public static void main(String[] args) {
		dog puppy=new dog ();
		puppy.method1();
		
		
	}
	
	
	}
	

can I access parent class private properties and behaviours using parent class reference from child class ?
No we can't access parent class private properties using child class private classes can acess with in the class

package com.school1;
   class dog {
	int a=10;
	private void method1() {
	System.out.println("parent dog");
	}
 }
class puppy extends  dog {
	public void method2() {
		System.out.println("child 1");
	}
}
public class Parent{
	public static void main(String[] args) {
		dog dog =new dog ();
		dog .method1();
	}
}

can I access child class properties and behaviours using child class reference ?

  yes we can access it
package com.school1;
   class A {
	int a=10;
	void method1() {
	System.out.println("parent class ");
	}
 }
class  B extends A {
	public void method2() {
		System.out.println("child 1");
	}
}
public class Parent{
	public static void main(String[] args) {
		B b=new B();
		b .method1();
		System.out.println(b.a);
	}
}


can I access parent class properties and behaviours using child class reference ?

package com.school1;
   class A {
	int a=10;
	void method1() {
	System.out.println("parent class ");
	}
 }
class  B extends A {
	public void method2() {
		System.out.println("child 1");
	}
}
public class Parent{
	public static void main(String[] args) {
		A b=new A();
		b .method1();
		((B)b).method2(); downcasting////
		System.out.println(b.a);
	}
}

can I store child class object into parent class reference variable?
package com.school1;
   class A {
	int a=10;
	void method1() {
	System.out.println("parent class ");
	}
 }
class  B extends A {
	public void method2() {
		System.out.println("child 1");
	}
}
public class Parent{
	public static void main(String[] args) {
		b A=new b();
		A .method1();
		((B)A).method2();
		System.out.println(A.a);
	}
}

 
which keywords is use to make relation b/w classes to classes ? 
Extends keyword

  

 Types of inheritance in java
how many types of inheritance ? 
1. single inheritance
2.multiple inheritance
3.multilevel inheritance
4.herichical inheritance
5.hybrid inheritance


can i access  child classproperties and bheviour using parent class reference variable?
No 



package com.school1;
   class A {
	int a=10;
	void method1() {
	System.out.println("parent class ");
	}
 }
class  B extends A {
	public void method2() {
		System.out.println("child 1");
	}
}
public class Parent{
	public static void main(String[] args) {
		b A=new b();
		A obj = new B(); 
		A .method1();
		((B)A).method2();
		
	}
}
     
Any Possible ways to store parent class reference into child class reference ?






package com.school1;
class parent {
	int a=10;
	void method1() {
	System.out.println("parent class ");
	}
 }
class  child extends parent {
	public void method2() {
		System.out.println("child 1");
	}
}
public class Parent{
	public static void main(String[] args) {
		parent a=new child();
		child c=(child)a;
		a .method1();
		System.out.println(a.a);
	}
}































