package supermercado;

import java.util.ArrayList;
import java.io.IOException;
import static supermercado.Supermercado.lUsuarios;

public class ManejadorUsuario{

	VistaProducto menu=new VistaProducto();
	//Usuario users=new Usuario();
	int contador=0;
	
        
	public void logIn(String usuario1, String clave)throws IOException{
            boolean existeUsuario= lUsuarios.existeUsuario(usuario1, clave);
            boolean esAdmin = lUsuarios.esAdministrador(usuario1, clave);
            if(existeUsuario){
                if(esAdmin){
                    System.out.println("Bienvenido buen adminstrador");
			menu.menuAdmin();
                }else{
                    System.out.println("Bienvenido no eres un administrador");  
                    menu.menuCajero();
                    
                }
            }else{
                System.out.println("Error, el usuario no es valido");
            }  
            
            
          /*
		if(usuario1.equals(users.getUsuario()) && clave.equals(users.getClave()) ){
		if(users.getRol().equals("a")){
			System.out.println("Bienvenido buen adminstrador");
			menu.menuAdmin();
		}else{
			System.out.println("tus datos son invalidos");
		}
		}else{
			contador++;
			}*/	
		
	}
}