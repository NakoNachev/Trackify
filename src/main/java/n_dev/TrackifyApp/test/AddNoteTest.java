package n_dev.TrackifyApp.test;

import n_dev.TrackifyApp.entities.Note;
import n_dev.TrackifyApp.services.NoteService;

public class AddNoteTest {
	
	public static void main(String args[]) {
		
		NoteService service = new NoteService();
		
		Note note = new Note("testTitle3");
		note.setContent("safkafafjAKFajfj");
		
		service.persist(note);
	}

}
