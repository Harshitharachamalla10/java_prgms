package multithreaded_prgs;

public class NewThread implements Runnable {
	Thread t;
	void newthread() 
        {
	    t = new Thread(this,"My Thread");
	    t.start();
	}
	public void run()
        {
	    System.out.println(t.getName());
	}
	}


