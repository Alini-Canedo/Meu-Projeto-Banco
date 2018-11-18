package Controle;

import Utilidades.Data;

public class RegistroContas {

	public static void main(String[] args) {
		Data d = new Data(07, 04,2017);
		Correntista c1 = new Correntista("22345656", "Ana");
		Correntista c2 = new Correntista("2545545", "Joe");
		Correntista [] correntistas = new Correntista[2];
		correntistas[0] = c1;
		correntistas[1] = c2;
		Conta conta1= new Conta(3455, d, correntistas, 200);
		System.out.println(conta1);
		conta1.fazerDeposito(300);
		System.out.println(conta1);
	}

}
