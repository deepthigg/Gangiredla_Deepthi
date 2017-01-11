import java.util.Scanner;
public class GameGun
{
	static int bulletCount;
	static int CLIPSIZE = 16;
	static int shotCount;
	static String [] clip;
	 
	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = new String [CLIPSIZE];
		resetClip();
		Scanner kb = new Scanner(System.in);
		
		while (bulletCount > 0 || shotCount > 0)
		System.out.println(" Action : ");
		String action = kb.nextLine();
		{
			if (action.equals("R"))
			{
				reload();
			}
			if (action.equals("S"))
			{
				System.out.println(shoot());

			}
			System.out.println( printClip());
			System.out.println("Out of Bullets");
	
		}
	
	}
	static void resetClip()
	{
		for(int i =0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
		
	}
	
	public static int shoot()
	{
		
		if (shotCount > 0)
		{
			clip [shotCount - 1] = "[]";
			shotCount -= 1;
			return "Boom!!";
		}
		return "Reload!!!";
	}
	
	static void reload()
	{
		if (bulletCount >= CLIPSIZE )
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shortCount = bulletCount;
			bulletCount = 0;
		}
	
	
		resetClip();
		
		for(int i =0; i < shotCount.length; i++)
		{
			clip[i] = " * ";
		}
	}
	
	static void printClip()
	{
		String output = "" ;
		System.out.println("Bullets:" + "/t" + bulletCount + newLine + "Clip: " + "/t");
		
		for(int i =0; i < clip.length; i++)
		{
			clip[i] += output;
		}
		System.out.println(" output");
	}
	
}