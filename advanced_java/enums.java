package advanced_java;

enum Status{
    //named constant
	Running, Failed, Pending, Success;
}

class Demo {
    public static void main(String[] args) {

    	int i=5;
//    	Status s= Status.Running;
//    	Status s= Status.Failed;
//    	Status s= Status.NoIdea;
//    	Status s= Status.Success;
    	
//    	System.out.println(s);
//    	System.out.println(s.ordinal());    Index no verir
    	
    	Status[] ss=Status.values();
    	System.out.println(ss); //Gives address
    	
    	for(Status s:ss)
    	{
    		System.out.println(s);  //value
    		System.out.println(s+" : "+s.ordinal());
    	}
    	
    	
        
    }
}