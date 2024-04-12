package org.comp;

import org.comp.Class.Produto;

import java.util.*;

public class Main {

    private static Scanner input = new Scanner(System.in); //buscar dados do teclado
    private static ArrayList<Produto> produtos; // lista de produtos
    private static Map<Produto, Integer> carrinho; //metodo carrinho com a chave principal o produto

    public static void main(String[] args) {
        produtos = new ArrayList<>();
        carrinho = new HashMap<>();
        menu(); //metodo menu

    }

    private static void menu() {
        System.out.println("======================================================================");
        System.out.println("====================SUPERMERCADO DO FAQUINHA==========================");
        System.out.println("====================INFORMAÇÕES DO SISTEMA============================");
        System.out.println("   ||   Digite 1 para - CADASTRAR UM PRODUTO                    ||");
        System.out.println("   ||   Digite 2 para - LISTAR PRODUTOS CADASTRADOS             ||");
        System.out.println("   ||   Digite 3 para - INICIAR UMA COMPRA                      ||");
        System.out.println("   ||   Digite 4 para - VER MEU CARRINHO DE COMPRA              ||");
        System.out.println("   ||   Digite 5 para - Sair do MENU                            ||");
        System.out.println("=====================================================================");

        System.out.println("=====================================================================");
        System.out.println("====================SUPERMERCADO DO FAQUINHA=========================");
        System.out.println("INFORME UMA DAS OPÇÕES ACIMA");
        int option = input.nextInt();


        switch (option) {

            case 1:
                cadastrarprodutos();
                break;
/*
            case 2:
                listarprodutos();
                break;
            case 3:
                comprarprodutos();
                break;
            case 4:
                vercarrinho();
                break;
*/
            case 5:
                System.out.println("Obrigado !!!");
                //System.exit();
            default:
                System.out.println("OPÇÃO INVÁLIDA, SER DIRECIONADO(a) PARA MENU PRINCIPAL");
                menu();
                break;

        }

    }

    private static void cadastrarprodutos(){
        Produto produto = new Produto();
        System.out.println("INFORME O NOME DO PRODUTO");
        String nome = input.next();
        System.out.println("INFORME O VALOR DO PRODUTO");
        Double preco = input.nextDouble();
        produto.setNome(nome);
        produto.setPreco(preco);
        produtos.add(produto);

        System.out.println("=====================================================================");

        System.out.println(produto.toString());

    }


}