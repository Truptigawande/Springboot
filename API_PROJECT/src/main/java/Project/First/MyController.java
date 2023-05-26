package Project.First;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

	@RequestMapping("apicall")
	public String apicall() {
		
		return "apicall";
	}
	
	@RequestMapping("Test")
	public ModelAndView test() {
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("Piyush");
		arrayList.add("Sarvesh");
		arrayList.add("Pradnyesh");
		arrayList.add("Aakanksha");
		arrayList.add("Arbaz");
		arrayList.add("Vivek");
		arrayList.add("Vaibhavi");
		arrayList.add("Jemini");
		arrayList.add("Vaibhav");
		arrayList.add("Shrikant Bhau");
		ModelAndView mv = new ModelAndView("test","data",arrayList);
		return mv;
	}
	
}
