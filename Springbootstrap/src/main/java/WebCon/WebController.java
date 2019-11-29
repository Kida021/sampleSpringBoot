package WebCon;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import java.util.Date;

@Controller
public class WebController {

//	    @Autowired
//	    public WebController(Environment environment){
//	        appMode = environment.getProperty("app-mode");
//	    }
	
	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
}
