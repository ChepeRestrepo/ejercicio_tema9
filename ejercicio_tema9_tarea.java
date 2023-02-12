class ejercicio_tema9_tarea{
  public static void main(String[]args){
    //Cliente
    Cliente cliente = new Cliente();
    System.out.println("**************************************************");
    cliente.setEdad(29);
    cliente.setNombre("Jose");
    cliente.setTelefono("3223242938");
    cliente.setCredito(2000000);
    System.out.println("Informacion del Cliente: " + "\n" + "Edad: " + cliente.getEdad()+"\n"+ "Nombre: " + cliente.getNombre() + "\n" + "Telefono: " + cliente.getTelefono() + "\n" + "Tiene un credito de: " + cliente.getCredito());
    System.out.println("**************************************************");
    //Trabajador
    Trabajador trabajador = new Trabajador();
    trabajador.setEdad(33);
    trabajador.setNombre("Victor");
    trabajador.setTelefono("301254254");
    trabajador.setSalario(3000000);
    System.out.println("Informacion del Trabajador: " + "\n" + "Edad: " + trabajador.getEdad()+"\n"+ "Nombre: " + trabajador.getNombre() + "\n" + "Telefono: " + trabajador.getTelefono() + "\n" + "Tiene un salario de: " + trabajador.getSalario());
    System.out.println("**************************************************");
  }
}
//Clase persona sin constructor
class Persona{
  private int edad;
  private String nombre;
  private String telefono;
  public void setEdad(int edad){
    this.edad = edad;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public void setTelefono(String telefono){
    this.telefono = telefono;
  }
  public int getEdad(){
    return this.edad;
  }
  public String getNombre(){
    return this.nombre;
  }
  public String getTelefono(){
    return this.telefono;
  }
}

class Cliente extends Persona{
private double credito;
public void setCredito(double credito){
  this.credito = credito;
}
public double getCredito(){
  return this.credito;
}
}
class Trabajador extends Persona{
  private double salario;
  public void setSalario(double salario){
    this.salario = salario;
  }
  public double getSalario(){
    return this.salario;
  }
  }