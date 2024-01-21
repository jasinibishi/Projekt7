package proekt6;

import java.util.Scanner;

public class Triagolnik {

	public static void main(String[] args){
		System.out.println("| Programa za identifikacija na triagolnik spored dolzina na strani.");
		int a,b,c;
		Scanner tastatura = new Scanner(System.in);
		System.out.println("| Vnesi vredost ( dolzina, cm ) za stranata A: ");
		a=tastatura.nextInt();
		System.out.println("| Vnesi vrednost ( dolzina, cm ) za stranata B: ");
		b=tastatura.nextInt();
		System.out.println("| Vnesi vrednost ( dolzina, cm ) za stranata C: ");
		c=tastatura.nextInt();
		if(a == b && a == c)
		{
			System.out.println("| Triagolnikot e RAMNOSTRAN, site agli imaat 60 stepeni.");
		}
		else if(a == b || a == c || b == c )
		{
			System.out.println("| Triagolnikot e RAMNOKRAK, ima 2 isti agli.");
		}
		else
		{
			System.out.println("| Triagolnikot e RAZNOSTRAN, site agli se razlicni");
		}

	}
}
