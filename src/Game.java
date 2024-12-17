import com.sun.nio.sctp.SendFailedNotification;

import javax.print.attribute.standard.RequestingUserName;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
    public Equipe playerTeam;
    public Equipe enemyTeam;


    public void play(){
        playerTeam = new Equipe();
        playerTeam.Name = "Gentil";
        playerTeam.add_combatant(new Combatant("Combatant équipe gantil"));

        enemyTeam = new Equipe();
        enemyTeam.Name = "Méchant";
        enemyTeam.add_combatant(new Combatant("Combatant équipe méchant"));

        while (getWinnerTeam() == null) {
            playerTeam.combatantList.get(0).attaque(enemyTeam.combatantList.get(0));
            System.out.println("Il reste " + playerTeam.combatantList.get(0).hp + " hp au "+ playerTeam.combatantList.get(0).Name);
            enemyTeam.combatantList.get(0).attaque(playerTeam.combatantList.get(0));
            System.out.println("Il reste " + enemyTeam.combatantList.get(0).hp + " hp au "+ enemyTeam.combatantList.get(0).Name);
        }
        Equipe winner_team = getWinnerTeam();
        System.out.println(winner_team.Name + " a gagné");
    }

    public Equipe getWinnerTeam(){
        if (playerTeam.isLoose()){
            return enemyTeam;
        }
        if (enemyTeam.isLoose()){
            return playerTeam;
        }
        return null;
    }
}
