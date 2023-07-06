public class Usuario implements Asesoria{

    private String nombre;
    private String fec_nacimiento;
    private String run;

    public Usuario() {
    }

    public Usuario(String nombre, String fec_nacimiento, String run) {
        this.nombre = nombre;
        this.fec_nacimiento = fec_nacimiento;
        this.run = run;
    }


    @Override
    public void analizarUsuario() {
        System.out.println("\n" + this.nombre);
    }
}

/**
 * Principio de inversión de dependencia: las clases de alto nivql por ejemplo Usuario , no depende de las
 * subclases o de bajo nivel, que es la clase padre que solo implementa una abstracción de metodos de una interface: Asesoría
 */

/**
 * Principio de responsabilidad única: se encarga de representar y gestionar los datos básicos de un usuario
 */