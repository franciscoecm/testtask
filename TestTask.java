import java.time.LocalDate; //importa la clase LocalDate
import java.util.ArrayList;
import java.util.Scanner; //importa la clase Scanner
/**
 *
 * @author fran_
 */
public class TestTask {
    
    public static void main(String[] args) {
        
        //declaración de variables
        int opcion, contador=0, seleccion;
        int año, mes, dia;
        
        String cadena;
        //para ingresar por teclado        
        Scanner scanner = new Scanner(System.in);
        
        //lista de arreglos de objetos de la clase Task
        Task tarea;
        ArrayList<Task> tareas;
        tareas = new ArrayList<>();
       
        System.out.println(".:LISTA DE TAREAS:.");
        System.out.println();
        
        //menú de opciones
        do{
            System.out.println("1. Agregar una tarea.");
            System.out.println("2. Ver listado de tareas.");
            System.out.println("3. Mostrar una tarea.");
            System.out.println("4. Marcar una tarea como completa");
            System.out.println("5. Eliminar una tarea.");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
                        
            switch(opcion){
                
                case 1:
                    tarea = new Task();   //creo una nueva tarea            
                    tarea.setNumero(contador+1);
                    System.out.println("Ingrese una descripcion: ");
                    cadena = scanner.nextLine();
                    tarea.setDescripcion(cadena);
                    System.out.print("Ingrese la fecha límite en formato AAAA-MM-DD: ");
                    System.out.println("Indique año: ");
                    año = scanner.nextInt();
                    System.out.println("Indique mes");
                    mes = scanner.nextInt();
                    System.out.println("Indique día");
                    dia = scanner.nextInt();
                    
                    LocalDate fecha = LocalDate.of(año, mes, dia);
                    tarea.setFecha(fecha);
                    
                    tareas.add(contador, tarea); //agrego la tarea a la lista
                    
                    contador++;
                    break;
                
                case 2:
                    for(int i = 0; i < tareas.size(); i++)
                        tareas.get(i).mostrarTarea();
                    break;
                
                case 3:
                    System.out.println("Ingrese el número de la tarea que desea mostrar: ");
                    seleccion = scanner.nextInt(); 
                    
                    if(seleccion > contador || seleccion <= 0){
                        System.out.println("No existe la tarea.");
                    }
                    
                    else{
                        tareas.get(seleccion-1).mostrarTarea(); //muestra la tarea seleccionada
                    }
                    break;
                
                case 4: 
                    System.out.println("Ingrese el número de la tarea que desea marcar como completa: ");
                    seleccion = scanner.nextInt();
                    
                    if(seleccion > contador || seleccion <= 0){
                        System.out.println("No existe la tarea.");
                    }
                    
                    else{
                        tareas.get(seleccion - 1).setEstado(true); // establece el estado de la tarea en verdadero
                    }
                    
                    break;
                
                case 5: 
                    System.out.println("Ingrese el número de la tarea que desea eliminar: ");
                    seleccion = scanner.nextInt();
                    
                    if(seleccion > contador || seleccion <= 0){
                        System.out.println("No existe la tarea.");
                    }
                    else{
                       tareas.remove(seleccion - 1);
                        System.out.println("Tarea eliminada.");
                    }   
                    break;
                    
                default:
                    System.out.println("Opcion no valida.");
                  
                    break;
            }          
        }while(opcion != 6);
    }
   
}
