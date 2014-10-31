package com.javaclinic.hsqldbrunner.settings;

public class MyDatabase {

    public static final String DATABASE_DRIVER =   "org.hsqldb.jdbcDriver";
    public static final String DATABASE_URL =      "jdbc:hsqldb:hsql://localhost:9002/mydb";
    public static final String DATABASE_DATAFILE = "file:database/data";
    public static final String DATABASE_USERNAME = "sa";
    public static final String DATABASE_PASSWORD = "";
    public static final int DATABASE_PORT =        9002;
    public static final String DATABASE_ALIAS =    "mydb";

    public static final String DATABASE_SCHEMA =   "src/main/resources/database/schema.sql";
    public static final String DATABASE_SEED =     "src/main/resources/database/seed.sql";

}
