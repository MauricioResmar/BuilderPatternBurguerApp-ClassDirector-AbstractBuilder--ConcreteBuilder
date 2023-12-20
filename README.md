PATRÓN DE DISEÑO BUILDER 

TIPO CREACIONAL

Modularización por creador - Analogía: chef de menúes.


Descripción del Patrón Builder:


El patrón de diseño Builder es una solución creacional que se utiliza para construir objetos complejos
paso a paso. Proporciona una forma de construir un objeto con una estructura compleja sin exponer los 
detalles internos de su construcción. En lugar de tener un constructor con numerosos parámetros, el 
patrón Builder utiliza una interfaz abstracta (Builder) con métodos para configurar cada parte del 
objeto y una clase concreta (Concrete Builder) para implementar esos métodos y construir el objeto.


Características Principales:

Construcción Paso a Paso: Permite la construcción de un objeto complejo paso a paso, delegando la 
responsabilidad de cada paso a un conjunto de métodos en el Builder.

Interfaz Abstracta (Builder): Define los métodos necesarios para construir cada parte del objeto. 
Puede incluir métodos como construirParteA, construirParteB, y un método final build para obtener 
el objeto completo.

Builder Concreto: Implementa la interfaz Builder y proporciona la lógica específica para construir 
el objeto. Puede haber múltiples Builder concretos que construyen objetos con variaciones específicas.

Director: Coordina el proceso de construcción utilizando un objeto Builder. Se encarga de llamar a los
métodos del Builder en el orden correcto para obtener el objeto final.

Ejemplo del Repositorio:

En el ejemplo del repositorio proporcionado en Java, se construye una entidad llamada Burger en un 
sistema de pedidos de comida rápida. Un Director coordina la construcción, eligiendo una clase Builder
concreta dependiendo del tipo de burger deseado. La clase Builder concreta implementa la interfaz 
Builder, definiendo cómo construir cada parte de la burger, y finalmente, el método build se utiliza
para obtener la burger completa.

Este enfoque modular y paso a paso del patrón Builder facilita la creación de objetos complejos, mejora
la legibilidad del código y permite la creación de diferentes variaciones del objeto final de manera flexible.

DIAGRAMA DE CLASES UML PATRÓN BUILDER EN ÉSTE PROYECTO:


    +-------------------+          +------------------+
    | BurgerResuturant  |          |      Burger      |
    +-------------------+          +------------------+
    | - burgerBuilder   |          | - bun: String    |
    +-------------------+          | - meat: String   |
    | + setBuilder()    |          | - salad: String  |
    | + buildBurger()   |          | - cheese: String |
    +-------------------+          | - sauce: String  |
    |                              +------------------+
    |                                       |
    |                                       |
    |                                       |
    |                                       |
    |                                       |
    v                                       |
    +-------------------+                   |
    |   BurgerBuilder   |<------------------+
    +-------------------+
    | ~ Burger          |                         +------------------+
    | {abstract}        |                         |       Main       |
    | + buildBun()      |                         +------------------+ 
    | + buildMeat()     |                         | {static}         |
    | + buildSalad()    |                         | + main(String[]) |
    | + buildCheese()   |                         | - buildBurger()  |
    | + buildSauce()    |                         +------------------+
    | + build()         |
    +-------------------+
    ^
    |
    |
    +---------------------+
    |  CheeseBurgerBuilder|
    +---------------------+
    | + buildBun()        |
    | + buildMeat()       |
    | + buildSalad()      |
    | + buildCheese()     |
    | + buildSauce()      |
    +---------------------+
