package core_java;

class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}

class C extends A
{
	public void show()
	{
		System.out.println("in C show");
	}
}

class D
{
	
}


class Demo{
	public static void main(String[] args) {
//		A obj=new B();
//		obj.show();
		
        //We can collect subclass object in one variable with that way
        //Possible with inheritance
		A obj=new A();
		obj.show();
		
		obj=new B();
		obj.show();
		
		obj=new C();
		obj.show();
		
//		obj=new D();
		
//		Laptop obj1=new Laptop();
//		Computer obj1=new Laptop();
	
	}
}