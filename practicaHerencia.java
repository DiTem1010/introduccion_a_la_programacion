
public class practicaHerencia{
public static void main(String[] args) {
  Cliente cliente = new Cliente();
  cliente.Nombre = "Douglas";
  cliente.Telefono= 978521435;
  cliente.credito= 410.20;

  Trabajador trabajador = new Trabajador();
  trabajador.Edad = 30;
  trabajador.Nombre = "Ariana";
  trabajador.Telefono = 963254167;
  trabajador.salario= 2150.80;

  System.out.println("Mi nombre es " + cliente.Nombre + ", tengo " + cliente.Edad + " años.*" );
  System.out.println("Mi telefono es " + cliente.Telefono + ", y solamente me queda de credito la cantidad de " + cliente.credito + "S/.");
  System.out.println("*************************************************************************************");
  System.out.println("Soy trabajadora, mi nombre es "+ trabajador.Nombre + ", tengo " + trabajador.Edad + " años.");
  System.out.println("Mi telefono es " + trabajador.Telefono + ", y mi salario es de " + trabajador.salario + "S/.");
  }
}
class Persona{
  int Edad;
  String Nombre;
  int Telefono;
}
class Cliente extends Persona{
  double credito;
}
class Trabajador extends Persona{
  double salario;
}
