public class TestMySQLConnector {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ MySQL Connector is AVAILABLE");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ MySQL Connector NOT FOUND");
        }
    }
}
