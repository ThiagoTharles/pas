package ex1;

public class RevendaComArray {
    private Produto[] produtos;
    private int indice;

    public RevendaComArray(int tamanho ) {
        produtos = new Produto[tamanho];
        indice = 0;
    }
    
    public void inserirProduto(Produto p1){
        produtos[indice] = p1;
        indice++;
    }

    public void comprar(int codigo, int qtd){
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getCodigo() == codigo) {
                produtos[i].compra(qtd);
                System.out.println("produto comprado");
                break;
            }
        }
        System.out.println("Produto nao encontrado");
    }

    public void vender(int codigo, int qtd){
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getCodigo() == codigo) {
                produtos[i].venda(qtd);
                System.out.println("produto vendido");
                break;
            }
        }
        System.out.println("Produto nao encontrado");
    }

    public void consultaPrecoVenda(int codigo){
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getCodigo() == codigo) {
                System.out.println(produtos[i].calculaPrecoVenda());
                break;
            }
        }
        System.out.println("Produto nao encontrado");
    }

    public void listaPrecos(){
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i].getCodigo()+", "+produtos[i].getDescricao()+", "+produtos[i].calculaPrecoVenda());
        }
    }

}
