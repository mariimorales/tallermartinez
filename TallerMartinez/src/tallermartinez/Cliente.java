/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermartinez;

/**
 *
 * @author mayra beatriz
 */
public class Cliente {
     private String noCliente;
    private String apellidos;
    private String nombre;
    private int numTelefono;
    
 // Contructor clase
public Cliente(String noCliente,String apellidos, 
String nombre, int numTelefono) {
    this.noCliente = noCliente;
    this.apellidos = apellidos;
    this.nombre = nombre;
    this.numTelefono = numTelefono;
}

    Cliente(String NoCliente, String Apellidos, String Nombre, String NumTelefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

// Métodos SET

public void setNoCliente(String noCliente) {
    this.noCliente = noCliente;
}

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setNumTelefono(int numTelefono) {
    this.numTelefono = numTelefono;
}

// Métodos GET

public String getNoCliente() {
    return noCliente;
}

public String getApellidos() {
    return apellidos;
}

public String getNombre() {
    return nombre;
}

public int getNumTelefono() {
    return numTelefono;
}
    
}





