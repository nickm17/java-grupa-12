package ro.siit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOImpl implements AuthorDAO {

    public static void main(String[] args) throws SQLException {
        AuthorDAO authorDAO = new AuthorDAOImpl();
        authorDAO.findAll().forEach(System.out::println);

        System.out.println("Test findAllByName ()=============");
        authorDAO.findAllByName("Georgel Ionescu")
                 .stream()
                 .map(author -> author.getEmail())
                 .filter(email -> email.endsWith("@gmail.com"))
                 .forEach(System.out::println);
        System.out.println("Test insert ()=============");
//        authorDAO.insert(new Author(4,"Ionffdfhsdjkfhsdjkfkjsdfhkjsdkfsdkfsdfhsdjkfkjsdfhkjsdkfsdkfsdfhsdjkfkjsdfhkjsdkfsdkfsdfhsdjkfkjsdfhkjsdkfsdkfsdfhsdjkfkjsdfhkjsdkfsdkfsdfkjsdfhkjsdkfsdkfsdfsdfsdkfhsdhfjsdfdfhjs", "ion.tiriac@gmail.com"));

        authorDAO.findAuthorsNr();
        System.out.println("Test delete ()=============");
//        authorDAO.delete(4);
    }

    @Override
    public List<Author> findAll() throws SQLException {
        List<Author> authorsFromDb = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sqlQuery = "SELECT * FROM authors";
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Author author = new Author();
                author.setId(resultSet.getInt("id"));
                author.setName(resultSet.getString("name"));
                author.setEmail(resultSet.getString("email"));
                authorsFromDb.add(author);
            }
//            resultSet.close();
//            statement.close();
//            connection.close();
        }
        return authorsFromDb;
    }

    public int findAuthorsNr() {
        List<Author> authorsFromDb = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sqlQuery = "SELECT COUNT(*) as nr FROM authors";
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            ResultSet rs = statement.executeQuery();
             rs.next();
            System.out.println(rs.getInt("nr"));
            System.out.println(rs.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Author> findAllByName(String name) {
        List<Author> authorsFromDb = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sqlQuery = "SELECT * FROM authors WHERE name = ?";
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            statement.setString(1, name);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Author author = new Author();
                author.setId(resultSet.getInt("id"));
                author.setName(resultSet.getString("name"));
                author.setEmail(resultSet.getString("email"));
                authorsFromDb.add(author);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authorsFromDb;
    }

    @Override
    public void insert(Author author) {
        try (Connection connection = getConnection()) {
            String sqlQuery = "INSERT INTO authors (id, name, email) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            preparedStatement.setInt(1, author.getId());
            preparedStatement.setString(2, author.getName());
            preparedStatement.setString(3, author.getEmail());
            int numberOfRowsAffected = preparedStatement.executeUpdate();
            if(numberOfRowsAffected == 1){
                System.out.println("Author successfully inserted!!!!! Uraaaaa!!!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {

        try (Connection connection = getConnection()) {
            String sqlQuery = "DELETE FROM authors WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            statement.setInt(1, id);
            int numberOfRowsAffected = statement.executeUpdate();
            if(numberOfRowsAffected == 1){
                System.out.println("Author successfully deleted!!!!! Nu mai e Ion :((( ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/jdbcdb",
                    "postgres",
                    "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
