package com.javaclinic.hsqldbrunner.run;

import org.hsqldb.cmdline.SqlTool;
import org.hsqldb.cmdline.SqlTool.SqlToolException;

import com.javaclinic.hsqldbrunner.settings.Configuration;

/**
 * Populates the HyperSQL database instance, as defined in
 * src/main/resources/database/seed.sql file.
 * 
 * @author neven
 *
 */
public class PopulateSeedData {

    public static void main(String[] args) throws SqlToolException {

        System.out.println("Run SQL script file: " + Configuration.getProperty("database.seed"));

        SqlTool.objectMain(
            new String[] {
                "--inlineRc=url=" + Configuration.getProperty("database.url") + ",user=" + Configuration.getProperty("database.username"),
                "--driver=" + Configuration.getProperty("database.driver"),
                "--noAutofile",
                "--autoCommit",
                Configuration.getProperty("database.seed")
            }
        );
        System.out.println("Done.");

    }

}
