
public class fachada {

    private static produtoService produto;
    private static loteService lote;
    public fachada(){
        this.produto= new produtoService("Pastel","pastelaria",10.0);
        this.lote = new loteService(3,"2022-05-11", produto);
    }
    public static String criar_produto() {
        System.out.println(produto.toString());
        return "Produto Criado";
    }
    public static String criar_lote(){

        return "Lote criado";

    }


}
