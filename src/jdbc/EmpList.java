package jdbc;

import java.sql.*;

public class EmpList {

    public static void main( String args[] ) 
                      throws SQLException, ClassNotFoundException {

        String url = "jdbc:oracle:thin:@192.168.0.200:1521:VCC";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;
        String query = null;

        // Driver 등록
        Class.forName( "oracle.jdbc.driver.OracleDriver" );
        //Class.forName( "org.gjt.mm.mysql.Driver" );

        // DB Connection
        conn = DriverManager.getConnection( url, "SE17###", "SE17###" );

        // Statement 생성
        stmt = conn.createStatement();

        String id = "10001";
        // Query 전송 및 결과 받기
        query = "SELECT ID , " + 
                "        LAST_NAME" + 
                " FROM EMP " +
                " where id = '" + id + "'";

        System.out.println( query );
        rset = stmt.executeQuery( query );

        System.out.println( "ID\t\t\tLAST_NAME" );
        System.out.println( "-----                  -----------" );
        if ( rset.next() ) {
            
            System.out.println( rset.getString( "id" ) + "\t\t\t"
                              + rset.getString( 2 ) );
        }

        rset.close();
        stmt.close();
        conn.close();
    }
}
