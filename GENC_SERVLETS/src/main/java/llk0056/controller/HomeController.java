package llk0056.controller;

import llk0056.dto.Author;
import llk0056.dto.Book;
import llk0056.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @RequestMapping(value="/invalid")
    public ModelAndView invalid() {
        ModelAndView ret = new ModelAndView("invalid");//ret = return
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
		ret.addObject("searchBID", book);//variable used to display
		m.addAttribute("book", book);
		return ret;
	}

	@RequestMapping(value="/find")
	public ModelAndView find_by_author_name(){
		ModelAndView ret = new ModelAndView("find");
		return ret;
	}

	@RequestMapping(value="/findView")
	public ModelAndView Find_Books_By_Author(String name, Model m){
		ModelAndView ret = new ModelAndView("findView");
		List<Book> book = service.findBooksByAuthor(name);
		ret.addObject("find", book);//variable used to display
		m.addAttribute("book", book);
		return ret;
	}


	@RequestMapping(value="/findBBT")
	public ModelAndView find_books_by_title(){
		ModelAndView ret = new ModelAndView("findBBT");
		return ret;
	}

	@RequestMapping(value="/findBBTView")
	public ModelAndView Find_Books_By_Title(String book_title, Model m){
		ModelAndView ret = new ModelAndView("findBBTView");
		List<Book> book = service.findBooksByTitle(book_title);
		ret.addObject("findBookByTitle", book);//variable used to display
		m.addAttribute("book", book);
		return ret;
	}

	@RequestMapping(value="/check")
	public ModelAndView testCheck(){
		ModelAndView ret = new ModelAndView("check");
		return ret;
	}

	@RequestMapping(value="/insert")
	public ModelAndView insert(){
		ModelAndView ret = new ModelAndView("insert");

		//ret.addObject("searchBID", book);
		//m.addAttribute("book", book);
		return ret;
	}

	@RequestMapping(value="/insertView")
	public ModelAndView testCheckView(String name){
		ModelAndView ret = new ModelAndView("insertAllView");
		service.addAuthor(name);

		//return new ModelAndView("redirect:/searchAll");
		return ret;
	}

}
