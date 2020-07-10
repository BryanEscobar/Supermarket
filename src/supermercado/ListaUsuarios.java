/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.ArrayList;


/**
 *
 
 */
public class ListaUsuarios {
    
    ArrayList<Usuario> lUsuarios;
    
    public ListaUsuarios(){
        this.lUsuarios= new ArrayList<>();
    }
    
    public void ingresarUsuario(Usuario usr){
        this.lUsuarios.add(usr);
    }
    
    public boolean existeUsuario(String nombre, String clave){
        Usuario temporal;
        for (int i = 0; i < lUsuarios.size(); i++) {
            temporal= lUsuarios.get(i);
            if(temporal.usuario.equalsIgnoreCase(nombre) &&
                    temporal.clave.equals(clave)){
                return true;
            }
        }
        return false;
    }
    
    public boolean esAdministrador(String nombre, String clave){
        Usuario temporal;
        for (int i = 0; i < lUsuarios.size(); i++) {
            temporal= lUsuarios.get(i);
            if(temporal.usuario.equalsIgnoreCase(nombre) &&
                    temporal.clave.equals(clave)){
                if(temporal.rol.equalsIgnoreCase("a")){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
    
    
    public void crearNuevoUsuario(){
        Datos texto = new Datos();
        Usuario nuevo= new Usuario();
        System.out.println("============ Bienvenido :D ==================");
        System.out.println("Ingresa tu nombre: ");
        nuevo.nombre= texto.code();
        System.out.println("Ingresa tu apellido: ");
        nuevo.apellido= texto.code();
        System.out.println("Ingresa tu edad: ");
        nuevo.edad= Integer.parseInt(texto.code());
        System.out.println("Ingresa tu contraseña: ");
        nuevo.clave= texto.code();
        nuevo.rol="x";
        int noUsuarios = lUsuarios.size()+1;
        nuevo.usuario=noUsuarios+nuevo.nombre;
        lUsuarios.add(nuevo);
        System.out.println("Usuario ingresado correctamente");
        System.out.println("Tu nombre de usuario es: "+ nuevo.usuario);
    }
    
    
}
