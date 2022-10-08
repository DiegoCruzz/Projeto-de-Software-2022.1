



import java.util.Date;
import java.util.List;

public class loteService {

    private loteRepository loteRepository;

    public loteService() {
        this.loteRepository = new loteRepository();
    }


    public Lote salvar(Produto produto, int quantidade, String data_validade) {
        Long id = Long.valueOf(this.loteRepository.getSize() +1);
        return this.loteRepository.salvar(new Lote(id, produto, quantidade, data_validade));
    }

    public List<Lote> listar() {
        return this.loteRepository.listar();
    }
}