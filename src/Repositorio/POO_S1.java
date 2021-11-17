
package Repositorio;

public class POO_S1 {

    
    public class Empleado
    {
        private String apellidos;
        private String nombres;
        private int edad;

        public Empleado(String ape,String nom,int e)
        {
        this.apellidos=ape;
        this.nombres=nom;
        this.edad=e;
        
        }
        
        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        
    }
    
    
}
