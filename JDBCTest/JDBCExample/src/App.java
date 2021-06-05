import java.sql.*;
import java.util.concurrent.TimeUnit;

public class App {
    static Connection con;
    static String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String USER = "root";
    static final String PASS = "root";
    static Savepoint savePoint;
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            //Statement stmt = con.createStatement();
            // ResultSet rs = stmt.executeQuery("select * from city where district = \"Kerala\"");
            // while(rs.next()){
            //     System.out.println(rs.getString(2));
            // }
            // con.close();
        } catch(Exception e){
            System.out.println("Error ayi Main.");
        }

        dBDrop();
        TimeUnit.SECONDS.sleep(1);
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        dBCreate();
        DB_URL = DB_URL + "TESTJAVA";
        con.close();
        con = DriverManager.getConnection(DB_URL, USER, PASS);

        TimeUnit.SECONDS.sleep(1);
        tableCreate();

        TimeUnit.SECONDS.sleep(1);
        tableAlter();

        TimeUnit.SECONDS.sleep(1);
        tableInsert("testtable");

        TimeUnit.SECONDS.sleep(1);
        tableTruncate();

        TimeUnit.SECONDS.sleep(1);
        tableRename();

        TimeUnit.SECONDS.sleep(1);
        tableInsert("ATABLE");

        TimeUnit.SECONDS.sleep(1);
        tableUpdate();

        TimeUnit.SECONDS.sleep(1);
        tableDelete();

        TimeUnit.SECONDS.sleep(1);
        tableSetSavePoint();

        TimeUnit.SECONDS.sleep(1);
        tableExtraInsert("Atable");

        TimeUnit.SECONDS.sleep(1);
        tableRollBack();

        // TimeUnit.SECONDS.sleep(1);
        // dBCommit();
        //Since autocommit is set to true, we are not committing manually.


        
    }

    static void dBCreate(){
        try {
            Statement s = con.createStatement();
            String sql = "CREATE DATABASE TESTJAVA";
            s.executeUpdate(sql);
            System.out.println("Database TESTJAVA has beem created...");
        } catch (Exception e) {
            System.out.println(e.toString());
        }  
    } 

    static void dBDrop(){
        try {
            Statement s = con.createStatement();
            String sql = "DROP DATABASE Testjava";
            s.executeUpdate(sql);
            System.out.println("Database TESTJAVA has been dropped...");
            con.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }  
    }

    static void tableCreate(){
        try {
            Statement s = con.createStatement();
            String sql = "CREATE TABLE TESTTABLE(ID INT(10) PRIMARY KEY, NAME VARCHAR(20))";
            s.executeUpdate(sql);
            System.out.println("Table Testtable has been created in TESTJAVA Database...");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void tableAlter(){
        try {
            Statement s = con.createStatement();
            String sql = "ALTER TABLE TESTTABLE ADD PHRASE VARCHAR(255)";
            s.executeUpdate(sql);
            System.out.println("Table testtable altered to add a new column - PHRASE...");
            } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void tableInsert(String tableName){
        try {
            Statement s = con.createStatement();
            String sql = "INSERT INTO "+ tableName +" values(1, 'Rahul', 'qwewet')";
            s.executeUpdate(sql);
            sql = "INSERT INTO "+ tableName +" values(2, 'Pinky', 'KKraods')";
            s.executeUpdate(sql);
            sql = "INSERT INTO "+ tableName +" values(3, 'Adona', 'Robust')";
            s.executeUpdate(sql);
            System.out.println("THree rows has been inserted into TestTable...");
            } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void tableTruncate(){
        try {
            Statement s = con.createStatement();
            String sql = "Truncate testtable";
            s.executeUpdate(sql);
            System.out.println("Table testtable has been truncated...");
            } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void tableRename(){
        try {
            Statement s = con.createStatement();
            String sql = "Alter table testtable Rename to ATABLE";
            s.executeUpdate(sql);
            System.out.println("Testtable has been renamed to ATable...");
            } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void tableUpdate(){
        try {
            Statement s = con.createStatement();
            String sql = "update atable set PHRASE = 'changed' where name = 'pinky'";
            s.executeUpdate(sql);
            System.out.println("Values updated in ATABLE..");
            } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void tableDelete(){
        try {
            Statement s = con.createStatement();
            String sql = "delete from atable where name = 'adona'";
            s.executeUpdate(sql);
            System.out.println("Values with names adona has been deleted from ATABLE..");
            } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void dBCommit(){
        try {
            con.commit();
            con.close();
            System.out.println("Data Committed and connection closed...");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void tableExtraInsert(String tableName){
        try {
            Statement s = con.createStatement();
            String sql = "INSERT INTO "+ tableName +" values(4, 'Rishan', 'qwewet')";
            s.executeUpdate(sql);
            sql = "INSERT INTO "+ tableName +" values(5, 'Jexin', 'KKraods')";
            s.executeUpdate(sql);
            sql = "INSERT INTO "+ tableName +" values(6, 'Albin', 'Robust')";
            s.executeUpdate(sql);
            System.out.println("Three rows of extra data has been inserted into TestTable...");
            } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void tableSetSavePoint(){
        try {
            savePoint = con.setSavepoint("testsavepointer");
            System.out.println("A Savepoint names TestSavePoint has been created before extra addition of data...");
            } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void tableRollBack(){
        try {
            con.rollback(savePoint);
            System.out.println("Rollback executed to a state before addition of extra data...");
            } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}











// try{
//     Class.forName("com.mysql.cj.jdbc.Driver");
//     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
//     Statement stmt = con.createStatement();
//     ResultSet rs = stmt.executeQuery("select * from city where district = \"Kerala\"");
//     while(rs.next()){
//         System.out.println(rs.getString(2));
//     }
//     con.close();
// } catch(Exception e){
//     System.out.println("Error ayi mone.");
// }