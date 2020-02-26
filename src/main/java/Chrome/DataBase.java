package Chrome;

import javax.persistence.Column;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {

    private static final String driverName = "oracle.jdbc.OracleDriver";
    private static final String URL = "jdbc:oracle:thin:@sbncp-oracle.bpm.lanit:1521:orcl";
    private static final String USERNAME = "SBPGS2_QA_STUB_ESB_FS";
    private static final String PASSWORD = "SBPGS2_QA_STUB_ESB_FS";
    private static Connection connection;
    

        public static Connection getDBConnection() {
            try {
                Class.forName(driverName);
                connection = DriverManager.getConnection(
                        URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
            return connection;
        }

    public static String requestToDB(String sqlRequest) throws SQLException {
        StringBuilder sb = new StringBuilder();
        try (Connection con = getDBConnection();
             Statement statement = con.createStatement();
             ResultSet rs = statement.executeQuery(sqlRequest)) {
            while (rs.next()) {
                sb.append(rs.getString(1));
            }
            System.out.println(sb);
            return sb.toString();
        }

}}














