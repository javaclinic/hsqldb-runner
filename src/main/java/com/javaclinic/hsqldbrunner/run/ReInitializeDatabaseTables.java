package com.javaclinic.hsqldbrunner.run;

import org.hsqldb.cmdline.SqlTool;
import org.hsqldb.cmdline.SqlTool.SqlToolException;

import com.javaclinic.hsqldbrunner.settings.MyDatabase;

public class ReInitializeDatabaseTables {

    public static void main(String[] args) throws SqlToolException {

        System.out.println("Run SQL script file: " + MyDatabase.DATABASE_SCHEMA);

        SqlTool.objectMain(
            new String[] {
                "--inlineRc=url=" + MyDatabase.DATABASE_URL + ",user=" + MyDatabase.DATABASE_USERNAME,
                "--driver=" + MyDatabase.DATABASE_DRIVER,
                "--noAutofile",
                "--autoCommit",
                MyDatabase.DATABASE_SCHEMA
            }
        );
        System.out.println("Done.");

    }

}
