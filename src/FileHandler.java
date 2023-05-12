import model.humans.tree.GenThree;

import java.io.*;

public class FileHandler implements FilesWorking{
    @Override
    public boolean save(Serializable serializable, String filePath) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
            objectOutputStream.writeObject(serializable);
//            objectOutputStream.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public GenThree read(String filePath) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
            return (GenThree) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
