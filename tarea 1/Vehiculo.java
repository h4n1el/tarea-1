
public class Vehiculo
{
    public String nombre;
    public String marca;
    public int ano;


public Vehiculo()
{
    setNombre("");
    setMarca("");
    setAno(0);
}
public Vehiculo(String nombre, String marca, int ano)
{
    setNombre(nombre);
    setMarca(marca);
    setAno(ano);
}
public String getNombre(){return nombre;}
public String getMarca(){return marca;}
public int getAno(){return ano;}

public void setNombre(String Nombre)
{
    this.nombre = Nombre;
}
public void setMarca(String Marca)
{
    this.marca = Marca;
}
public void setAno(int Ano)
{
    this.ano= Ano;
}
 
}
class Carro extends Vehiculo
{
    int puertas;

    public Carro(String nombre, String marca,int ano, int puertas){
    super(nombre, marca, ano);
    this.puertas = puertas;
    }
}
class Motocicleta extends Vehiculo{
    int cilindrada;
    public Motocicleta(String nombre, String marca,int ano, int cilindrada){
        super(nombre, marca, ano);
        this.cilindrada = cilindrada;
    }

}