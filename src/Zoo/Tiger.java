package Zoo;

/**
 * @author Inna Ignatovich
 * @Date 02.04.2026
 */
public class Tiger extends AbstractAnimal {

    public Tiger() {
        super("Тигр");
    }

    @Override
    public void voice() {
        System.out.println(name + ":«Ррррр...»");
    }

    @Override
    protected boolean canEatFood(String food) {
        return "Meat".equals(food);
    }

    @Override
    protected void eatFood() {
        System.out.println(name + " плотоядный");
    }
}