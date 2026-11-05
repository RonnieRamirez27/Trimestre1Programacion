import java.util.Scanner;

public class Main {

    // Variables globales del juego
    static Scanner sc = new Scanner(System.in); //static para que utilice todo el main el mismo scanner

    static String nombre;
    static int hp = 20;
    static final int MAX_HP = 20;


    // METODO PRINCIPAL
    public static void main(String[] args) {

        iniciar();

    }


    // INICIAR JUEGO
    public static void iniciar() {

        System.out.println("✨ Dark Essence (Edición de Texto) ✨");
        System.out.println("--------------------------------");

        boolean confirmado = false;

        while (!confirmado) {
            System.out.print("Introduce tu nombre: ");
            nombre = sc.nextLine();

            System.out.println("\n¿Quieres utilizar el nombre " + nombre + "?");
            System.out.println("1. Confirmar");
            System.out.println("2. Cambiar nombre");

            int opcion = leerOpcion(2);

            if (opcion == 1) {
                confirmado = true;
                System.out.println("\n¡Nombre confirmado!");
            } else {
                System.out.println("\nVamos a elegir otro nombre...\n");
            }
        }

        mostrarDialogo("\nCaíste al subsuelo... Tu determinación te guiará.");

        // Encuentro 1
        if (estaVivo()) {
            encuentroToriel();
        }

        // Encuentro 2
        if (estaVivo()) {
            encuentroSansYPapyrus();
        }

        finalizarJuego();
    }


    // ENCUENTRO CON TORIEL
    public static void encuentroToriel() {

        mostrarDialogo("\n--- ENCUENTRO: TORIEL ---");

        mostrarDialogo("Toriel bloquea el camino con una mirada triste pero firme.");

        mostrarDialogo("Toriel: ¿Cuál es el ingrediente principal de mi tarta favorita?");

        System.out.println("1. Manzana y Canela");
        System.out.println("2. Caramelo y Canela");
        System.out.println("3. Chocolate amargo");

        int opcion = leerOpcion(3);

        if (opcion == 2) {

            mostrarDialogo("🌻 Toriel sonríe. Decides PERDONARLA. Ella te deja pasar.");

        } else {

            mostrarDialogo("🔥 Toriel lanza magia de fuego por equivocación.");

            recibirDanio(8);
        }
    }


    // ENCUENTRO CON SANS Y PAPYRUS
    public static void encuentroSansYPapyrus() {

        mostrarDialogo("\n--- ENCUENTRO: PAPYRUS ---");

        mostrarDialogo("Papyrus te desafía con un puzle, mientras Sans observa comiendo un perrito caliente.");

        mostrarDialogo("Papyrus: ¡HUMANO! ¿Qué comida es mi absoluta especialidad de chef?");

        System.out.println("1. Lasaña congelada");
        System.out.println("2. Espagueti");
        System.out.println("3. Pizza de Grillby's");

        int opcion = leerOpcion(3);

        if (opcion == 2) {

            mostrarDialogo("🍝 ¡NYEH HEH HEH! ¡Has acertado! Papyrus se siente halagado y te perdona.");

        } else {

            mostrarDialogo("☠️ Papyrus se ofende y te atrapa en un ataque de huesos azules.");

            recibirDanio(10);
        }
    }


    // LEER OPCIONES
    public static int leerOpcion(int maxOpciones) {

        int opcion = 0;

        while (opcion < 1 || opcion > maxOpciones) {

            System.out.print("Elige tu acción (número): ");

            if (sc.hasNextInt()) {

                opcion = sc.nextInt();

                if (opcion < 1 || opcion > maxOpciones) {

                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                }

            } else {

                System.out.println("Por favor, introduce un número.");

                sc.next();
            }
        }

        // Consumir el salto de línea pendiente
       sc.nextLine();

        return opcion;
    }


    // MOSTRAR DIALOGOS
    public static void mostrarDialogo(String texto) {

        System.out.println(texto);

        System.out.println("\n[Pulsa ENTER para continuar...]");

        sc.nextLine();
    }


    // RECIBIR DAÑO
    public static void recibirDanio(int cantidad) {

        hp -= cantidad;

        if (hp < 0) {
            hp = 0;
        }

        System.out.println("💔 ¡Recibiste " + cantidad +
                " de daño! HP actual: " + hp + "/" + MAX_HP);
    }


    // CURAR
    public static void curar(int cantidad) {

        hp += cantidad;

        if (hp > MAX_HP) {
            hp = MAX_HP;
        }

        System.out.println("❤️ Te has curado. HP actual: " + hp + "/" + MAX_HP);
    }


    // COMPROBAR SI SIGUE VIVO
    public static boolean estaVivo() {

        return hp > 0;
    }


    // FINALIZAR JUEGO
    public static void finalizarJuego() {

        System.out.println("\n--------------------------------");

        if (estaVivo()) {

            mostrarDialogo("🎉 ¡Felicidades, " + nombre +
                    "! Lograste salir del subsuelo manteniendo tu DETERMINACIÓN.");

        } else {

            mostrarDialogo("☠️ Has muerto... Pero no pierdas la esperanza.");

            mostrarDialogo("¡" + nombre + "! ¡Mantén tu DETERMINACIÓN!");
        }

        System.out.println("--------------------------------");
    }

}
