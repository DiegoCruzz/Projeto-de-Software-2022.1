



import java.util.List;

public class produtoService {

    private produtoRepository produtoRepository;

    public produtoService() {
        this.produtoRepository = new produtoRepository();
    }


    public Produto salvar(String nome, String fabricante, double valor) {
        Long id = Long.valueOf(this.produtoRepository.getSize() +1);
        return this.produtoRepository.salvar(new Produto(id, nome, fabricante, valor));
    }

    public List<Produto> listar() {
        return this.produtoRepository.listar();
    }


}