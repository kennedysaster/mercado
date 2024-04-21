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

            case 2:
                listarprodutos();
                break;

            case 3:
                comprarprodutos();
                break;

            case 4:
                vercarrinho();
                break;

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
        Integer id = produto.getId();
        System.out.println("INFORME O NOME DO PRODUTO");
        String nome = input.next();
        System.out.println("INFORME O VALOR DO PRODUTO");
        Double preco = input.nextDouble();
        System.out.println("Informe a quantidade de entrada");
        Integer qtdProduto = input.nextInt();
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setId(id);
        produto.setQuantidade(qtdProduto);
        produtos.add(produto);
        System.out.println("=====================================================================");
        //System.out.println(produto.toString());
        System.out.println("Produto cadastrado com sucesso" + " " + produto.getNome());
        menu();

    }

    private static void listarprodutos(){

        if (produtos.size() > 0){

            System.out.println("=================LISTA DE PRODUTOS ==============");

            for (Produto p : produtos){
                System.out.println("ID PRODUTO" + " " + p.getId());
                System.out.println("NOME PRODUTO" + " " +p.getNome());
                System.out.println("QUANTIDADE PRODUTO" + " " +p.getQuantidade());

            }
        }else{
            System.out.println("Nenhum produto cadastrado");

        }
        menu();

    }

    private static void comprarprodutos(){

        System.out.println("Informe ID do protudo");
        Integer id = Integer.parseInt(input.next());
        System.out.println("Infome a quantidade desejada");
        Integer qtd1 = Integer.parseInt(input.next());
        boolean produtoexistente = false;



            for (Produto p : produtos){
                if (p.getId() == id){
                    int qtd = qtd1;
                    if (qtd1 <= p.getQuantidade()){
                        System.out.println("Disponível");
                    }else{
                        System.out.println("Quantidade indisponível no estoque" + " " + "EM ESTOQUE NO MOMENTO : " + " "+ p.getQuantidade());
                        menu();
                    }
                    try {
                        qtd = carrinho.get(p);
                        carrinho.put(p, qtd1 + 1);
                    }catch (NullPointerException e){
                        carrinho.put(p,id);
                    }
                    System.out.println(p.getNome() + " " + "adicionado ao carrinho");
                    System.out.println(qtd + " " + "quantidade");
                    produtoexistente = true;
                    menu();
                }else{
                    System.out.println("Não existe este produto na lista");
                    menu();
                }
            }
        }

        private static void vercarrinho(){

        System.out.println("-------MINHA LISTA DE COMRAS-----------");

        if(carrinho.size() > 0){

            for (Produto p: carrinho.keySet()){
                System.out.println("Produto" + carrinho.get(p) );

            }



        }




        }


    }
