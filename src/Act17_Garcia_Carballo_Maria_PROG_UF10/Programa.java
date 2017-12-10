package Act17_Garcia_Carballo_Maria_PROG_UF10;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		HacerConexion driver = new HacerConexion();
		driver.registrarDriver();
		
		System.out.println("========MENU TIPO CONEXIONES======="); 
		System.out.println("1. Conexión con un parámetro");
		System.out.println("2. Conexión con tres parámetro");
		System.out.println("3. Conexión con properties");
		System.out.println("4. Salir");
		System.out.println("===================================");
		System.out.println("Teclea opción: ");
		
		Scanner teclado = new Scanner(System.in);
		
		HacerConexion conexion01 = new HacerConexion();
		HacerConexion conexion02 = new HacerConexion();
		HacerConexion conexion03 = new HacerConexion();
		
		if (teclado.nextInt()==1)
			conexion01.getConexion01();
		if (teclado.nextInt()==2)
			conexion02.getConexion02();
		if (teclado.nextInt()==3)
			conexion03.getConexion03();
		if (teclado.nextInt()==4)
			System.out.println("Fin de la prueba de conexiones");
		teclado.close();
	}

}
