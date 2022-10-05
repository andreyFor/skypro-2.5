import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/employee/add")
    public String add(@RequestParam("firstName") String firstName,
                      @RequestParam("lastName") String lastName) throws RuntimeException {
        if (!firstName.equals(null) && !lastName.equals(null)) {
            return employeeService.addEmployee(firstName, lastName);
        } else {
            throw new RuntimeException("Error");
        }
    }

    @GetMapping(path = "/employee/remove")
    public String remove(@RequestParam("firstName") String firstName,
                         @RequestParam("lastName") String lastName) throws RuntimeException {
        if (!firstName.equals(null) && !lastName.equals(null)) {
            return employeeService.removeEmployee(firstName, lastName);
        } else {
            throw new RuntimeException("Error");
        }
    }

    @GetMapping(path = "/employee/search")
    public String search(@RequestParam("firstName") String firstName,
                         @RequestParam("lastName") String lastName) throws RuntimeException {
        if (!firstName.equals(null) && !lastName.equals(null)) {
            return employeeService.searchEmployee(firstName, lastName);
        } else {
            throw new RuntimeException("Error");
        }
    }
}