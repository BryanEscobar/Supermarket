package supermercado;

import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.io.IOException;
	
	public class Datos{
	BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	
	
	public String code(){
		String valor=null;
		try{
			valor=entrada.readLine();
		}catch(IOException ioe){
			System.out.println("Error");
			System.exit(1);
		}
		return valor;
		
	}

	public int entero(){
		String numero= "1";
		int variable= 0;
		try{
			variable=Integer.parseInt(entrada.readLine());
		}catch(IOException ioe){
			System.out.println("Error ");
			System.exit(1);
		}
		return variable;
	
	
	}

public double decimal(){
		double variable= 0;
		try{
			variable=Double.parseDouble(entrada.readLine());
		}catch(IOException ioe){
			System.out.println("Error ");
			System.exit(1);
		}
		return variable;
	
	}
	
	
	

	
}



					
					
	