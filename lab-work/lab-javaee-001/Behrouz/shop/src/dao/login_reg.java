package dao;

public class login_reg {



    public static boolean authenticate(String username , String password) {

        if ("admin".equalsIgnoreCase(username) && "behi".equalsIgnoreCase(password)) {
            return true ;
        } else {
            return false ;
        }


    }
    public static boolean register (String name , String family ,
                                    long phonenumber , String username , String password) {
            // add the information to sql
        return true ;

    }

}
