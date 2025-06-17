💱 Conversor de Monedas - Currency Converter
📋 Descripción | Description
ES:
Aplicación de consola desarrollada en Java que permite convertir entre distintas monedas utilizando tasas de cambio en tiempo real proporcionadas por la API de ExchangeRate.

EN:
Console application developed in Java to convert between various currencies using real-time exchange rates provided by the ExchangeRate API.

🚀 Características | Features
Interfaz por consola fácil de usar
Selección de pares de monedas predefinidos
Consulta de tasas de cambio actualizadas desde una API externa
Manejo de errores y validación de entradas del usuario
EN: -Easy-to-use console interface -Selection of predefined currency pairs -Fetching of up-to-date exchange rates from an external API -Error handling and user input validation

🛠️ Tecnologías | Technologies
Java 17+
API pública: ExchangeRate API
Gson (para deserialización de JSON)
Java HttpClient (para realizar peticiones HTTP)
EN:

Java 17+
Public API: ExchangeRate API
Gson (for JSON deserialization)
Java HttpClient (for making HTTP requests)
▶️ Cómo usar | How to Run
Clona el repositorio:
git clone https://github.com/tu-usuario/conversor-monedas.git

Compila el proyecto (usando tu IDE o línea de comandos):
javac -d out src/**/*.java

Ejecuta el programa desde la clase Main:
java -cp out com.chriscoronel.conversordemonedas.principal.Main

EN:

Clone the repository: git clone https://github.com/your-username/conversor-monedas.git

Compile the project (using your IDE or the command line): javac -d out src/**/*.java

Run the program from the Main class: java -cp out com.chriscoronel.conversordemonedas.principal.Main

🎮 Ejemplo de uso | Usage Example
========================== | Conversor de Monedas | Peso Mexicano =>> Dólar Estadounidense

Libra Esterlina =>> Euro ... Elige una opción: 1 ¿Qué cantidad deseas cambiar?: 100 100 MXN equivale a 5.9 USD

⚠️ Notas | Notes
Es necesario contar con conexión a Internet para obtener las tasas de cambio.
Asegúrate de que tu clave de API esté activa y configurada correctamente en el código (ConversorMonedasService.java).
EN:

An internet connection is required to retrieve exchange rates.
Make sure your API key is active and correctly configured in the code (ConversorMonedasService.java).
📩 Contacto | Contact
Desarrollado por: / Developed by: Chris Coronel
GitHub:@CoronelChris https://github.com/CoronelChris
