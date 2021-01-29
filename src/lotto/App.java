package lotto;

import java.util.Arrays;

public class App 
{
	public static void main(String[] args) 
	{
		int anzahlGewinnerZahlen = 3;
		Spiel lotto = new Spiel(anzahlGewinnerZahlen);
		lotto.ziehen();
		
		Tipp tipp = new Tipp();
		tipp.abgebenRandom(anzahlGewinnerZahlen);
		Tipp tipp2 = new Tipp();
		tipp2.abgebenRandom(anzahlGewinnerZahlen);
		
		System.out.println("Lotto: " + Arrays.toString(lotto.getGewinnerZahlen()));
		System.out.println("Tipp1: " + Arrays.toString(tipp.getZahlen()));
		System.out.println("Tipp2: " + Arrays.toString(tipp2.getZahlen()));
		System.out.println(String.format("1. Sie haben %d Richtige!", lotto.vergleichen(tipp)));
		System.out.println(String.format("2. Sie haben %d Richtige!", lotto.vergleichen(tipp2)));
	}
}