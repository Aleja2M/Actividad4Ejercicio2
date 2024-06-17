package co.edu.uniminuto.entity;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    //1. Declaro atributos o propiedades
    String nombres;
    String apellidos;
    String carrera;
    String semestre;
    double promedio;
    //2.Metodo Constructor

    public Estudiante(String nombres, String apellidos, String carrera, String semestre, double promedio) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public Estudiante() {
    }
    
    //3.Metodo de Accessos

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double promediarGlobal(List<Estudiante> lista) {
        List<Estudiante>listaEstudiante=new ArrayList<>(lista);
        double suma=0;
        for(Estudiante e: listaEstudiante){
            //e.getPromedio(); 
            suma=suma+e.getPromedio();
        }
        return suma /listaEstudiante.size();         
    }

    //4.String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{");
        sb.append("nombres=").append(nombres);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", carrera=").append(carrera);
        sb.append(", semestre=").append(semestre);
        sb.append(", promedio=").append(promedio);
        sb.append('}');
        return sb.toString();
    }

}
