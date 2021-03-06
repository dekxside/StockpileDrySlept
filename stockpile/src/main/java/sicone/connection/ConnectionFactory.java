package sicone.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * classe responsavel por criar e fechar a conexao com o banco de dados.
 * @author Dodo
 *
 */
public class ConnectionFactory {

//	private static final String DRIVER = "com.mysql.jdbc.Driver";
//	private static final String URL = "jdbc:mysql://127.0.0.1:49442/localdb";
//	private static final String USER = "azure";
//	private static final String PASS = "6#vWHD_$";
	
//	private static final String DRIVER = "com.mysql.jdbc.Driver";
//	private static final String URL = "jdbc:mysql://localhost:3306/sicone";
//	private static final String USER = "root";
//	private static final String PASS = "";

	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static final String USER = "system";
	private static final String PASS = "alunofatec";

	/**
	 * metodo responsavel por criar conexao com o banco de dados.
	 * 
	 * @return connection
	 */
	public static Connection createConnection() {
		Connection connection = null;

		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER, PASS);
			
			

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Erro ao criar conex�o com o banco de dados: " + URL);
			throw new RuntimeException(e);
		}

		return connection;
	}

	/**
	 * metodo responsavel por fechar a conexao com o banco de dados.
	 * 
	 * @param connection
	 * @param pstmt
	 * @param rs
	 */
	public static void closeConnection(Connection connection, PreparedStatement pstmt, ResultSet rs) {

		try {
			if (connection != null) {
				connection.close();
			}

			if (pstmt != null) {
				pstmt.close();
			}

			if (rs != null) {
				rs.close();
			}

		} catch (SQLException e) {
			System.out.println("Erro ao fechar conex�o com o banco de dados: " + URL);
			throw new RuntimeException(e);
		}
	}
}
