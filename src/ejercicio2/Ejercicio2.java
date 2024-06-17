package ejercicio2;

import co.edu.uniminuto.entity.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * 2.El departamento escolar de la facultad de ingeniería necesita obtener un
 * reporte global de los promedios de sus estudiantes y que muestre el promedio
 * de cada uno, nombres, apellidos, carrera y semestre. Se debe imprimir el
 * promedio global y cada uno de los datos de los estudiantes.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
        List<Estudiante> listEstudiantes = new ArrayList<>();
        short opcion = 0;
        double promedio = 0;
        String nombre = "";
        String apellido = "";
        String carrera = "";
        String semestre = "";
        Estudiante estudiante;// declaración de objeto de tipo estudiante
        try {
            do {
                nombre = JOptionPane.showInputDialog("Dame tu Nombre:");
                apellido = JOptionPane.showInputDialog("Dame tu Apellido:");
                carrera = JOptionPane.showInputDialog("Dame tu Carrera:");
                semestre = JOptionPane.showInputDialog("Dame tu Semestre:");
                promedio=Double.parseDouble(JOptionPane.showInputDialog("Dame el promedio:"));
                if ((promedio >= 0) && (promedio <= 5)) {
                    estudiante = new Estudiante(nombre, apellido, carrera, semestre, promedio);
                    listEstudiantes.add(estudiante);
                } else {
                    JOptionPane.showMessageDialog(null, "Valor fuera de rango");
                }
                opcion = Short.parseShort(JOptionPane.showInputDialog("Si no desea seguir agregando promedios presione 0 "));
            } while (opcion != 0);
        } catch (Exception e) {
            System.out.println("Error en captura de datos:" + e.getMessage());
        }
        for (Estudiante e : listEstudiantes) {
            System.out.println(e);
        }
        estudiante = new Estudiante();
        double avgGlobal = estudiante.promediarGlobal(listEstudiantes);
        System.out.println("Promedio Gloabal:" + avgGlobal);
    }
}
