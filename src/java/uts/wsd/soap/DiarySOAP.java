/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.wsd.soap;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.servlet.ServletContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import uts.wsd.DiaryApplication;
import uts.wsd.User;
import uts.wsd.Users;

/**
 *
 * @author J-Mo
 */
@WebService(serviceName = "diaryApp")
public class DiarySOAP {
    
    @Resource
    private WebServiceContext context;
    
    @WebMethod
    public Users fetchUsers() throws Exception {
        return getDiaryApp().getUsers();
    }
    
    @WebMethod
    public User fetchUser(String email) throws Exception {
        return getDiaryApp().getUsers().getUser(email);
    }
            
    private DiaryApplication getDiaryApp() throws Exception {
        ServletContext application = (ServletContext) context.getMessageContext().get(MessageContext.SERVLET_CONTEXT);
        DiaryApplication diaryApp = (DiaryApplication) application.getAttribute("diaryApp");
        if (diaryApp == null) {
            diaryApp = new DiaryApplication();
            diaryApp.setFilePath(application.getRealPath("WEB-INF/users.xml"));
            application.setAttribute("diaryApp", diaryApp);
        }
        return diaryApp;
    }
}
