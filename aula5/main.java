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
	  
	  Pedido pedido1 = new Pedido(1, "Pendente", pessoa1.getId());
	  
	  Produto produto1 = new Produto(1, "Refrigerante", "Pitchula", 19.99, 20);
	  Produto produto2 = new Produto(2, "Bolacha", "Trakinas", 5.99, 639);
	  Item item1 = new Item(produto1, 3);
	  Item item2 = new Item(produto2, 5);
	  
	  Pedido.adicionarItem(item1);
	  Pedido.adicionarItem(item2);
	  
	  for(Item item : Pedido.getPedido()) {
		System.out.println(item.getProduto().getNome() + " x" + item.getQuantidade());
	  }
	  
	  double total = pedido1.calcularTotal();
	  System.out.printf("Total: R$");
	  System.out.printf("%.2f\n", total);
	  
  }
}
