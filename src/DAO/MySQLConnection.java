/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Principal
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Início da classe de conexão// 

public class MySQLConnection {

    public static String status = "Não conectou...";
//Método Construtor da Classe// 

    public MySQLConnection() {
    }

    public static java.sql.Connection getConexaoMySQL() {
        Connection connection = null;
        //atributo do tipo MySQLConnection 
        try { // Carregando o JDBC Driver padrão 
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName); // Configurando a nossa conexão com um banco de dados// 
            String serverName = "localhost"; //caminho do servidor do BD 
            String mydatabase = "audiencemeasurement"; //nome do seu banco de dados 
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?autoReconnect=true&useSSL=false?autoReconnect=true&useSSL=false";
            String username = "root"; //nome de um usuário de seu BD 
            String password = "root"; //sua senha de acesso 
            connection = DriverManager.getConnection(url, username, password); //Testa sua conexão// 
            if (connection != null) {
                status = "STATUS--->Conectado com sucesso!";

            } else {
                status = "STATUS--->Não foi possivel realizar conexão";

            }

            return connection;
        } catch (ClassNotFoundException e) { //Driver não encontrado 
            
           status = "O driver expecificado nao foi encontrado.";
            return null;
        } catch (SQLException e) { //Não conseguindo se conectar ao banco 
           status = "Nao foi possivel conectar ao Banco de Dados.";
            return null;
        }
    }

    public static String statusConection() {
        return status;
    } //Método que fecha sua conexão// 

    public static boolean FecharConexao() {
        try {
            MySQLConnection.getConexaoMySQL().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

}
