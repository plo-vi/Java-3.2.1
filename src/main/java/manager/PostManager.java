package manager;

import domain.Wall;

public class PostManager {
    private Wall[] posts = new Wall[0];

    private Wall[] post;
    public Wall[] search(int ownerId, String  domain, String query, boolean ownerOnly, int count, int offset) {
        //TODO: add logic
        return null;
    }

    public void delete(int id, int ownerId) {
        int length = posts.length - 1;
        Wall[] tmp = new Wall[length];
        int index = 0;
        for (Wall item : posts) {
            if (item.isCanDelete(true)) {
                if (item.getId() != id) {
                    tmp[index] = item;
                    index++;
                } else {
                    break;
                }
            }
        }
        posts = tmp;
    }
}
