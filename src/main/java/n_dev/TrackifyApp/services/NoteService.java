package n_dev.TrackifyApp.services;

import java.util.List;

import n_dev.TrackifyApp.dao.NoteDao;
import n_dev.TrackifyApp.entities.Note;
import n_dev.TrackifyApp.interfaces.GenericDao;

public class NoteService implements GenericDao<Note> {
	
	private static NoteDao noteDao;
	
	public NoteService() {
		noteDao = new NoteDao();
	}

	@Override
	public void persist(Note entity) {
		noteDao.openCurrentSessionWithTransaction();
		noteDao.persist(entity);
		noteDao.closeCurrentSessionWithTransaction();
		
	}

	@Override
	public void update(Note entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Note findByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Note entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Note> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
