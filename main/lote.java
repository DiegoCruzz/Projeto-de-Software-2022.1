import java.util.Date;


public class lote {
    int qtd;
    String dataV;
    produto prod;
    public lote(int qtd, String dataV, produto prod ){
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

    public produto getProd() {
        return prod;
    }

    public void setProd(produto prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "lote{" +
                "qtd=" + qtd +
                ", dataV='" + dataV + '\'' +
                ", prod=" + prod +
                '}';
    }
}

