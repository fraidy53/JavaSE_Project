package jdbc;

import java.sql.*;

public class EmpUpdateWithPreparedStatement {
    public static void main( String args[] ) 
              throws SQLException, ClassNotFoundException {
        String url = "jdbc:oracle:thin:@192.168.0.200:1521:VCC";
        Connection conn = null;
        PreparedStatement pstmt = null;
        String query = null;
        int updateCount = 0;

        // Driver 등록
        Class.forName( "oracle.jdbc.driver.OracleDriver" );

        // DB Connection
        conn = DriverManager.getConnection( url, "SE17###", "SE17###" );
        
        // Auto Commit 이 되지 않도록 설정한다.즉. commit()을 호출해야만 커밋.
        conn.setAutoCommit( false );

        // Statement생성
        query = "UPDATE EMP  " + 
                "   SET LAST_NAME  = ? " + 
                " WHERE  ID = ? ";

        pstmt = conn.prepareStatement( query );

        pstmt.setString( 1, "HITE" );
        pstmt.setString( 2, "10004" );

        // Query 전송/실행
        updateCount = pstmt.executeUpdate();
        System.out.println( "업데이트된 행의 갯수 : " + updateCount );
        
        conn.commit();
        
        // 닫기
        pstmt.close();
        conn.close();
    }
}