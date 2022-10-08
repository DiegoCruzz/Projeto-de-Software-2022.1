


import java.util.stream.Collectors;

public class main {

    public static void main(String args[]) {
        fachada f = new fachada();

        Produto pastel = f.salvarProduto("Pastel", "pastelaria", 2.50);
        Produto arroz = f.salvarProduto("Arroz", "mercadinho beira rio", 7);
        Produto coxinha = f.salvarProduto("coxinha", "frituras do joca", 2.50);
        Produto feijão = f.salvarProduto("Feijão", "feijoaFerns",7.90);

        f.salvarLote(pastel, 600,"20/01/2022");
        f.salvarLote(arroz, 600, "20/01/2022");

        f.salvarLote(coxinha, 500, "20/01/2022");
        f.salvarLote(feijão, 550, "20/01/2022");

        System.out.println(f.listarProdutos().stream().map(Produto::toString).collect(Collectors.joining("\n")));
        System.out.println(f.listarLotes().stream().map(Lote::toString).collect(Collectors.joining("\n")));
    }
}