/*
Principio de Responsabilidad Única (SRP):
La clase Listado parece tener una única responsabilidad: gestionar una lista de objetos de tipo Asesoria y proporcionar métodos para agregar usuarios y listarlos. Esto sugiere que la clase cumple con el principio SRP.

Principio de Abierto/Cerrado (OCP):
En la implementación actual, la clase Listado no muestra una extensión clara sin modificaciones. Sin embargo, dado que la clase utiliza una lista genérica, es posible que se pueda extender mediante la adición de métodos adicionales que operen en la lista de Asesoria sin modificar directamente la clase Listado.

Principio de Sustitución de Liskov (LSP):
Dado que no se muestra la definición de la clase Asesoria, no podemos evaluar directamente si se cumple el principio LSP. Sería necesario revisar cómo se implementa la clase Asesoria y cómo se relaciona con sus subclases.

 Principio de Inversión de Dependencia (DIP):
La clase Listado depende de la interfaz List y de la clase concreta ArrayList para almacenar y operar en la lista de Asesoria. En términos generales, la clase Listado está dependiendo de abstracciones más altas (la interfaz List) en lugar de depender directamente de implementaciones concretas. Esto indica una forma de cumplir con el principio DIP.
 */
import java.util.ArrayList;
import java.util.List;

public class Listado {

    List<Asesoria> lista;

    /**
     * Principio de responsabilidad única: Esta clase tienen la responsabilidad exclusiva en las funciones de lista
     * de almacenamiento y vista de los objetos de la que implementan la interface Asesoría
     */

    /**
     * Principio de abierto - cerrado, esta clase está abierto para ser utilizada en cualquier parte del programa en donde
     * se necesita instanciar una lista de usuario, abierta para extender cualquier clase desde esta clase y cerrado a modificar la estructura de esta clase
     */

    public Listado() {
        this.lista = new ArrayList<Asesoria>();
    }

    public void addUsuario( Asesoria us ){
        this.lista.add(us);
    }

    public void listarUsuarios(){

        for ( Asesoria el : lista
             ) {
            el.analizarUsuario();

        }

    }


}
