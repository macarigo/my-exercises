import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheController {

    /*@RequestMapping(method = RequestMethod.GET, value = "api/hello")
    public ResponseEntity<String>
    helloWorld(@RequestParam(value = "name", defaultValue = "mate") String str) {

        return new ResponseEntity<String>("G'day " + str, HttpStatus.I_AM_A_TEAPOT);
    }*/
    @RequestMapping(method = RequestMethod.GET, value = "api/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> helloWorld(@RequestParam(value = "name", defaultValue = "World") String str) {

        Message message = new Message();
        message.setMessage("Hello " + str);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
