public class Person {
    AttackStrategy attackStrategy;

    public Person(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
    public Person(){};
    public void setWeapon(AttackStrategy weapon) {
        this.attackStrategy = weapon;
    }

    public void attack() {
        attackStrategy.attack();
    }
}
