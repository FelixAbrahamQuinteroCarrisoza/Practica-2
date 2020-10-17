import java.util.Scanner;

public class ClaseAl {
    public static void main(String[] args) {
        
        System.out.println("\n------------------------LISTA DE ESTUDIANTES----------------------- ");
        
      
        //Punto numero 3 de la practica
        Estudiantes alumno[]=new Estudiantes[6];
        alumno[1] = new Estudiantes("Felix Quintero",1266014 ,"Matematicas",9," ");
        alumno[2] = new Estudiantes("Abraham Carrisoza",1266015 ,"Matematicas",5,"");
        alumno[3] = new Estudiantes("Carlos Mesa",1266018 ,"Matematicas",6,"");
        alumno[4] = new Estudiantes("Osmar Arellano",1266011 ,"Matematicas",7," ");
        alumno[5] = new Estudiantes("Isai",1266022 ,"Matematicas",4," ");

        
        System.out.println("\nNOTA:Alumnos ya capturados del 1 al 5, capture los 5 alumnos restantes"); 
        Estudiantes alumno1[]=new Estudiantes[11];
        for(int i=6;i<11;i++){
        //Punto numero 4 de la practica (usuario introduce los datos)
        alumno1[i] = new Estudiantes();

        System.out.println("\n-----------CAPTURA DE ALUMNO---["+i+"]: "); 
        //NOMBRE
        System.out.println("\nIngresa el nombre del estudiante: ");  
        Scanner inName = new Scanner(System.in);
        alumno1[i].setName(inName.next());
        
        //IDENTIFICACION
        System.out.println("Ingresa la identificacion del estudiante: ");  
        Scanner inIde = new Scanner(System.in);
        alumno1[i].setIde(inIde.nextInt());
        
        //MATERIA
        System.out.println("Ingresa la materia del estudiante: ");  
        Scanner inMateria = new Scanner(System.in);
        alumno1[i].setMateria(inMateria.next());
        
        //CALIFICACION
        System.out.println("Ingresa la calificacion del estudiante: ");  
        Scanner inCalifi = new Scanner(System.in);
        alumno1[i].setCalifi(inCalifi.nextFloat());
        }

        //IMPRIMIR punto 3
        for (int i=1;i<6;i++){
            System.out.println("\n-----ESTUDIANTE---["+i+"]: ");   
            System.out.println("\nNombre del  estudiante: "+alumno[i].getName()+
            "\nIdentificacion del estudiante : "+alumno[i].getIde()+
            "\nMateria del alumno : "+alumno[i].getMateria()+
            "\nCalificacion del alumno: "+alumno[i].getCalifi()+
            "\nTu estado del alumno: "+alumno[i].getEstado());    
            }

        //IMPRIMIR punto 4
        for(int i=6;i<11;i++){
        System.out.println("\n-----ESTUDIANTE---["+i+"]: "); 

        System.out.println("\nEl nombre del alumno que ingreso es: ");
        System.out.println(alumno1[i].getName());

        System.out.println("La identificacion del alumno que ingreso es: ");
        System.out.println(alumno1[i].getIde()); 

        System.out.println("La materia del alumno que ingreso es: ");
        System.out.println(alumno1[i].getMateria());

        System.out.println("La materia del alumno que ingreso es: ");
        System.out.println(alumno1[i].getCalifi());
        
        System.out.println("Su estado es:");
        System.out.println(alumno1[i].getEstado());

        }
        
    }
}