package Act17_Garcia_Carballo_Maria_PROG_UF10;

import java.sql.*;
import java.util.Properties;

public class HacerConexion {
	
	//Variables que incluyen la informaci�n de la conexi�n
	private String url="jdbc:mysql://82.98.139.78:3306/telefonica";
	private String user="ted";
	private String password="ted2ted";
	
	//Conexi�n con 1 par�metro. En la cadena url, se incluye adem�s de la url de la conexi�n, 
	//los par�metros user y password de acceso.
	public void getConexion01()
	{
		try 
		{
		DriverManager.getConnection("jdbc:mysql://82.98.139.78:3306/telefonica?user=ted&password=ted2ted");
		System.out.println("Conexi�n realizada con �xito");
		}
		catch (SQLException exc)
		{
			System.out.println("Error de conexi�n");
		}
	}
		
	//Conexi�n con 3 par�metros. Con los tres par�metros necesarios para la conexi�n en forma de string, 
	//la url a la base de datos y el user y password para hacer la conexi�n.
	public void getConexion02()
	{
		try
		{
			DriverManager.getConnection(url, user, password);
			System.out.println("Conexi�n realizada con �xito");
		}
		catch (SQLException exc)
		{
			System.out.println("Error de conexi�n");
		}				
	}
	
	//Conexi�n con properties. Adem�s de la cadena url para la conexi�n, el segundo par�metro 
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
		System.out.println("Conexi�n realizada con �xito");
	    } catch (SQLException exc) 
		{
	    	System.out.println("Error de conexi�n");
		}
	}	
	
	public void registrarDriver() 
	{
		try 
		{ 
			Class.forName("com.mysql.jdbc.Driver"); 
			System.out.println("Driver cargado con �xito"); 
		} 
		catch (ClassNotFoundException ex) 
		{ 
			System.out.println("Error: No se puede cargar el driver:" + ex.getMessage()); 
			System.exit(1); 
		} 
	}		
}
	
	

