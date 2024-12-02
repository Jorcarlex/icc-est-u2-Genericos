import models.genericos.Caja;
import models.genericos.Par;
import models.genericos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> CajaInteger = new Caja<>();
        Caja<Persona> cajaPerson = new Caja<>();

        Persona persona = new Persona();
        persona.setNombre("juan");
        persona.setEdad(19);

        cajaString.guardar("Guardar un String");
        CajaInteger.guardar(100);
        cajaPerson.guardar(persona);
        // Para crear una persona
        /// cajaPerson.guardar(new Persona());

        System.out.println(cajaString.obtener());
        System.out.println(CajaInteger.obtener());
        System.out.println(cajaPerson.obtener().getNombre());

        Par<Integer, String> par = new Par<>();
        Par<String, Integer> par2 = new Par<>();

        ////////////////////////////////////////////////////////

        par.establecerClave(10);
        par.establecerValor("Ashee");
        par2.establecerClave("Ely");
        par2.establecerValor(30);

        System.out.println(par.obtenerClave());
        System.out.println(par.obtenerValor());
        System.out.println(par2.obtenerClave());
        System.out.println(par2.obtenerValor());

        ////////////////////////////////////////////////////////

        Persona[] personas = new Persona[10];
        personas[0] = new Persona("Jordan", 10);
        personas[1] = new Persona("Brandom", 20);
        personas[3] = new Persona("Jose", 23);
        personas[4] = new Persona("Pepe", 39);
        personas[5] = new Persona("Kate", 40);
        personas[6] = new Persona("Sofia", 66);
        personas[7] = new Persona("Liz", 23);
        personas[8] = new Persona("Alex", 10);
        personas[9] = new Persona("Camila", 5);
        personas[10] = new Persona("Juan", 7);
        
        int personasMayores = 0;
        int personasMenores = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() >= 18) {
                personasMayores++;
            }else {
                personasMenores++;
            }
        }

        Par<String, Integer>[] mayores = new Par[personasMayores];
        Par<Integer, String>[] menores = new Par[personasMenores];

        int contadorMayores = 0;
        int contadorMenores = 0;

        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() >= 18) {
                mayores[contadorMayores] = new Par<String, Integer>();
                mayores[contadorMayores].establecerClave(personas[i].getNombre());
                mayores[contadorMayores].establecerValor(personas[i].getEdad());
                contadorMayores++;
            }else {
                mayores[contadorMenores] = new Par<Integer, String>();
                mayores[contadorMenores].establecerClave(personas[i].getEdad());
                mayores[contadorMenores].establecerValor(personas[i].getNombre());
                contadorMenores++;
            }
        }

    }
}
