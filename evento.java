package exintroducao;

import java.util.Scanner;

public class evento {

	public static void main(String[] args) {
		int horas = 0, minutos = 0, segundos = 0, seg = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a duração do evento em segundos: ");
		segundos = ler.nextInt();
		
		horas = (segundos/3600);
		minutos = (segundos % 3600) / 60;
		seg = (segundos % 3600) % 60;
		
		System.out.println("A duração do evento foi de : " + horas + "horas" + minutos + "minutos e" + seg + "segundos");
		
		
		
		

	}

}
