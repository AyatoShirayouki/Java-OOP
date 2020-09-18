
public class Thread1 extends Thread{
	int time;
	
	public Thread1(int time) {
		//this.word = word;
		this.time = time;
	}
	
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("A: " + i);
			try {
				sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
