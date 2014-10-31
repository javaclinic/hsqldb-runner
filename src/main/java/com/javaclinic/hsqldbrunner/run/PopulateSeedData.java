package com.javaclinic.hsqldbrunner.run;

import org.hsqldb.cmdline.SqlTool;
import org.hsqldb.cmdline.SqlTool.SqlToolException;

import com.javaclinic.hsqldbrunner.settings.MyDatabase;

/**
 * Populates the HyperSQL database instance, as defined in
 * src/main/resources/database/seed.sql file.
 * 
 * @author neven
 *
 */
public class PopulateSeedData {

    public static void main(String[] args) throws SqlToolException {

        System.out.println("Run SQL script file: " + MyDatabase.DATABASE_SEED);

        SqlTool.objectMain(
            new String[] {
                "--inlineRc=url=" + MyDatabase.DATABASE_URL + ",user=" + MyDatabase.DATABASE_USERNAME,
                "--driver=" + MyDatabase.DATABASE_DRIVER,
                "--noAutofile",
                "--autoCommit",
                MyDatabase.DATABASE_SEED
            }
        );
        System.out.println("Done.");

    }

}
