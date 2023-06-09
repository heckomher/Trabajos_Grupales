// INTEGRANTES

/*ALAN VERA
JOAQUÍN DE LA HUERTA
HECTOR KOMORI
VICTOR RIVAS*/

import java.util.Scanner;

public class CargaUsuarios {
    public static void main(String[] args) {

        String nombre;
        String fnac;
        String run;

        int tipo ;
        int empleados = 0 , experiencia = 0;
        String direccion = "" , telefono ="" , departamento="" , funcion ="" , nombreSuperior ="";

        Scanner leer = new Scanner(System.in);

        System.out.println("Nombre del usuario");
        nombre = leer.next();

        System.out.println("Fecha de Nacimiento");
        fnac = leer.next();

        System.out.println("RUN");
        run = leer.next();

        System.out.println("Perfil usuario");
        tipo = leer.nextInt();

        switch(tipo){
            case 1:
                System.out.println("Dirección");
                direccion = leer.next();
                System.out.println("Teléfono");
                telefono = leer.next();
                System.out.println("Cantidad de empleados");
                empleados = leer.nextInt();
            break;
            case 2:
                System.out.println("Años de Experiencia");
                experiencia = leer.nextInt();
                System.out.println("Departamento");
                departamento = leer.next();

            break;
            case 3:
                System.out.println("Función");
                funcion = leer.next();
                System.out.println("Nombre del Superior");
                nombreSuperior = leer.next();

            break;

        }

        System.out.println( "EMPLEADO REGISTRADO \n\n");
        System.out.println("Nombre del usuario: " + nombre);
        System.out.println("Fecha de Nacimiento: " + fnac);
        System.out.println("RUN : " + run);

        switch(tipo){
            case 1:
                System.out.println("Dirección : " + direccion);

                System.out.println("Teléfono :" + telefono);

                System.out.println("Cantidad de empleados : " + empleados);

                break;
            case 2:
                System.out.println("Años de Experiencia: " + experiencia);

                System.out.println("Departamento : " + departamento);


                break;
            case 3:
                System.out.println("Función : " + funcion);
                System.out.println("Nombre del Superior: " + nombreSuperior);
                break;

        }

    }

}
