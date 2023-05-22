package bean;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class DbConnection {
	//フィールド
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public void open() {
		try {
			//Driverをインスタンス化したからConnectionクラスのインスタンスをｓつくる
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			//フィールドのconにいれる
			con = DriverManager.getConnection(
					"jdbc:mysql://192.168.33.10/yakuzo2",
					"java",
					"HogeHoge123#"
					);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException | SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	public void close() {
		try {
			//必ずResultSetインスタンスがあるとは限らないから、ないままクローズ指示してエラーにならないようにif文で存在確認
			if(Objects.nonNull(rs)) {
				rs.close();
			}
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}	
	}
	
}
