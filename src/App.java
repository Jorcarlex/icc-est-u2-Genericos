import models.genericos.Caja;
import models.genericos.Par;
import models.genericos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPerson = new Caja<>();

        Persona persona = new Persona();
        persona.setNombre("juan");
        persona.setEdad(19);

        cajaString.guardar("Guardar un String");
        cajaInteger.guardar(100);
        cajaPerson.guardar(persona);
        // Para crear una persona
        /// cajaPerson.guardar(new Persona());

        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
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

        System.out.println(" ");
        System.out.println("////////////////////////////////////////////////");
        Persona[] personas = new Persona[10];
        personas[0] = new Persona("Jordan", 14);
        personas[1] = new Persona("Brandom", 20);
        personas[2] = new Persona("Jose", 23);
        personas[3] = new Persona("Pepe", 39);
        personas[4] = new Persona("Kate", 1);
        personas[5] = new Persona("Sofia", 66);
        personas[6] = new Persona("Liz", 23);
        personas[7] = new Persona("Alex", 10);
        personas[8] = new Persona("Camila", 5);
        personas[8] = new Persona("Mika", 2);

        int personasMayores = 0;
        int personasMenores = 0;

        for (Persona p : personas) {
            if (p != null && p.getEdad() >= 18) {
                personasMayores++;
            } else if (p != null) {
                personasMenores++;
            }
        }

        Par<String, Integer>[] mayores = new Par[personasMayores];
        Par<Integer, String>[] menores = new Par[personasMenores];

        int contadorMayores = 0;
        int contadorMenores = 0;

        for (Persona p : personas) {
            if (p != null) {
                if (p.getEdad() >= 18) {
                    mayores[contadorMayores] = new Par<>();
                    mayores[contadorMayores].establecerClave(p.getNombre());
                    mayores[contadorMayores].establecerValor(p.getEdad());
                    contadorMayores++;
                } else {
                    menores[contadorMenores] = new Par<>();
                    menores[contadorMenores].establecerClave(p.getEdad());
                    menores[contadorMenores].establecerValor(p.getNombre());
                    contadorMenores++;
                }
            }
        }

        System.out.println(" ");
        System.out.println("MAYORES DE EDAD:");
        for (Par<String, Integer> p : mayores) {
            System.out.println(p.obtenerClave() + " - " + p.obtenerValor());
        }

        System.out.println(" ");

        System.out.println("MENORES DE EDAD:");
        for (Par<Integer, String> p : menores) {
            System.out.println(p.obtenerClave() + " - " + p.obtenerValor());
        }

    }
}
