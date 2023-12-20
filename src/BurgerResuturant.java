/* CLASS DIRECTOR*/
public class BurgerResuturant {
    private BurgerBuilder burgerBuilder; // Crea una Variable privada del tipo constructor abstracto

    /*
    Metodo setter, mediante el cual se recibe como parámetro desde el Main, el constructor() concreto a ser usado.
    */
    public void setBuilder(BurgerBuilder burgerBuilder) {
        this.burgerBuilder = burgerBuilder;
    }

    /*
    Genera un metodo llamado buildBurger del tipo de la Clase Burger, la cual encapsula la forma Burger
    y en el cual vamos ahora a invocar los metodos build definidos en la clase abstracta BurgerBuilder y retornamos el objeto
     */
    public Burger buildBurger(){
        burgerBuilder.buildBun();
        burgerBuilder.buildMeat();
        burgerBuilder.buildSalad();
        burgerBuilder.buildCheese();
        burgerBuilder.buildSauce();

        return burgerBuilder.build();
    }
}
