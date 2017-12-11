package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_run th[] = new Thread_run[3];
		Thread_runnable th2[] = new Thread_runnable[3];
		for(int i = 1; i < 3; i++) {
		
		  th[i] = new Thread_run();
		  th[i].start();
		  th2[i] = new Thread_runnable();
		  th2[i].run();
		}
		/*try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		for(int i = 0; i < 10; i++) {
			System.out.println("main‚©‚ço—Í : " +i);
		}
	}

}
