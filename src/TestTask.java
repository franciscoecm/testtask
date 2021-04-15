import java.time.LocalDate; //Importa la clase LocalDate (para fechas)
import java.util.ArrayList; //Importa la clase ArrayList (para crear listas)
import java.util.Iterator; //Importa la clase Iterator (para recorrer listas)
import java.util.Scanner; //Importa la clase Scanner (para ingresar por teclado)
/**
 *
 * @author Francisco Carmona
 */
public class TestTask {
    
    
    public static void main(String[] args) {
        
        //Declaración de variables
        int option, counter=0, taskNumber;
        int year, month, day;
        
        String description, expirationDate;
        //Para ingresar por teclado        
        Scanner scanner = new Scanner(System.in);
        
        Task task;
        //ArrayList de la clase Task       
        ArrayList<Task> tasks;
        tasks = new ArrayList<>();
        
        //Iterador para la clase Task
        Iterator<Task> iterator = tasks.iterator();
       
        System.out.println("        .:LISTA DE TAREAS:.");
        
        //Menú de opciones
        do{
            System.out.println("======================================");
            System.out.println("1. Agregar una tarea.");
            System.out.println("2. Ver listado de tareas.");
            System.out.println("3. Mostrar una tarea.");
            System.out.println("4. Marcar una tarea como completa");
            System.out.println("5. Eliminar una tarea.");
            System.out.println("6. Salir");
            System.out.print("OPCION: ");
            option = scanner.nextInt();
            scanner.nextLine();
                        
            switch(option){
                
                case 1:
                    task = new Task();   //Creo una nueva tarea            
                    task.setNum(counter+1);
                    
                    System.out.println("Ingrese una descripcion: ");
                    description = scanner.nextLine();
                    task.setDescription(description);
                    
                    System.out.print("Ingrese la fecha límite en formato AAAA/MM/DD: ");
                    expirationDate = scanner.nextLine();
                    
                    //Separo la cadena en números y los guardo en tres variables
                    year = Integer.parseInt(expirationDate.split("/")[0]);
                    month = Integer.parseInt(expirationDate.split("/")[1]);
                    day = Integer.parseInt(expirationDate.split("/")[2]);
                    
                    //Creo un nuevo objeto de tipo LocalDate para guardar la fecha actual
                    LocalDate date = LocalDate.of(year, month, day);
                    task.setDate(date);
                    
                    //Agrego una tarea al ArrayList de tareas
                    tasks.add(counter, task); 
                    counter++;
                    break;
                
                case 2:
                    //Recorro el ArrayList para mostrar las tareas
                    for(int i = 0; i < tasks.size(); i++)
                        tasks.get(i).showTask();
                    break;
                
                case 3:
                    //Utilizo un iterador para encontrar la tarea y luego mostrarla
                    System.out.println("Ingrese el número de la tarea que desea mostrar: ");
                    taskNumber = scanner.nextInt();
                  
                    iterator = tasks.iterator();
                    
                    
                    if(!tasks.isEmpty()){
                       while(iterator.hasNext()){
                           
                           Task elemento = iterator.next();
                           
                           if(taskNumber == elemento.getNum()){
                               elemento.showTask();
                               break;
                           }
                       }
                    }
                    else{
                        System.out.println("La lista de tareas esta vacia.");
                    }
              
                    break;
                
                case 4:
                    //Utilizo un iterador para encontrar una tarea y cambiar su estado a true
                    System.out.println("Ingrese el número de la tarea que desea marcar como completa: ");
                    taskNumber = scanner.nextInt();
                    
                     iterator = tasks.iterator();
                                        
                    if(!tasks.isEmpty()){
                       while(iterator.hasNext()){
                           
                           Task elemento = iterator.next();
                           
                           if(taskNumber == elemento.getNum()){
                               elemento.setState(true);
                               break;
                           }
                       }
                    }
                    else{
                        System.out.println("La lista de tareas esta vacia.");
                    }
                  
                    break;
                
                case 5:
                    //Utilizo un iterador para encontrar una tarea y eliminarla
                    System.out.println("Ingrese el número de la tarea que desea eliminar: ");
                    taskNumber = scanner.nextInt();
                                        
                    iterator = tasks.iterator();
                                        
                    if(!tasks.isEmpty()){
                       while(iterator.hasNext()){
                           
                           Task elemento = iterator.next();
                           
                           if(taskNumber == elemento.getNum()){
                               iterator.remove();
                               break;
                           }
                       }
                    }
                    else{
                        System.out.println("La lista de tareas esta vacia.");
                    }
                    break;
               
                default:
                    System.out.println("Opción no válida.");
                  
                    break;
            }          
        }while(option != 6);
    }
   
}
