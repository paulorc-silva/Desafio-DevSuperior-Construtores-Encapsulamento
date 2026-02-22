package br.com.devsuperior.application;

import br.com.devsuperior.entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.print("Vida inicial: ");
		int life = sc.nextInt();

		System.out.print("Ataque: ");
		int attack = sc.nextInt();

		System.out.print("Armadura: ");
		int armor = sc.nextInt();

		Champion firstChampion = new Champion(name, life, attack, armor);

		System.out.println("\nDigite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();

		System.out.print("Vida inicial: ");
		life = sc.nextInt();

		System.out.print("Ataque: ");
		attack = sc.nextInt();

		System.out.print("Armadura: ");
		armor = sc.nextInt();

		Champion secondChampion = new Champion(name, life, attack, armor);

		System.out.print("\nQuantos turnos você deseja executar? ");
		int numberOfShifts = sc.nextInt();

		for (int i = 1; i <= numberOfShifts; i++) {
			System.out.printf("\nResultado do turno %d%n", i);
			firstChampion.takeDamage(secondChampion);
			System.out.println(firstChampion.status());

			secondChampion.takeDamage(firstChampion);
			System.out.println(secondChampion.status());

			if (firstChampion.getLife() == 0 || secondChampion.getLife() == 0) break;
		}

		System.out.println("\nFIM DO COMBATE");
	}
}
