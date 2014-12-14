package com.javaclinic.hsqldbrunner.run;

import org.hsqldb.util.DatabaseManager;

import com.javaclinic.hsqldbrunner.settings.Configuration;

/**
 * Starts HyperSQL Database Manager (GUI) for the running instance.
 * 
 * @author neven
 *
 */
public class StartDatabaseManagerGui {

    public static void main(String[] args) {

        System.out.println("Starting HSQLDB GUI Database Manager...");
        DatabaseManager.main(
            new String[] {
                "--driver", Configuration.getProperty("database.driver"),
                "--url", Configuration.getProperty("database.url"),
                "--user", Configuration.getProperty("database.username"),
                "--password", Configuration.getProperty("database.password"),
                "--noexit"
            }
        );

    }

}
