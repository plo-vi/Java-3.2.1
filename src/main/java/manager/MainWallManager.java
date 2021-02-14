package manager;

public class MainWallManager {
    private BlockManager[] managers;

    public String generate() {
        for (BlockManager manager : managers) {
            String block = manager.generateBlock();
        }
        return null;
    }
}
