package supermercado;

public class Usuario{
	String usuario; //id
	String clave; //pass
	String rol; // a-> admin x -> cualquier cosa
        String nombre;
        String apellido;
        int edad;
        
	
	//administrador
        public Usuario(String usr, String clave ){
            this.nombre= "Bryan";
            this.clave= "123";
            this.rol="a";
            this.usuario= usr;
            this.apellido="Escobar";
            this.edad=17;
        }
        
        //usuario cualquiera
        public Usuario(String nombre, String apellido, int edad, String clave, int id)
        {
            this.nombre= nombre;
            this.apellido= apellido;
            this.edad= edad;
            this.clave= clave;
            this.usuario= id+nombre;
            this.rol= "x";
        }
       /* 
	public Usuario(){
		usuario="bryan";
		clave="123";
		rol="a";
	}*/

    Usuario() {
        
    }

	public String getUsuario(){		
		return usuario;
	}
	public String getClave(){		
		return clave;
	}
	public String getRol(){
		return rol;		
	}

}