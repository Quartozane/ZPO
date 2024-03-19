public class main {
    public static void main(String[] args) {
        Archer archer = new Archer(new Miecz());
        archer.setWeapon(new Pistolet());
        archer.attack();
    }
}
