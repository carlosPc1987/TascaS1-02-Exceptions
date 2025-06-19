
Java OOP & Input Validation Project

Autor Carlos de Cózar

Tecnología

Java 21
IntelliJ IDEA
Git
Descripción
Este proyecto muestra una aplicación orientada a objetos con un enfoque especial en el principio de responsabilidad única
y el manejo robusto de entradas del usuario. 
Se han aplicado los principios SOLID en el diseño del sistema de entrada, haciendo el código extensible, fácilmente testeable y alineado con buenas prácticas.
Estructura por Niveles

Nivel 1 - Product Sale System (No incluido en este proyecto, orientado a Nivel 2) 
Nivel 2 - Input Validation System Objetivo Crear una clase Input que delegue la lectura de diferentes tipos de datos
a lectores específicos que validan y gestionan excepciones apropiadamente. 

Requisitos cumplidos:

·Lectura de tipos numéricos:
·readByte(String message)
·readInt(String message)
·readFloat(String message)
·readDouble(String message)
·Lectura de tipos textuales:
·readChar(String message)
·readString(String message)
·readYesNo(String message) ("s" → true, "n" → false)
·Repregunta automática ante error de formato
·Manejo de excepciones personalizado
·Mensajes de error claros
·Compatible con entrada de coma y punto decimal para decimales
·Entrada centralizada vía fachada (Input) sin romper principios SOLID
·Diseño extensible mediante interfaz InputReader Extra destacado Este proyecto va más allá de los mínimos propuestos:
·Cumplimiento estricto de los principios SOLID
·Separación total de responsabilidades entre lógica de entrada, validación y ejecución
·Diseño extensible por tipo de dato, sin necesidad de modificar clases existentes
·Formato de entrada decimal adaptable a diferentes configuraciones regionales
·Encapsulamiento de ejecución: el Main solo invoca Program.executeProgram() para máxima limpieza

Ejecución

Clona el repositorio: git clone 🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀     https://github.com/carlosPc1987    🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀

Abre el proyecto en IntelliJ IDEA

Asegúrate de tener configurado Java SDK 21

Ejecuta la clase Main

Prueba diferentes entradas, incluyendo casos erróneos Aprendizajes clave

Principios SOLID aplicados a la entrada de datos

Diseño desacoplado y mantenible

Manejo de excepciones enfocado al usuario

Adaptabilidad de sistemas orientados a consola Contribuciones Bienvenidas. 
Si quieres proponer mejoras o usar este enfoque para tu propio proyecto, puedes hacer fork y personalizarlo.

🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀🚀


-🚀🚀🚀🚀🚀🚀🚀 CarlosPc1987🚀🚀🚀🚀🚀🚀🚀
