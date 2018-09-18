package aula_threads;

public class RunnableRacer implements Runnable {
	private String i;
	
	public RunnableRacer( String i)
	{ 
		this.i = i;
	}
	
	public void run()
	{
		for(int j = 0; j < 5; j++)
		{
			System.out.println("[Runnable] O corredor " + i + " está correndo. Vrruuuummmm");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
