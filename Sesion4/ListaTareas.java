
import java.util.ArrayList;
import java.util.Scanner;

public class ListaTareas {
    public ArrayList<Exercise5> listaTareas = new ArrayList<Exercise5>();
    public ArrayList<String> estado = new ArrayList<String>();

    Scanner sc = new Scanner(System.in);

    public void inPutDataList() {
        //Valores del ArryList del Estado
        ArrayList<String> estado_ArrayList = new ArrayList<String>();
        estado_ArrayList.add("Activa");
        estado_ArrayList.add("En desarrollo");
        estado_ArrayList.add("Realizada");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese la tarea " + i);
            String nombre_tarea = sc.next();
            System.out.println("Duración de la tarea " + i );
            System.out.print("Ingrese las horas: ");
            Integer duracionHoras = sc.nextInt();
            System.out.print("Ingrese los minutos:"); 
            Integer duracionMin = sc.nextInt();
            System.out.println("Persona encargada de la tarea " + i);
            String persona_encargada = sc.next();
            System.out.println("Defina si la tarea" + i + " está: (Activa), (En_desarrollo) o (Realizada)");
            String estado = sc.next();
            System.out.println(comprobarEstado(estado));
            
            listaTareas.add(new Exercise5(nombre_tarea, duracionHoras, duracionMin, persona_encargada, estado));
            System.out.println("Datos ingresados correctamente de las tareas del día " + i);
            for (int i2 = 0; i2 < listaTareas.size(); i2++) {
                System.out.println(listaTareas.get(i2));
            }
        }
        
    }
    public boolean comprobarEstado (String estado){
        ArrayList<String> estado_ArrayList = new ArrayList<String>();
        estado_ArrayList.add("Activa");
        estado_ArrayList.add("En_desarrollo");
        estado_ArrayList.add("Realizada");
        boolean comprobar= false;
        if (estado.equals(estado_ArrayList.get(0))) {
            comprobar=true;
        } else if (estado.equals(estado_ArrayList.get(1))) {
            comprobar=true;
        } else if (estado.equals(estado_ArrayList.get(2))) {
            comprobar=true;
        }
    
        return(comprobar);
    }
    // USAR FOR PARA RECOPILAR DATOS
}
