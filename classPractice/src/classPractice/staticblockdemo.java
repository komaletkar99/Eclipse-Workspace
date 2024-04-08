package classPractice;
class sbdemo{
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("Instance block ");
	}
}
public class staticblockdemo {
	public static void main(String[] args) {
		sbdemo sb=new sbdemo();
	}


}
