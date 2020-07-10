package supermercado;

import java.io.IOException;

public class VistaProducto {

    Datos texto = new Datos();
    ManejadorProducto mProducto = new ManejadorProducto();
    int opcion = 0;
    int retorno = 0;
    String nombre;
    String descripcion;
    int cantidad;
    double precio;
    int codigo = 2018000;

    public void crearProducto() {
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese el nombre del producto ");
            nombre = texto.code();
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la descripcion del producto");
            descripcion = texto.code();
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la cantidad del producto");
            cantidad = texto.entero();
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese el precio del producto");
            precio = texto.decimal();
            System.out.println("-----------------------------------------------------------------------");
            codigo++;
            mProducto.ingresoProducto(codigo, nombre, descripcion, cantidad, precio);
            System.out.println("Se ha creado el producto "+ mProducto.nombre+" y codigo: "+ codigo+", con exito");
            System.out.println("Si desea continuar ingresando productos seleccione 1, de lo contrario seleccione 2");
            retorno = texto.entero();
        } while (retorno == 1);
    }

    public void menuAdmin() throws IOException {
        do {
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Esocoje un opcion querido amigo:");
            System.out.println("1: Ingresar productos");
            System.out.println("2: Modificar productos");
            System.out.println("3: reporte");
            System.out.println("4: Elimar un dato");
            System.out.println("Usted decida la opcion que requiera");
            System.out.println("-----------------------------------------------------------------------");
            opcion = texto.entero();

            System.out.println("-----------------------------------------------------------------------");

            switch (opcion) {
                case 1:
                    System.out.println("Ingresaste a la opcion de productos");
                    crearProducto();
                    break;
                case 2:
                    System.out.println("Usted ingreso a ingresar productos");
                    mProducto.modificar();
                    break;
                case 3:
                    System.out.println("usted ingreso al reporte de los productos ingresados");
                    mProducto.reporte();
                    break;
                case 4:
                    System.out.println("eliminaras un producto");
                    mProducto.eliminar();
                    break;
                default:
                    System.out.println("tu opcion es invalida");
                    break;
            }
            System.out.println("Desea continuar en el menu de Administrador, colocar 1, de lo contrario colocar 2");
            retorno = texto.entero();
        } while (retorno == 1);

    }

    public void menuCajero() throws IOException {

        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("opearaciones que trabajaras :");
            System.out.println("1. Ingresar Productos");
            System.out.println("2. Reporte de producto");
            opcion = texto.entero();
            System.out.println("-----------------------------------------------------------------------");
            switch (opcion) {
                case 2: {
                    mProducto.reporte();
                    break;
                }

                case 1: {
                    crearProducto();
                    break;
                }
                
                default:
                    System.out.println(" tu opcion es incorrecta ");
                    break;

            }
            System.out.println("usted desea recgresar a menu de cajero pon 1 y si no pon 2");
            retorno = texto.entero();
        } while (retorno == 1);

    }
}
