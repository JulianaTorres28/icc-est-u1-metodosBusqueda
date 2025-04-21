import controllers.MetodosBusqueda;
import models.Person;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {

        ShowConsole showConsole = new ShowConsole();

        int numero = showConsole.getInt("Ingrese cantidad de Personas del listado: ");
        Person[] personas = new Person[numero];
        
        for(int i = 0; i < numero; i++) {
            System.out.println("Ingrese Persona:");
            String nombre = showConsole.getString("Nombre: ");
            int age;
            do {
                age = showConsole.getInt("Edad: ");
                if (age < 0) {
                    System.out.println("La edad no puede ser negativa. Intente de nuevo.");
                }
            } while (age < 0);
            personas[i] = new Person(nombre, age);
        }

        // Aquí llamas directamente a la clase que ya ordena y busca
        MetodosBusqueda mB = new MetodosBusqueda(personas);
    }
}
