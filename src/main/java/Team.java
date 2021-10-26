import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Team {
    List<Player> players = new ArrayList<Player>();

    Team(){
        for (int i = 0; i<11;i++){
            players.add(new Player());
        }
    }

    public void status(){
        for (Player p :players) {
            System.out.println(p.getName() + " : " + p.getPower());
        }
    }
}
