package uprajnenie7;

public class PingPong extends Thread {
	String word;
	int time;
	
	public PingPong(String word, int time) {
		this.word = word;
		this.time = time;
	}
	
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(word);
			try {
				sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new PingPong("ping", 100).start();
		new PingPong("\tPong", 100).start();
	}

}
