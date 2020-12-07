package ex1;

/**
 * Produto
 */
public class Produto {

    private int codigo, estoque;
    private double valor, custo, lucro;
    private String descricao;

    public Produto(int codigo, String descricao) {
        this.setCodigo(codigo);
        this.setDescricao(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto(int codigo, double valor, double custo, double lucro, String descricao) {
        this.setCodigo(codigo);
        this.valor = valor;
        this.custo = custo;
        this.lucro = lucro;
        this.setDescricao(descricao);
    }

    public Produto(int codigo, int estoque, double valor, double custo, double lucro, String descricao) {
        this.setCodigo(codigo);
        this.estoque = estoque;
        this.valor = valor;
        this.custo = custo;
        this.lucro = lucro;
        this.setDescricao(descricao);
    }

    public Produto() {
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getCusto() {
        return this.custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void compra(int quant){
        estoque = estoque + quant;
    }

    public void venda(int quant){
        if (estoque<=quant) {
            estoque = estoque - quant;
        } else {
            System.out.println("venda invalida");
        }
    }

    public double calculaPrecoVenda(){
        return valor + custo + lucro*(valor + custo);
    }
}