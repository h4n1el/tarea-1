import java.util.Scanner;

public class Estudiante
{
    public String nombre;
    public String matricula;
    public int edad;


public Estudiante()
{
    setNombre("");
    setMatricula("");
    setEdad(0);
}
public Estudiante(String nombre, String matricula, int edad)
{
    setNombre(nombre);
    setMatricula(matricula);
    setEdad(edad);
}
public String getNombre(){return nombre;}
public String getMatricula(){return matricula;}
public int getEdad(){return edad;}

public void setNombre(String Nombre)
{
    this.nombre = Nombre;
}
public void setMatricula(String Matricula)
{
    this.matricula = Matricula;
}
public void setEdad(int Edad)
{
    this.edad = Edad;
}
 
}