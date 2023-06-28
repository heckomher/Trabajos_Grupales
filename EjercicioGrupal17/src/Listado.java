import java.util.ArrayList;
import java.util.List;

public class Listado {

    List<Asesoria> lista;

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
