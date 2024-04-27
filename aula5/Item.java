public class Item {
  private int idItem;
  private int idPedido;
  private int idProduto;

  public Item(int idItem, int idPedido, int idProduto) {
    this.idItem = idItem;
    this.idPedido = idPedido;
    this.idProduto = idProduto;
  }

  public int getIdItem() {
    return idItem;
  }

  public void setIdItem(int idItem) {
    this.idItem = idItem;
  }

  public int getIdPedido() {
    return idPedido;
  }

  public void setIdPedido(int idPedido) {
    this.idPedido = idPedido;
  }

  public int getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(int idProduto) {
    this.idProduto = idProduto;
  }
  
  public double calcularSubtotal() {
	  // implementar
	  return 0;
  }
}
