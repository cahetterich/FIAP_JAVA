import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		//variaveis
		int tc; 
		double sal, aumento, novo_sal;
		
		//Escreva 'Digite o seu tempo de casa: "
		System.out.print("Digite o tempo de casa:");
		
		//Leia tempo de casa - tc
		tc = entrada.nextInt();

		//Escreva "Digite o seu salário: "
		System.out.print("Digite o salário:");
		
		//Leia salario sal
		sal = entrada.nextDouble();
		
		//Se tc < 3 entao
		if(tc < 3) 
		{
			//aumento = salario * 0.05
			aumento = sal * 0.05;
		}
		//senão
		else
		{
			//aumento = salario * 0.1
			aumento = sal * 0.1;
		}	
		//fim_se

		//novo_sal = sal + aumento
		novo_sal = sal + aumento;
		
		//Escreva "O seu salário foi de", sal, "para", novo_sal
		System.out.print("O seu salário foi de " + sal + " para " + novo_sal);
	}

}
