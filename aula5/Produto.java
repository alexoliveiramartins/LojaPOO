public class Produto {
  int idProduto;
  int idPedido;
  int idItemPedido;
  float preco;
  int estoque;

  public Produto(int idProduto, int idPedido, int idItemPedido, float preco, int estoque) {
    this.idProduto = idProduto;
    this.idPedido = idPedido;
    this.idItemPedido = idItemPedido;
    this.preco = preco;
    this.estoque = estoque;
    }
}