package fc;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class Listener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
	
		System.out.println("SESSION CREATED");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("ABOUT TO BE DESTROYED");
	}

}
