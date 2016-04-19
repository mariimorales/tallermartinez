/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallermartinez;






import java.util.*;
import java.io.*;
import javax.swing.*;


/**
 *
 * @author mayra beatriz
 */
public class CatalogodeCliente {
   
    private ArrayList<Cliente> objCliente;
    
    // Contructor
    public CatalogodeCliente() {
        objCliente = new ArrayList<Cliente>();
        
    }
    
    // Métodos de manejo del ArrayList
    public void agregar(Cliente al) {
        objCliente.add(al);
    }
    
    public void borrar(Cliente al) {
        objCliente.remove(al);
    }
    
    public Cliente obtener(int pos) {
        return objCliente.get(pos);
    }
    
    public Cliente buscar(String noControl) {
        for (int i = 0; i < objCliente.size(); i++) {
            if(noControl.equals(objCliente.get(i).getNoCliente()))
                return objCliente.get(i);
        }
        return null;
    }
    
    public int numElementos() {
        return objCliente.size();
    }
    
    public void leerDatos() {
        cargar();
    }
    
    
    
    // Cargar lista de alumnos
    private void cargar() {
        try {
            
            File archivo = new File("NuevoCliente.txt");
            // Si el archivo existe
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("NuevoCliente.txt"));
                String linea;
                
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String NoCliente = st.nextToken().trim();
                    String Apellidos = st.nextToken().trim();                    
                    String Nombre = st.nextToken().trim();
                    int NumTelefono = Integer.parseInt(st.nextToken().trim());
                    Cliente cl = new Cliente(NoCliente, Apellidos, Nombre, NumTelefono);
                    agregar(cl);
                }
                       
                
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
        }   
    }
    public void guardar() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("alumnos.txt"));
            for(int i=0; i<numElementos(); i++) {
                pw.println(obtener(i).getNoCliente()+","+obtener(i).getApellidos()+","+
                        ","+obtener(i).getNombre()+","+obtener(i).getNumTelefono());
                pw.close();
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
        }

    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
