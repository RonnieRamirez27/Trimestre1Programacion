
package menuInicio;

import java.util.Scanner;
import java.util.Random;

public class main {

    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String ROJO = "\u001B[31m";
    public static final String PURPLE = "\u001B[35m";
    public static final String GRIS = "\u001B[90m";

    // Array de inventario
    public static String[] inventario = new String[10];
    public static int totalObjetos = 0;
    public static int vidaJugador = 100;
    public static boolean esGrupoYanina = false;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            limpiarPantalla();

            System.out.println(PURPLE + "========================================");
            System.out.println("             DARK ESSENCE               ");
            System.out.println("========================================" + RESET + "\n");

            pausa(200);
            imprimirConRetardo(CYAN + "  [1] Nueva Partida\n" + RESET, 20);
            pausa(150);
            imprimirConRetardo(ROJO + "  [2] Salir de la partida\n\n" + RESET, 20);

            pausa(200);
            System.out.print("Selecciona una opción: ");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        animacionCarga("Debes salir de aqui");
                        limpiarPantalla();

                        System.out.println(PURPLE);
                        System.out.println("██████   █████  ██████  ██   ██      ███████ ███████ ███████ ███████ ███    ██  ██████ ███████ ");
                        System.out.println("██   ██ ██   ██ ██   ██ ██  ██       ██      ██      ██      ██      ████   ██ ██      ██      ");
                        System.out.println("██   ██ ███████ ██████  █████        █████   ███████ ███████ ██████  ██ ██  ██ ██      █████   ");
                        System.out.println("██   ██ ██   ██ ██   ██ ██  ██       ██           ██      ██     ██  ██  █  ██ ██      ██      ");
                        System.out.println("██████  ██   ██ ██   ██ ██   ██      ███████ ███████ ███████ ███████ ██   ████  ██████ ███████ " + RESET);

                        System.out.println(GRIS + "----------------------------------------------------------------------------------------" + RESET);

                        limpiarPantalla();

                        imprimirConRetardo("...\n", 500);
                        limpiarPantalla();

                        imprimirConRetardo("--- Vas abriendo los ojos poco a poco, la luz del sol te molesta --- \n", 10);
                        imprimirConRetardo("--- Una vez que puedes distinguir todo con claridad te encuentras mirando al cielo ---\n", 10);
                        imprimirConRetardo("--- Algo te parece raro no se escucha nada de ruido humano solo pequeños cantos de los pájaros ---\n", 10);

                        boolean continuarAventura = despertar(sc);

                        if (continuarAventura) {
                            imprimirConRetardo("--- Poco a poco empiezas a recuperar y mover tus piernas para levantarte ---\n", 10);

                            limpiarPantalla();

                            imprimirConRetardo("--- Al levantarte poco a poco a tu cuerpo consigues sentarte ---\n", 10);
                            imprimirConRetardo("--- Observas a tu alrededor y te das cuentas que estas en un valle, lo reconoces, es el valle que se encuentra a las afueras del centro de tu ciudad ---\n", 10);
                            imprimirConRetardo("--- Todo a tu alrededor parece un dia normal en tu vida salvo que no tenias a nadie a tu alrededor en un valle que solía estar lleno de turistas ---\n", 10);

                            limpiarPantalla();

                            imprimirConRetardo("--- ¿Qué es lo que estaba pasando? ---\n", 15);
                            imprimirConRetardo("...\n", 300);
                            imprimirConRetardo("--- Lo último que recuerdas es que te encontrabas en un bosque y... ---\n", 15);
                            imprimirConRetardo("--- De la nada todo fue silencio ---\n", 15);

                            limpiarPantalla();

                            imprimirConRetardo("--- No tienes tiempo de pensar ahora mismo ---\n", 10);
                            imprimirConRetardo("--- Debes encontrar respuestas lo antes posible ---\n", 10);
                            imprimirConRetardo("--- Observas a tu alrededor ---\n", 10);
                            imprimirConRetardo("--- A lo lejos puedes observar una ciudad con una amplia cantidad de vegetación ---\n", 10);

                            limpiarPantalla();

                            imprimirConRetardo("--- Sin embargo al observar más a tu alrededor te das cuenta que hay un río algo más enfrente --- \n", 10);
                            imprimirConRetardo("--- al observar atrás hay un bosque parece ser algo extenso pero al ser de día debería ser más fácil explorar--- \n", 10);
                            imprimirConRetardo("--- Te preguntas si habrá alguien en el centro de la ciudad --- \n", 10);
                            imprimirConRetardo("--- Debes elegir tu camino --- \n", 10);

                            limpiarPantalla();

                            imprimirConRetardo("...\n", 500);

                            explorarZonas(sc);
                        }

                        pausa(3000);
                        break;

                    case 2:
                        imprimirConRetardo(ROJO + "\nSaliendo del juego... Vuelve pronto...\n" + RESET, 30);
                        pausa(1000);
                        break;

