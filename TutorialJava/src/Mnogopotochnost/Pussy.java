package Mnogopotochnost;

import java.util.Random;

public class Pussy implements Runnable
{
	int time;
	String name;
	Random r = new Random();
	
	
public Pussy(String name)
{
	this.name = name;
	time = r.nextInt(6000);
}
	
	public void run() 
	{
		System.out.printf("����� %s ���� %d \n", name, time);
		try{
			Thread.sleep(time);
		}catch(Exception e){}
		System.out.printf("����� %s ��������� \n", name);
	
	}

}
