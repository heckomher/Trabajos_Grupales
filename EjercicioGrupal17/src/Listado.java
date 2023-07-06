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
