public class Pedido {
  private int idPedido;
  private String status;
  private int idCliente;

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
}