# 🎮 DARK ESSENCE

**DARK ESSENCE** es un juego de aventura conversacional desarrollado en Java. El jugador despierta en un mundo aparentemente abandonado y tendrá que explorar diferentes lugares, conocer a otros personajes y superar una serie de minijuegos para intentar descubrir qué está pasando y encontrar la forma de volver a casa.

El juego funciona mediante una consola, donde el jugador tendrá que leer los diálogos y elegir sus acciones escribiendo números.

---

## 📖 Historia

La aventura comienza cuando el protagonista despierta en un valle a las afueras de su ciudad. Todo parece tranquilo, pero hay algo extraño: no hay personas por ningún lado.

A partir de ese momento, el jugador tendrá que investigar lo sucedido y seguir las indicaciones que aparecen durante la aventura.

Por el camino podrá encontrarse con otros personajes, como Yanina y Rem, y decidir si quiere ayudarlos o continuar solo.

La historia va avanzando según las decisiones que tome el jugador.

---

## 🕹️ ¿Qué contiene el juego?

### Exploración

Al principio de la aventura se pueden explorar diferentes lugares:

- **Ciudad abandonada:** permite encontrar objetos médicos en una farmacia.
- **Río:** es una zona donde se pueden conseguir recursos.
- **Bosque:** permite recoger materiales para fabricar una caña de pescar.

### Inventario y objetos

El juego cuenta con un inventario donde se guardan los objetos que se van encontrando.

Algunos de los objetos disponibles son:

- Analgésicos, vendas y pastillas.
- Ramas, piedras e hilos.
- Caña de pescar.
- Pescado y pescado cocinado.
- Llave oxidada.
- Botiquines y pociones.

Algunos objetos se pueden utilizar para recuperar puntos de vida o para conseguir otros recursos.

### Sistema de vida (DV)

El jugador empieza con **100 Dias de Vida**.

Durante la aventura puede perder vida al fallar determinados minijuegos y recuperarla utilizando objetos o descansando.

Si la vida llega a cero, el jugador no podrá continuar.

### Personajes y decisiones

Durante la historia aparecen diferentes personajes con los que se puede interactuar.

Algunas decisiones importantes son:

- Aceptar o rechazar formar equipo con Yanina.
- Decidir si ayudar a Rem.
- Elegir cuándo descansar y cuándo continuar.
- Administrar los objetos del inventario.

Estas decisiones permiten que la aventura tenga diferentes situaciones dependiendo de lo que elija el jugador.

---

## 🎯 Minijuegos

Durante la aventura hay cuatro pruebas principales que el jugador debe superar:

1. **Tres en raya:** el jugador se enfrenta a un robot en dos partidas. Perder una partida supone perder 50 puntos de vida.
2. **Trivial:** hay que responder correctamente a seis preguntas. Para ganar se necesitan al menos cinco respuestas correctas.
3. **Ahorcado:** hay que descubrir una palabra secreta antes de quedarse sin intentos. Esta prueba está relacionada con el secuestro de Yanina.
4. **Piedra, papel o tijera:** es el enfrentamiento final contra Kyle. Hay que ganar para completar la aventura.

---

## 💻 Tecnologías utilizadas

- **Java:** lenguaje utilizado para desarrollar el juego.
- **IntelliJ IDEA:** entorno de desarrollo utilizado para programar.
- **Scanner:** para recoger las decisiones y respuestas del jugador.
- **Random:** para generar elecciones aleatorias en algunos minijuegos.
- **Arrays:** utilizados para almacenar los objetos del inventario y organizar los tableros.

---

## 📥 Cómo descargar y ejecutar el juego

Para jugar a DARK ESSENCE no es necesario instalar ningún programa especial aparte de Java.

### 1. Descargar el proyecto

1. Entra en este repositorio de GitHub.
2. Pulsa el botón verde **Code**.
3. Selecciona **Download ZIP**.
4. Descomprime el archivo descargado en tu ordenador.

También puedes clonar el repositorio utilizando Git:

```bash
git clone https://github.com/RonnieRamirez27/Trimestre1Programacion
```

### 2. Abrir el proyecto en IntelliJ IDEA

1. Abre IntelliJ IDEA.
2. Selecciona **Open**.
3. Busca la carpeta del proyecto que acabas de descargar.
4. Ábrela con IntelliJ.
5. Comprueba que tienes configurado un JDK (se recomienda Java 17 o superior).

### 3. Iniciar el juego

1. Abre la carpeta `src`.
2. Entra en el paquete `menuInicio`.
3. Abre el archivo `main.java`.
4. Busca el método `main`.
5. Pulsa el botón verde de ejecutar que aparece junto al método.

El juego se iniciará en la consola de IntelliJ y ya podrás comenzar tu aventura.

---

## 🎮 Controles

El juego se controla escribiendo las opciones que aparecen en pantalla.

- Introduce el número correspondiente a la acción que quieras realizar.
- Pulsa ENTER para confirmar.
- Lee los diálogos y las instrucciones antes de elegir.
- Administra tus objetos y puntos de vida para poder avanzar.

---

## 🚧 Estado del proyecto

DARK ESSENCE es un proyecto en desarrollo. Actualmente cuenta con una historia inicial, exploración, inventario, sistema de vida, decisiones entre personajes y cuatro minijuegos principales.

Todavía se pueden añadir nuevas zonas, personajes, eventos y mejoras para ampliar la aventura.

---

**¡Gracias por jugar a DARK ESSENCE!**
