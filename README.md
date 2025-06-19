
Java OOP & Input Validation Project

Autor Carlos de Cózar


```text
 //=============================\\
||   Crafted with 💛 by Carlos   ||
||     and approved by 🦆       ||
 \\=============================//
```


# Product Sale & Input System

## Autor
Carlos de Cózar

## Tecnología utilizada
- Java 21  
- IntelliJ IDEA  
- Git  

## Descripción general
Este proyecto demuestra una aplicación orientada a objetos con foco en el principio de responsabilidad única, el diseño extensible y el manejo robusto de entradas del usuario. Se ha aplicado rigurosamente el conjunto de principios SOLID, permitiendo una arquitectura mantenible, testeable y clara.

---

## Estructura por niveles

### Nivel 1 - Product Sale System

| Elemento                         | Descripción                                                                                                                                           |
|----------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Objetivo**                     | Simulación de una venta con productos, aplicando orientación a objetos y manejo de excepciones personalizadas.                                        |
| **Flujo principal**              | - Venta vacía<br>- Comprobación y lanzamiento de `EmptySaleException` si no hay productos<br>- Agregado de productos<br>- Cálculo de total<br>- Manejo de `IndexOutOfBoundsException` |
| **Clases involucradas**          | `Program`, `Sale`, `Product`, `EmptySaleException`                                                                                                   |
| **Principios aplicados**         | Responsabilidad única, encapsulamiento del flujo de ejecución, diseño limpio y testeable.                                                            |
| **Buenas prácticas destacadas**  | Separación de lógica, validación y entrada. Entrada unificada vía fachada. Cumplimiento estricto de principios SOLID.                                |

---

### Nivel 2 - Input Validation System

| Elemento                         | Descripción                                                                                                                                           |
|----------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Objetivo**                     | Crear una clase `Input` que delegue la lectura de distintos tipos de datos a lectores específicos encargados de validar entradas y gestionar excepciones. |
| **Tipos de datos soportados**    | - Numéricos: `readByte`, `readInt`, `readFloat`, `readDouble`<br>- Textuales: `readChar`, `readString`, `readYesNo` (`"s"` = true, `"n"` = false)     |
| **Manejo de errores**            | - Repregunta automática ante errores de formato<br>- Mensajes de error descriptivos<br>- Manejo de excepciones personalizado                          |
| **Compatibilidad regional**      | Soporte para coma o punto como separador decimal                                                                                                      |
| **Diseño extensible**            | - Entrada centralizada vía `Input`, respetando SOLID<br>- Interfaz `InputReader` que permite extender la lógica sin modificar clases existentes      |
| **Extra destacado**              | - Separación clara entre lógica, entrada y validación<br>- Adaptabilidad internacional<br>- Código preparado para escalabilidad futura               |

---

## Ejecución del proyecto

1. Clona el repositorio:

   
2. Abre el proyecto en IntelliJ IDEA  
3. Asegúrate de tener configurado el SDK de Java 21  
4. Ejecuta la clase `Main`  
5. Prueba diferentes entradas, incluyendo casos erróneos

---

## Aprendizajes clave

- Aplicación práctica de los principios SOLID
- Arquitectura desacoplada, limpia y mantenible
- Gestión de excepciones centrada en el usuario
- Flexibilidad para adaptarse a distintas configuraciones regionales en sistemas orientados a consola

---

## Contribuciones

Las contribuciones están abiertas. Si deseas proponer mejoras o utilizar este enfoque en tus propios proyectos, siéntete libre de hacer un fork y personalizarlo según tus necesidades.


```text
 //=============================\\
||   Crafted with 💛 by Carlos   ||
||     and approved by 🦆       ||
 \\=============================//
```



---

**Repositorio oficial:**  
[github.com/carlosPc1987](https://github.com/carlosPc1987)
