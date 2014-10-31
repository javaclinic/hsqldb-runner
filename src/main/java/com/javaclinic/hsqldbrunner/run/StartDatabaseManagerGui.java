package com.javaclinic.hsqldbrunner.run;

import org.hsqldb.util.DatabaseManager;

import com.javaclinic.hsqldbrunner.settings.MyDatabase;


public class StartDatabaseManagerGui {

    public static void main(String[] args) {

        System.out.println("Starting HSQLDB GUI Database Manager...");
        DatabaseManager.main(
            new String[] {
                "--driver", MyDatabase.DATABASE_DRIVER,
                "--url", MyDatabase.DATABASE_URL,
                "--user", MyDatabase.DATABASE_USERNAME,
                "--password", MyDatabase.DATABASE_PASSWORD,
                "--noexit"
            }
        );

    }

}
