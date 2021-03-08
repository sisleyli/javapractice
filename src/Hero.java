public class Hero implements Mortal{
    private String name = "老八";

    private int hp = 100;

    public Hero(){

    }

    public Hero(String name) {
        this.name = name;
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void die() {
        System.out.println("A hero die");
    }
    public static void battleWin(){
        System.out.println("hero battle win");
    }
}
