package br.edu.fatecfranca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //criar 3 variaveis
    // jdbc --> proytocolo de comunicação do java com BD
    //postgresql --> banco de dados
    //localhost --> máquina local
    //5432 --> porta onde o postgres fica escutando requisição
    //escola --> nome do banco de dados
    static String URL = "jdbc:postgresql://localhost:5432/escola";
    static String USER = "postgres";
    static String PASSWORD = "1234";

    // função de conexão com o banco de dados

    public static Connection getConnection(){

        // tentar conectar
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }

        catch (SQLException e){
            // deu erro, não conseguiu conectar

            throw new RuntimeException("Erro ao conectar " + e.getMessage());
        }
    }
}