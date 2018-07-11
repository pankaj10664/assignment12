import java.util.*;

class Multithrd
{
	public static void main(String[] args) throws InterruptedException {
		task1 a = new task1();
		Thread t1 = new Thread(a);
		task2 b = new task2();
		Thread t2 = new Thread(b);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	}
}

class task1 implements Runnable
{

	int i = 1;
	@Override
	public void run() {
		while(i<=500)
		{
			System.out.println(i);
			i++;
		}
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println("Caught in exception");
		}
	}
	
}
class task2 implements Runnable
{

	int i = 501;
	public void run() {
		while(i <= 1000)
		{
			System.out.println(i);
			i++;
		}
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println("caught in exception");
		}
	}
	
}