import java.time.LocalDate;
/**
 *
 * @author fran_
 */
public class Task {
    
    //declaración de atributos
    private String descripcion;  
    private boolean estado;
    private LocalDate fecha;
    private int numero;
    
    
    //constructores
    Task(String descripcion, LocalDate fecha, boolean estado){
        this.descripcion = descripcion;
        this.estado = estado;
        this.fecha = fecha;
    }
    
    Task(){

    }
    
    //métodos    
    void mostrarTarea(){
        
        System.out.println("Tarea # " + numero);
        
        System.out.println("Descripción : " + descripcion);
        if(estado == false){
            System.out.println("Estado : Incompleta");
        }
        else{
            System.out.println("Estado: Completa");
        }
        System.out.println("Fecha: " + fecha);
        
    }
    
    //getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
    
   
    
    
    
}
