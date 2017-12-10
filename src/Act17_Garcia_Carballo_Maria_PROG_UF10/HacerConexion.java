package Act17_Garcia_Carballo_Maria_PROG_UF10;

import java.sql.*;
import java.util.Properties;

public class HacerConexion {
	
	//Variables que incluyen la información de la conexión
	private String url="jdbc:mysql://82.98.139.78:3306/telefonica";
	private String user="ted";
	private String password="ted2ted";
	
	//Conexión con 1 parámetro. En la cadena url, se incluye además de la url de la conexión, 
	//los parámetros user y password de acceso.
	public void getConexion01()
	{
		try 
		{
		DriverManager.getConnection("jdbc:mysql://82.98.139.78:3306/telefonica?user=ted&password=ted2ted");
		System.out.println("Conexión realizada con éxito");
		}
		catch (SQLException exc)
		{
			System.out.println("Error de conexión");
		}
	}
		
	//Conexión con 3 parámetros. Con los tres parámetros necesarios para la conexión en forma de string, 
	//la url a la base de datos y el user y password para hacer la conexión.
	public void getConexion02()
	{
		try
		{
			DriverManager.getConnection(url, user, password);
			System.out.println("Conexión realizada con éxito");
		}
		catch (SQLException exc)
		{
			System.out.println("Error de conexión");
		}				
	}
	
	//Conexión con properties. Además de la cadena url para la conexión, el segundo parámetro 
	//es una referencia a un objeto Properties, que define un conjunto de pares de valores, 
	//en el que al menos estar el par formado para los valores de user y password
	public void getConexion03()
	{
		try
		{
		Properties connectionProps = new Properties(); 
		   connectionProps.put("user", user); 
		   connectionProps.put("password", password); 
		DriverManager.getConnection(url, connectionProps); 
		System.out.println("Conexión realizada con éxito");
	    } catch (SQLException exc) 
		{
	    	System.out.println("Error de conexión");
		}
	}	
	
	public void registrarDriver() 
	{
		try 
		{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			System.out.println("Driver cargado con éxito"); 
		} 
		catch (ClassNotFoundException ex) 
		{ 
			System.out.println("Error: No se puede cargar el driver:" + ex.getMessage()); 
			System.exit(1); 
		} 
	}		
}
	
	

