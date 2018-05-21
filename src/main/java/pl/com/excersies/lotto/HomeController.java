package pl.com.excersies.lotto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Daniel_D'AGE on 21.05.2018.
 */
@Controller
public class HomeController {

    //@ResponseBody  // mówi nam, że ma być zwrócony String, a nie HTML; inaczej zwraca nam Stringa,a  nie HTML
    @GetMapping("/")
    public String getHello(ModelMap modelMap) {


       Set<Integer> integerSet = new TreeSet<>();
        Random random = new Random();
        while (integerSet.size() !=6){
            integerSet.add(random.nextInt((49)+1));
        }


        modelMap.put("number",integerSet);

        return "hello";


    }
}
