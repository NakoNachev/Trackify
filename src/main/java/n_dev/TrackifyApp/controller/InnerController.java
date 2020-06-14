package n_dev.TrackifyApp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	
	
	
	@GetMapping("/displayNotes")
	public String displayGoals(Model model) {
		
		//pass the list with notes to be displayed on the page
		NoteService service = new NoteService();
		List<Note> notes = new ArrayList<Note>();
		notes = service.findAll();
		model.addAttribute("notesList",notes);
		
		//save the size of he list to be used as a select form 
		int size = notes.size();
		model.addAttribute("notesListSize",size);
		
		
		//
		
		EditOptionChoice option = new EditOptionChoice();
		model.addAttribute("optionChoice",option);
		
		return "notes_list";
	}
	
	@RequestMapping("/editNote")
	public String editNote(Model model,@ModelAttribute("optionChoice") EditOptionChoice option) {

		NoteService service = new NoteService();
		Note editNote = service.findByID(option.getId());
		model.addAttribute("noteToEdit",editNote);

		return "edit_note";
		
	}
	
	@RequestMapping("/editNote/editConfirmation") 
	public String editNoteConfirmation(Model model, @ModelAttribute("noteToEdit") Note editedNote) {
		
		NoteService service = new NoteService();
		service.update(editedNote);
		
		return "edit_confirmation";
	}
	
	

}
