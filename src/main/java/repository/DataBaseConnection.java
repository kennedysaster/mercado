package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static DataBaseConnection instance;

//atributo para armazenar os dados da concesões.
    private Connection connection;

//criando a abertura de conexão com o banco com um unico acesso
public static DataBaseConnection getInstance(){
    if(instance == null){
        instance = new DataBaseConnection();

    }
    return instance;
}


    //criar um construtor como vai ser criado a conexao
    public DataBaseConnection (){
        try {
            this.createConnection();
        }catch (SQLException e){
            System.out.println("SQL ERRO :" + e.getMessage());
        }


    }
    //criar outro metodo para estabelecer a concexao
    private void createConnection() throws SQLException {

        this.connection = DriverManager.getConnection("jdbc:postgresql://localhost:8080/compras","postgress", "postegres");




    //(url: "jdbc:postgresql://localhost:8080/COMPRAS", user: "postgres", password: "postgres");
        this.connection.setAutoCommit(true);
    }

    public Connection getConnection(){
        return this.connection;
    }

    public void closeConnection(){
    try {
        this.connection.close();
    } catch (SQLException e){
        System.out.println(e.getMessage());

    }

    }

}
