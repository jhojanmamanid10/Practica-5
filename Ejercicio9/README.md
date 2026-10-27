Ejercicio 9: Pruebas y análisis del validador

Objetivo

Comprobar el funcionamiento de un validador de texto mediante diferentes casos de prueba y analizar sus resultados.

Archivos

* Main.java: ejecuta las pruebas.
* Validator.java: contiene los métodos de validación.

Prompt utilizado

Analiza este programa Java de validación. Identifica posibles errores lógicos, propone casos de prueba y explica cómo comprobar los resultados. Utiliza ejemplos ficticios relacionados con Jhojan y Minecraft.

Reglas de validación

1. El texto debe tener al menos ocho caracteres.
2. No debe contener espacios.
3. Debe incluir al menos una letra.
4. Debe incluir al menos un número.
5. Los valores null deben rechazarse.

Casos de prueba

N.º	Entrada	Resultado esperado
1	Jhojan2026	true
2	Minecraft123	true
3	Jhojan	false
4	12345678	false
5	Jhojan Mine	false
6	Mine2026	true

Revisión crítica

El programa verifica la longitud del texto, la presencia de letras y números, y la ausencia de espacios. Las pruebas permiten comprobar que las condiciones se cumplen según lo esperado.

Mejoras posibles

* Añadir más casos de prueba.
* Comprobar valores vacíos y null.
* Separar la lógica de validación de la ejecución del programa.
* Evitar utilizar ejemplos de prueba como contraseñas reales.

Conclusión

El ejercicio permite practicar clases, métodos, arreglos, ciclos y condicionales en Java. La separación entre Main y Validator facilita la organización y el mantenimiento del código.