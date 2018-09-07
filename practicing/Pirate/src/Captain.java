public class Captain extends Pirate {
    private int drankRum;
    private int HP;

    public Captain() {
        this.drankRum = 1;
        this.HP = 10;
    }

    @Override
    public int getDrankRum() {
        return drankRum;
    }

    @Override
    public int getHP() {
        return HP;
    }
}
