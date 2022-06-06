public class practicaEncapsulacion {
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setEdad(19);
    persona.setNombre("Diglas");
    persona.setTelefono(957963215);

    System.out.println("Mi nombre es " + persona.getNombre() + ", tengo " + persona.getEdad() + " años y mi numero es " + persona.getTelefono());
  }
}

class Persona{
  private int Edad;
  private String Nombre;
  private int Telefono;

  public void setEdad(int Edad){
    this.Edad = Edad;
  }
  public int getEdad(){
    return this.Edad;
  }

  public void setNombre(String Nombre){
    this.Nombre = Nombre;
  }
  public String getNombre(){
    return this.Nombre;
  }

  public void setTelefono(int Telefono){
    this.Telefono = Telefono;
  }
  public int getTelefono(){
    return this.Telefono;
  }

}
