package common;

import java.sql.Connection;
import java.sql.DriverManager;

public class Common {
    final static String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    final static String ORACLE_ID = "HONEY";
    final static String ORACLE_PW = "1234";
    final static String ORACLE_DRV = "oracle.jdbc.driver.OracleDriver";

    public static Connection getConnection() {
        Connection conn = null;
        try{
            Class.forName(ORACLE_DRV);
            conn = DriverManager.getConnection(ORACLE_URL, ORACLE_ID, ORACLE_PW);
        }catch (Exception e) {
            System.out.println(e + "연결 실패");
        }
        return conn;
    }











}
