
package gestionaire;

import com.login.Loginframe;
import com.login.Signupframe;
import com.home.Homeframe;
import com.database.DB;

public class Gestionaire {

    public static void main(String[] args) {

        //créé un objet fram login
        Loginframe log1 = new Loginframe();
        log1.show();
        Homeframe home1 = new Homeframe();
        home1.show();
        DB.loadConnection();
        
    }
    
}
