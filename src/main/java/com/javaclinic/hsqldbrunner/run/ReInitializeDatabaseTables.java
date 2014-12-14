package com.javaclinic.hsqldbrunner.run;

import org.hsqldb.cmdline.SqlTool;
import org.hsqldb.cmdline.SqlTool.SqlToolException;

import com.javaclinic.hsqldbrunner.settings.Configuration;

/**
 * Re-initializes the HyperSQL database instance. Drops and re-creates all tables as
 * defined in src/main/resources/database/schema.sql file.
 * 
 * @author neven
 *
 */
public class ReInitializeDatabaseTables {

    public static void main(String[] args) throws SqlToolException {

        System.out.println("Run SQL script file: " + Configuration.getProperty("database.schema"));

        SqlTool.objectMain(
            new String[] {
                "--inlineRc=url=" + Configuration.getProperty("database.url") + ",user=" + Configuration.getProperty("database.username"),
                "--driver=" + Configuration.getProperty("database.driver"),
                "--noAutofile",
                "--autoCommit",
                Configuration.getProperty("database.schema")
            }
        );
        System.out.println("Done.");

    }

}
