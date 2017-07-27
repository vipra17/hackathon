package summer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SummerController {
	@RequestMapping("/multiply")
	@ResponseBody
	public int multiply(@RequestParam int a, int b){
		return a*b;
	}
	
	@RequestMapping("/doei")
	@ResponseBody
	public String doei(){
		return "Hallo doei";
	}
	
	@RequestMapping("/root")
	@ResponseBody
	public double squareRoot(@RequestParam int number){
		return Math.pow(number, 0.5);
	}
}
