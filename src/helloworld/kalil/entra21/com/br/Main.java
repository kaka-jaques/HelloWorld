package helloworld.kalil.entra21.com.br;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//Função para exibir painel flutuante (import javax.swing.*) - AULA 1 
		JOptionPane.showMessageDialog(null, "Welcome to my first Hello World! Click OK!");
		
		short[] birth = {23,8,2001};
		String name = "Kalil J. Fakhouri";
		String email = "kjfakhouri@gmail.com";
		String[] XP = {"IFAP - Campus Santana - 2019-2019","Leilão Fantinatto - 2019-2021","Clickway Informática - 2021-2021","Showtec Informática - 2021-atualmente"};
		
		System.out.println("**CURRICULO VITAE**\n-------------------------------------");
		System.out.println("Nome: "+name);
		System.out.println("E-mail: "+email);
		System.out.println("Data de Nascimento: "+birth[0]+"/"+birth[1]+"/"+birth[2]+"\n-------------------------------------");
		System.out.println("**EXPERIÊNCIAS PROFISSIONAIS**\n");
		System.out.println("-"+XP[0]+"\n-"+XP[1]+"\n-"+XP[2]+"\n-"+XP[3]+"\n");
		
		//Variáveis FINAIS & Tipos de variáveis e seus tamanhos - AULA 2
		System.out.println("\n****VARIABLES INFORMATION****\n");
		System.out.println("The Value of Byte is: "+Byte.MIN_VALUE+" - "+Byte.MAX_VALUE);
		System.out.println("The Value of Short is: "+Short.MIN_VALUE+" - "+Short.MAX_VALUE);
		System.out.println("The Value of Int is: "+Integer.MIN_VALUE+" - "+Integer.MAX_VALUE);
		System.out.println("The Value of Double is: "+Double.MIN_VALUE+" - "+Double.MAX_VALUE);
		System.out.println("The Value of Float is: "+Float.MIN_VALUE+" - "+Float.MAX_VALUE);
		System.out.println("The Value of Long is: "+Long.MIN_VALUE+" - "+Long.MAX_VALUE);
		
	}

}
