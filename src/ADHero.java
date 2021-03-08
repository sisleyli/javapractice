public class ADHero extends Hero implements Mortal{
    private int adpower;
    public ADHero(){
        super();
        adpower=20;
    }

    @Override
    public void die() {
        System.out.println("ADHero "+getName()+" 嗝屁了");
    }
    public static void battleWin(){
        System.out.println("ADHero 奥里给干了兄弟们");
    }
    public class ADWeapon{
        int attack = 30;
        int life = 10;
        public void useWeapon(){
            if(life != 0 ){
                int nowpower = adpower + attack;
                System.out.println("ADHero: "+getName()+ "use the weapon power : "+nowpower);
                life--;
            }
            else {
                System.out.println("ADHero :"+getName()+"weapon has aborted");
            }
        }
    }
}
