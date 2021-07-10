
package services;

import dataaccess.UserDB;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import models.User;
import servlets.UserServlet;

public class RoleService {

    public static void generateAllUsers(UserDB userDB, HttpServletRequest request) {
        try {
            List<User> users = userDB.getAll();
            request.setAttribute("users", users);
        } catch (Exception ex) {
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
