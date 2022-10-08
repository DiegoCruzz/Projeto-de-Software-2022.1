



import java.util.List;

public class fachada {

    private loteService loteService;
    private produtoService produtoService;

    public fachada() {
        this.loteService = new loteService();
        this.produtoService = new produtoService();
    }

    public Produto salvarProduto(String nome, String fabricante, double valor) {
        return this.produtoService.salvar(nome, fabricante, valor);
    }

    public List<Produto> listarProdutos() {
        return (List<Produto>) this.produtoService.listar();
    }

    public Lote salvarLote(Produto produto, int quantidade, String data_validade) {
        return this.loteService.salvar(produto, quantidade, data_validade);
    }

    public List<Lote> listarLotes() {
        return this.loteService.listar();
    }
}