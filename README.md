HSQLDB RUNNNER
================
Hsqldb Runner is a collection of standalone runnable scripts (Java executable classes) that start/stop/manage `HSQLDB` database.
We included two files for initial schema and initial data, e.g. `src/main/resources/database/schema.sql` and `src/main/resources/database/seed.sql`.

Features
--------
- Start HyperSQL Database instance
- Stop HyperSQL Database instance
- Start HyperSQL Database Manager (GUI)
- Re-initialize HyperSQL Database instance (with schema.sql)
- Re-populate HyperSQL Database instance (with seed.sql)


Initial Settings
----------------
Initial settings are hardcoded in the `com.javaclinic.hsqldbrunner.settings.MyDatabase` class:
- JDBC driver:      `org.hsqldb.jdbcDriver`
- JDBC url:         `jdbc:hsqldb:hsql://localhost:9002/mydb`
- JDBC datafile:    `file:database/data`
- JDBC username:    `sa`
- JDBC password:    `<empty>`
- JDBC db port:     `9002`
- JDBC db name:     `mydb`
- JDBC schema file: `src/main/resources/database/schema.sql`
- JDBC seed file:   `src/main/resources/database/seed.sql`

Usage
-----
- Start Hsqldb Database:               `mvn exec:java -Dexec.mainClass=com.javaclinic.hsqldbrunner.run.StartHsqldbServer`
- Stop Hsqldb Database:                `mvn exec:java -Dexec.mainClass=com.javaclinic.hsqldbrunner.run.StopHsqldbServer`
- Start Hsqldb Database Manager (GUI): `mvn exec:java -Dexec.mainClass=com.javaclinic.hsqldbrunner.run.StartDatabaseManagerGui`
- Re-initialize Hsqldb instance:       `mvn exec:java -Dexec.mainClass=com.javaclinic.hsqldbrunner.run.ReInitializeDatabaseTables`
- Re-seed Hsqldb instance:             `mvn exec:java -Dexec.mainClass=com.javaclinic.hsqldbrunner.run.PopulateSeedData`

Todo
----
- Add SQL prompt
- Add SQL file execution



