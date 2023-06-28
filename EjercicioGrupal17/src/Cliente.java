public class Cliente extends Usuario{

    private String nombres;
    private String apellidos;
    private String direccion;
    private String comuna;
    private int edad;
    private String telefono;
    private String afp;
    private int salud;




    public Cliente() {

    }



    public Cliente(String nombre, String fec_nacimiento, String run, String nombres, String apellidos, String direccion, String comuna, int edad, String telefono, String afp, int salud) {
        super(nombre, fec_nacimiento, run);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
        this.telefono = telefono;
        this.afp = afp;
        this.salud = salud;
    }

    @Override
    public void analizarUsuario(){
        super.analizarUsuario();

        System.out.println(
                "Nombres:" + nombres + '\n' +
                        "Apellidos: " + apellidos + '\n' +
                        "Telefono :" + telefono + '\n' +
                        "Afp:" + afp + '\n' +
                        "Salud:" + salud + '\n' +
                        "Direccion:" + direccion + '\n' +
                        "Comuna:" + comuna + '\n' +
                        "Edad:" + edad);

    }

}
