package br.com.eoflores.projetojsf.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public static Connection createConnection() {
		String stringDeConexao = "jdbc:postgresql://localhost:5432/teste";
		String usuario = "postgres";
		String senha = "postgres";

		Connection conexao = null;

		try {
			conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexao;
	}
}
