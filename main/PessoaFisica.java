
public class PessoaFisica extends Pessoa {
	private String cpf;
	
	public PessoaFisica(int id, String nome, String cpf) {
		super(id, nome);
		this.cpf = cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public boolean validarCpf() {
		// primeiro digito
		int soma = 0, aux = 0, d1, d2;
		for(int c = 1; c <= 9; c++) {
			aux = cpf.charAt(c-1) - '0';
			soma += (aux * c);
		}
		d1 = soma % 11;
		if(d1 == 10) d1 = 0;
		
		// segundo digito
		soma = 0;
		for(int c = 0; c < 10; c++) {
			aux = cpf.charAt(c) - '0';
			soma += (aux * c);
		}
		d2 = soma % 11;
		if(d2 == 10) d2 = 0;
		
		// return
		if(d1 == cpf.charAt(9) - '0' && d2 == cpf.charAt(10) - '0') return true;
		else return false;
	}
}
