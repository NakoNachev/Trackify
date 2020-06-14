package n_dev.TrackifyApp.dao;

import java.util.List;

import n_dev.TrackifyApp.business_logic.SessionTransactionControl;
import n_dev.TrackifyApp.entities.Note;
import n_dev.TrackifyApp.interfaces.GenericDao;

public class NoteDao extends SessionTransactionControl implements GenericDao<Note>  {

	@Override
	public void persist(Note entity) {
		super.getCurrentSession().save(entity);
		
	}

	@Override
	public void update(Note entity) {
		super.getCurrentSession().saveOrUpdate(entity);
		
	}

	@Override
	public Note findByID(int id) {
		Note note = super.getCurrentSession().get(Note.class, id);
		return note;
	}

	@Override
	public void delete(Note entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Note> findAll() {
		List<Note> notes = super.getCurrentSession().createQuery("from Note n").getResultList();
		return notes;
	}

}
