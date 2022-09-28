import java.util.Date;


public class lote extends produto{
    int qtd;
    Date dataV;
    produto prod;
    public lote(int qtd, Date dataV, produto prod ){
        this.qtd=qtd;
        this.dataV=dataV;
        this.prod=prod;

     }
}

