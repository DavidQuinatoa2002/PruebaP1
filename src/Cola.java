import java.util.*;

public class Cola {

    private LinkedList<PersonaDavidQuinatoa> cola;

    public Cola() {
        cola = new LinkedList<>();
    }


    public void agregarPersona(PersonaDavidQuinatoa persona) {
        if (!cola.contains(persona)) {
            cola.add(persona);
        } else {
            System.out.println("La cédula " + persona.getCedula() + " ya existe en la cola.");
        }
    }


    public List<PersonaDavidQuinatoa> mostrarColaPorEdad() {
        cola.sort(Comparator.comparingInt(PersonaDavidQuinatoa::getEdad).reversed());
        return cola;
    }


    public List<PersonaDavidQuinatoa> filtrarPersonas(String generoFiltrado, int edadMinima, String regionFiltrada) {
        List<PersonaDavidQuinatoa> personasFiltradas = new ArrayList<>();
        for (PersonaDavidQuinatoa persona : cola) {
            if (persona.getGenero().equalsIgnoreCase(generoFiltrado) && persona.getEdad() >= edadMinima && persona.getRegion().equalsIgnoreCase(regionFiltrada)) {
                personasFiltradas.add(persona);
            }
        }
        return personasFiltradas;
    }
}




