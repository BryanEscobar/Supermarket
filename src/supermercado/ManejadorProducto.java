package supermercado;

import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManejadorProducto {

    Datos data = new Datos();
    ArrayList<Producto> espacios = new ArrayList<Producto>();
    int codigos;
    int cantidad;
    double precio;
    String a;
    String nombre;
    String descripcion;
    int opcion = 0;
    int b = 0;
    double c = 0;
    int retorno = 0;
    String y;

    public void ingresoProducto(int codigos, String nombre, String descripcion, int cantidad, double precio) {
        espacios.add(new Producto(codigos, nombre, descripcion, cantidad, precio));
    }

    public void reporte() throws IOException {
        for (int i = 0; i < espacios.size(); i++) {
            codigos = espacios.get(i).getCodigo();
            nombre = espacios.get(i).getNombre();
            descripcion = espacios.get(i).getDescripcion();
            cantidad = espacios.get(i).getCantidad();
            precio = espacios.get(i).getPrecio();
            System.out.println("----------------------------------------------------------------");
            System.out.println("Productos " + i);
            System.out.println("   ");
            System.out.println("El codigo :   " + codigos);
            System.out.println("Nonbre de tu producto: " + nombre);
            System.out.println("Descripcion : " + descripcion);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio : " + precio);
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("==================  Impresion de reporte ============================");
        System.out.println("Desea guardar el reporte? Ingrese 1 de lo contrario ingrese 2");
        retorno = data.entero();
        if (retorno == 1) {
            System.out.println("pon la ruta que ingresaste los datos");
            y = data.code();
            String ruta = y;
            File archivo = new File(ruta);
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Reorte producto");
            bw.newLine();
            for (int i = 0; i < espacios.size(); i++) {
                codigos = espacios.get(i).getCodigo();
                nombre = espacios.get(i).getNombre();
                descripcion = espacios.get(i).getDescripcion();
                precio = espacios.get(i).getPrecio();
                cantidad = espacios.get(i).getCantidad();
                bw.write("Producto" + i);
                bw.newLine();
                bw.write("Codigo:  " + codigos);
                bw.newLine();
                bw.write("tu producto  " + nombre);
                bw.newLine();
                bw.write("Descripcion:  " + descripcion);
                bw.newLine();
                bw.write("Precio:  " + precio);
                bw.newLine();
                bw.write("Cantidad:  " + cantidad);
                bw.newLine();

            }
            bw.close();
        }else
        {
           
        }
    }

    public void modificar() {

        System.out.println("Desbes ingresar el producto a modificar");
        codigos = data.entero();
        for (int i = 0; i < espacios.size(); i++) {
            if (codigos == espacios.get(i).getCodigo()) {
                do {
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("1:modificacion de producto");
                    System.out.println("2: modificacion de se descripcion");
                    System.out.println("3: modificacion de cantidad del producto");

                    System.out.println("----------------------------------------------------------------");
                    opcion = data.entero();

                    switch (opcion) {
                        case 1:
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("Ingreso a modificacion");
                            System.out.println("Pon el producto a modificar");
                            a = data.code();
                            espacios.get(i).setNombre(a);
                            System.out.println("----------------------------------------------------------------");
                            break;
                        case 2:
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("modificacion descripcion");
                            System.out.println("su nueva descripcion");
                            a = data.code();
                            espacios.get(i).setDescripcion(a);
                            System.out.println("----------------------------------------------------------------");
                            break;
                        case 3:
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("cantidad del producto que modificaste");
                            System.out.println("su neuva cantidad");
                            b = data.entero();
                            espacios.get(i).setCantidad(b);
                            System.out.println("----------------------------------------------------------------");
                            break;

                        default:
                            System.out.println("tu opcion es invalida amigo");
                            break;

                    }
                    System.out.println("Deseas seguir pon 1 y si no pon 2");
                    retorno = data.entero();
                } while (retorno == 1);

            }
        }

    }

    public void eliminar() {
        do {
            System.out.println("Pon el codigo del producto a modificar");
            codigos = data.entero();
            for (int i = 0; i < espacios.size(); i++) {
                if (codigos == espacios.get(i).getCodigo()) {

                    System.out.println("----Eliminar----");
                    espacios.remove(i);
                }
            }
            System.out.println("Deseas seguir pon 1 y si no pon 2");
            retorno = data.entero();
        } while (retorno == 1);
    }
}
