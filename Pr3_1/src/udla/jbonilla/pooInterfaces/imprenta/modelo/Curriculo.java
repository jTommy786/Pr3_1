package udla.jbonilla.pooInterfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja{

    /** Declaracion de Atributos */

    private String persona;
    private String carrera;
    private List<String> experiencia;

    /** Constructor */

    public Curriculo(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculo addExperiencia (String exp){
        experiencia.add(exp);
        return this;
    }

    /** Importar la clase abstracta*/

    @Override
    public String imprimir() {

        String StringBuilder = ("Nombre : " + this.persona + "\n" + "Resumen : " + this.contenido + "Profesion : " + this.carrera );
        for(String exp: this.experiencia){

        }

        /**
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre : " + this.persona).append("\n")
                .append("Resumen : ").append(this.contenido)
                .append("\n").append("Profesion : ")
                .append(this.carrera).append("\n");

        for(String exp: this.experiencia){
            sb.append("- ").append(exp).append("\n");
        }

        return sb.toString();

         */

        return StringBuilder;

    }
}
