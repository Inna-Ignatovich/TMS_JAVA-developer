package Zoo;

/**
 * @author Inna Ignatovich
 * @Date 02.04.2026
 */
public class Rabbit extends AbstractAnimal {

    public Rabbit() {
        super("Кролик");
    }

    @Override
    public void voice() {
        System.out.println(name + ":«Фрррр....»");
    }

    @Override
    protected boolean canEatFood(String food) {
        return "Grass".equals(food);
    }

    @Override
    protected void eatFood() {
        System.out.println(name + " вегетарианец");
    }
}