
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criando novas Operações e Imprimindo
		double op1 = Operacao.calcular(10.0, 5.0, Operacao.SOMA);
		System.out.println(op1);
		double op2 = Operacao.calcular(10.0, 5.0, Operacao.SUBTRACAO);
		System.out.println(op2);
		double op3 = Operacao.calcular(10.0, 5.0, Operacao.MULTIPLICACAO);
		System.out.println(op3);
		double op4 = Operacao.calcular(10.0, 5.0, Operacao.DIVISAO);
		System.out.println(op4);
		
		//Gerar o Sinal das Operações Matematicas e Imprimir
		String teste = Operacao.SOMA.toString();
		System.out.println(teste);
		String teste1 = Operacao.SUBTRACAO.toString();
		System.out.println(teste1);
		String teste2 = Operacao.MULTIPLICACAO.toString();
		System.out.println(teste2);
		String teste3 = Operacao.DIVISAO.toString();
		System.out.println(teste3);
		
		
	}

}
