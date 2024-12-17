import java.util.Random;

public class Combatant {
    public String Name;
    public int hp=100;
    public int power;

    public Combatant(String name){
        Name = name;
    }

    public void loose_hp(int hp_loose){
        hp -= hp_loose;
    }

    public void attaque(Combatant ennemie){
        Random random = new Random();
        int randomInt = random.nextInt(10) + 1;

        ennemie.loose_hp(randomInt);
        System.out.println("");
        System.out.println(Name + " enlève " + randomInt + " hp au " + ennemie.Name);

    }
}
