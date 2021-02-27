package domain;

public class Reposts {
    private int count; /*number of users who reposted the note*/
    private boolean userReposted; /*true, if the current user reposted the note*/

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }
}
