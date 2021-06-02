//Nama 	: Rizki Pratama Firdaus
//Kelas 	: A11.4418
//NIM 	:  A11.2019.12220.
package mvc.Koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
public class Koneksi {
    static Connection con;
    
    public static Connection connection() {
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("db_crud");
            data.setUser("root");
            data.setPassword("");
            try {
                con = data.getConnection();
            } catch (SQLException ex) {
                System.out.println("Tidak terkoneksi");
            }
        }
        return con;
    }
}