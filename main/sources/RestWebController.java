package sources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by werner.diwischek on 4.9.2020.
 */

@RestController
public class RestWebController {
    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public String post(
            @RequestParam(value = "name", required = true) final String name
    ) {
       return "<h1>Welcome " + name + " from post</h1>";
    }

    @RequestMapping(value = "/welcome/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String get(@PathVariable String name) {
        return "<h1>Welcome " + name + " + from get</h1>";
    }

    @PostMapping(value = "/welcome/post")
    public String postMapping(
        @RequestParam(value = "name", required = true) final String name
    ) {
        return "<h1>Welcome " + name + " from post</h1>";
    }

    @GetMapping(value = "/welcome/get/{name}")
    @ResponseBody
    public String getMapping(@PathVariable String name) {
        return "<h1>Welcome " + name + " + from get</h1>";
    }
}
