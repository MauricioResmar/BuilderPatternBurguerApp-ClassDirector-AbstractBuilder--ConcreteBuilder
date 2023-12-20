/* CONSTRUCTOR ABSTRACTO SUPER-CLASE
 Generamos el constructor abstracto, el cual define los metodos a implementar como minimo,
 posteriormente por el constructor concreto a utilizar.
 */

public abstract class BurgerBuilder {
    Burger burger = new Burger();

    abstract void buildBun();
    abstract void buildMeat();
    abstract void buildSalad();
    abstract void buildCheese();
    abstract void buildSauce();

    Burger build(){
        return burger;
    };
}
