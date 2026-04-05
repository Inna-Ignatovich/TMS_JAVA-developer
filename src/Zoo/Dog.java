package Zoo;

/**
 * @author Inna Ignatovich
 * @Date 02.04.2026
 */
public class Dog extends AbstractAnimal {

    public Dog() {
        super("Пёс");
    }

    @Override
    public void voice() {
        System.out.println(name + ":«Гав!»");
    }

    @Override
    protected boolean canEatFood(String food) {
        return true;
    }

    @Override
    protected void eatFood() {
        System.out.println(name + " всеядный.");
    }
}