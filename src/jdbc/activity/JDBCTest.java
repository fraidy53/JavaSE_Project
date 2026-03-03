package jdbc.activity;

import java.sql.*;

public class JDBCTest {

    String url = "jdbc:oracle:thin:@192.168.0.200:1521:VCC";
    String user = "SE17###";
    String passwd = "SE17###";
    
    private Connection conn;

    public JDBCTest() {

        try {
            Class.forName( "oracle.jdbc.driver.OracleDriver" );
            conn = DriverManager.getConnection( url, user, passwd );
            System.out.println( "[DB에 성공적으로 연결되었습니다!]" );
            conn.setAutoCommit( false );
        } catch ( SQLException e ) {
            System.out.println( "[DB 연결에 문제가 발생하였습니다.]" );
            e.printStackTrace();
        } catch ( ClassNotFoundException e ) {
            System.out.println( "[JDBC 드라이버 설정에 문제가 있습니다.]" );
            e.printStackTrace();
        }
    }

    /**
     * main 메소드
     * 
     * @param args
     */
    public static void main( String[] args ) {

        JDBCTest jdbcTester = new JDBCTest();

        System.out.println( "############ Statement Example ############" );

        System.out.println( "--- SELECT 1 ----" );
        jdbcTester.statementSelectExam();
        System.out.println( "" );
        System.out.println( "" );

        System.out.println( "--- UPDATE ----" );
        System.out.println( jdbcTester.statementUpdateExam() );
        System.out.println( "" );
        System.out.println( "" );

        System.out.println( "--- SELECT 2 ----" );
        jdbcTester.statementSelectExam();
        System.out.println( "" );
        System.out.println( "" );

        System.out.println( "--- Rollback ----" );
        jdbcTester.rollback();
        System.out.println( "" );
        System.out.println( "" );

        System.out.println( "--- SELECT 3 ----" );
        jdbcTester.statementSelectExam();
        System.out.println( "" );
        System.out.println( "" );

        jdbcTester.closeConnection();
    }

    /**
     * Connection 객체를 얻는다.
     * 
     * @return Connection 객체를 Return.
     */
    public Connection getConnection() {

        if ( isConnected() )
            return conn;
        else {
            System.out.println( "[DB 연결에 문제가 있습니다.]" );
            return null;
        }
    }

    /**
     * DB와 Connect되었는지 여부를 Return한다.
     * 
     * @return DB와 Connect되었는지 여부.
     */
    public boolean isConnected() {

        boolean validConnection = true;

        try {
            if ( conn == null || conn.isClosed() )
                validConnection = false;
        } catch ( SQLException e ) {
            validConnection = false;
            e.printStackTrace();
        }

        return validConnection;
    }

    /**
     * DB와 연결을 끊음.
     */
    public void closeConnection() {

        try {
            if ( isConnected() ) {
                conn.close();
                System.out.println( "[DB 연결이 해제되었습니다!]" );
            }
        } catch ( SQLException e ) {
            e.printStackTrace();
        }
    }

    /**
     * DB Commit 을 수행한다.
     */
    public void commit() {

        try {
            if ( isConnected() ) {
                conn.commit();
                System.out.println( "[커밋 되었습니다.]" );
            }
        } catch ( SQLException e ) {
            e.printStackTrace();
        }
    }

    /**
     * DB 트랜잭션 롤백.
     */
    public void rollback() {

        try {
            if ( isConnected() ) {
                conn.rollback();
                System.out.println( "[롤백 되었습니다.]" );
            }
        } catch ( SQLException e ) {
            e.printStackTrace();
        }
    }

    /**
     * Statement 객체를 이용한 기본적인 Select 예제
     */
    public void statementSelectExam() {

        Statement stmt = null;
        ResultSet rset = null;
        String query = null;

        try {
            stmt = conn.createStatement();
            query = " SELECT ID,    " + 
                    "        LAST_NAME,  " + 
                    "        FIRST_NAME, " + 
                    "        SALARY   " + 
                    " FROM   EMP     " + 
                    " WHERE  SALARY > 30000 ";

            rset = stmt.executeQuery( query );

            while ( rset.next() ) {
                System.out.print( rset.getString( 1 ) + "\t   " );
                System.out.print( rset.getString( 2 ) + "\t   " );
                System.out.print( rset.getString( 3 ) + "\t   " );
                System.out.print( rset.getInt( 4 ) + "\n" );
            }
        } catch ( SQLException e ) {
            System.out.println( "[statementSelectExam()에서 문제가 발생하였습니다.]" );
            e.printStackTrace();
        } finally {
            try {
                if ( stmt != null ) {
                    rset.close();
                    stmt.close();
                }

            } catch ( SQLException e ) {
                System.out.println( "[statementSelectExam()에서 문제가 발생하였습니다.]" );
                e.printStackTrace();
            }
        }
    }

    /**
     * Statement 객체를 이용한 간단한 Udate 예제
     * 
     * @return boolean
     */
    public boolean statementUpdateExam() {

        Statement stmt = null;
        String query = null;
        boolean returnValue = false;
        int result = 0;

        try {
            stmt = conn.createStatement();

            query = " UPDATE EMP           " + 
                    " SET    SALARY = SALARY * 1.2 " + 
                    " WHERE  SALARY > 10000 ";

            result = stmt.executeUpdate( query );
        } catch ( SQLException e ) {
            System.out.println( "[statementUpdateExam()에서 문제가 발생하였습니다.]" );
            e.printStackTrace();
        } finally {
            try {
                if ( result > 0 )
                    returnValue = true;

                stmt.close();
            } catch ( SQLException e ) {
                System.out.println( "[statementUpdateExam()에서 문제가 발생하였습니다. ]" );
                e.printStackTrace();
            }
        }
        return returnValue;
    }
}
