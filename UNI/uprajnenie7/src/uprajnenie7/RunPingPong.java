package uprajnenie7;

public class RunPingPong implements Runnable{
	String word;
	int time;
	
	public RunPingPong(String word, int time) {
		this.word = word;
		this.time = time;
	}
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(word);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		RunPingPong ping = new RunPingPong("Ping", 100);
		RunPingPong pong = new RunPingPong("\tPong", 100);
		
		//new Thread(ping).start();
		Thread t1 = new Thread(ping);
		t1.start();
		new Thread(pong).start();
	}

	

}
