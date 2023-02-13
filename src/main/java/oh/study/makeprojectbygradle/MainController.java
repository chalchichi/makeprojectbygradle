package oh.study.makeprojectbygradle;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    MakeWord service;
    public MainController(MakeWord service)
    {
        this.service = service;
    }

    @GetMapping("/words")
    public String returnrequest()
    {
        String res = service.Service();
        return res;
    }

}
