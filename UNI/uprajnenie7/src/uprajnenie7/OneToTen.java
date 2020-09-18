package uprajnenie7;

public class OneToTen extends Thread {
	//String word;
	int time;
	
	public OneToTen(int time) {
		//this.word = word;
		this.time = time;
	}
	
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new OneToTen(1000).start();//tread priority: th.setPriority(), getPriority()

	}

}
