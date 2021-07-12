package services;

import dataaccess.RoleDB;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import models.Role;

import servlets.UserServlet;

public class RoleService {

    public static void getAllRoles(RoleDB roleDB, HttpServletRequest request) {
        try {
            List<Role> roles = roleDB.getAll();
            request.setAttribute("roles", roles);
        } catch (Exception ex) {
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
