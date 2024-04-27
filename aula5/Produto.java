public class Produto {
  int idProduto;
  String nome;
  String descricao;
  double preco;
  int estoque;

  public Produto(int idProduto, String nome, String descricao, double preco, int estoque) {
    this.idProduto = idProduto;
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.estoque = estoque;
  }

  public int getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(int idProduto) {
    this.idProduto = idProduto;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getEstoque() {
    return estoque;
  }

  public void setEstoque(int estoque) {
    this.estoque = estoque;
  }
}
