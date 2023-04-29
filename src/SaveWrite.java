import java.io.*;

public class SaveWrite implements FilesWorking{
    @Override
    public boolean save(Serializable serializable) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("file.txt"));
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public GenThree write() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("file.txt"));
            return (GenThree) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
