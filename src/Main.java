public class Main {
    public static void main(String[] args) {

        //Creamos una nueva instancia de nuestra Clase DIRECTOR BurgerResuturant:

        BurgerResuturant burgerResuturant = new BurgerResuturant();

        /*
        Asignamos parámetro a nuestra instancia de la Clase DIRECTOR,
        una nueva instancia de la Clase CONSTRUCTORA CONCRETA (new CheeseBurgerBuilder()):
         */
        burgerResuturant.setBuilder(new CheeseBurgerBuilder());

        /*
        Invocamos el metodo buildBurger, el cual pone en marcha el CONSTRUCTOR CONCRETO para la creación del objeto:
         */
        buildBurger(burgerResuturant);
    }

        /*
        Generamos a continuación el respectivo metodo buildBurger el cual construira nuestro objeto.
        Para finalizar éste invoca al metodo print() definido anteriormente en la Clase POJO Burger,
        útil para realizar la impresión del objeto:
         */

    private static void buildBurger(BurgerResuturant burgerResuturant) {
        Burger burger = burgerResuturant.buildBurger();
        burger.print();
    }
}