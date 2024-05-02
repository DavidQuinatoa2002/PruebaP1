public class PersonaDavidQuinatoa {
    private String cedula;
    private String nombre;
    private int edad;
    private String genero;
    private String region;

    public PersonaDavidQuinatoa(String cedula, String nombre, int edad, String genero, String region) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.region = region;
    }

    public PersonaDavidQuinatoa() {
        this.cedula = "1728445110";
        this.nombre = "David Quinatoa";
        this.edad = 21;
        this.genero = "Masculino";
        this.region = "Sierra";
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }




}
