package controllers;

import views.ShowConsole;
import models.Person;

public class MetodosBusqueda {
    private ShowConsole showConsole;
    private Person[] people;

    public MetodosBusqueda(Person[] persons){
        showConsole = new ShowConsole();
        this.people = persons;
        showPersonByCode();
    }
    public int busquedaLineal(int[] arreglo, int valorBuscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscar) 
                return i;
        }
        return -1; 
    }

    /**
     * 
     * 
     * return la posicion del valor buscadp
     */
    public int findPersonByCode(int code){
        for(int i = 0; i < people.length; i++){
            if (people[i].getCode()==code) {
                return i;
            }
        }
        return -1;
    }

    public void showPersonByCode(){
        int codeToFind = showConsole.getCode();//llamar al metodo de obetener un número
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson>=0) {
            showConsole.showMessage("Persona encontrada");
            showConsole.showMessage(people[indexPerson].toString());//to string para que agarre como texto 
        }else{
            showConsole.showMessage("Persona con código "+codeToFind+"no encontrada");
        }
    }
}

