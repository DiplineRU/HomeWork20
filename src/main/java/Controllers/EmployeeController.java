package Controllers;

import com.amam.collections1.services.for_services.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public EmployeeController(com.amam.collections1.services.EmployeeServiceImpl ES) {
        this.ES = ES;
    }

    @GetMapping("/all")
    public String showAllEmployees() {
        return ES.getEmployees();
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam("firstName") String firstName,
                                @RequestParam("lastName") String lastName,
                                @RequestParam("unit") int unit,
                                @RequestParam("salary") float salary) {

        return ES.addEmployee(firstName, lastName, unit, salary);
    }

    @GetMapping("/remove")
    public Employee removeEmployee(@RequestParam("key") int key) {
        return ES.removeEmployee(key);
    }

    @GetMapping("/find")
    public Employee findEmployee(@RequestParam("key") int key) {
        return ES.findEmployee(key);
    }
}