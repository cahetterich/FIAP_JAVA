import java.util.Scanner;
public class ValorDesconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		//declarar variaveis
		double venda, desconto;
		
		//Escreva "Digite o valor da venda: "
		System.out.print("Digite o valor da venda: ");
		//Leia a venda
		venda = entrada.nextDouble();
		//Se venda > 300 então
		if (venda > 300)
		{
			//desconto = venda * 10 / 100
			desconto = venda * 10 / 100;
			//venda = venda - desconto
			venda = venda - desconto;
		}
		
		//Escreva "Novo valor = ", venda
		System.out.print("Novo valor = " + venda);
	}

}

