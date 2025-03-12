package advanced_java;

class Counter
{
	int count;
//	synchronized make sure increment called by only
//  one method a time
//  If t1 is working with t2 has to wait
	public synchronized void increment()
	{
		count++;
	}
}

class Demo {
    public static void main(String[] args) throws InterruptedException{   
    	
    	Counter c=new Counter();
    	
    	Runnable obj1=()->
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Runnable obj2=()->
    	{
//    		for(int i=1;i<=1000;i++)
    		for(int i=1;i<=10000;i++)
    		{
    			c.increment();
    		}
    	};
    	
    	Thread t1=new Thread(obj1);
    	Thread t2=new Thread(obj2);
    	 	
    	t1.start();
    	t2.start();
    	
        //Join waits main to finish threads
    	t1.join();
    	t2.join();
    	
    	System.out.println(c.count);
    }
}

    

