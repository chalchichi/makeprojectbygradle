package oh.study.makeprojectbygradle;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
    TestServcie service;
    public Controller1(TestServcie service)
    {
        this.service = service;
    }

    @GetMapping("/hi")
    public String returnrequest()
    {
        return service.Service("hi");
    }

}
