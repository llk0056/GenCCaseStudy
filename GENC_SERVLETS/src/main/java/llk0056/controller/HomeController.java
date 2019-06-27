package llk0056.controller;

import llk0056.dto.Author;
import llk0056.dto.Book;
import llk0056.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.List;

@Controller
public class HomeController {

	private AuthorService service;

	@Inject
	public void setService(AuthorService service) {
		this.service = service;
	}

//(@RequestParam(required=false, defaultValue="World") String name)

	@RequestMapping(value={"/home", "/"})
	public ModelAndView home() {
		ModelAndView ret = new ModelAndView("home");//ret = return
		// Adds an object to be used in home.jsp
		return ret;
	}

	@RequestMapping(value="/page1")
	public ModelAndView page1() {
		ModelAndView ret = new ModelAndView("page1");
		return ret;
	}

	@RequestMapping(value="/mj")
	public ModelAndView mj() {
		ModelAndView ret = new ModelAndView("mj");
		return ret;
	}

	@RequestMapping(value="/searchAll")
	public ModelAndView search(){
		ModelAndView ret = new ModelAndView("searchAll");
		ret.addObject("searchAll", service.findAll());
		return ret;
	}

	@RequestMapping(value="/searchAllBooks")
	public ModelAndView searchAllBooks(){
		ModelAndView ret = new ModelAndView("searchAllBooks");
		ret.addObject("searchAllBooks", service.findBook());
		return ret;
	}

	@RequestMapping(value="/sAID")
	public ModelAndView Search_by_id(){
		ModelAndView ret = new ModelAndView("sAID");
		return ret;
	}

	@RequestMapping(value="/sAIDView")
	public ModelAndView Search_by_idView(int AID, Model m){
		ModelAndView ret = new ModelAndView("sAIDView");
		Author auth = service.getAuthorById(AID);
		ret.addObject("searchAID", auth);
		m.addAttribute("author", auth);
		return ret;
	}

	@RequestMapping(value="/sBID")
	public ModelAndView Search_by_bid(){
		ModelAndView ret = new ModelAndView("sBID");
		return ret;
	}

	@RequestMapping(value="/sBIDView")
	public ModelAndView Search_by_bidView(int BID, Model m){
		ModelAndView ret = new ModelAndView("sBIDView");
		List<Book> book = service.getBookById(BID);
		ret.addObject("searchBID", book);
		m.addAttribute("book", book);
		return ret;
	}

	/*@RequestMapping(value="/insertAll")
	public ModelAndView insertAll(Model m){
		ModelAndView ret = new ModelAndView("insertAll");
		String A_name = request.getParameter("first_name");
		service.addAuthor(A_name);
		return ret;
	}*/


}
