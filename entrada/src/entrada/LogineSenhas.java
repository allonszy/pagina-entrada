package entrada;
import java.util.HashMap;

public class LogineSenhas {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
 LogineSenhas(){
		
		logininfo.put("Eduarda","senha");
		logininfo.put("diego123","12345");
		logininfo.put("Marcela","@Meia22");
		logininfo.put("Milton Antonio","ALvz90-$");
		logininfo.put("Al-ice@","S3nh4L3Gal");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}