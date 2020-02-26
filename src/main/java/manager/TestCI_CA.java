package manager;

import Chrome.DataBase;

import java.sql.SQLException;

public class TestCI_CA {
    public static void main(String[] args) throws SQLException {
        DataBase db = new DataBase();
        db.getDBConnection();
        try {
            DataBase.requestToDB("SELECT OPERATION_NAME FROM REQUEST_LOG WHERE ENTRY_ID LIKE 163444");
            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
