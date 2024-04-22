public class Item {
  private int idItem;
  private int idPedido;
  private int idProduto;
  private int quantidade;
  private float preco;

  public Item(int idItem, int idPedido, int idProduto, int quantidade, float preco) {
    this.idItem = idItem;
    this.idPedido = idPedido;
    this.idProduto = idProduto;
    this.quantidade = quantidade;
    this.preco = preco;
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

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public float getPreco() {
    return preco;
  }

  public void setPreco(float preco) {
    this.preco = preco;
  }
}
