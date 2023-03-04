public class Citizen {
    private int cedula;
    private String name;
    private int fecha_de_nacimiento;
    private String ciudad_nacimiento;

    public Citizen(int cedula, String name, int fecha_de_nacimiento, String ciudad_nacimiento) {
        this.cedula = cedula;
        this.name = name;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.ciudad_nacimiento = ciudad_nacimiento;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(int fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getCiudad_nacimiento() {
        return ciudad_nacimiento;
    }

    public void setCiudad_nacimiento(String ciudad_nacimiento) {
        this.ciudad_nacimiento = ciudad_nacimiento;
    }
}
