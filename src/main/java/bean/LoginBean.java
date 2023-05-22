package bean;

import java.util.List;
import java.util.Map;

public class LoginBean extends DbConnection {
	//フィールド
	private String shain_code = "";
	private String shan_name = "";
	private String kengen_code = "";
	private String tenpo_code = "";
	private String tenpo_name = "";
	private String password = "";
	private List<Map<String,String>> list;
	private String msg = "";
	
	//コンストラクタ
	public LoginBean() {
		TorihikisakiBean tb = new TorihikisakiBean();
		//店舗情報を取得するために作ったTorihikisakiBeanをインスタンスが持っているgetTenpoList()メソッドを使って出来上がったリストを返してもらう
		list = tb.getTenpoList();
	}
	//チェック用
	public boolean check() {
		return true;
	}
	
	//上の部分を右クリック>ソース>getter及びsetterの設定で自動生成
	//getter,setter
	public String getShain_code() {
		return shain_code;
	}
	public void setShain_code(String shain_code) {
		this.shain_code = shain_code;
	}
	public String getShan_name() {
		return shan_name;
	}
	public void setShan_name(String shan_name) {
		this.shan_name = shan_name;
	}
	public String getKengen_code() {
		return kengen_code;
	}
	public void setKengen_code(String kengen_code) {
		this.kengen_code = kengen_code;
	}
	public String getTenpo_code() {
		return tenpo_code;
	}
	public void setTenpo_code(String tenpo_code) {
		this.tenpo_code = tenpo_code;
	}
	public String getTenpo_name() {
		return tenpo_name;
	}
	public void setTenpo_name(String tenpo_name) {
		this.tenpo_name = tenpo_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Map<String, String>> getList() {
		return list;
	}
	public void setList(List<Map<String, String>> list) {
		this.list = list;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
