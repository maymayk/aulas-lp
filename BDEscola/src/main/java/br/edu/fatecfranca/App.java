package br.edu.fatecfranca;

import java.util.List;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
       AlunoDAO dao = new AlunoDAO();
       Scanner sc = new Scanner(System.in);
       int opcao;
       do {
           System.out.println("Menu Aluno");
           System.out.println("1 - Cadastrar Aluno");
           System.out.println("2 - Alterar Aluno");
           System.out.println("3 - Excluir Aluno");
           System.out.println("4 - Listar Alunos");
           System.out.println("0 - Sair");
           System.out.println("Informe a opção escolhida: ");
           opcao = sc.nextInt();
           switch (opcao){
               case 1:
                   System.out.println("Informe o nome do aluno: ");
                   String nome = sc.next();
                   System.out.println("Informe o CPF do aluno: ");
                   String cpf = sc.next();
                   dao.inserir(nome, cpf);
                   break;
               case 2:
                   System.out.println("Informe o ID do aluno: ");
                   int id = sc.nextInt();
                   System.out.println("Informe o novo nome: ");
                   nome = sc.next();
                   System.out.println("Informe o novo CPF: ");
                   cpf = sc.next();
                   dao.atualizar(id, nome, cpf);
                   break;
               case 3:
                   System.out.println("Informe o ID do aluno que deseja remover: ");
                   id = sc.nextInt();
                   dao.remover(id);
                   break;
               case 4:
                   System.out.println(dao.listar());
                   List<String> alunos = dao.listar();
                   if (alunos.isEmpty()){ //se vetor é vazio
                       System.out.println("Sem aluno cadastrado.");
                   }
                   else{
                       for (String aluno : alunos){ //para cada string aluno
                           System.out.println(aluno); //exibe os dados dos alunos
                       }
                   }
                   break;
               case 0:
                   System.out.println("Encerrando...");
                   break;
               default:
                   System.out.println("Opção inválida! Escolha uma das alternativas listadas.");
           }
       } while (opcao != 0);
    }
}