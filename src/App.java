import controllers.MetodosBusqueda;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] personas= new Person[7];
        personas[0]= new Person (101, "Juan");
        personas[1]= new Person (102, "Mauricio");
        personas[2]= new Person (103, "Miguel");
        personas[3]= new Person (104, "Carlos");
        personas[4]= new Person (105, "Ana");
        personas[5]= new Person (106, "Maria");
        personas[6]= new Person (107, "Sofia");
        MetodosBusqueda mB = new MetodosBusqueda(personas);
        

    }
}
