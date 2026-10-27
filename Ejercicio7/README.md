Ejercicio 7: Revisión de código con ayuda de IA

Objetivo

Revisar un programa Java mediante pruebas y comprobar si las operaciones de una cuenta digital funcionan correctamente.

Prompt utilizado

Revisa esta clase Java de una cuenta digital. Identifica posibles errores lógicos y propón cinco casos de prueba. Explica qué resultado debería producir cada caso y cómo puedo verificarlo ejecutando el programa.

Pruebas realizadas

Prueba	Entrada	Resultado
1	Depositar 200	Correcto
2	Retirar 100	Correcto
3	Depositar -50	Rechazado
4	Retirar 1000	Rechazado
5	Depositar 0	Rechazado

Revisión crítica

El programa valida los depósitos y retiros. Los depósitos negativos y los retiros superiores al saldo son rechazados. También se debe comprobar el comportamiento cuando el depósito es cero.

Decisiones de diseño

Los atributos se mantienen privados para proteger el saldo. Las operaciones se realizan mediante métodos que verifican las condiciones antes de modificarlo.

Conclusión

Las pruebas permiten comprobar el funcionamiento del programa y detectar errores antes de utilizarlo.