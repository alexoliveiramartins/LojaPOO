import javax.swing.JOptionPane;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
		  
	  // criacao de pessoas e validacao de cnpj/cpf
	  
	  Pessoa pessoa1 = new PessoaFisica(1, "Alex", "07203321177");
	  boolean valido = ((PessoaFisica) pessoa1).validarCpf();
	  if(valido == true) System.out.println("CPF VALIDO!");
	  else{
		  JOptionPane.showMessageDialog(null, "CPF INVALIDO!", "alerta", JOptionPane.ERROR_MESSAGE);
		  return;
	  }
	  
	  Pessoa empresa1 = new PessoaJuridica(2, "Simas Turbo", "71489715000106");
	  boolean cnpjValido = ((PessoaJuridica) empresa1).validarCnpj();
	  if(cnpjValido == true) System.out.println("CNPJ VALIDO!");
	  else{
		  JOptionPane.showMessageDialog(null, "CNPJ INVALIDO!", "alerta", JOptionPane.ERROR_MESSAGE);
		  return;
	  }
	  
	  // criacao do pedido/ produtos/ itens
	  
	  Pedido pedido1 = new Pedido(1, "Pendente", pessoa1.getId());
	  
	  Produto produto1 = new Produto(1, "Refrigerante", "Pitchula", 19.99, 20);
	  Produto produto2 = new Produto(2, "Bolacha", "Trakinas", 5.99, 639);
	  
	  Item item1 = new Item(produto1, 3);
	  Item item2 = new Item(produto2, 5);
	  
	  Pedido.adicionarItem(item1);
	  Pedido.adicionarItem(item2);
	  
	  // finalização do pedido
	  
	  String notaFiscal = "";
	  
	  for(Item item : Pedido.getPedido()) {
		  notaFiscal += item.getProduto().getNome() + " x" + item.getQuantidade() + " (" + item.getProduto().getEstoque() + ")\n";
	  }
	  
	  System.out.println("Resumo do Pedido:\n" + notaFiscal);
	  
	  double total = pedido1.calcularTotal();
	  
	  int i = JOptionPane.showConfirmDialog(null, "Total: R$" + total + "\n" + notaFiscal, "Confirmar Pedido", JOptionPane.YES_NO_OPTION);
	  if(i == JOptionPane.YES_OPTION) {
		  JOptionPane.showMessageDialog(null, "Pedido Finalizado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
	  pedido1.setStatus("FINALIZADO");
	  System.out.println("Estoque Atualizado!");
	  for(Item item : Pedido.getPedido()) {
			  item.getProduto().setEstoque(item.getProduto().getEstoque() - item.getQuantidade());
			  System.out.println(item.getProduto().getNome() + " - Estoque: " + item.getProduto().getEstoque());
		  }
		  return;
	  }
	  else if(i == JOptionPane.NO_OPTION) {
		  JOptionPane.showMessageDialog(null, "Pedido Cancelado!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			  return;
	  }
  }
}
