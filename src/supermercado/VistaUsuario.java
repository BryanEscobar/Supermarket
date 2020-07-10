package supermercado;

import java.io.IOException;
import static supermercado.Supermercado.lUsuarios;

public class VistaUsuario{
	Datos texto=new   Datos();
	ManejadorUsuario hola=new ManejadorUsuario();
	
        
        public void iniciarMenu() throws IOException{
            Datos texto2 = new Datos();
            System.out.println("========== Seleccione una opcion ===============");
            System.out.println("1. Iniciar sesion");
            System.out.println("2. Crear usuario");
            System.out.println("3. Salir");
            String op = texto2.code();
            if(op.equalsIgnoreCase("1")){
                vistaU();
                iniciarMenu();
            }else if(op.equalsIgnoreCase("2")){
                lUsuarios.crearNuevoUsuario();
                System.out.println("");
                System.out.println("");
                iniciarMenu();
            }else{
                
            }
        }
        
        
	public void vistaU()throws IOException{
	String usuario;
	String clave;
	String rol;
	System.out.println("------------------------------");
	System.out.println("Ingrese el usuario");
	System.out.println("------------------------------");
	usuario=texto.code();
	System.out.println("------------------------------");
	System.out.println("Ingrese la clave");
	System.out.println("------------------------------");
	clave=texto.code();
	
	
	hola.logIn(usuario,clave);
	}


}