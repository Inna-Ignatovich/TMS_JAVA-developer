package Zoo;

/**
 * @author Inna Ignatovich
 * @Date 05.04.2026
 */
public abstract class AbstractAnimal implements Animal {

    protected final String name;

    protected AbstractAnimal(String name) {
        this.name = name;
    }

    @Override
    public void eat(String food) {
        if (canEatFood(food)) {
            eatFood();
        } else {
            System.out.println(name + " голодает");
        }
    }

    protected abstract boolean canEatFood(String food);

    protected abstract void eatFood();

    @Override
    public String getName() {
        return name;
    }
}