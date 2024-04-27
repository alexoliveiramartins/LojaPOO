import javax.swing.JOptionPane;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
	  
	  Pessoa pessoa1 = new PessoaFisica(1, "Alex", "12345678912");
	  boolean valido = ((PessoaFisica) pessoa1).validarCpf();
	  if(valido == true) System.out.println("CPF VALIDO!");
	  else JOptionPane.showMessageDialog(null, "CPF INVALIDO!", "alerta", JOptionPane.ERROR_MESSAGE);
	  
	  Pessoa empresa1 = new PessoaJuridica(2, "Simas Turbo", "71489715000106");
	  boolean cnpjValido = ((PessoaJuridica) empresa1).validarCnpj();
	  if(cnpjValido == true) System.out.println("CNPJ VALIDO!");
	  else JOptionPane.showMessageDialog(null, "CNPJ INVALIDO!", "alerta", JOptionPane.ERROR_MESSAGE);
	
  }
}
