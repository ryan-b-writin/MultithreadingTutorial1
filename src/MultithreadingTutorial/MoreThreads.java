package MultithreadingTutorial;

public class MoreThreads {

	public static void main(String[] args) {
		System.out.println("main thread starting");
		
		MyThread mt1 = MyThread.createAndStart("child #1");
		MyThread mt2 = MyThread.createAndStart("child #2");
		MyThread mt3 = MyThread.createAndStart("child #3");
		
		for (int i=0; i < 50 ; i++) {
			System.out.println(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted");
			}
		}
		
		System.out.println("Main thread ending");

	}

}
