package core_java;

class Demo {
	public static void main(String[] args) 
	{
        //mutuable
		StringBuffer sb= new StringBuffer("Bahadır");
//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		sb.append(" Kılıç");
		System.out.println(sb);
		
//		String str=sb.toString();
		
//		sb.deleteCharAt(2);
//		sb.insert(0,"Java");
//		sb.insert(6,"java");
//		sb.setLength(30);
		sb.ensureCapacity(100);
		
		System.out.println(sb);
	
	}
}