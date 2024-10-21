# 💱 Conversor de Monedas

Este conversor de monedas permite realizar conversiones actualizadas en tiempo real
entre diferentes divisas. Utiliza la API de Open Exchange Rates, en su plan gratuito,
que proporciona actualizaciones cada hora.
Posee un menú que está diseñado para ser intuitivo y fácil de usar.

##  🔩 Funcionalidades
 
1. **Conversión de Monedas en Tiempo Real**: 
   - El conversor obtiene tasas de cambio actualizadas en tiempo real a través de la API de **Open Exchange Rates**,
     lo que garantiza que las conversiones sean precisas y reflejen los valores actuales del mercado.
     El plan gratuito de la API permite hasta 1000 solicitudes mensuales y se actualiza cada hora, con el dólar
     estadounidense (USD) como moneda base.

2. **Menú Interactivo e Intuitivo**: 
   - La aplicación presenta un menú claro y fácil de navegar, que permite al usuario seleccionar entre diferentes pares de divisas para realizar conversiones. Entre 
 las opciones de conversión, se incluyen:
     - Dólar estadounidense (USD) a Peso argentino (ARS) y viceversa.
     - Dólar estadounidense (USD) a Real brasileño (BRL) y viceversa.
     - Dólar estadounidense (USD) a Peso colombiano (COP) y viceversa.
     - Dólar estadounidense (USD) a Sol peruano (PEN) y viceversa.
   - El menú también ofrece la posibilidad de visualizar el historial de conversiones y salir del programa cuando se desee.

3. **Validación de Entrada**:
   - El conversor cuenta con un sistema de validación de entrada que se asegura de que el usuario ingrese
   únicamente valores numéricos válidos. De este modo, el sistema evita entradas incorrectas, como espacios en blanco,
   vacios o el uso de caracteres no numéricos cómo letras.

## 🔧 Tecnologías Utilizadas

- **Lenguaje de programación**: Java ☕
- **Entorno de desarrollo**: IntelliJ IDEA 🖥️
- **Gson (de Google)**: Librería utilizada para convertir los datos JSON obtenidos de la API en objetos Java y viceversa.
- **Api Open Exchange Rates:** Para optener los tipos de cambios actualizados

- ## 🚀 Instalación

### 📋 Pre-requisitos 
1. Instala en tu ordenador: Java JDK 17 o superior.

* Puedes descargarlo desde aqui:

  ```
  https://www.oracle.com/ar/java/technologies/downloads/#java17
  
  ```
  
2. Tener acceso a Internet para realizar las solicitudes a la API **Open Exchange Rates**.
3. Abre tu IDE o editor de codigo favorito.
   * Aunque el proyecto fue desarrollado en **IntelliJ IDEA**, puedes utilizar cualquier IDE o entorno de desarrollo de tu preferencia (como Eclipse, NetBeans, Visual Studio Code, etc.).
   * Si prefieres IntelliJ IDEA, puedes descargarlo aquí.
   
    ```
    https://www.jetbrains.com/es-es/idea/
    
    ```

4. **Librería Gson**: Necesitas agregar la librería Gson para el manejo de JSON.
* Puedes descargarla desde aqui:

  ```
  https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0
  
  ```
