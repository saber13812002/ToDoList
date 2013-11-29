package org.mobtakeran.to_do_list;

/**
 * Created with IntelliJ IDEA.
 * User: system1
 * Date: 10/9/13
 * Time: 5:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class TimeRecord {

    private String time;
    private String note;
    private boolean deleted;

    public TimeRecord(String time, String note,boolean deleted) {
        this.time = time;
        this.note = note;
        this.deleted = deleted;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
