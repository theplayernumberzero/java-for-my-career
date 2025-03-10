package core_java;

class Calculator
{
    //Same name with different number of parameter
	public int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
    //Same name with different type of parameter
	public double add(double n1, int n2)
	{
		return n1+n2;
	}
}


class Demo {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int r1=obj.add(3,4);
		System.out.println(r1);
	}
}