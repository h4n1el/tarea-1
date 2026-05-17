import java.util.Scanner;

public class Main extends Vehiculo
{
    public static void main(String[] args)
    {
        Scanner boton = new Scanner(System.in);
        char opcion;
        
    do{

            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Verificar número Par o Impar");
            System.out.println("2. Calculadora básica");
            System.out.println("3. Tabla de multiplicar");
            System.out.println("4. Contar Vocales ");
            System.out.println("5. Matriz 3x3 ");
            System.out.println("6. Promedio de notas ");
            System.out.println("7. Clase de estudiantes ");
            System.out.println("8. Clase de Vehiculo ");
            System.out.println("9. Cuenta Bancaria ");
            System.out.println("A. Inventario Sencillo ");
            System.out.println("B. Salir del Programa ");

            opcion = boton.next().charAt(0);
           

        switch(opcion)
        {
            case '1':
                NumeroParImpar();
                break;
            case '2':
                Calculadora();
                break;
            case '3':
                TablaMultiplicar();
                break;
            case '4':
                ContarVocales();
                break;
            case '5':
                Matriz();
                break;
            case '6':
                PromedioNotas();
                break;
            case '7':
                MostrarEst();
                break;
            case '8':
                MostrarVeh();
            case '9':
                CuentaBanco();
                break;
            case 'A':
                InventarioSencillo();
                break;
            case 'B':
                System.out.println("Saliendo de el programa");                
                default:
                    System.out.println("Opcion no Valida");
                    return;


            }
        
        }while(opcion != 'B');

        
        
    }
    public static void Calculadora()
    {
       
        Scanner boton = new Scanner(System.in);

        System.out.println("=== Calculadora basica ===");

        System.out.println("ingresa el primer numero");
        double num1 = boton.nextDouble();

        System.out.println("selecciona de operadores (+, -, *, /)");
        char opcion = boton.next().charAt(0);

        System.out.println("ingresa el segundo numero");
        double num2 = boton.nextDouble();

        double resultado;

        switch(opcion)
        {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                resultado = num1 / num2;
                if(num2 != 0)
                {
                    resultado = num1 / num2;
                } else 
                {
                    System.out.println("esto no sirve");
                    return;
                }
                break;
                default:

                System.out.println("no es valido");
                return;

        }
        System.out.println("el resultado es: " + resultado);
                


    } 
    
