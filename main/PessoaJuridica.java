
public class PessoaJuridica extends Pessoa {
	private String cnpj;
	
	public PessoaJuridica(int idCliente, String nome, String cnpj) {
		super(idCliente, nome);
		this.cnpj = cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnpj() {
		return this.cnpj;
	}
	
	public boolean validarCnpj() {
		// primeiro digito
		int soma = 0, aux = 0, d1, d2;
		int[] digitosVerificadores = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
		for(int c = 0; c < 12; c++) {
			aux = cnpj.charAt(c) - '0';
			soma += (aux * digitosVerificadores[c]);
			// System.out.println(aux + " * " + digitosVerificadores[c] + " = " + aux * digitosVerificadores[c]);
		}
		d1 = soma % 11;
		if(d1 == 0 || d1 == 1) d1 = 0;
		else d1 = 11 - (soma % 11);
		// System.out.println(soma);
		
		// segundo digito
		soma = 0;
		int[] digitosVerificadoresDois = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
		for(int c = 0; c < 13; c++) {
			aux = cnpj.charAt(c) - '0';
			soma += (aux * digitosVerificadoresDois[c]);
			// System.out.println(aux + " * " + digitosVerificadoresDois[c] + " = " + aux * digitosVerificadoresDois[c]);
		}
		d2 = soma % 11;
		if(d2 == 0 || d2 == 1) d2 = 0;
		else d2 = 11 - (soma % 11);
		// System.out.println(soma);
		
		// return
		if(d1 == cnpj.charAt(12) - '0' && d2 == cnpj.charAt(13) - '0') return true;
		else return false;
	}
}
