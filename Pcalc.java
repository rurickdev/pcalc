//package pcalc;

public class Pcalc{

  //public Polinomio p = new Polinomio();

  public static void main(String[] args){

    comprobarOperaciones(args[0]);
  }

  //Comprueba que sean operacoinea validas
  public static void comprobarOperaciones(String operaciones){

    char caracter = Character.toLowerCase(operaciones.charAt(1));

    switch (caracter) {
      case 's':
        System.out.println("Sumar");
        break;
      case 'r':
        System.out.println("Restar");
        break;
      case 'm':
        System.out.println("Multiplicar");
        break;
      case 'd':
        System.out.println("Derivar");
        break;
      case 'i':
        System.out.println("Integrar");
        break;
      case 'h':
        System.out.println("Ayuda");
        break;
      default :
        mensajeError();
        break;
    }
  }

  //Imprime mensaje de error
  public static void mensajeError(){
    System.out.println("Error");
  }
}

/*To-Do
 *Leer el Polinomio
 *  Comprobar Polinomio bien escrito
 *Operar los Polinomios
 *Regresar el resultado
 *Mensaje de ayuda para --help -h

//Objeto Polinomio
