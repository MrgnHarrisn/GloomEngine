package TextureManager;

import java.io.File;
import java.util.HashMap;

public class TextureManager {

    public HashMap<String, Texture> textures = new HashMap<>();

    public TextureManager(File folder) {
        for (File file : folder.listFiles()) {
            textures.put(file.getName(), new Texture(file));
        }
    }
    
}
