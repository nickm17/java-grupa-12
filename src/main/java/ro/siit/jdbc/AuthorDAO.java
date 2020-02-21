package ro.siit.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface AuthorDAO {
    List<Author> findAll() throws SQLException;
    List<Author> findAllByName(String name);
    void insert(Author author);
    void delete(int id);
    int findAuthorsNr();
}
