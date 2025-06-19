
# Tasca-S1-02-Exceptions
Java · Excepciones con OOP

Autor: Carlos de Cózar

Temática: Programación Orientada a Objetos · Excepciones en Java

Entorno: IntelliJ IDEA + JDK 21

✦ Contenido del repositorio
Este proyecto incluye dos ejercicios cuidadosamente diseñados para dominar el arte de capturar errores y validar entradas en Java. La teoría está bien, pero aquí aprenderás haciéndolo — generando, atrapando y entendiendo excepciones como todo un artesano del código.

🔍 En Java, las excepciones permiten reaccionar ante errores sin que el programa se venga abajo. Se dividen en:
- Checked → Obligatorio manejarlas (e.g. IOException)
- Unchecked → Surgen en tiempo de ejecución (e.g. NullPointerException)
¿Lo interesante? Tú también puedes crear tus propias excepciones a medida.

☰ Nivel 1 · Sistema de ventas
Un ejercicio práctico con una historia sencilla:
Sin productos no hay venta. Sin excepciones… tampoco.
Clases:
- Producte: nombre y precio
- Venda: contiene productos y calcula el total
Cuando la colección está vacía, se lanza una excepción personalizada:
VendaBuidaException → “Per fer una venda primer has d’afegir productes”
Además, se practica la captura de IndexOutOfBoundsException para afinar el control de errores.

⌨ Nivel 2 · Validación de entradas
Entra la clase Entrada, tu compañera de batalla cuando el teclado quiere sabotear tus programas.
Métodos numéricos (manejan InputMismatchException):
- llegirByte(String)
- llegirInt(String)
- llegirFloat(String)
- llegirDouble(String)
Métodos textuales (lanzan InvalidInputException):
- llegirChar(String)
- llegirString(String)
- llegirSiNo(String) — “s” → true, “n” → false
Todos los métodos repreguntan automáticamente hasta que el dato sea correcto. Si hay errores de formato, lo comunican con claridad sin interrumpir el flujo.

☑ Requisitos & Ejecución
- Clona este repositorio
git clone https://github.com//java-exercises.git
- Ábrelo con IntelliJ
- Selecciona el JDK 21
- Ejecuta las clases Main de cada nivel
- Testea escenarios con errores, listas vacías y entradas mal formateadas

🛠 Contribuir
¿Quieres llevar este proyecto un paso más allá?
- Haz un fork 🪄
- Mejora el código 📦
- Envía tu PR 📬
- Déjale una estrella ⭐ si te resultó útil

