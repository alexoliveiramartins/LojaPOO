import java.util.*;

public class Pedido {
	private int idPedido;
	private String status;
	private int idCliente;
	private static ArrayList<Item> pedido = new ArrayList<>();

	public Pedido(int idPedido, String status, int idCliente) {
		this.idPedido = idPedido;
		this.status = status;
		this.idCliente = idCliente;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public static ArrayList<Item> getPedido() {
		return pedido;
	}

	public static void adicionarItem(Item item) {
		pedido.add(item);
	}

	public double calcularTotal() {
		int tam = pedido.size();
		int soma = 0;
		for(int c = 0; c < tam; c++) {
			soma += pedido.get(c).calcularSubTotal();
		}
		return soma;
	}
}
