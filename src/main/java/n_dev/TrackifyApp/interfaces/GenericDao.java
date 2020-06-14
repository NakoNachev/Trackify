package n_dev.TrackifyApp.interfaces;

import java.util.List;

public interface GenericDao<T> {
	
	
	public void persist(T entity);
	
	public void update(T entity);
	
	public T findByID(int id);
	
	public void delete(T entity);
	
	public List<T> findAll();

}
