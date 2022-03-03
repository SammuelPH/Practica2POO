public class Estudiante {

    String nombre;
    int numcontrol;
    String materia;
    int calificacion;
    String estado;

    public Estudiante (String nombre, int numcontrol, String materia, int calificacion, String estado) {

        setnombre(nombre);
        setncontrol(numcontrol);
        setmateria(materia);
        setcalificacion(calificacion);
        setestado(estado);
    }

    //Colocamos los setters
    public void setnombre (String nombre) {
        this.nombre = nombre;
    }
    public void setncontrol (int numcontrol) {
        this.numcontrol = numcontrol;
    }
    public void setmateria (String materia) {
        this.materia = materia;
    }
    public void setcalificacion (int calificacion) {
        this.calificacion = calificacion;
    }
    public void setestado (String estado) {
        this.estado = estado;
    }

    //Colocamos los getters
    public String getnombre(){
        return nombre;
    }
    public int getNControl() {
        return numcontrol;
    }
    public String getmateria() {
        return materia;
    }
    public int getcalificacion() {
        return calificacion;
    }
    public String getestado() {
        return estado;
    }
}