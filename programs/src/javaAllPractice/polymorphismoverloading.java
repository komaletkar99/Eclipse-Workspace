package javaAllPractice;

class parent1{
	public int add(int a, int b)
		{
			int sum=a+b;
			return sum;
		
			
	}
	public int add(int a, int c, int b)
	{
		int sum=a+b+c;
		return sum;
	
		
}
	
}
public class polymorphismoverloading {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent1 obj= new parent1();
			System.out.println(obj.add(10, 20));
			System.out.println(obj.add(10,20,30));
			
		

	}

}
