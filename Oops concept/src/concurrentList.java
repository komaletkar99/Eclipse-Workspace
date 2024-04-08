import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class concurrentList extends Thread {

	static CopyOnWriteArraySet hs = new CopyOnWriteArraySet();
	//static HashSet hs = new HashSet();

	@Override
	public void run() {
		hs.add(10);
		hs.add(null);
		System.out.println("child thread updating collection");

	}

	public static void main(String[] args) throws InterruptedException {
		hs.add("komal");
		hs.add(7889.90);
		hs.add("etkar");
		hs.add(null);
		
		concurrentList al = new concurrentList();
		al.start();
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()) {
			Object a1 = itr.next();
			Thread.sleep(2000);
			System.out.println("mani thread iterating collection: " + a1);
		}

		System.out.println("Final List : " + hs);
		
	}

}
