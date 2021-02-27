package domain;

public class Donut {
    private boolean isDonut; /*true, if the note is visible only for VK Donut users*/
    private int paidDuration; /*period of visibility for VK Donut users*/
    private boolean canPublishFreeCopy; /*true, if the note could be open for all the users*/

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }
}
