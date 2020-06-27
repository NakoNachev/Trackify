package n_dev.TrackifyApp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import n_dev.TrackifyApp.business_logic.EditOptionChoice;
import n_dev.TrackifyApp.entities.Note;
import n_dev.TrackifyApp.services.NoteService;

@Controller
@RequestMapping("/home")
public class InnerController {
	
	@Autowired
	private NoteService noteService;
	
	@GetMapping("/displayNotes")
	public String displayGoals(Model model) {
		
		//pass the list with notes to be displayed on the page
//		NoteService service = new NoteService();
		List<Note> notes = new ArrayList<Note>();
//		notes = service.findAll();
		notes = noteService.findAll();
		model.addAttribute("notesList",notes);
		
		//save the size of he list to be used as a select form 
		int size = notes.size();
		model.addAttribute("notesListSize",size);
		
		
		//
		
		EditOptionChoice option = new EditOptionChoice();
		model.addAttribute("optionChoice",option);
		
		// add variable for new note
		
		Note newNote = new Note();
		model.addAttribute("newNote",newNote);
		
		return "notes_list";
	}
	
	@RequestMapping("/editNote")
	public String editNote(Model model,@ModelAttribute("optionChoice") EditOptionChoice option) {

//		NoteService service = new NoteService();
//		Note editNote = service.findByID(option.getId());
		Note editNote = noteService.findByID(option.getId());
		model.addAttribute("noteToEdit",editNote);

		return "edit_note";
		
	}
	
	@RequestMapping("/editNote/editConfirmation") 
	public String editNoteConfirmation(Model model, @ModelAttribute("noteToEdit") Note editedNote) {
		
//		NoteService service = new NoteService();
//		service.update(editedNote);
		
		noteService.update(editedNote);
		
		return "edit_confirmation";
	}
	
	@RequestMapping("/showAddNoteForm/addNoteConfirmation")
	public String addNewNote(Model model, @ModelAttribute("newNote") Note newNote) {
		
		noteService.persist(newNote);
		return "add_note_confirmation";
	}
	
	@RequestMapping("/showAddNoteForm")
	public String showAddNoteForm(Model model,@ModelAttribute("newNote") Note newNote) {
		
		return "add_new_note_form";
	}
	
	@RequestMapping("/deleteNote")
	public String deleteNote(Model model,@ModelAttribute("optionChoice") EditOptionChoice option) {
		
		Note noteToDelete = noteService.findByID(option.getId());
		noteService.delete(noteToDelete);
		
		return "delete_confirmation";
	}
	
	

}
