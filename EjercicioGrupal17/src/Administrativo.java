/*
Gracias por proporcionar la implementación de la clase Administrativo. Ahora podemos evaluar cómo se aplican los principios SOLID en esta clase:

    Principio de Responsabilidad Única (SRP):
    La clase Administrativo parece tener una única responsabilidad: representar y gestionar los datos de un usuario administrativo. No se observan violaciones claras del principio SRP en esta implementación.

    Principio de Abierto/Cerrado (OCP):
    En la implementación actual, la clase Administrativo no muestra una extensión clara sin modificaciones. Sin embargo, dado que es una subclase de Usuario, es posible que se pueda extender mediante la adición de métodos o propiedades adicionales específicas de los usuarios administrativos sin modificar directamente la clase Administrativo.

    Principio de Sustitución de Liskov (LSP):
    La clase Administrativo hereda de la clase Usuario, lo que indica una relación de herencia. A simple vista, parece que la clase Administrativo puede ser sustituida por su clase base (Usuario) sin afectar la corrección del programa. Sin embargo, para evaluar completamente si se cumple el principio LSP, necesitaría revisar la implementación de la clase Usuario y verificar si todas las precondiciones y postcondiciones se mantienen en la subclase.

    Principio de Segregación de Interfaces (ISP):
    La clase Administrativo implementa la interfaz Usuario, que sugiere que proporciona una funcionalidad coherente y específica para los usuarios. Aunque no se muestra explícitamente en la implementación proporcionada, si la interfaz Usuario define métodos adecuados para el análisis de usuarios, entonces la clase Administrativo parece cumplir con el principio ISP.

    Principio de Inversión de Dependencia (DIP):
La clase Administrativo no muestra directamente dependencias con otras clases en su implementación proporcionada. Sin embargo, dado que hereda de la clase abstracta Usuario, está siguiendo una forma de inversión de dependencia, dependiendo de abstracciones en lugar de depender directamente de implementaciones concretas.
 */
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


    /**
     * Principio de responsabilidad única: Las clases Cliente, Administrativo y Profesional se centran en los datos específicos de cada tipo de usuario y de los meétodos constructores y de mostrar sus datos
     */

}
