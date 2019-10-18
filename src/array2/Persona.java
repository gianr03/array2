package array2;
import javax.swing.JOptionPane;

public class Persona {

    int ta = Integer.parseInt(JOptionPane.showInputDialog("Digite numero de personas a las que va a tomar sus datos"));
    Datospersona[] datos = new Datospersona[ta];
    

    public Persona() {

        this.mostrarMenu();

    }

    public void mostrarMenu() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Personas\n"
                + "1-Ingresar datos de persona\n"
                + "2-Mostrar datos personas\n"
                + "3-Cerrar\n"
                + "Escoja opcion"));
        this.cargarOpcion(opcion);
    }

    public void leerPersona() {

        JOptionPane.showMessageDialog(null, "Usted ha escogido ingresar datos de persona ");

        for (int i = 0; i < datos.length; i++) {
            datos[i] = new Datospersona();
            
            int np=i+1;
            
            JOptionPane.showMessageDialog(null, "Digite datos de la persona #"+np);
          
            datos[i].nombre = JOptionPane.showInputDialog("Nombres");
            datos[i].apellido = JOptionPane.showInputDialog("Apellidos");
            datos[i].identificacion = JOptionPane.showInputDialog("Identificaion");
            datos[i].telefono = JOptionPane.showInputDialog("Telefono");
            datos[i].fecha_naci = JOptionPane.showInputDialog("Fecha de nacimiento");
            datos[i].calcEdad();

        }
        this.mostrarMenu();

    }

    public void escribirPersona() {

        for (int i = 0; i<datos.length; i++) {
            
           int np=i+1;
            
           JOptionPane.showMessageDialog(null, "los datos de la persona #" + np +" son:" );
            
           JOptionPane.showMessageDialog(null, "Nombre: " + datos[i].nombre + "\n"
                    + "Apellidos: " + datos[i].apellido+"\n"
                            + "Identificacion "+datos[i].identificacion+"\n"
                                            + "Telefono "+datos[i].telefono+"\n"
                                                    + "Fecha de naciento: "+datos[i].fecha_naci+"\n"
                                                            + "Edad: "+datos[i].calcEdad());
                                    

        }
    }

    public void cargarOpcion(int op) {

        switch (op) {

            case 1:
                this.leerPersona();
                break;

            case 2:
                this.escribirPersona();
                break;

            case 3:
                JOptionPane.showMessageDialog(null,"Usted ha finalizado el programa");
                break;

            default:
                JOptionPane.showMessageDialog(null,"Opcion invalida");

        }

    }

}
