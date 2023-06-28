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
