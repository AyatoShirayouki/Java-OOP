
public class Thread2 extends Thread{
	int time;
	
	public Thread2(int time) {
		this.time = time;
	}
	
	//int realTime =  time + 5 * (time / 100);
	
	public void run() {
		for (int i = -1; i >= -20; i--) {
			System.out.print("    B: " + i + "\n");
			try {
				sleep(time + 5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
