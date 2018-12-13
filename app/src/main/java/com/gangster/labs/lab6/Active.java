package com.gangster.labs.lab6;

public class Active {
    public static final String TABLE_NAME = "actives";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_ACTIVE = "active";
    public static final String COLUMN_TIMESTAMP = "timestamp";

    private int id;
    private String active;
    private String timestamp;

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_ACTIVE + " TEXT,"
                    + COLUMN_TIMESTAMP + " DATETIME DEFAULT CURRENT_TIMESTAMP"
                    + ")";

    public Active() {}

    public Active(int id, String active, String timestamp) {
        this.id = id;
        this.active = active;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}