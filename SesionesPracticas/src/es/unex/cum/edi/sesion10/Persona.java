package es.unex.cum.edi.sesion10;

public class Persona implements Comparable{
    private String _nombre;
    private String _apellidos;
    private String _dni;
    private int _edad;
    protected static long _num_Personas;
    

    public Persona() {
            _num_Personas++;
    }

    public Persona(String n, String a, String d, int edad) {
        this();
        _nombre=n;
        _apellidos=a;
        _dni=d;
        _edad=edad;
        
    }
    public Persona(Persona o) {
        this();
        _nombre=o._nombre;
        _apellidos=o._apellidos;
        _dni=o._dni;
        _edad=o._edad;
        
    }

    public String get_nombre() {
        return _nombre;
    }

    public void set_nombre(String val) {
        this._nombre = val;
    }

    public String get_apellidos() {
        return _apellidos;
    }

    public void set_apellidos(String val) {
        this._apellidos = val;
    }

    public String get_dni() {
        return _dni;
    }

    public void set_dni(String val) {
        this._dni = val;
    }

    public int get_edad() {
        return _edad;
    }

    public void set_edad(int val) {
        this._edad = val;
    }
    
    public long get_cuantos() {
        return _num_Personas;
    }
    
    public void mostrar(){ 
        System.out.println("Nombre: "+get_nombre()+'\n'+
                "Apellido: "+get_apellidos()+"\n"+
                "Dni: "+get_dni()+"\n"+
                "Edad: "+get_edad());
    }
     public String toString(){ 
        String temp="Persona: "+get_nombre()+" "+get_apellidos()+" Dni: "+get_dni();
        return temp;
    }
     
     public int compareTo(Object o) {
    	 Persona p = (Persona) o;
    	 return this._dni.compareTo(p._dni);
     }
}
