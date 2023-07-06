/*
    Principio de Responsabilidad Única (SRP):
    En la clase Main, se encarga principalmente de inicializar los objetos y llamar a los métodos correspondientes. A simple vista, no parece haber violaciones claras del principio SRP.

    Principio de Abierto/Cerrado (OCP):
    El código de la clase Main no muestra claramente cómo se extiende el comportamiento de las clases existentes sin modificarlas. Sin embargo, es posible que existan extensiones y modificaciones en las clases Cliente, Administrativo y Profesional que no se muestran en el código proporcionado.

    Principio de Sustitución de Liskov (LSP):
    No se pueden identificar claramente las relaciones de herencia y las sustituciones en el código proporcionado. Sería necesario revisar las definiciones de las clases Cliente, Administrativo y Profesional para verificar si se cumplen las condiciones del principio LSP.

    Principio de Segregación de Interfaces (ISP):
    El código proporcionado no muestra explícitamente interfaces ni su implementación, por lo que no se puede evaluar la segregación de interfaces.

    Principio de Inversión de Dependencia (DIP):
    En el código proporcionado, la clase Listado se utiliza para agregar y listar usuarios. Sin ver su implementación, no podemos asegurar si se cumple el principio de inversión de dependencia.
 */
public class Main {

    public static void main(String[] args) {

        Listado lista = new Listado();

        // 1 cliente, 2 profesionales y dos administrativos


        /**
         * En los constructores se cumple el principio de sustitución de Liskov ya que en la creación de los objetos de cada clase
         *  se instancia en la sustitución por la clase hija de menor nivel que al instanciarse no afecta el comportamiento de la clase padre : Ejemplo todos son Usuarios , pero varias clases heredan de esta,
         * por lo que su instanciacion será su respectiva subclase
         */

        Cliente c1 = new Cliente( "Juanito Perez" , "1990-08-01" , "17985632-7" , "Juan" , "Perez Machuca" , "Los Queules 174" ,"Coronel" ,31 ,"78954455","Modelo" , 1 );
        Administrativo a1 = new Administrativo("María José Eguiguren", "2000-10-14", "21695882-6","Contabilidad","no");

        Administrativo a2 = new Administrativo("Pedro Pérez","1975-06-22","9555632-4","Gerente de Finanzas","21 años");

        Profesional p1 = new Profesional("Josefa Gonzalez", "1989-04-21", "18995657-4", "Prevencionista SERNAGEOMIN", "2021-02-28");

        Profesional p2 = new Profesional("Ivan Contreras" , "1996-05-05" , "18758966-k" , "Ingeniero Comercial" , "2017-12-01");

        lista.addUsuario(c1);
        lista.addUsuario(a1);
        lista.addUsuario(a2);
        lista.addUsuario(p1);
        lista.addUsuario(p2);

        System.out.println("*** LISTA DE USUARIOS ***");

        lista.listarUsuarios();
    }
}
