import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/employee")
@RestController
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public Employee add(@RequestParam("firstName") String firstName,
                        @RequestParam("lastName") String lastName) throws RuntimeException {
        if (!firstName.equals(null) && !lastName.equals(null)) {
            return employeeService.add(firstName, lastName);
        } else {
            throw new RuntimeException("Error");
        }
    }

    @GetMapping(path = "/remove")
    public Employee remove(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName) throws RuntimeException {
        if (!firstName.equals(null) && !lastName.equals(null)) {
            return employeeService.remove(firstName, lastName);
        } else {
            throw new RuntimeException("Error");
        }
    }

    @GetMapping(path = "/find")
    public Employee search(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName) throws RuntimeException {
        if (!firstName.equals(null) && !lastName.equals(null)) {
            return employeeService.find(firstName, lastName);
        } else {
            throw new RuntimeException("Error");
        }
    }
}