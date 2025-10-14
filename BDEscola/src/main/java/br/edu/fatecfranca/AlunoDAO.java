package br.edu.fatecfranca;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// DAO - Data Access Object
public class AlunoDAO {
    // função para inserir um aluno no banco de dados
    public void inserir(String nome, String cpf){
        // monta uma string que representa o SQL
        String sql = "INSERT INTO aluno (nome,cpf) VALUES (?,?)";
        try { // tenta inserir
            // conecta no banco de dados
            Connection conexao = ConnectionFactory.getConnection();
            // prepara para inserir
            PreparedStatement stmt = conexao.prepareStatement(sql);
            // define os valores de nome e cpf
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            // executa a inserção no banco de dados
            stmt.executeUpdate();
            System.out.println("Aluno adicionado com sucesso!");
        }
        catch(SQLException e){
            System.out.println("Erro ao inserir aluno " + e.getMessage());
        }
    }
    public List<String> listar(){
        List<String> alunos  = new ArrayList<>();
        String sql = "SELECT * FROM aluno order by id";

        try{
            Connection conexao = ConnectionFactory.getConnection();
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                alunos.add(rs.getInt("id") + " - " + rs.getString("nome"));
            }
        }
        catch (SQLException e){
            System.out.println("Erro ao listar alunos" + e.getMessage());
        }
        return alunos;
    }
}