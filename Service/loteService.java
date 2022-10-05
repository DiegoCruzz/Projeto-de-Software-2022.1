import java.util.Date;


public class loteService {
    int qtd;
    String dataV;
    produtoService prod;

    public loteService(int qtd, String dataV, produtoService prod ){
        this.qtd=qtd;
        this.dataV=dataV;
        this.prod=prod;


    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getDataV() {
        return dataV;
    }

    public void setDataV(String dataV) {
        this.dataV = dataV;
    }

    public produtoService getProd() {
        return prod;
    }

    public void setProd(produtoService prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "lote{" +
                "quantidade=" + qtd +
                ", dataValidade='" + dataV + '\'' +
                ", produtos=" + prod +
                '}';
    }
}

