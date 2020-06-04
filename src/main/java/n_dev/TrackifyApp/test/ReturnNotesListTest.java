package n_dev.TrackifyApp.test;

import n_dev.TrackifyApp.services.NoteService;

public class ReturnNotesListTest {

	public static void main(String[] args) {
		
		NoteService service = new NoteService();
		System.out.println(service.findAll());

	}

}
