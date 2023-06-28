public class Profesional extends Usuario{
    private String titulo;
    private String fecha_ingreso;

    public Profesional() {

    }

    public Profesional(String nombre, String fec_nacimiento, String run, String titulo, String fecha_ingreso) {
        super(nombre, fec_nacimiento, run);
        this.titulo = titulo;
        this.fecha_ingreso = fecha_ingreso;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + this.titulo);
        System.out.println("Fecha Ingreso: " + this.fecha_ingreso);

    }


}
