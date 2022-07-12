package jana60.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class MainController {
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/ora")
	public String oraLocale(Model model) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
		LocalDateTime localData = LocalDateTime.now();
		model.addAttribute("ora", formatter.format(localData));
		return "home";
	}
}
