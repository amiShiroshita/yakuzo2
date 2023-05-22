package bean;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TorihikisakiBean extends DbConnection {
	//DBを格納するリスト
	public List<Map<String,String>> getTenpoList(){
		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
		String sql = "select torihikisaki_code,torihikisaki_name from mst_torihikisaki where torihikisaki_kbn = '2' and delete_flg = '0'";
		
		open();
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			//店舗数分くり返す↓
			// while文の中でMap作成
			//1店舗の情報を持たせ、それをListに持たせる
				while(rs.next()) {
					Map<String,String> map = new HashMap<String,String>();
					//1つめの引数　キー：tenpo_code　２つめの引数　格納する内容
					map.put("tenpo_code",rs.getString("torihikisaki_code"));
					//キー：tenpo_name
					map.put("tenpo_name", rs.getString("torihikisaki_name"));
					list.add(map);
				}
				//親クラスのcloseメソッドを実行
				close();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		//データを格納したいlistを実行先に返す
		return list;
	}
}
