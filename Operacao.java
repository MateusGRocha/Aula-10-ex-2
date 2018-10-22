/**
 * Criando um Enum para Operações Matematicas
 */
public enum Operacao {
	SOMA('+'), 
	SUBTRACAO('-'), 
	MULTIPLICACAO('*'), 
	DIVISAO('/');
	
	private char elemento;
	
	private Operacao(char elemento) {
		this.elemento = elemento;
	}

	/**
	 * Metodos para Operações Matematicas
	 * @param x
	 * @param y
	 * @param op
	 * @return
	 */
	public static Double calcular(Double x, Double y, Operacao op) {
		if (op == Operacao.SOMA) {
			return x + y;
		}
		if(op == Operacao.SUBTRACAO) {
			return x - y;
		}
		if(op == Operacao.MULTIPLICACAO) {
			return x * y;
		}
		else {
			return x / y;
		}
	}
	
	/**
	 * Metodo Get e toString
	 * @return
	 */
	public char getElemento() {
		return elemento;
	}
	
	public String toString() {
		return String.valueOf(elemento);
		
	}
}
