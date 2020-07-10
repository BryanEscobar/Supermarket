
package supermercado;

import java.io.IOException;


public class Supermercado {
    
    
    public static ListaUsuarios lUsuarios = new ListaUsuarios();

    
    public static void main(String[] args) throws IOException {
        Usuario admin = new Usuario("bryan","123");
       // ListaUsuarios lUsuarios = new ListaUsuarios();
        lUsuarios.ingresarUsuario(admin);
        
        VistaUsuario mirar = new VistaUsuario();
        mirar.iniciarMenu();
//mirar.vistaU();
    }

}