    public static void NumeroParImpar()
    {
        Scanner boton = new Scanner(System.in);

        System.out.println("ingresa un numero"); 
        int num = boton.nextInt();

        String resultado = (num % 2 == 0)? "par": "impar";
        System.out.println("El número " + num + " es " + resultado);
        
    }
    public static void TablaMultiplicar()
    {
       Scanner boton = new Scanner(System.in);

       System.out.println("Que tablas quieres ver");

       int num = boton.nextInt();

       System.out.println("la tabla del numero es: " + num);

       for(int i = 0; i <= 12; i++)
       {
        int resultado = num * i;
        System.out.println(num  + "x" +  + i + "=" + resultado);
       } 
    }
    public static void ContarVocales()
    {
        Scanner boton = new Scanner(System.in);

        int contador = 0;
        System.out.println("===Contador de Vocales===");

        System.out.println("ingresa un texto: ");

        String texto = boton.nextLine().toUpperCase();

        for(int i = 0; i < texto.length(); i++)
        {
          char palabra = texto.charAt(i);
          if(palabra == 'A'|| palabra == 'E'|| palabra == 'O' || palabra == 'I'|| palabra == 'U')
          {
            contador++;
          }

        }
        System.out.println("La frase tiene " + contador + " vocales.");
    }
    public static void Matriz()
    {
        int[][] matriz = {
        {15, 20, 12},
        {47, 45, 6},
        {77, 88, 23}

        };
        System.out.println("===Imprimir Matriz===");

        for(int i = 0; i < matriz.length; i++)
        {
            for(int j = 0; j < matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        

    }
    public static void PromedioNotas()
    {
        Scanner boton = new Scanner(System.in);

        System.out.println("=== Promedio de Calificaciones === ");

        System.out.println("cuantas materias va a registrar: ");
        int CantidadNota = boton.nextInt();


        double suma = 0;
        double Totalcredito = 0;

        for(int i = 0; i < CantidadNota; i++)
        {
            
            System.out.println("ingresa la nota " + (i + 1) + ":");
            double Nota = boton.nextDouble();

            System.out.println("ingresa los creditos de esa materia");
            double credito = boton.nextDouble();

            double Calificacion = (Nota / 100) * 4.0;

            suma = suma + (Calificacion * credito);
            Totalcredito = Totalcredito + credito;
            
        }
        

        double promedio = suma / Totalcredito;

        System.out.println("\n--- Resultado ---");
        System.out.println("La suma total es: " + suma);
        System.out.println("El promedio final es: " + promedio);

        if(promedio >= 4.0)
        {
            System.out.println("tu promedio es de A");
        } else if(promedio >= 3.5)
        {
            System.out.println("tu promedio es de B+");
        } else if(promedio >= 3.0)
        {
            System.out.println("tu promedio es de B");
        }else if(promedio >= 2.5)
        {
            System.out.println("tu promedio es de C+");
        }else if(promedio >= 2.0)
        {
            System.out.println("tu promedio es de C");
        }else if(promedio >= 1.5)
        {
            System.out.println("tu promedio es de D+");
        }else if(promedio >= 1.0)
        {
            System.out.println("tu promedio es de D");
        }else
        {
            System.out.println("tu promedio es de F");
        }
        
        
    }
    
    public static void MostrarEst() {
        Scanner boton = new Scanner(System.in);
        

        System.out.print("Cuántos estudiantes va a registrar?: ");
        int cantidad = boton.nextInt();
        boton.nextLine(); 

        Estudiante[] List = new Estudiante[cantidad];

        for (int i = 0; i < cantidad; i++) {
            Estudiante est = new Estudiante();

            
            System.out.println("\n--- Registrando datos ---");
            System.out.print("ingresa el nombre del estudiante: ");
            est.setNombre(boton.nextLine());
            
            System.out.print("ingresa la matricula del estudiante: ");
            est.setMatricula(boton.nextLine());
            
            System.out.print("ingresa la edad del estudiante: ");
            est.setEdad(boton.nextInt());
            boton.nextLine(); 
            
            List[i] = est;
        }
        System.out.println("\n=== Estudiante Registrado ===");
        for(int i = 0; i < List.length; i++){
        System.out.println("\n=== Estudiante Registrado numero: " + (i + 1));
        System.out.println("el nombre del estudiante es: " + List[i].getNombre());
        System.out.println("la matricula del estudiante es: " + List[i].getMatricula()); 
        System.out.println("la edad del estudiante es: " + List[i].getEdad()); 
        }
    }
    public static void MostrarVeh()
    {
        Scanner boton = new Scanner(System.in);
        Vehiculo vh = new Vehiculo();
        


            System.out.println("\n=== Registrando Carro ===");
            System.out.println("ingresa el nombre del carro: ");
            String NameCarro = boton.nextLine();
            System.out.println("ingresa la marca del vehiculo: ");
            String marCarro = boton.nextLine();
            System.out.println("ingresa el ano del vehiculo: ");
            int anoCarro = boton.nextInt();
            System.out.println("ingresa el numero de puertas del vehiculo: ");
            int puerCarro = boton.nextInt();
            boton.nextLine();

            Carro car = new Carro(NameCarro, marCarro, anoCarro, puerCarro);

            System.out.println("\n=== Registrando Motocicleta ===");
            System.out.println("ingresa el nombre de la motocicleta: ");
            String NameMoto = boton.nextLine();
            System.out.println("ingresa la marca de la motocicleta: ");
            String marMoto = boton.nextLine();
            System.out.println("ingresa el ano de la motocicleta: ");
            int anoMoto = boton.nextInt();
            System.out.println("ingresa el numero de cilindrada: ");
            int ciliMoto = boton.nextInt();
            boton.nextLine();

            Motocicleta moto = new Motocicleta(NameMoto, marMoto, anoMoto, ciliMoto);

            System.out.println("\n=== VEHICULOS GUARDADOS ===");
            System.out.println("Carro: " + car.marca + " " + car.nombre + " -> " + car.puertas + " puertas (Año: " + car.ano + ")");
            System.out.println("Moto:  " + moto.marca + " " + moto.nombre + " -> " + moto.cilindrada + "cc (Año: " + moto.ano + ")");


        


    }
    public static void CuentaBanco()
    {
        Scanner boton = new Scanner(System.in);

    System.out.println("\n=== APERTURA DE CUENTA BANCARIA ===");
    System.out.print("Nombre del titular: ");
    String titular = boton.nextLine();
    System.out.print("Monto de depósito inicial: ");
    double montoInicial = boton.nextDouble();

    CuentaBanco cuenta = new CuentaBanco(titular, montoInicial);

    int opcion;
    do {
        System.out.println("\n=== Cajero Automatico ===");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Balance actual: " + cuenta.getBalance());
        System.out.println("1. Depositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Volver al Menú Principal");
        System.out.print("Seleccione una opción: ");
        opcion = boton.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Monto a depositar: ");
                double dep = boton.nextDouble();
                cuenta.Depositar(dep); 
                break;
            case 2:
                System.out.print("Monto a retirar: ");
                double ret = boton.nextDouble();
                cuenta.RetirarMonto(ret); 
                break;
            case 3:
                System.out.println("Saliendo del cajero...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    } while (opcion != 3);

    }
    public static void InventarioSencillo() {
    Scanner boton = new Scanner(System.in);

    
    String articuloGuardado = "Ninguno";
    int artGuardado = 0;
    double precioGuardado = 0.0;

    int opcion;

    do {
        System.out.println("\n=== Inventario De Un Articulo ===");
        System.out.println("1. Guardar / Registrar Artículo");
        System.out.println("2. Ver Artículo Guardado");
        System.out.println("0. Volver al Menú Principal");
        System.out.print("Seleccione una opción: ");
        opcion = boton.nextInt();
        boton.nextLine(); 

        switch (opcion) {
            case 1:
                System.out.println("\n=== Registrando Nuevo Articulo ===");
                System.out.print("Nombre del artículo: ");
                articuloGuardado = boton.nextLine(); 
                
                System.out.print("Cantidad en Stock: ");
                artGuardado = boton.nextInt();
                
                System.out.print("Precio:  ");
                precioGuardado = boton.nextDouble();
                
                System.out.println("Artículo guardado con éxito en la memoria");
                break;

            case 2: 
                System.out.println("\n=== Articulo en Almacen ===");
                if (articuloGuardado.equals("Ninguno")) {
                    System.out.println("El inventario está vacío. Registra un articulo primero.");
                } else {
                    System.out.println("Producto: " + articuloGuardado);
                    System.out.println("Cantidad: " + artGuardado + " unidades");
                    System.out.println("Precio:   RD$ " + precioGuardado);
                    System.out.println("Valor Total en Inventario: RD$ " + (artGuardado * precioGuardado));
                }
                break;

            case 0:
                System.out.println("Saliendo del inventario ");
                break;

            default:
                System.out.println("No disponible");
        }

    } while (opcion != 0);
}

 }
