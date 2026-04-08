package Zoo;

/**
 * @author Inna Ignatovich
 * @Date 02.04.2026
 */
public interface Animal {

    /**
     * Подать голос.
     */
    void voice();

    /**
     * Есть еду.
     *
     * @param food (еда).
     */
    void eat(String food);

    /**
     * Получить имя животного.
     *
     * @return Имя животного.
     */
    String getName();
}