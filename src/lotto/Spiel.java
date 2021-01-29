package lotto;

public class Spiel 
{
	public int[] getGewinnerZahlen()
	{
		return this.gewinnerZahlen;
	}
	private int[] gewinnerZahlen;
	private int tippsVerfuegbar;
	private int getMaxZahlen()
	{
		return (int)Math.pow(tippsVerfuegbar, 2);
	}
	
	public Spiel(int anzahlGewinnerZahlen) 
	{
		this.gewinnerZahlen = new int[anzahlGewinnerZahlen];
		this.tippsVerfuegbar = anzahlGewinnerZahlen;
	}
	
	public void ziehen()
	{
		for (int i = 0; i < gewinnerZahlen.length; i++) 
		{
			int zahl = Helper.getRandomNumber(1, this.getMaxZahlen());
			for (int j = 0; j < i; j++) 
			{
				while (zahl == this.gewinnerZahlen[j])
				{
					zahl = Helper.getRandomNumber(1, this.getMaxZahlen());
				}
			}
			this.gewinnerZahlen[i] = zahl;
		}
	}
	
	public int vergleichen(Tipp tipp)
	{
		int[] zahlen = tipp.getZahlen();
		int gleiche = 0;
		for (int i = 0; i < gewinnerZahlen.length; i++) 
		{
			for (int j = 0; j < zahlen.length; j++) 
			{
				if (zahlen[j] == this.gewinnerZahlen[i])
				{
					gleiche++;
				}
			}
		}
		return gleiche;
	}
}