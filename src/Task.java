import java.time.LocalDate; //Importa la clase LocalDate (para fechas)
/**
 *
 * @author Francisco Carmona
 */
public class Task {
    
    //Declaración de atributos
    private String description;  
    private boolean state;
    private LocalDate date;
    private int num;
    
    
    //Constructores
    public Task(String description, LocalDate date, boolean state){
        this.description = description;
        this.state = state;
        this.date = date;
    }
    
    public Task(String description, boolean state){
        this.description = description;
        this.state = state;
    }
    
    public Task(){

    }
    
    //Métodos    
    void showTask(){
        System.out.println("======================================");
        System.out.println("Tarea # " + num);
        
        System.out.println("Descripción : " + description);
        if(state == false){
            System.out.println("Estado : Incompleta");
        }
        else{
            System.out.println("Estado: Completa");
        }
        System.out.println("Fecha: " + date);
        
    }
    
    //Getters y Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
  
}
