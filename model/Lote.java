
public class Lote {

    private Long id;
    private Produto produto;
    private int quantidade;
    private String dataValidade;


    public Lote(Long id, Produto produto, int qtd, String data) {
        this.id = id;
        this.produto = produto;
        this.quantidade = qtd;
        this.dataValidade = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "id=" + id +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", dataValidade='" + dataValidade + '\'' +
                '}';
    }
}