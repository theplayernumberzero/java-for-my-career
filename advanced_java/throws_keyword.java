package advanced_java;

class A
{// ducking exceptions
	public void show() throws ClassNotFoundException
	{
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}
		
		Class.forName("Calc");
	}
}

class throws_keyword {
	
	static {
		System.out.println("Class Loader");
	}
	
    public static void main(String[] args) {


    	A obj=new A();
    	try {
    		obj.show();
    	}catch(ClassNotFoundException e)
    	{
    		e.printStackTrace();	//Ne neyi çağırdı hiyerarşik verir
    	}
    	
    	
    }
}
