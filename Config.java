import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private static ConfigManager instance;
    private Map<String, String> config = new HashMap<>();

    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

  
    public void setProperty(String key, String value) {
        config.put(key, value);
    }
    public String getProperty(String key) {
        return config.get(key);
    }
}
public class Config{
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance();

        config.setProperty("db.url", "jdbc:mysql://localhost:3306/mydb");
        config.setProperty("db.user", "root");

        System.out.println("DB URL: " + config.getProperty("db.url"));
        System.out.println("DB User: " + config.getProperty("db.user"));
    }
}
