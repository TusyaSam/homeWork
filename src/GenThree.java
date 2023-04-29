import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenThree implements Serializable{

    private List<Human> genThree;

    public GenThree() {
        this.genThree = new ArrayList<>();
    }

    public void addHuman (Human human){ /*добавление нового человека в список*/
        genThree.add(human);
    }

    public Human getHumanByName (String name){/*Поиск по имени*/
        for (Human human: genThree ){
            if (human.getName().equals(name)){
                return human;
            }
        }
        return null;
    }

    public List<Human> getHumanList(){
        return genThree;
    }

    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        for (Human human: genThree){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}

