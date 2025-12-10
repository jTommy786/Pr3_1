package udla.jbonilla.pooInterfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    /** Atributos de la clase: */

    private String autor;
    private String revisor;

    /** Herencia deL Constructor*/

    public Informe( String autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    /** Herencia deL Metodo Abstracto*/

    @Override
    public String imprimir() {
        return "Informe Escrito por: "+ this.autor +
                "\nRevisador por : "+ this.revisor +
                "\n" + this.contenido;
    }
}
