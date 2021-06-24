/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author sebas
 */
public class AlumnoActivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno AlumnoA= new Alumno("319159799", "ICO", 3, "Juan", 20, 1, 1.66f);
        
        System.out.println("------Tus datos son------");
        System.out.println("Nombre: "+AlumnoA.getNombre());
        System.out.println("Edad: "+AlumnoA.getEdad());
        System.out.println("Genero: "+AlumnoA.getGenero());
        System.out.println("Altura: "+AlumnoA.getAltura());
        System.out.println("Numero de Cuenta: "+AlumnoA.getNumeroCuenta());
        System.out.println("Carrera: "+AlumnoA.getCarrera());
        System.out.println("Semestre: "+AlumnoA.getSemestre());
        
    }
    
}
