package br.com.eoflores.projetojsf.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.Scanner;

import br.com.eoflores.projetojsf.config.ConnectionFactory;

public class Teste {

	public static void main(String[] args) {
		// Scanner entrada = new Scanner(System.in);

		try {
			System.out.println(" Abrindo conexão ... ");
			Connection conexao = ConnectionFactory.createConnection();

			/* INICIO INCLUINDO REGISTRO */
			/*
			int id = 3;
			System.out.println(" Digite o nome da editora : ");
			// String nome = entrada.nextLine();
			String nome = "Editora New Order";

			System.out.println(" Digite o email da editora : ");
			// String email = entrada.nextLine();
			String email = "neworder@email.com";

			String sql = " INSERT INTO editora " + " VALUES (?, ?, ?)";

			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1, id);
			comando.setString(2, nome);
			comando.setString(3, email);
			
			System.out.println(sql);

			System.out.println(" Executando comando ... ");
			comando.execute();
			*/
			/* FIM INCLUINDO REGISTRO */
			
			/* INICIO LISTANDO REGISTRO */

			String sql = " SELECT * FROM Editora;";

			PreparedStatement comando = conexao.prepareStatement(sql);
			System.out.println(sql);
			
			System.out.println(" Executando comando ... ");
			ResultSet resultado = comando.executeQuery();

			while ( resultado . next ()) {
				int id = resultado.getInt("id");
				String nome = resultado.getString("nome");
				String email = resultado.getString("email");
				System.out.println(id + ", " + nome + ", " + email);
			}

			/* FIM LISTANDO REGISTRO */

			System.out.println(" Fechando conexão ... ");
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
