import java.util.ArrayList;
import java.util.List;

public class Equipe {
    public String Name;
    List<Combatant> combatantList = new ArrayList<Combatant>();

    public void add_combatant(Combatant combatant){
        combatantList.add(combatant);
    }

    public boolean isLoose(){
        for (Combatant combatant : combatantList) {
            if (combatant.hp > 0){
                return false;
            }
        }
        return true;
    }
}
