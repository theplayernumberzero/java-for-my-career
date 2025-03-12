package advanced_java;

//Every method is public abstract
//interface extends interface
interface A
{
//	public abstract void show();
//	public abstract void config();
	int age=23;            // all variables final and static 
	String area="Sivas";
	
	void show();
	void config();
}

class B implements A
{
	public void show()
	{
		System.out.println("in show");
	}
	public void config()
	{
		System.out.println("in cofing");
	}
}

class Demo {
    public static void main(String[] args) {

    	A obj;
    	obj=new B();
    	
    	obj.show();
    	obj.config();
    	
 //   	A.area="Hyderabad";
    	
    	System.out.println(A.area);
        
    }
}
