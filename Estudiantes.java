public class Estudiantes {

    private String name;
    private int ide;
    private String materia;
    private float califi;
    private String estado;
    
    //NOMBRE
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //IDENTIFICACION
    public int getIde(){
        return ide;
    }

    public void setIde(int ide){
        this.ide = ide;
    }

    //MATERIA
    public String getMateria(){
        return materia;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }

    //CALIFICACION
    public float getCalifi(){
        return califi;
    }

    public void setCalifi(float califi){
        this.califi = califi;
    }

    //ESTADO
    public String getEstado(){
        if(califi<6){
            estado="Reprobado";
        }
        else if(califi>=6){
            estado="Aprobado";
        }
        return estado;
        
    }

    public void setEstado(String estado){
        this.estado= estado;
    }
    
    //Declarar
    public Estudiantes(){
        this.name = "";
        this.ide = 0;
        this.materia = "";
        this.califi = 0;
        this.estado = "";
        
        
    }
    
    //Pasar por parametro
    public Estudiantes(String name,int ide,String materia,float califi,String estado){
        this.name = name;
        this.ide = ide;
        this.materia = materia;
        this.califi = califi;
        this.estado = estado;
    }
}