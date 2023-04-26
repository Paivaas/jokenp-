package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		 Random aleatorio = new Random();
		 int numeroP = aleatorio.nextInt(3);
		 
		 
		 Scanner teclado = new Scanner(System.in);
		 
		 System.out.println("---------------------------------------");
		 System.out.println("Jogue com o computador: J O K E M P Ô !");
		 System.out.println("---------------------------------------");
		 System.out.println("");
		 System.out.println("1 = Pedra");
		 System.out.println("2 = Tesoura");
		 System.out.println("3 = Papel");
		 System.out.println("");
		 System.out.println("---------------------------------------");
		 System.out.print("Faça a sua escolha (1 à 3): ");
		 int numeroU = teclado.nextInt();
		 System.out.println("");
		 
		 
		 if (numeroU==1 && numeroP==1) {
		 System.out.println("Você escolheu ----> PEDRA!");
		 System.out.println("O PC escolheu ----> PEDRA!");
		 System.out.println("");
		 System.out.println("---------------------------------------");
		 System.out.println("--------------   EITA!   --------------");
		 System.out.println("------------ DEU EMPATE!!! ------------");
		 System.out.println("---------------------------------------");
		 
		 } else if (numeroU==2 && numeroP==2) {
		 System.out.println("Você escolheu ----> TESOURA!");
		 System.out.println("O PC escolheu ----> TESOURA!");
		 System.out.println("");
		 System.out.println("---------------------------------------");
		 System.out.println("--------------   EITA!   --------------");
		 System.out.println("------------ DEU EMPATE!!! ------------");
		 System.out.println("---------------------------------------");
		 
		 }else if (numeroU==3 && numeroP==3) {
		 System.out.println("Você escolheu ----> PEDRA!");
		 System.out.println("O PC escolheu ----> PEDRA!");
		 System.out.println("");
		 System.out.println("---------------------------------------");
		 System.out.println("--------------   EITA!   --------------");
		 System.out.println("------------ DEU EMPATE!!! ------------");
		 System.out.println("---------------------------------------");
		 
		 }else if (numeroU==1 && numeroP==2 ) {
		 System.out.println("Você escolheu ----> PEDRA!");
		 System.out.println("O PC escolheu ----> TESOURA!");
		 System.out.println("");
		 System.out.println("---------------------------------------");
		 System.out.println("------------   PARABÉNS!   ------------");
		 System.out.println("-----------  VOCÊ VENCEU!!!  ----------");
		 System.out.println("---------------------------------------");
		 
		 }else if (numeroU==2 && numeroP==3 ) {
		 System.out.println("Você escolheu ----> TESOURA!");
		 System.out.println("O PC escolheu ----> PAPEL!");
		 System.out.println("");
		 System.out.println("---------------------------------------");
		 System.out.println("------------   PARABÉNS!   ------------");
		 System.out.println("-----------  VOCÊ VENCEU!!!  ----------");
		 System.out.println("---------------------------------------");
		 
		 }else if (numeroU==3 && numeroP==1 ) {
		 System.out.println("Você escolheu ----> PAPEL!");
		 System.out.println("O PC escolheu ----> PEDRA!");
		 System.out.println("");
		 System.out.println("---------------------------------------");
		 System.out.println("------------   PARABÉNS!   ------------");
		 System.out.println("-----------  VOCÊ VENCEU!!!  ----------");
		 System.out.println("---------------------------------------");
		 
		 }else if (numeroU==2 && numeroP==1 ) {
		 System.out.println("Você escolheu ----> TESOURA!");
		 System.out.println("O PC escolheu ----> PEDRA!");
		 System.out.println("");
		 System.out.println("---------------------------------------");
		 System.out.println("------------   QUE PENA!   ------------");
		 System.out.println("----------  O PC VENCEU!!!  -----------");
		 System.out.println("---------------------------------------");
		 
		 }else if (numeroU==3 && numeroP==2 ) {
		 System.out.println("Você escolheu ----> PAPEL!");
		 System.out.println("O PC escolheu ----> TESOURA!");
		 System.out.println("");
		 System.out.println("---------------------------------------");
		 System.out.println("------------   QUE PENA!   ------------");
		 System.out.println("----------  O PC VENCEU!!!  -----------");
		 System.out.println("---------------------------------------");
		 
		 }else if (numeroU==1 && numeroP==3 ) {
		 System.out.println("Você escolheu ----> PEDRA!");
		 System.out.println("O PC escolheu ----> PAPEL!");
		 System.out.println("");
		 System.out.println("---------------------------------------");
		 System.out.println("------------   QUE PENA!   ------------");
		 System.out.println("----------  O PC VENCEU!!!  -----------");
		 System.out.println("---------------------------------------");
		 
		 
		 
		 }else if (numeroP == 0) {
		  numeroP = aleatorio.nextInt(3);
		 }
	}
}
