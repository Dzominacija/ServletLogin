package listener;




import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


import domain.User;



/**
 * Application Lifecycle Listener implementation class MyContextListener
 *
 */
@WebListener
public class MyContextListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	List<User> users = new ArrayList<User>() {
    		
    		{
    			add(new User("nikola", "1234", "nikola", "kompirovic"));
    			add(new User("bot1", "bot1", "bot1", "bot1"));
    			add(new User("bot2", "bot2", "bot2", "bot2"));
    			add(new User("bot3", "bot3", "bot3", "bot3"));
    			add(new User("bot4", "bot4", "bot4", "bot4"));
    		}
    	};
    	arg0.getServletContext().setAttribute("users", users);
    	arg0.getServletContext().setAttribute("loggedUsers", new ArrayList<User>());
    }
	
}
