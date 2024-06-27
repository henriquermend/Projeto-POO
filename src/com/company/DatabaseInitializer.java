import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseInitializer {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "root";

        String[] sqlStatements = {
                "DROP DATABASE IF EXISTS QCurso;",
                "CREATE DATABASE QCurso;",
                "USE QCurso;",
                "CREATE TABLE IF NOT EXISTS Gerente(" +
                        "email VARCHAR(45), PRIMARY KEY (email), " +
                        "nome VARCHAR(45), telefone VARCHAR(45), senha VARCHAR(45));",
                "CREATE TABLE IF NOT EXISTS Professor(" +
                        "email VARCHAR(45), PRIMARY KEY(email), " +
                        "nome VARCHAR(45), telefone VARCHAR(45), senha VARCHAR(45));",
                "CREATE TABLE IF NOT EXISTS Aluno(" +
                        "email VARCHAR(45), PRIMARY KEY (email), " +
                        "nome VARCHAR(45), telefone VARCHAR(45), senha VARCHAR(45));",
                "CREATE TABLE IF NOT EXISTS Curso(" +
                        "nome VARCHAR(45), PRIMARY KEY(nome), " +
                        "descricao VARCHAR(1000), tempo VARCHAR(12), " +
                        "quantidadeDeAlunos VARCHAR(100), id VARCHAR(100));",
                "CREATE TABLE IF NOT EXISTS Inscricoes(" +
                        "aluno_id VARCHAR(45), curso_id VARCHAR(45));",
                "CREATE TABLE IF NOT EXISTS Ministrada(" +
                        "professor_id VARCHAR(45), curso_id VARCHAR(45));"
        };

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            for (String sql : sqlStatements) {
                statement.execute(sql);
            }

            System.out.println("Banco de dados e tabelas criados com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
