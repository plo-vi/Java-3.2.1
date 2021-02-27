package domain;

public class LikesInfo {
    private int count; /*number of users who liked the note*/
    private boolean userLikes; /*true, if the current user likes the note*/
    private boolean canLike; /*true, if the current user may Like the note*/
    private boolean canRepost; /*true, if the current user may repost the note*/

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }
}
