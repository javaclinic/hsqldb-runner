package com.javaclinic.hsqldbrunner.run;

import org.hsqldb.Server;

import com.javaclinic.hsqldbrunner.settings.MyDatabase;

public class StartHsqldbServer {

    public static void main(String[] args) {

        System.out.println("Starting HSQLDB server...");
        System.out.println("\n\n");

        Server server = new Server();
        server.setPort(MyDatabase.DATABASE_PORT);
        server.setDatabaseName(0, MyDatabase.DATABASE_ALIAS);
        server.setDatabasePath(0, MyDatabase.DATABASE_DATAFILE);
        server.setNoSystemExit(true);
        server.start();

        System.out.println("\n\n");
        System.out.println("  jdbc_url: " + MyDatabase.DATABASE_URL);
        System.out.println("  username: " + MyDatabase.DATABASE_USERNAME);
        System.out.println("  password: " + MyDatabase.DATABASE_PASSWORD);
        System.out.println("  driver:   " + MyDatabase.DATABASE_DRIVER);
        System.out.println("\n\n");

}

}
