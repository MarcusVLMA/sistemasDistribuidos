package aula_threads;

public class ThreadRacer extends Thread {
	
	private String i;
	
	public ThreadRacer(String i)
	{
		this.i = i;
	}
	
	public void run()
	{
		while(true)
		{
			System.out.println("[Thread] O corredor " + i + " está correndo. Vrruuuummmm");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
