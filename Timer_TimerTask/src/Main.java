import java.util.Timer;

public class Main {

	public static void main(String[] args) {
		
		MyTask timerTask = new MyTask();
		Timer timer = new Timer();
		
		//set an initial delay of 1 second,
		//repeat every half second.
		timer.schedule(timerTask, 1000, 500);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		timer.cancel();
		
	}

}
