package com.javaclinic.hsqldbrunner.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.javaclinic.hsqldbrunner.settings.MyDatabase;

public class StopHsqldbServer {

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("Trying to shutdown HSLQDB server...");
        Class.forName(MyDatabase.DATABASE_DRIVER);

        Connection c = null;
        PreparedStatement ps = null;
        boolean success = false;
        try {
            c = DriverManager.getConnection(
                    MyDatabase.DATABASE_URL,
                    MyDatabase.DATABASE_USERNAME,
                    MyDatabase.DATABASE_PASSWORD);
            ps = c.prepareStatement("SHUTDOWN");
            ps.execute();
            success = true;
            System.out.println("Shuting down server.");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } finally {
            // no need to close ps and c if shutdown successful
            if ( ps != null && !success ) try { ps.close(); } catch (SQLException sqle) { sqle.printStackTrace(); }
            if ( c != null && !success ) try { c.close(); } catch (SQLException sqle) { sqle.printStackTrace(); }
        }
        System.out.println("Done.");

    }

}
