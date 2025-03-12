package advanced_java;

class A
{
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	//static for class only can be used in inner class
//	class B
//	{
//		public void config()
//		{
//			System.out.println("in config");
//		}
//	}
	
	static class B
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
}


class  Demo{
    public static void main(String[] args) {
    	A obj=new A();
    	obj.show();
    	
//    	A.B obj1=obj.new B();
//    	obj1.config();
    	
        //First A object than B object
    	A.B obj1=new A.B();
    	obj1.config();

    }
}
