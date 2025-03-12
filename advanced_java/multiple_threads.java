package advanced_java;

class A extends Thread
{
    //run method called by start()
    //every thread have run() method
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hi");
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hello");
		}
	}
}

class Demo {
    public static void main(String[] args) throws NumberFormatException {   
        //not normal objects, they are threads
    	A obj1=new A();
    	B obj2=new B();
    	
//    	obj1.show();
//    	obj2.show();
    	
        //start new thread
    	obj1.start();
    	obj2.start();
    }
    
}
