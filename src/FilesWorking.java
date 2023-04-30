import java.io.Serializable;

public interface FilesWorking {
    boolean save(Serializable serializable, String filePath);
    GenThree read(String filePath);
}