                    default:
                        System.out.println(ROJO + "\n (!) Opción no válida, elige 1 o 2." + RESET);
                        pausa(1000);
                }
            } else {
                System.out.println(ROJO + "\n(!) Introduce un número valido" + RESET);
                sc.next();
                pausa(1000);
            }

        } while (opcion != 2);


    }

    public static boolean despertar(Scanner seguirDurmiendo) throws InterruptedException {
        int vecesIntentadasSueño = 0;
        int decision = 0;

        do {
            limpiarPantalla();

            if (vecesIntentadasSueño == 0) {
                imprimirConRetardo("Tal vez hacer un pequeño descanso para coger fuerzas sea lo mejor...\n", 10);
            } else if (vecesIntentadasSueño == 1) {
                imprimirConRetardo("Quiza la hierba por el momento es calida y el sueño demasiado profundo...\n", 10);
            } else if (vecesIntentadasSueño == 2) {
                imprimirConRetardo("Parece que en este mundo comienza a hacer frío no debe ser la mejor idea quedarse a descansar, se acerca la noche...\n", 10);
            } else if (vecesIntentadasSueño == 3) {
                imprimirConRetardo(ROJO + "Debes despertar\n" + RESET, 10);
            } else {
                imprimirConRetardo(ROJO + "Tienes que despertar...\n" + RESET, 15);
            }

            imprimirConRetardo("--- Tu cuerpo esta lleno de agujetas y se te dificulta moverte ---\n", 15);
            imprimirConRetardo("--- Por otro lado este mundo parece tan tranquilo, hace un dia soleado ---\n", 15);
            imprimirConRetardo("--- Te planteas seguir y salir lo antes posible de aqui o quedarte a descansar ---\n\n", 15);
            pausa(40);

            imprimirConRetardo(VERDE + "  [1] Seguir explorando (Forzar a tu cuerpo a levantarse)\n" + RESET, 20);
            imprimirConRetardo(CYAN + "  [2] Seguir durmiendo (Dejarte llevar por el cansancio un poco más)\n\n" + RESET, 20);

            System.out.print("¿Qué vas a hacer? (1-2): ");

            if (seguirDurmiendo.hasNextInt()) {
                decision = seguirDurmiendo.nextInt();

                if (decision == 1) {
                    animacionCarga("Sacudes la cabeza y te pones de pie");
                    return true;
                } else if (decision == 2) {
                    vecesIntentadasSueño++;
                    animacionCarga("Te acurrucas de nuevo");
                    pausa(1000);
                } else {
                    System.out.println(ROJO + "Opción no valida elige entre 1 o 2" + RESET);
                    pausa(1000);
                }
            } else {
                System.out.println(ROJO + "Elige un número valido" + RESET);
                seguirDurmiendo.next();
                pausa(1000);
            }

        } while (true);
    }

    public static void explorarZonas(Scanner sitio) throws InterruptedException {
        int destino = 0;
        boolean yaHasExplorado = false;

        do {
            limpiarPantalla();
            System.out.println(AMARILLO + "------------------------------------");
            System.out.println("Elige un camino por el que quieras continuar");
            System.out.println("-----------------------------------------" + RESET + "\n");

            pausa(200);
            imprimirConRetardo(VERDE + "  [1] 🏙️  El centro de la ciudad abandonada\n" + RESET, 20);
            pausa(150);
            imprimirConRetardo(CYAN + "  [2] 🌊 El río frente al valle\n" + RESET, 20);
            pausa(150);
            imprimirConRetardo(PURPLE + "  [3] 🌲 El bosque extenso a tus espaldas\n" + RESET, 20);
            imprimirConRetardo(AMARILLO + "  [4] 🎒 Ver Inventario\n" + RESET, 20);
            imprimirConRetardo(GRIS + "  [5] 🔙 Salir al menú principal\n\n" + RESET, 20);

            System.out.print("Elige tu destino (1-5): ");

            if (sitio.hasNextInt()) {
                destino = sitio.nextInt();

                switch (destino) {
                    case 1:
                        animacionCarga("--- Has decidido caminar hacia la ciudad ---");
                        limpiarPantalla();
                        imprimirConRetardo("--- Te levantas y empiezas a camninar, todo te parece muy extreño por lo que observas con cuidado tu alrededor ---\n", 10);
                        imprimirConRetardo("--- Poco a poco empiezas a salir de la zona en la que te encontrabas en un incio  ---\n", 10);
                        imprimirConRetardo("--- Caminas con mucha confusion a tu alrededor ---\n", 10);
                        imprimirConRetardo("--- Mientras caminas vas gritando, preguntando si hay alguien más ---\n", 10);

                        limpiarPantalla();

                        imprimirConRetardo("...\n", 500);
                        imprimirConRetardo("--- No recibes ninguna respuesta ---\n", 10);

                        limpiarPantalla();

                        imprimirConRetardo("--- Déspues de caminar durante aproximadamente una hora llegas al centro de la ciudad ---\n", 35);
                        imprimirConRetardo("--- Observas a tu alrededor ---\n", 15);
                        imprimirConRetardo("...\n", 500);
                        imprimirConRetardo("--- Hay varias tiendas en donde dentro no se encuentra nadie --- \n", 15);
                        imprimirConRetardo("--- Las luces estan apagadas--- \n", 15);
                        imprimirConRetardo("--- Vas intentando abrir las puertas de distintos supermercados, algunos están cerrados--- \n", 15);
                        imprimirConRetardo("--- Llegas a una farmacia--- \n", 15);
                        imprimirConRetardo("--- Parece que esta si esta abierta--- \n", 15);
                        imprimirConRetardo("--- Decides entrar ...--- \n", 15);
                        imprimirConRetardo("--- Deberias saquear esto, te puede servir para más adelante--- \n", 15);
                        imprimirConRetardo("--- Elige un objeto médico --- \n\n", 15);

                        imprimirConRetardo("  [1] Analgésico\n  [2] Vendas\n  [3] Pastillas\n", 20);
                        System.out.print("Elige un objeto (1-3): ");

                        if (sitio.hasNextInt()) {
                            int objetoMedico = sitio.nextInt();
                            if (objetoMedico == 1) {
                                agregarAlInventario("Analgésico");
                            } else if (objetoMedico == 2) {
                                agregarAlInventario("Vendas");
                            } else if (objetoMedico == 3) {
                                agregarAlInventario("Pastillas");
                            }
                        }
                        imprimirConRetardo("--- Agarras lo que necesitas y sales de la farmacia ---\n", 35);
                        mostrarInventario(sitio);
                        imprimirConRetardo("--- Miras a tu alrededor y te haces preguntas ---\n", 35);
                        imprimirConRetardo("--- Parece que esta empezando a anochecer ---\n", 35);

                        pausa(2500);
                        yaHasExplorado = true;
                        llegarAlHotel(sitio);
                        break;

                    case 2:
                        animacionCarga("--- Has decido acercarte al río ---");
                        limpiarPantalla();

                        imprimirConRetardo("--- Te acercas al agua, observas tu reflejo en un agua completamente cristalina ---\n", 35);
                        imprimirConRetardo("--- Te limpias la cara, ha servido para activarte ---\n", 35);
                        imprimirConRetardo("--- Observas a tu alrededor, esta lleno de piedras ---\n", 35);
                        imprimirConRetardo("--- Quiza alguna te pueda servir para más tarde asi que la guardas en tu inventario ---\n", 35);

                        agregarAlInventario("Piedra ");
                        yaHasExplorado = true;
                        mostrarInventario(sitio);
                        llegarAlHotel(sitio);
                        pausa(2500);
                        break;

                    case 3:
                        rutaBosqueExtendida(sitio);
                        yaHasExplorado = true;
                        break;

                    case 4:
                        mostrarInventario(sitio);
                        break;

                    case 5:
                        imprimirConRetardo(GRIS + "\nRegresando...\n" + RESET, 25);
                        pausa(1000);
                        yaHasExplorado = true;
                        break;

                    default:
                        System.out.println(ROJO + "\n(!) Opción no válida. Elige entre 1 y 5." + RESET);
                        pausa(1000);
                }
            } else {
                System.out.println(ROJO + "\n(!) Introduce un número válido." + RESET);
                sitio.next();
                pausa(1000);
            }

        } while (!yaHasExplorado);
    }


    public static void rutaBosqueExtendida(Scanner sitio) throws InterruptedException {
        animacionCarga("--- Has decido adentrarte hacia el bosque ---");
        limpiarPantalla();

        imprimirConRetardo("--- Crees que es la mejor opción, el sol todavía esta brillando, es el mejor momento ---\n", 35);
        imprimirConRetardo("--- Vas hacia adelante explorando el suelo ---\n", 35);
        imprimirConRetardo("--- En el suelo logras ver una rama alargada y resistente --- \n", 35);
        imprimirConRetardo("--- Podría servirte para más tarde... --- \n", 35);

        agregarAlInventario("Rama");
        agregarAlInventario("Rama");
        agregarAlInventario("Rama");
        pausa(1500);

        imprimirConRetardo("\n--- Decides seguir explorando un poco más adentrándote entre los árboles --- \n", 35);
        imprimirConRetardo("--- Al mirar con atención entre unos arbustos caídos, descubres unos hilos resistentes y bien conservados --- \n", 35);

        agregarAlInventario("Hilos");
        pausa(1500);


        if (tieneObjeto("Rama") && tieneObjeto("Hilos")) {
            imprimirConRetardo("\n--- Tienes una Rama y unos Hilos en tu inventario --- \n", 35);
            imprimirConRetardo("--- ¿Deseas combinar ambos materiales para crear una caña de pescar? (1. Sí / 2. No): ", 35);

            if (sitio.hasNextInt()) {
                int crearCana = sitio.nextInt();
                if (crearCana == 1) {
                    agregarAlInventario("Caña de pescar");
                    imprimirConRetardo("--- ¡Has creado con éxito una caña de pescar artesanal! --- \n", 35);
                    imprimirConRetardo("--- Con esto puedes acercarte al río anterior e ir a pescar --- \n", 35);
                    limpiarPantalla();
                    imprimirConRetardo("--- Llegas al lugar de incio y te acercas al río --- \n\n", 35);
                    imprimirConRetardo("--- Vas a necesitar alimentarte por lo que te pones a pescar --- \n\n", 35);

                    menuPesca(sitio);
                } else {
                    imprimirConRetardo("--- Decides guardar los materiales sin ensamblar por ahora ---\n", 35);
                }
            }
        }
        if (tieneObjeto("Pescado")) {
            limpiarPantalla();
            imprimirConRetardo("--- Tienes pescado crudo en tu inventario ---\n", 35);
            imprimirConRetardo("--- Con una rama puedes crear fuego y cocinarlo ---\n", 35);
            imprimirConRetardo("Hacer una hoguera consumirá 1 Rama de tu inventario.\n", 30);
            imprimirConRetardo("  [1] Sí, hacer hoguera y cocinar\n  [2] No hacer nada\nOpción: ", 25);

            if (sitio.hasNextInt()) {
                int hacerHoguera = sitio.nextInt();
                if (hacerHoguera == 1) {
                    if (tieneObjeto("Rama")) {
                        eliminarDelInventario("Rama");
                        eliminarDelInventario("Pescado");
                        agregarAlInventario("Pescado cocinado");
                        imprimirConRetardo(VERDE + "--- Has encendido la hoguera consumiendo una rama para cocinar el pez --- \n" + RESET, 35);
                        imprimirConRetardo("--- El pescado cocinado queda listo para comer cuando lo necesites ---\n", 35);
                    } else {
                        imprimirConRetardo(ROJO + "--- No tienes ninguna rama disponible en el inventario para hacer la hoguera ---\n" + RESET, 35);
                    }
                }
            }
        }

        imprimirConRetardo("---Parece que has escogido el mejor sitio para explorar ---\n", 30);
        mostrarInventario(sitio);
        imprimirConRetardo("--- Ahora estas preparado para encontrar la verdad ---\n", 30);
        llegarAlHotel(sitio);

    }


    public static void menuPesca(Scanner sitio) throws InterruptedException {
        int usosCana = 4;
        Random random = new Random();

        do {
            limpiarPantalla();
            System.out.println(CYAN + "+--------------------------------------");
            System.out.println("|             PESCA                   |");
            System.out.println("|      Usos restantes de caña: " + usosCana + "       |");
            System.out.println("+--------------------------------------" + RESET + "\n");

            imprimirConRetardo("Te sitúas en la orilla del río con tu caña lista.\n", 25);
            imprimirConRetardo("¿Hacia dónde quieres lanzar el anzuelo?\n", 25);
            imprimirConRetardo("  [1] Izquierda\n", 20);
            imprimirConRetardo("  [2] Derecha\n", 20);
            imprimirConRetardo("  [3] Dejar de pescar y continuar\n", 20);
            System.out.print("Elige una opción (1-3): ");

            if (sitio.hasNextInt()) {
                int eleccionJugador = sitio.nextInt();

                if (eleccionJugador == 3) {
                    imprimirConRetardo("--- Guardas tu caña y te alejas de la orilla ---\n", 30);
                    pausa(1500);
                    break;
                }

                if (eleccionJugador == 1 || eleccionJugador == 2) {

                    int eleccionMaquina = random.nextInt(2) + 1;

                    animacionCarga("Lanzas el anzuelo al agua y esperas con tensión");

                    if (eleccionJugador == eleccionMaquina) {
                        imprimirConRetardo(VERDE + "¡Has acertado! Un pez ha picado el anzuelo y lo atrapas con éxito.\n" + RESET, 30);
                        agregarAlInventario("Pescado");
                        usosCana--;
                    } else {
                        imprimirConRetardo(ROJO + "Has elegido el lado equivocado. El pez huyó y la corriente desgastó tu sedal.\n" + RESET, 30);
                        usosCana--;
                    }
                    pausa(2000);
                } else {
                    System.out.println(ROJO + "Opción no válida." + RESET);
                    pausa(1000);
                }

                if (usosCana <= 0) {
                    limpiarPantalla();
                    imprimirConRetardo(ROJO + "La caña se ha roto por completo tras agotar sus 4 usos\n" + RESET, 30);
                    eliminarDelInventario("Caña de pescar");
                    pausa(2000);
                    break;
                }

            } else {
                System.out.println(ROJO + "Introduce un número válido." + RESET);
                sitio.next();
                pausa(1000);
            }

        } while (true);
    }


    public static void agregarAlInventario(String objeto) {
        if (totalObjetos < inventario.length) {
            inventario[totalObjetos] = objeto;
            totalObjetos++;
            System.out.println(VERDE + "[+] Has guardado '" + objeto + "' en tu inventario." + RESET);
        } else {
            System.out.println(ROJO + "[!] El inventario está lleno" + RESET);
        }
    }

    public static boolean tieneObjeto(String nombreObjeto) {
        for (int i = 0; i < totalObjetos; i++) {
            if (inventario[i] != null && inventario[i].contains(nombreObjeto)) {
                return true;
            }
        }
        return false;
    }

    public static void mostrarInventario(Scanner sc) throws InterruptedException {
        limpiarPantalla();
        imprimirConRetardo("¿Quieres ver el inventario ahora mismo?\n", 25);
        imprimirConRetardo("  [1] Sí, abrir inventario\n", 20);
        imprimirConRetardo("  [2] No, volver atrás\n", 20);
        System.out.print("Elige una opción (1-2): ");

        if (sc.hasNextInt()) {
            int decision = sc.nextInt();

            if (decision == 1) {
                System.out.println(AMARILLO + "--------------------------------------");
                System.out.println("|          INVENTARIO ACTUAL           |");
                System.out.println("--------------------------------------" + RESET);

                if (totalObjetos == 0) {
                    System.out.println("| Tu inventario está vacío.            |");
                } else {
                    for (int i = 0; i < totalObjetos; i++) {
                        System.out.println("| " + (i + 1) + ". " + inventario[i]);
                    }
                }
                System.out.println("--------------------------------------");
                imprimirConRetardo("\nPulsa cualquier número para volver: ", 20);
                sc.nextInt();

            }
        }
    }

    public static void imprimirConRetardo(String texto, int milisegundos) throws InterruptedException {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            Thread.sleep(milisegundos);
        }
    }

    public static void pausa(int milisegundos) throws InterruptedException {
        Thread.sleep(milisegundos);
    }

    public static void animacionCarga(String mensaje) throws InterruptedException {
        System.out.print("\n" + mensaje);
        for (int i = 0; i < 3; i++) {
            pausa(400);
            System.out.print(".");
        }
        pausa(600);
        System.out.println("\n");
    }

    public static void limpiarPantalla() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }

    public static void eliminarDelInventario(String nombreDelObjeto) {
        for (int i = 0; i < totalObjetos; i++) {
            if (inventario[i] != null && inventario[i].contains(nombreDelObjeto)) {
                for (int j = i; j < totalObjetos - 1; j++) {
                    inventario[j] = inventario[j + 1];
                }
                inventario[totalObjetos - 1] = null;
                totalObjetos--;
                break;
            }
        }
    }

    public static void llegarAlHotel(Scanner sitio) throws InterruptedException {
        animacionCarga("--- De la nada sientes algo ---\n");
        limpiarPantalla();
        imprimirConRetardo("--- Es casi de noche y parece que se ha encendido una potente luz que se ve a kilométros ---\n", 20);
        imprimirConRetardo("--- A lo lejos puedes distinguir una pantalla que te indica con una flecha que debes ir al centro de esa potente luz ---\n", 20);
        imprimirConRetardo("--- Tienes miedo pero debes avanzar ---\n", 25);

        limpiarPantalla();

        imprimirConRetardo("--- Llevas un tiempo andando, ya estas apunto de llegar ---\n", 25);
        imprimirConRetardo("--- Acabas de llegar a una calle principal del centro de la ciudad ---\n", 25);
        imprimirConRetardo("--- La luz proviene de un hotel lujoso que tiene una enorme pantalla ---\n", 25);
        imprimirConRetardo("--- En la pantalla en blanco aparece un texto ---\n", 25);
        imprimirConRetardo("Próximo juego en curso, se espera a formar grupo\n", 25);
        imprimirConRetardo("--- Bajas la mirada y ves a alguien debajo del hotel ---\n", 25);
        imprimirConRetardo("--- Es la primera persona que ves desde que estas aqui ---\n", 25);
        imprimirConRetardo("--- No sabes como podria reaccionar pero al final decides acercarte ---\n", 25);

        limpiarPantalla();

        imprimirConRetardo("--- Te vas acercando poco a poco ---\n", 25);
        imprimirConRetardo("???: ...\n", 25);
        imprimirConRetardo("???: ¿Eres un humano?\n", 25);
        imprimirConRetardo("???: Eres la primera persona que veo desde que estoy aqui\n", 25);
        imprimirConRetardo("???: Yo solo desperte aqui esta mañana\n", 25);
        imprimirConRetardo("???: ¿A ti te ha pasado lo mismo?\n", 25);
        imprimirConRetardo("???: hablame sobre ti\n", 25);
        imprimirConRetardo("???: ¿Cuál es tu nombre?\n", 25);
        System.out.print("Introduce tu nombre: ");
        sitio.nextLine();
        String nombreJugador = sitio.nextLine();
        imprimirConRetardo("???: asi que te llamas " + nombreJugador, 25);
        imprimirConRetardo("\n???: Mi nombre es Yanina\n", 25);
        imprimirConRetardo("Yanina: Desperte esta mañana en mi casa pero no encontre a nadie...\n", 25);
        imprimirConRetardo("Yanina: Imagino que a ti te ha pasado algo parecido\n", 25);
        imprimirConRetardo("Yanina: Yo de igual forma he seguido las luces\n", 25);
        imprimirConRetardo("Yanina: Parece que si queremos más información debemos entrar al hotel\n", 25);
        imprimirConRetardo("Yanina: ¿Quieres que vayamos juntos?\n", 25);
        imprimirConRetardo("  [1] Aceptar formar grupo con Yanina\n", 20);
        imprimirConRetardo("  [2] Rechazar su oferta y seguir solo\n", 20);
        System.out.print("Elige una opción (1-2): ");

        if (sitio.hasNextInt()) {
            int decisionGrupo = sitio.nextInt();

            if (decisionGrupo == 1) {
                esGrupoYanina = true;
                limpiarPantalla();
                imprimirConRetardo("Yanina: Perfecto, todavia no sabemos a lo que nos enfrenamos si permanecemos unidos sera mejor.\n", 35);
                imprimirConRetardo("Yanina: pareces una persona confiable\n", 35);
                imprimirConRetardo("Yanina: Toma, me harias un favor guardandome esto...\n", 35);


                agregarAlInventario("Llave oxidada (Regalo de Yanina)");

                imprimirConRetardo("Yanina: Gracias por guardarla, avancemos .\n", 20);
                imprimirConRetardo("--- Entrais a ese hotel para saber que esta pasando ---\n", 20);
                imprimirConRetardo("--- te sorprende que hay algunas personas más ahi ---\n", 20);
                imprimirConRetardo("--- No parecen hablar mucho ---\n", 20);
                imprimirConRetardo("--- De repente una voz empieza a hablar desde una maquina ---\n", 20);
                imprimirConRetardo("??: Buenas nuevos jugadores\n", 20);
                imprimirConRetardo("??: Gracias por asistir al minujuego de hoy\n", 20);
                imprimirConRetardo("??: Hoy jugareis al 3 en raya \n", 20);
                imprimirConRetardo("??: Ya sabeis las reglas si perdeis...morireis \n", 20);
                imprimirConRetardo("??: Buena suerte a todos \n", 20);
                imprimirConRetardo("--- Las puertas de salida se cerraron bruscamente --- \n", 20);
                imprimirConRetardo("--- Y has sido separado de las demas personas, estas tu solo en una habitación --- \n", 20);
                imprimirConRetardo("--- Tienes un tablero en grande, parece el 3 en raya --- \n", 20);
                imprimirConRetardo("--- De verdad parece que tienes que jugar --- \n", 20);

            } else {
                esGrupoYanina = false;
                limpiarPantalla();
                imprimirConRetardo("Yanina asiente con seriedad, respetando tu decisión. 'De acuerdo, cada uno por su lado entonces'.\n", 35);
                imprimirConRetardo("--- No has obtenido ningún objeto, continúas tu camino en solitario ---\n", 35);
                imprimirConRetardo("--- Decides adentrarte a donde te indican las luces que son más a dentro del hotel, en una habitación ---\n", 35);
                imprimirConRetardo("--- Al entrar en la habitación la puerta se cierra brucamente ---\n", 35);
                imprimirConRetardo("--- De repente una voz empieza a hablar desde una maquina ---\n", 20);
                imprimirConRetardo("--- De repente una voz empieza a hablar desde una maquina ---\n", 20);
                imprimirConRetardo("??: Buenas nuevos jugadores\n", 20);
                imprimirConRetardo("??: Gracias por asistir al minujuego de hoy\n", 20);
                imprimirConRetardo("??: Hoy jugareis al 3 en raya \n", 20);
                imprimirConRetardo("??: Ya sabeis las reglas si perdeis...morireis \n", 20);
                imprimirConRetardo("??: Buena suerte a todos \n", 20);


            }
        }
        for (int numPartida = 1; numPartida <= 2; numPartida++) {
            if (vidaJugador <= 0) break;

            imprimirConRetardo("\n--- ¡Comienza la Partida " + numPartida + " de 2! (Tu vida actual: " + vidaJugador + "/100) \n\n", 30);
            pausa(1500);


            boolean ganoJugador = ejecutarTresEnRaya(sitio, numPartida);

            if (ganoJugador) {
                imprimirConRetardo(VERDE + "\n¡Has ganado la Partida " + numPartida + "!\n" + RESET, 30);
            } else {
                vidaJugador -= 50;
                imprimirConRetardo(ROJO + "\n¡Has perdido la Partida " + numPartida + "! Pierdes 50 puntos de vida. Vida actual: " + vidaJugador + "/100\n" + RESET, 30);
            }


            if (vidaJugador <= 0) {
                limpiarPantalla();
                imprimirConRetardo(ROJO + "Parece que tu vida a llegado a 0, no puedes salir de aqui \n" + RESET, 40);
                pausa(1000);
                System.exit(0);
            }

            pausa(2000);


            menuCuracionPostPartida(sitio);
        }

        limpiarPantalla();
        imprimirConRetardo("Has superado la primera prueba, mereces vivir, tu vida actual es:" + vidaJugador + " HP --- \n", 20);
        imprimirConRetardo("--- No entiendes lo que esta pasando ---\n", 20);
        imprimirConRetardo("--- ¿Realmente habrías podido morir si no ganabas ese minijuego? ---\n", 20);
        imprimirConRetardo("--- Aún así has podido ganar y por lo visto seguir con vida ---\n", 20);
        imprimirConRetardo("--- Las puertas se vuelven a abrir por lo que te diriges fuera del hotel ---\n", 20);
        if (esGrupoYanina){
            imprimirConRetardo("--- Parece que Yanina ya estaba fuera ---\n", 20);
            imprimirConRetardo("Yanina: ¡"+nombreJugador+"!\n", 20);
            imprimirConRetardo("Yanina: Estas bien, a ti también te han hecho jugar al 3 en raya\n", 20);
            imprimirConRetardo("Yanina: Cuando entre al hotel, conoci a otras personas\n", 20);
            imprimirConRetardo("Yanina: Me contaron un poco más acerca de este lugar, por lo visto si queremos regresar a casa...\n", 20);
            imprimirConRetardo("Yanina: Necesitamos jugar a todos los minijuegos\n", 20);
            imprimirConRetardo("Yanina: Mira las pantallas, indican un nuevo lugar de un nuevo minijuego\n", 20);
            imprimirConRetardo("Yanina: Podemos descansar o seguir hacia el siguiente minijuego...\n", 20);

            elegirAccionDespuesDeJuego(sitio);

        } else {

            imprimirConRetardo("--- Las puertas se vuelven a abrir por lo que te diriges fuera del hotel ---\n", 20);
            imprimirConRetardo("--- Según las indicaciones de la pantalla de tu habitación del hotel para salir de aquí necesitas ir al siguiente minijuego ---\n", 20);
            imprimirConRetardo("--- No estas muy seguro de eso pero es lo único que puedes hacer por el momento ---\n", 20);

            elegirAccionDespuesDeJuego(sitio);

        }
    }

    public static boolean ejecutarTresEnRaya(Scanner sc, int numPartida) throws InterruptedException {
        Random random = new Random();
        char[][] tablero = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

        char jugador = 'X';
        boolean ganador = false;
        int movimientos = 0;

        while (!ganador && movimientos < 9) {
            limpiarPantalla();
            System.out.println(AMARILLO + " PARTIDA " + numPartida + " DE TRES EN RAYA (Vida: " + vidaJugador + "/100) " + RESET);
            mostrarTablero(tablero);
            int posicion;

            if (jugador == 'X') {
                System.out.println("Tu turno (Jugador X)");
                System.out.print("Elige una casilla (1-9): ");

                if (sc.hasNextInt()) {
                    posicion = sc.nextInt();
                } else {
                    sc.next();
                    continue;
                }
            } else {
                System.out.println("Turno del robot O ");
                posicion = random.nextInt(9) + 1;
                System.out.println("El robot ha elegido: " + posicion);
                pausa(1000);
            }

            if (posicion < 1 || posicion > 9) {
                System.out.println("Posicion incorrecta.");
                pausa(1000);
                continue;
            }

            int fila = (posicion - 1) / 3;
            int columna = (posicion - 1) % 3;

            if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'O') {
                System.out.println("Casilla ocupada.");
                pausa(1000);
                continue;
            }

            tablero[fila][columna] = jugador;
            movimientos++;

            ganador = comprobarGanador(tablero);

            if (ganador) {
                limpiarPantalla();
                mostrarTablero(tablero);
                if (jugador == 'X') {
                    System.out.println(VERDE + "¡Has ganado la partida!" + RESET);
                    pausa(2000);
                    return true; // Gana el jugador
                } else {
                    System.out.println(ROJO + "¡Ha ganado el robot O!" + RESET);
                    pausa(2000);
                    return false; // Pierde el jugador
                }
            } else if (movimientos == 9) {
                limpiarPantalla();
                mostrarTablero(tablero);
                System.out.println("¡Empate! (Cuenta como derrota para restar vida)");
                pausa(2000);
                return false;
            } else {
                if (jugador == 'X') {
                    jugador = 'O';
                } else {
                    jugador = 'X';
                }
            }
        }
        return false;
    }

    public static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tablero[i][j] + " ");
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
    }

    public static boolean comprobarGanador(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j]) {
                return true;
            }
        }
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            return true;
        }
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
            return true;
        }
        return false;
    }

    public static void menuCuracionPostPartida(Scanner sc) throws InterruptedException {
        limpiarPantalla();
        System.out.println(AMARILLO + "+--------------------------------------+");
        System.out.println("|      ESTADO DE SALUD E INVENTARIO    |");
        System.out.println("+--------------------------------------+" + RESET);
        System.out.println("Vida actual: " + vidaJugador + "/100\n");

        imprimirConRetardo("¿Deseas revisar tu inventario y consumir un objeto curativo?\n", 25);
        imprimirConRetardo("  [1] Sí, abrir inventario y curarme\n", 20);
        imprimirConRetardo("  [2] No usar nada y continuar\n", 20);
        System.out.print("Elige una opción (1-2): ");

        if (sc.hasNextInt()) {
            int opcionCuracion = sc.nextInt();
            if (opcionCuracion == 1) {
                mostrarInventario(sc);

                imprimirConRetardo("\n¿Qué deseas consumir?\n", 20);
                imprimirConRetardo("  [1] Pescado cocinado (Recupera 30 HP)\n", 20);
                imprimirConRetardo("  [2] Objeto farmacéutico [Analgésico/Anestésico/Pastillas] (Recupera 40 HP)\n", 20);
                imprimirConRetardo("  [3] No consumir nada\n", 20);
                System.out.print("Elige una opción (1-3): ");

                if (sc.hasNextInt()) {
                    int tipoObjeto = sc.nextInt();
                    if (tipoObjeto == 1) {
                        if (tieneObjeto("Pescado cocinado")){
                        eliminarDelInventario("Pescado cocinado");
                        vidaJugador = Math.min(100, vidaJugador + 30);
                        imprimirConRetardo(VERDE + "Has comido el pescado cocinado. Nueva vida: " + vidaJugador + "/100\n" + RESET, 30);
                        pausa(2000);
                        }else if (!tieneObjeto("Pescado cocinado")){
                        imprimirConRetardo(ROJO + "No tienes ningún pescado cocinado en el inventario.\n" + RESET, 30);
                    }}
                    else if (tipoObjeto == 2) {
                        if (tieneObjeto("Analgésico")) {
                            eliminarDelInventario("Analgésico");
                        } else if (tieneObjeto("Vendas")) {
                            eliminarDelInventario("Vendas");
                        } else if (tieneObjeto("Pastillas")) {
                            eliminarDelInventario("Pastillas");
                        } else {
                            imprimirConRetardo(ROJO + "No tienes ningún objeto farmacéutico en el inventario.\n" + RESET, 30);
                            pausa(2000);
                            return;
                        }
                        vidaJugador = Math.min(100, vidaJugador + 40);
                        imprimirConRetardo(VERDE + "Has usado medicina. Nueva vida: " + vidaJugador + "/100\n" + RESET, 30);
                        pausa(2000);
                    }
                }
            }
        }
    }
    public static void elegirAccionDespuesDeJuego(Scanner sitio) throws InterruptedException {
        limpiarPantalla();
        System.out.println(AMARILLO + "--------------------------------------");
        System.out.println("|           ¿QUÉ DESEAS HACER?          |");
        System.out.println("--------------------------------------" + RESET + "\n");

        imprimirConRetardo("Has terminado los enfrentamientos en el centro comercial.\n", 30);
        imprimirConRetardo("  [1] Descansas y vas a buscar comida\n", 25);
        imprimirConRetardo("  [2] Avanzar directamente hasta el siguiente minijuego\n", 25);
        System.out.print("Elige una opción (1-2): ");

        if (sitio.hasNextInt()) {
            int eleccion = sitio.nextInt();

            if (eleccion == 1) {

                limpiarPantalla();
                animacionCarga("Te detienes a descansar y buscas provisiones por los alrededores");
                limpiarPantalla();


                if (esGrupoYanina) {
                    imprimirConRetardo("Yanina se acerca amablemente y, al ver que estáis en equipo, te echa una mano.\n", 35);
                    imprimirConRetardo("Yanina : 'Toma, te vendrá bien tener esto para lo que se avecina.'\n", 35);
                    agregarAlInventario("Comida enlatada");
                    agregarAlInventario("Pescado cocinado");
                    imprimirConRetardo(VERDE + "[+] Yanina te ha prestado una comida enlatada y un pescado cocinado\n" + RESET, 30);
                } else {
                    imprimirConRetardo("Buscas en solitario rebuscando entre los escombros y restos de tiendas...\n", 35);


                    String[] objetosAleatorios = {"Lata de conserva", "Piedra", "Cerillas", "Trozo de metal"};
                    int indiceAleatorio = (int) (Math.random() * objetosAleatorios.length);
                    String objetoEncontrado = objetosAleatorios[indiceAleatorio];

                    agregarAlInventario(objetoEncontrado);
                    imprimirConRetardo(VERDE + "[+] Has encontrado un objeto aleatorio: " + objetoEncontrado + "\n" + RESET, 30);
                }

                limpiarPantalla();
                if (esGrupoYanina) {

                    imprimirConRetardo("--- Le comentas a Yanina que lo mejor sera descansar --- \n", 35);
                    imprimirConRetardo("--- Buscáis algún buen refugio para descansar --- \n", 35);
                    imprimirConRetardo("--- Después de un tiempo encontráis una casa abandonada --- \n", 35);
                    limpiarPantalla();
                    animacionCarga("Te recuestas en un rincón seguro y duermes profundamente");


                    vidaJugador = Math.min(100, vidaJugador + 25);
                    imprimirConRetardo(VERDE + "Has recuperado 25 puntos de vida durmiendo. Vida actual: " + vidaJugador + "/100\n" + RESET, 30);
                    pausa(2500);
                } else {
                    imprimirConRetardo("--- Te alejas del hotel para buscar un sitio para descansar --- \n", 35);
                    imprimirConRetardo("--- Después de un tiempo encuentras una casa abandonada --- \n", 35);
                    limpiarPantalla();
                    animacionCarga("Te recuestas en un rincón seguro y duermes profundamente");


                }
            } else {

                limpiarPantalla();
                animacionCarga("Decides no perder tiempo y avanzas de inmediato");
                imprimirConRetardo("--- Ignoras el cansancio y sigues avanzando por la oscura ciudad ---\n", 35);
               limpiarPantalla();
            }
        }


        limpiarPantalla();
        imprimirConRetardo("--- Es hora de avanzar ---\n", 15);
        imprimirConRetardo("--- Sigues las indicaciones de las pantallas ---\n", 15);
        imprimirConRetardo("--- El siguiente minijuego esta a 2km ---\n", 15);
        imprimirConRetardo("--- No pierdes tiempo y te pones a caminar ---\n", 15);

         limpiarPantalla();
        iniciarTrivial(sitio);
    }
     public static void iniciarTrivial(Scanner sitio) throws InterruptedException {

        limpiarPantalla();
        imprimirConRetardo("--- Estas caminando, ya queda poco para llegar  ---\n", 15);
        imprimirConRetardo("--- Te das cuenta que quedan solo quedan 100 metros para llegar al lugar del minijuego ---\n", 15);
        imprimirConRetardo("--- Esta dentro del rencinto ferial  ---\n", 15);
        imprimirConRetardo("--- ¿Tendrá algo que ver el lugar con el minijuego? ---\n", 15);

        if (esGrupoYanina) {
            imprimirConRetardo("Yanina: Un lugar como este sin gente verdaderamente da miedo\n", 15);
            imprimirConRetardo("Yanina: Debemos darnos prisa y salir de aquí\n", 15);
            imprimirConRetardo("--- Llegais al sitio del minijuego\n", 15);
            imprimirConRetardo(" ... ", 15);

        } else {

            imprimirConRetardo("--- Un sitio como este es realmente frío sin gente ---\n", 15);
            imprimirConRetardo("--- Debes darte prisa y llegar al minijuego ---\n", 15);
            imprimirConRetardo("--- Llegas al sitio del minijuego ---\n", 15);

        }

        imprimirConRetardo("??: Bienvenidos jugadores\n", 15);
        imprimirConRetardo("??: Os interesa saber que los minijuegos a completar son 4\n", 15);
        imprimirConRetardo("??: Una vez los hayáis completado podréis encontrar respuestas sobre este mundo\n", 15);

        limpiarPantalla();

        System.out.println("|          MINIJUEGO: TRIVIAL          |");


        imprimirConRetardo("Te adentras en una zona extraña del centro comercial y encuentras un viejo terminal activo.\n", 30);
        imprimirConRetardo("Una voz automatizada resuena: 'Responde correctamente para demostrar tu valía y obtener suministros.'\n\n", 30);
        pausa(2000);

        int puntos = 0;
        int respuesta;

        limpiarPantalla();
        System.out.println(AMARILLO + "--- PREGUNTA 1 de 6 ---" + RESET);
        imprimirConRetardo("¿Cómo se llama la primera persona que te has encontrado?\n", 25);
        imprimirConRetardo("  [1] Senna\n  [2] Amazonas\n  [3] Janeiro \n", 20);
        System.out.print("Elige una opción (1-3): ");

        if (sitio.hasNextInt()) {
            respuesta = sitio.nextInt();
            if (respuesta == 2) {
                imprimirConRetardo(VERDE + "¡Correcto!\n" + RESET, 20);
                puntos++;
            } else {
                imprimirConRetardo(ROJO + "¡Incorrecto!\n" + RESET, 20);
            }
        }
        pausa(1500);

        limpiarPantalla();
        System.out.println(AMARILLO + "--- PREGUNTA 2 de 6 ---" + RESET);
        imprimirConRetardo("¿Cuál es tu límite máximo de puntos de vida (HP) al empezar?\n", 25);
        imprimirConRetardo("  [1] 50\n  [2] 15\n  [3] 100\n", 20);
        System.out.print("Elige una opción (1-3): ");

        if (sitio.hasNextInt()) {
            respuesta = sitio.nextInt();
            if (respuesta == 3) {
                imprimirConRetardo(VERDE + "¡Correcto!\n" + RESET, 20);
                puntos++;
            } else {
                imprimirConRetardo(ROJO + "¡Incorrecto!\n" + RESET, 20);
            }
        }
        pausa(1500);

        limpiarPantalla();
        System.out.println(AMARILLO + "--- PREGUNTA 3 de 6 ---" + RESET);
        imprimirConRetardo("¿Qué planeta es conocido como el planeta rojo?\n", 25);
        imprimirConRetardo("  [1] Venus\n  [2] Marte\n  [3] Júpiter\n", 20);
        System.out.print("Elige una opción (1-3): ");

        if (sitio.hasNextInt()) {
            respuesta = sitio.nextInt();
            if (respuesta == 2) {
                imprimirConRetardo(VERDE + "¡Correcto!\n" + RESET, 20);
                puntos++;
            } else {
                imprimirConRetardo(ROJO + "¡Incorrecto!\n" + RESET, 20);
            }
        }



        limpiarPantalla();
        System.out.println(AMARILLO + "--- PREGUNTA 4 de 6 ---" + RESET);
        imprimirConRetardo("¿En qué año se creó Java?\n", 25);
        imprimirConRetardo("  [1] 1995\n  [2] 2005\n  [3] 2010\n", 20);
        System.out.print("Elige una opción (1-3): ");

        if (sitio.hasNextInt()) {
            respuesta = sitio.nextInt();
            if (respuesta == 1) {
                imprimirConRetardo(VERDE + "¡Correcto!\n" + RESET, 20);
                puntos++;
            } else {
                imprimirConRetardo(ROJO + "¡Incorrecto!\n" + RESET, 20);
            }
        }



        limpiarPantalla();
        System.out.println(AMARILLO + "--- PREGUNTA 5 de 6 ---" + RESET);
        imprimirConRetardo("¿Cuántos lados tiene un hexágono?\n", 25);
        imprimirConRetardo("  [1] 5\n  [2] 8\n  [3] 6\n", 20);
        System.out.print("Elige una opción (1-3): ");

        if (sitio.hasNextInt()) {
            respuesta = sitio.nextInt();
            if (respuesta == 3) {
                imprimirConRetardo(VERDE + "¡Correcto!\n" + RESET, 20);
                puntos++;
            } else {
                imprimirConRetardo(ROJO + "¡Incorrecto!\n" + RESET, 20);
            }
        }



        limpiarPantalla();
        System.out.println(AMARILLO + "--- PREGUNTA 6 de 6 ---" + RESET);
        imprimirConRetardo("¿Cuál es el océano más grande?\n", 25);
        imprimirConRetardo("  [1] Atlántico\n  [2] Pacífico\n  [3] Índico\n", 20);
        System.out.print("Elige una opción (1-3): ");

        if (sitio.hasNextInt()) {
            respuesta = sitio.nextInt();
            if (respuesta == 2) {
                imprimirConRetardo(VERDE + "¡Correcto!\n" + RESET, 20);
                puntos++;
            } else {
                imprimirConRetardo(ROJO + "¡Incorrecto!\n" + RESET, 20);
            }
        }


        limpiarPantalla();

        System.out.println("           RESULTADO FINAL            ");

        System.out.println("Puntuación obtenida: " + puntos + " / 6\n");

        if (puntos >= 5) {
            imprimirConRetardo(VERDE + "¡¡¡HAS GANADO EL TRIVIAL!!!\n" + RESET, 30);
            imprimirConRetardo("El terminal se abre y te otorga un botiquín avanzado.\n", 30);
            agregarAlInventario("Botiquín avanzado");
            vidaJugador = Math.min(100, vidaJugador + 30);
        } else {
            imprimirConRetardo(ROJO + "No has conseguido los 5 puntos necesarios. El sistema emite una descarga eléctrica.\n" + RESET, 30);
            vidaJugador -= 50;
            imprimirConRetardo("Pierdes 50 puntos de vida. Vida actual: " + vidaJugador + "/100\n", 30);
        }
    imprimirConRetardo("--- Parece que has sido la primera persona en superar este minijuego\n", 30);
        if (esGrupoYanina) {
            imprimirConRetardo("--- Yannina deberia seguir jugando\n", 30);

        } else {
            imprimirConRetardo("--- No esperas a nadie, deberias seguir ---\n", 15);
        }
        remYSecuestro(sitio);
    }
        public static void remYSecuestro (Scanner sitio) throws InterruptedException {
        imprimirConRetardo("--- Parece que hay alguien más llegando al sitio---\n",15);
        imprimirConRetardo("--- Es una chica que parece nerviosa y temblorosa ---\n",15);
        imprimirConRetardo("--- Va a hacer ahora el minijuego del trivia ---\n",15);
        imprimirConRetardo("--- Parece que esa chica se esta acercando a ti ---\n",15);
        imprimirConRetardo("?: ¿Hola...?\n",15);
        imprimirConRetardo("?: Eres la primera persona que encuentro aquí\n",15);
        imprimirConRetardo("?: No se que esta pasando\n",15);
        imprimirConRetardo("?: ¿Podrías ayudarme?, Me llamo Rem\n",15);
        limpiarPantalla();
        imprimirConRetardo("¿Qué decides hacer?\n", 25);
        imprimirConRetardo("  [1] Ayudar a REM antes de que juegue\n", 20);
        imprimirConRetardo("  [2] No ayudarla y mantenerte al margen\n", 20);
        System.out.print("Elige una opción (1-2): ");
        int decisionRem = 2;
        if (sitio.hasNextInt()) {
            decisionRem = sitio.nextInt();
        } else {
            sitio.next();
        }
        limpiarPantalla();
        if (decisionRem == 1) {
            esGrupoRem = true;
            imprimirConRetardo(VERDE + "--- Ha decido ayudar a Rem ---\n" + RESET, 15);
            imprimirConRetardo( "--- Le cuentas acerca del siguiente minijuego el trivia ---\n" , 15);
            imprimirConRetardo( "--- Le das consejos y como responder ---\n" , 15);
            imprimirConRetardo("REM : ¡Muchísimas gracias!  \n", 15);
            imprimirConRetardo("REM : Porfavor acepta esto como agradecimiento \n", 15);
            agregarAlInventario("Poción +70 DA");
        } else {
            imprimirConRetardo("--- Decides no intervenir y observas desde la distancia ---\n", 15);
            imprimirConRetardo("--- Tras terminar, REM sigue su propio camino ---\n", 15);
        }
        if (esGrupoYanina){
            imprimirConRetardo("--- Por fin ves a la gente salir, debes esperar a Yanina ---\n", 15);
            imprimirConRetardo("--- Parece que por fin esta saliendo---\n", 15);
            imprimirConRetardo("Yanina:¡Aqui!\n", 15);
            imprimirConRetardo("Yanina:¡He conseguido superar el trivia!\n", 15);
            imprimirConRetardo("Yanina: Venga solo quedan 2 minijuegos más para salir de aquí, decidamos\n", 15);
        }else {
            imprimirConRetardo("--- No tienes tiempo que perder ahora ---\n", 15);

        }

        limpiarPantalla();
        System.out.println(AMARILLO + "¿Qué deberías hacer ahora?" + RESET + "\n");

        imprimirConRetardo("  [1] Descansar (dormir)\n", 20);
        imprimirConRetardo("  [2] Seguir con nuestro camino\n", 20);
        System.out.print("Elige una opción (1-2): ");

        int decisionCamino = 2;
        if (sitio.hasNextInt()) {
            decisionCamino = sitio.nextInt();
        } else {
            sitio.next();
        }

        if (decisionCamino == 1) {
            limpiarPantalla();
            animacionCarga("--- Buscas una zona tranquila cerca del agua para descansar ---");


            limpiarPantalla();
            animacionCarga("--- Tras el rato junto al agua, te recuestas y duermes para recuperar energías ---");
            vidaJugador = Math.min(100, vidaJugador + 20);
            imprimirConRetardo(VERDE + "[+] Has descansado bien. Tu vida actual es: " + vidaJugador + "/100\n" + RESET, 30);
            pausa(2000);
        }
        limpiarPantalla();
        animacionCarga("--- Seguís avanzando con nuestro camino por el recinto ---");
        imprimirConRetardo("--- El siguiente minijuego parece estar muy cerca a unos 150 metros ---\n", 15);
        limpiarPantalla();

        imprimirConRetardo(ROJO + "??? : Vaya parece que sois los primeros en llegar\n" + RESET, 15);
        imprimirConRetardo("???: Me presento, me llamo kyle\n", 15);
        imprimirConRetardo("Kyle: Este es el penúltimo minijuego que tenéis que jugar \n", 15);
        if (esGrupoYanina) {
            imprimirConRetardo("--- Antes de que puedas reaccionar, Kyle aprovecha un descuido, secuestra a Yanina y la cuelga de una estructura ---\n", 35);
            imprimirConRetardo(AMARILLO + "Kyle : 'Si quieres salvarla, tendrás que jugar al famoso ahorcado'\n\n" + RESET, 15);
        } else {
            imprimirConRetardo("--- Antes de que puedas reaccionar, Kyle secuestra a uno de los participantes ---\n", 15);
            imprimirConRetardo("--- Parece aquella chica que viste el incio en el centro comercial ---\n", 15);
            imprimirConRetardo(AMARILLO + "Kyle : 'Si quieres salvarla, tendrás que jugar al famoso ahorcado'\n\n" + RESET, 15);

        }


    }

      public static boolean jugarAhorcado(Scanner scanner) throws InterruptedException {
        limpiarPantalla();

        System.out.println("|             AHORCADO           |");


        imprimirConRetardo("X ha colgado a Yanina de una estructura metálica en lo alto del centro comercial.\n", 30);
        imprimirConRetardo("Para descender la cuerda y salvarla a tiempo, debes adivinar la palabra secreta.\n\n", 30);
        pausa(2000);

        String palabraSecreta = "Despierta".toLowerCase();
        char espacios = ' ';
        StringBuilder palabraMostrada = new StringBuilder();


        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == espacios) {
                palabraMostrada.append(" ");
            } else {
                palabraMostrada.append("_");
            }
        }

        int intentos = 6;
        boolean[] letrasAdivinadas = new boolean[palabraSecreta.length()];

        while (intentos > 0 && palabraMostrada.toString().contains("_")) {
            limpiarPantalla();
            System.out.println(AMARILLO + "=== JUEGO DEL AHORCADO ===" + RESET);
            System.out.println("  ------");
            System.out.println("  |    |");
            if (intentos <= 5) System.out.println("  O    |"); else System.out.println("       |");
            if (intentos <= 3) System.out.println(" /|\\   |"); else if (intentos == 4) System.out.println(" /|    |"); else System.out.println("       |");
            if (intentos <= 1) System.out.println(" / \\   |"); else if (intentos == 2) System.out.println(" /     |"); else System.out.println("       |");
            System.out.println("       |");
            System.out.println("-------");

            System.out.println("\nPalabra actual: " + palabraMostrada);
            System.out.println(ROJO + "Tienes " + intentos + " intentos restantes." + RESET);
            System.out.print("Introduce una letra: ");

            char letra = scanner.next().toLowerCase().charAt(0);
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra && !letrasAdivinadas[i]) {
                    letrasAdivinadas[i] = true;
                    palabraMostrada.setCharAt(i, letra);
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos--;
                imprimirConRetardo(ROJO + "Letra incorrecta. Te quedan " + intentos + " intentos.\n" + RESET, 20);
                pausa(1000);
            } else {
                imprimirConRetardo(VERDE + "¡Bien! Has acertado una letra.\n" + RESET, 20);
                pausa(1000);
            }
        }

        limpiarPantalla();
        if (palabraMostrada.toString().equals(palabraSecreta)) {
            imprimirConRetardo(VERDE + "¡Felicidades! Has adivinado la palabra: " + palabraSecreta + "\n", 30);
            imprimirConRetardo("La cuerda se afloja y consigues desatar a Yanina a tiempo. ¡Está a salvo!\n" + RESET, 30);
            imprimirConRetardo("Yanina esta estable pero se ha desmayado\n" , 10);
            imprimirConRetardo("--- Decides cargarla y llevarle a un sitio en el que puedas decansar ---\n" , 10);
            imprimirConRetardo("--- Empiezas a caminar buscando algún sitio en el que ella pueda encontrarse bien  ---\n" , 10);
            limpiarPantalla();
            imprimirConRetardo("---Despues de un tiempo consigues encontrar un refugio ---\n" , 10);
            imprimirConRetardo("--- La dejas ahi y es tiempo de avanzar ---\n" , 10);

            pausa(3000);
            return true;
        } else {
            imprimirConRetardo(ROJO + "¡Has perdido! La palabra era: " + palabraSecreta + "\n", 30);
            imprimirConRetardo("No lo has conseguido a tiempo... Kyle se marcha riéndose mientras Yanina cae.\n" + RESET, 30);
            vidaJugador -= 50;
            imprimirConRetardo("El fracaso te deja devastado. Pierdes 50 puntos de vida. Vida actual: " + vidaJugador + "/100\n", 30);
            imprimirConRetardo("--- No hay tiempo para lamentare, necesitas hacer el siguiente juego que esta a 2km de aqui ---\n" , 10);

            pausa(3000);
            return false;
        }

    }

    public static void eventoFinalKyle(Scanner sc) throws InterruptedException{
        limpiarPantalla();
        System.out.println("|          EL DESENLACE FINAL          |");
        imprimirConRetardo("--- Empiezas a correr, con lo último has llegado a tu límite necesitas encontrar la respuesta ---\n" , 10);
        imprimirConRetardo("--- Solo quedan 50m para entrar en el minijuego ---\n" , 10);
        limpiarPantalla();
        imprimirConRetardo("Kyle: viajero, este tu minijuego final\n" , 10);
        imprimirConRetardo("Kyle: Gana y llegaras a tus propias conclusiones.\n" , 10);

        boolean ganoPartida = false;

        do {
            limpiarPantalla();
            System.out.println(AMARILLO + " FINAL: PIEDRA, PAPEL O TIJERA " + RESET);
            System.out.println("0: 🗒️ Papel");
            System.out.println("1: 🪨 Piedra");
            System.out.println("2: ✂️ Tijera");
            System.out.print("Elige tu opción (0-2): ");

            int choosePlayer = -1;
            if (sc.hasNextInt()) {
                choosePlayer = sc.nextInt();
                if (choosePlayer < 0 || choosePlayer > 2) {
                    System.out.println(ROJO + "¡Error! Introduce un número entre 0 y 2." + RESET);
                    pausa(1500);
                    continue;
                }
            } else {
                System.out.println(ROJO + "¡Error! Debes introducir un número válido." + RESET);
                sc.next();
                pausa(1500);
                continue;
            }

            Random random = new Random();
            int chooseRobot = random.nextInt(3);

            limpiarPantalla();
            if (choosePlayer == 0) System.out.println("Elegiste: 🗒️ Papel");
            else if (choosePlayer == 1) System.out.println("Elegiste: 🪨 Piedra");
            else if (choosePlayer == 2) System.out.println("Elegiste: ✂️ Tijera");

            if (chooseRobot == 0) System.out.println("Kaiyun eligió: 🗒️ Papel");
            else if (chooseRobot == 1) System.out.println("Kaiyun eligió: 🪨 Piedra");
            else if (chooseRobot == 2) System.out.println("Kaiyun eligió: ✂️ Tijera");

            System.out.println();

            // Lógica de resultados de tu código
            if (choosePlayer == chooseRobot) {
                System.out.println(AMARILLO + "¡Empate! Kyle te obliga a elegir de nuevo." + RESET);
                pausa(2000);
            } else if ((choosePlayer == 0 && chooseRobot == 1) ||
                    (choosePlayer == 1 && chooseRobot == 2) ||
                    (choosePlayer == 2 && chooseRobot == 0)) {

                System.out.println(VERDE + "FELICIDADES HAS GANADO " + RESET);
                imprimirConRetardo("Kyle: Vaya... has demostrado que tienes \n", 35);
                ganoPartida = true;
                pausa(3000);

            } else {
                System.out.println(ROJO + "PIERDES EL DUELO" + RESET);
                imprimirConRetardo("Kyle se impone ante ti y te obliga a elegir de nuevo bajo amenaza...\n", 35);

            }

        } while (!ganoPartida);

        limpiarPantalla();

        System.out.println("          FIN DE LA AVENTURA          ");

        imprimirConRetardo("Has completado Dark Essence con éxito. Gracias por jugar.\n", 40);
        pausa(3000);


    }

}

    


