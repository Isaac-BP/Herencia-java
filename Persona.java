public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        if(edad >= 1 && edad <= 120){
            this.edad = edad;
        }else {
            System.out.println("Edad Incorrecta: " + edad);
        }   
    }
    public void setSexo(char sexo){
        if(sexo == 'M' && sexo == 'm' && sexo == 'F' && sexo == 'f' ){
            this.sexo = sexo;
        }else{
            System.out.println("Sexo no valido: " + sexo );
        }  
    }

    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public char getSexo(){
        return sexo;
    }


    public Persona(String nombre, String apellido, int edad, char sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

}