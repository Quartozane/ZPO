public class main {
    public static void main(String[] args) {
        Person person = new Person(new Archer());
        person.attack();
        person.setWeapon(new Gunman());
        person.attack();
    }
}
