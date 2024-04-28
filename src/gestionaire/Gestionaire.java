
package gestionaire;

import com.acceuil.acceuilframe;
import com.login.Loginframe;
import com.login.Signupframe;
import com.home.Homeframe;
import com.database.DB;

public class Gestionaire {

    public static void main(String[] args) {

        //créé un objet fram login
        acceuilframe log = new acceuilframe();
        log.show();
   
        DB.loadConnection();
        
    }
    
}
