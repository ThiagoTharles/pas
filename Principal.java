package ex1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            RevendaComArray revenda;
            System.out.println("Quantidade de produtos: ");
            int tam = Integer.parseInt(sc.nextLine());
            revenda = new RevendaComArray(tam);
            do {
                System.out.printf("MENU: \n>>1. Criar Produto \n>>2. Comprar \n>>3. Vender \n>>4. Consultar Preço \n>>5. Listar Preco\n");
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        System.out.println("Codigo: ");
                        int codigo = sc.nextInt();
                        System.out.println("Estoque: ");
                        int estoque = sc.nextInt();
                        System.out.println("Valor: ");
                        double valor = sc.nextDouble();
                        System.out.println("Custo: ");
                        double custo = sc.nextDouble();
                        System.out.println("Lucro: ");
                        double lucro = sc.nextDouble();
                        System.out.println("Descrição: ");
                        String desc = sc.next();
                        Produto p = new Produto(codigo, estoque, valor, custo, lucro, desc);
                        revenda.inserirProduto(p);
                        break;
                    case 2:
                        System.out.println("Codigo: ");
                        int cod3 = sc.nextInt();
                        System.out.println("quantidate: ");
                        int qtd2 = sc.nextInt();
                        revenda.comprar(cod3, qtd2);
                        break;
                    case 3:
                        System.out.println("Codigo: ");
                        int cod2 = sc.nextInt();
                        System.out.println("quantidate: ");
                        int qtd = sc.nextInt();
                        revenda.vender(cod2, qtd);
                        break;
                    case 4:
                        System.out.println("Codigo: ");
                        int cod = sc.nextInt();
                        revenda.consultaPrecoVenda(cod);
                        break;
                    case 5:
                        revenda.listaPrecos();
                        break;
                    default:
                        System.out.println("opcao invalida");
                        break;
                }
            } while (true);
            //rest of your code
        }
	}
}
