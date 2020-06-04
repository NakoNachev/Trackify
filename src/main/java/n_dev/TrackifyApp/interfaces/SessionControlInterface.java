package n_dev.TrackifyApp.interfaces;

import org.hibernate.Session;

public interface SessionControlInterface {
	
	public Session openCurrentSession();
	public Session openCurrentSessionWithTransaction();
	public void closeCurrentSession();
	public void closeCurrentSessionWithTransaction();

}
