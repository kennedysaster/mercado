package repository;

import org.comp.Class.Produto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ProdutoRepository {

    private DataBaseConnection connection;

    public ProdutoRepository(){
        this.connection = new DataBaseConnection.getInstance();

    public List<Produto> findAll(){

        List<Produto> produtos = new ArrayList<>();

        PreparedStatement preparedStatement = this.connection
                .getConnection().prepareStatement("select * from compras");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            Produto produto = new Produto();
            produto.setId(resultSet.getInt("id"));
            produto.add(produto);
        }

        return produtos;
    }



}
