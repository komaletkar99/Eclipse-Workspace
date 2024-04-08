class display extends Thread{
	parent p;
	String name;
	public display(parent p, String name) {

		this.p = p;
		this.name = name;
	}
	@Override
	public void run() {
			p.show(name);
		
	}
	
	

}

class parent{
	public synchronized void show(String name){
	for(int i=0;i<5;i++) {
		System.out.print("good morning:" +" ");
		System.out.println(name);
	}
	
}
	
}
public class SynchronizationDemo {
	

	public static void main(String[] args) {
		parent p = new parent();
		display d = new display(p,"komal");
		display d1 = new display(p,"pallavi");
		d.start();
		d1.start();

	}

}
