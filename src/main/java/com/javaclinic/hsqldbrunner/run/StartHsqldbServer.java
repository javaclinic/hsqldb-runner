package com.javaclinic.hsqldbrunner.run;

import org.hsqldb.Server;

import com.javaclinic.hsqldbrunner.settings.Configuration;

/**
 * Starts a HyperSQL database instance.
 * 
 * @author neven
 *
 */
public class StartHsqldbServer {

    public static void main(String[] args) {

        System.out.println("Starting HSQLDB server...");
        System.out.println("\n\n");

        Server server = new Server();
        server.setPort(Integer.parseInt(Configuration.getProperty("database.port")));
        server.setDatabaseName(0, Configuration.getProperty("database.name"));
        server.setDatabasePath(0, Configuration.getProperty("database.datafile"));
        server.setNoSystemExit(true);
        server.start();

        System.out.println("\n\n");
        System.out.println("  jdbc_url: " + Configuration.getProperty("database.url"));
        System.out.println("  username: " + Configuration.getProperty("database.username"));
        System.out.println("  password: " + Configuration.getProperty("database.password"));
        System.out.println("  driver:   " + Configuration.getProperty("database.driver"));
        System.out.println("\n\n");

    }

}
