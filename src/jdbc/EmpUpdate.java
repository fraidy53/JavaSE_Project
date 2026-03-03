package jdbc;

import java.sql.*;

public class EmpUpdate {
    public static void main( String args[] ) throws SQLException,
                    ClassNotFoundException {
        String url = "jdbc:oracle:thin:@192.168.0.200:1521:VCC";
        Connection conn = null;
        Statement stmt = null;
        String query = null;
        int updateCount = 0;


        // Driver 등록
        Class.forName( "oracle.jdbc.driver.OracleDriver" );

        // DB Connection
        conn = DriverManager.getConnection( url, "SE17###", "SE17###" );
        
        // Auto Commit 이 되지 않도록 설정한다.즉. commit()을 호출해야만 커밋.
        conn.setAutoCommit( false );

        // Statement생성
        stmt = conn.createStatement();
        
        String empName = "HITE" ;
        String empId = "10004";
        
         // Query 전송/실행
        query = "UPDATE EMP  " + 
                 "   SET LAST_NAME  =  '" + empName + "'"+ 
                 " WHERE  ID =  '" + empId + "'";  
        System.out.println( query );
        updateCount = stmt.executeUpdate(query);
        System.out.println( "업데이트된 행의 갯수 : " + updateCount );

        conn.commit();// cf) conn.rollback();
        stmt.close();
        conn.close();
    }
}