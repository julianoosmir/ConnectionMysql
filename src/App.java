import dao.ProdutoDAO;
import model.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Produto produto = new Produto();
        produto.setId(1);
        produto.setDescricao("pao");
        produto.setPreco(12);
        produto.setQtd(1);

        ProdutoDAO dao = new ProdutoDAO();
        dao.create(produto);

    }
}
