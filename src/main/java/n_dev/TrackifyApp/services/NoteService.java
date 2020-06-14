package n_dev.TrackifyApp.services;

import java.util.ArrayList;
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
		noteDao.openCurrentSessionWithTransaction();
		noteDao.update(entity);
		noteDao.closeCurrentSessionWithTransaction();
		
	}

	@Override
	public Note findByID(int id) {
		noteDao.openCurrentSession();
		Note note = noteDao.findByID(id);
		noteDao.closeCurrentSession();
		
		return note;
	}

	@Override
	public void delete(Note entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Note> findAll() {
		List<Note> notes = new ArrayList<Note>();
		
		noteDao.openCurrentSessionWithTransaction();
		notes = noteDao.findAll();
		noteDao.closeCurrentSessionWithTransaction();
		return notes;
	}
	

}
