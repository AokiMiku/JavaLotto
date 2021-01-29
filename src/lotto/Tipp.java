package lotto;

public class Tipp 
{
	private int[] zahlen;
	
	public int[] getZahlen()
	{
		return this.zahlen;
	}
	
	public void abgebenRandom(int anzahl)
	{
		this.zahlen = new int[anzahl];
		
		for (int i = 0; i < zahlen.length; i++) 
		{
			this.zahlen[i] = Helper.getRandomNumber(1, (int)Math.pow(anzahl, 2));
			for (int j = 0; j < i; j++) 
			{
				while (this.zahlen[i] == this.zahlen[j])
				{
					this.zahlen[i] = Helper.getRandomNumber(1, (int)Math.pow(anzahl, 2));
				}
			}
		}
	}
}