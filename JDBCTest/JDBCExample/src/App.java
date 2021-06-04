import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from city where district = \"Kerala\"");
            while(rs.next()){
                System.out.println(rs.getString(2));
            }
            con.close();
        } catch(Exception e){
            System.out.println("Error ayi mone.");
        }
    }
}
