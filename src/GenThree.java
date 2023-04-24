import java.util.ArrayList;
import java.util.List;

public class GenThree {
    private int id;
    private List<Human> humanList;

    public GenThree() {
        this.humanList = new ArrayList<>();
    }

    public void addHuman (Human human){
        humanList.add(human);
    }

    public Human getHumanByName (String name){
        for (Human human: humanList ){
            if (human.getName().equals(name)){
                return human;
            }
        }
        return null;
    }

    public List<Human> getHumanList(){
        return humanList;
    }

    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Human human: humanList){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

