import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    Integer power;
    String name;

    Player(){
        this.name = Util.sortName();
        this.power = Util.sortInteger();
    }
}
