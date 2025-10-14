package br.edu.fatecfranca;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        AlunoDAO alunoDAO = new AlunoDAO();
        alunoDAO.inserir("Paulo", "698537");
        List<String> alunos = alunoDAO.listar();
        System.out.println("Lista de Alunos: ");
        for (String aluno : alunos){ //para cada aluno da lista de alunos
            System.out.println(aluno); // exibe id e nome do aluno
        }
    }
}