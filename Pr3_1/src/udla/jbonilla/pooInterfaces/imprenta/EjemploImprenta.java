package udla.jbonilla.pooInterfaces.imprenta;


import udla.jbonilla.pooInterfaces.imprenta.modelo.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjemploImprenta {
    public static void main(String[] args) {
        /** Declaracion de Objetos*/

        Curriculo cv = new Curriculo("JJ", "Ing. de Software", "Resumen Laboral");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring FrameWork");
        cv.addExperiencia("Fullstack Developer");
        cv.addExperiencia("Angular");

        Informe informe = new Informe("JJ", "SR", "Estudio de Hoja de Vida");

        /**Llamar al Metodo que invoca al metodo abstracto*/

        imprimir(cv);
        System.out.println();
        imprimir(informe);


    }

    public static void imprimir (Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}