# 🌑 DARK ESSENCE

Dark Essence es un juego de aventuras desarrollado en Java en el que el jugador despierta en un mundo extraño, aparentemente sin habitantes, y tiene que descubrir qué está pasando.

A medida que avanza la historia, tendrá que explorar diferentes lugares, conseguir objetos, tomar decisiones y superar minijuegos para poder sobrevivir.

El proyecto todavía está en desarrollo, por lo que algunas partes de la historia y algunas mecánicas están pendientes de implementar.

## 📖 Historia

La historia comienza cuando el protagonista despierta en un valle sin recordar exactamente cómo ha llegado hasta allí. Todo parece normal a primera vista, pero hay algo extraño: no hay nadie alrededor.

Después de explorar los alrededores, descubre una ciudad aparentemente abandonada y comienza a buscar respuestas.

Durante la aventura conocerá a otros personajes, como Yanina, y descubrirá que para poder regresar a casa tendrá que superar diferentes minijuegos. Sin embargo, perder no es una opción, ya que su propia vida está en juego.

## 🎮 Funcionalidades implementadas

Actualmente, el juego cuenta con las siguientes funciones:

### Menú principal
- Inicio de una nueva partida.
- Opción para salir del juego.
- Menús interactivos mediante la terminal.
- Textos que aparecen progresivamente para dar más ambiente a la historia.

### Historia y exploración
- Introducción a la historia del juego.
- Sistema para decidir si el personaje continúa durmiendo o se levanta.
- Posibilidad de explorar tres zonas:
  - Centro de la ciudad abandonada.
  - Río.
  - Bosque.
- Diferentes acontecimientos dependiendo de la zona elegida.
- Aparición del personaje Yanina.
- Posibilidad de aceptar o rechazar formar equipo con ella.

### 🎒 Inventario
- Sistema de inventario mediante un array.
- Capacidad máxima de 10 objetos.
- Posibilidad de recoger objetos durante la aventura.
- Consultar los objetos que tienes guardados.
- Eliminar objetos cuando se utilizan o se consumen.

Algunos objetos que se pueden conseguir actualmente son:
- Analgésicos.
- Vendas.
- Pastillas.
- Piedras.
- Ramas.
- Hilos.
- Caña de pescar.
- Pescado.
- Pescado cocinado.
- Llave oxidada.

### 🌲 Sistema de exploración y creación
- Recogida de materiales en el bosque.
- Posibilidad de combinar una rama y unos hilos para fabricar una caña de pescar.
- Sistema de pesca con diferentes posibilidades.
- La caña tiene un máximo de 4 usos.
- Posibilidad de conseguir pescado y cocinarlo utilizando una rama para hacer una hoguera.

### ❤️ Sistema de vida y curación
- El jugador comienza con 100 puntos de vida.
- Perder una partida de tres en raya resta 50 puntos de vida.
- Posibilidad de recuperar vida utilizando objetos del inventario.
- El pescado cocinado recupera 30 puntos de vida.
- Los objetos médicos recuperan 40 puntos de vida.
- Descansar con Yanina permite recuperar 25 puntos de vida.
- La vida máxima está limitada a 100 puntos.

### ❌ Primer minijuego: Tres en raya
- Tablero de 3x3.
- El jugador utiliza las X.
- La máquina utiliza las O.
- Turnos alternos entre el jugador y la máquina.
- Comprobación de filas, columnas y diagonales para detectar al ganador.
- Comprobación de empate.
- El empate cuenta como derrota.
- El jugador debe superar dos partidas para completar esta primera prueba.

## 🛠️ Tecnologías utilizadas

- **Java:** lenguaje utilizado para desarrollar el juego.
- **IntelliJ IDEA:** entorno de desarrollo.
- **Scanner:** para recoger las decisiones y respuestas del jugador.
- **Random:** para generar resultados aleatorios, como los movimientos de la máquina o la pesca.
- **Arrays:** utilizados para almacenar los objetos del inventario y representar el tablero del tres en raya.
- **Colores ANSI:** para diferenciar mensajes y opciones en la terminal.
- 

## ▶️ Cómo ejecutar el juego

Para ejecutar el proyecto es necesario tener instalado Java y un entorno que permita ejecutar programas Java.

1. Descargar o clonar el repositorio.
2. Abrir el proyecto desde IntelliJ IDEA.
3. Localizar la clase `Main`.
4. Ejecutar el método `main`.
5. Seguir las instrucciones que aparecen en la terminal.

## 🚧 Próximas mejoras

El juego todavía no está terminado. Estas son algunas de las cosas que quedan por desarrollar o mejorar:

- Continuar la historia después del primer minijuego.
- Añadir nuevos minijuegos.
- Incorporar nuevas zonas para explorar.
- Añadir más personajes y decisiones.
- Ampliar el sistema de inventario.
- Implementar nuevas formas de conseguir y utilizar objetos.
- Seguir desarrollando el sistema de vida y supervivencia.
- Añadir más acontecimientos dependiendo de las decisiones del jugador.

## 📌 Estado del proyecto

**En desarrollo.**

Esta es una primera versión del juego en la que se está construyendo la historia principal y sus primeras mecánicas. La idea es ir añadiendo contenido poco a poco hasta completar la aventura.

---
