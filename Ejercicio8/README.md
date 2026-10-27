Ejercicio 8: Validador de claves con ayuda de IA

Objetivo

Desarrollar un programa en Java que valide textos mediante condiciones específicas y comprobar su funcionamiento con diferentes pruebas.

Archivos

* Main.java: contiene el método principal y los casos de prueba.
* Validator.java: contiene la lógica de validación.

Reglas de validación

1. El texto debe tener al menos ocho caracteres.
2. No debe contener espacios.
3. Debe contener al menos una letra.
4. Debe contener al menos un número.
5. Si el texto es null, debe rechazarse.

Prompt utilizado

Revisa el código Java de un validador de claves. Identifica errores lógicos, propone casos de prueba y explica los resultados esperados. Utiliza ejemplos ficticios relacionados con Jhojan y Minecraft.

Pruebas realizadas

N.º	Entrada	Resultado esperado
1	Jhojan2026	true
2	Minecraft123	true
3	Jhojan	false
4	12345678	false
5	Jhojan Mine	false
6	Mine2026	true

Revisión crítica de la IA

La propuesta permite comprobar diferentes condiciones, como la longitud mínima, la presencia de letras y números y la existencia de espacios. Sin embargo, las pruebas deben ejecutarse para verificar que los resultados coincidan con lo esperado.

Decisiones de diseño

Se separó la validación en la clase Validator para organizar mejor el código y facilitar su reutilización. La clase Main se encarga de ejecutar las pruebas y mostrar los resultados.

Conclusión

El ejercicio permite practicar clases, métodos, condicionales, ciclos y manejo de cadenas en Java. Este validador es didáctico y no debe utilizarse como un sistema real de autenticación.