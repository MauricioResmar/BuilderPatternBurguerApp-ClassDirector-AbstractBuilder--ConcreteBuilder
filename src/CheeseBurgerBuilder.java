/* CONSTRUCTOR CONCRETO 1 - SUBCLASE
Creamos el respectivo constructor concreto CheeseBurgerBuilder, el cual hereda directamente los
métodos, del constructor abstracto BurgerBuilder, por lo cual, debe implementarlos de manera concreta,
haciendo uso de los respectivos metodos setter creados en la Clase Pojo: Burger.
*/
public class CheeseBurgerBuilder extends BurgerBuilder {

    @Override
    public void buildBun(/*String Bun - getparam*/) {burger.setBun("White bread"/*getparam*/);}

    @Override
    public void buildMeat() {burger.setMeat("Beef");}

    @Override
    public void buildSalad() {burger.setSalad("Iceberg");}

    @Override
    public void buildCheese() {burger.setCheese("American Cheese");}

    @Override
    public void buildSauce() {burger.setSauce("Secret Sauce");}
}

