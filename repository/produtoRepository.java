

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class produtoRepository {

    private Map<Long, Produto> repository;


    public produtoRepository() {
        this.repository = new HashMap<Long, Produto>();
    }

    public Produto salvar(Produto produto) {
        this.repository.put(produto.getId(), produto);
        return this.repository.get(produto.getId());
    }

    public List<Produto> listar() {
        return new ArrayList<>(this.repository.values());
    }

    public int getSize() {
        return this.repository.size();
    }
}