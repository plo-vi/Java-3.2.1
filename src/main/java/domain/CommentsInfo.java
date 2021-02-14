package domain;

public class CommentsInfo {
    private int count; /*number of comments*/
    private boolean canPost; /*trues, if the current user may left a comment*/

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }
}
