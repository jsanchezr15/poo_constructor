/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juanjo SR
 */
public class Cliente extends Persona{
    private String nit;
    public Cliente(){}

    public Cliente(String nit, String nombre, String apellido, String direccion, String telefono, String fechanacimiento) {
        super(nombre, apellido, direccion, telefono, fechanacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    @Override
    public void agregar(){
    System.out.println("NIT "+ this.getNit());
    System.out.println("NOMBRE "+ this.getNombre());
    System.out.println("APELLIDO "+ this.getApellido());
    System.out.println("DIRECCION "+ this.getDireccion());
    System.out.println("TELEFONO "+ this.getTelefono());
    System.out.println("FECHA NACIMIENTO "+ this.getFechanacimiento());
    System.out.println("__________________________________________");
    }
    
}
