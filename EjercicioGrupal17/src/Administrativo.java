public class Administrativo extends Usuario{

    private String area;
    private String experiencia_previa; // en texto por ej: 6 meses

    public Administrativo() {

    }

    public Administrativo(String nombre, String fec_nacimiento, String run, String area, String experiencia_previa) {
        super(nombre, fec_nacimiento, run);
        this.area = area;
        this.experiencia_previa = experiencia_previa;
    }

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + this.area);
        System.out.println("Experiencia : " + this.experiencia_previa);
    }

}
