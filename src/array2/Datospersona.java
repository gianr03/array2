
package array2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Datospersona {
    
    public String nombre;
    public String fecha_naci;
    public String apellido;
    public String tipo_sangre;
    public String nacionalidad;
    public String identificacion;
    public String telefono;
    public String direccion;
    public String correo_electronico;
    public String genero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   public void printname(){
   
       System.out.println(this.nombre +" "+ this.apellido);
       
 }
  
   public int calEdad;{


       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate dob = LocalDate.parse(this.fecha_naci,fmt);
       LocalDate nowDate = LocalDate.now();
       Period period = Period.between(dob, nowDate);
       period.getYears();
               


}  


   
}
