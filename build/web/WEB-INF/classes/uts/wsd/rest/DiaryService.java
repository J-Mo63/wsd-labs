package uts.wsd.rest;
 
import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.JAXBException;
import java.io.*;
import uts.wsd.DiaryApplication;
import uts.wsd.User;
import uts.wsd.Users;
 
@Path("/diaryApp")
public class DiaryService {
 @Context
 private ServletContext application;
 
 private DiaryApplication getDiaryApp() throws JAXBException, IOException, Exception {
  // The web server can handle requests from different clients in parallel.
  // These are called "threads".
  //
  // We do NOT want other threads to manipulate the application object at the same
  // time that we are manipulating it, otherwise bad things could happen.
  //
  // The "synchronized" keyword is used to lock the application object while
  // we're manpulating it.
  synchronized (application) {
   DiaryApplication diaryApp = (DiaryApplication)application.getAttribute("diaryApp");
   if (diaryApp == null) {
    diaryApp = new DiaryApplication();
    diaryApp.setFilePath(application.getRealPath("WEB-INF/users.xml"));
    application.setAttribute("diaryApp", diaryApp);
   }
   return diaryApp;
  }
 }
 
    @Path("users")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Users getUsers() throws Exception {
        return getDiaryApp().getUsers();
    }
    
    @Path("users/{email}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public User getUser(@PathParam("email") String email) throws Exception {
        Users users = getDiaryApp().getUsers();
        for (User user : users.getList()) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
    
    @Path("users")
    @POST
    public void addUser() throws Exception {
    }
}
