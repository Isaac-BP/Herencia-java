public class Empleado extends Persona {
    private int codEmpleado;
    private String depto;
     

    //constructor//
    public Empleado(String nombre,String apellido,int edad,char sexo,int codEmpleado, String depto) {
        super(nombre, apellido, edad, sexo);
        this.codEmpleado = codEmpleado;
        this.depto = depto;
    }
    
    //metodo//
    public void datosEmpleado(){
        System.out.println("Nombre: " + getNombre() + 
        "\nApellido: " +getApellido() +
        "\nEdad: " + getEdad() +
        "\nSexo: " + getSexo() +
        "\nCodido Empleado: " + codEmpleado +
        "\nDepartamento: " + depto);
    }
}
