public class Main {

    public static void main(String[] args) {

        Listado lista = new Listado();

        // 1 cliente , 2 profesionales y dos administrativos

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
