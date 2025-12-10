package udla.jbonilla.pooInterfaces.imprenta.modelo;

abstract public class Hoja {
    /** Declaracion de Atributos */

    protected String contenido;

    /** Constructores y Destructores */

    public Hoja(String contenido) {
        this.contenido = contenido;
    }
    /** Metodos Abstractos */

    abstract public String imprimir();

}
