/*
 * package com.java.webserver;
 * 
 * import static org.assertj.core.api.Assertions.assertThat; import static
 * org.mockito.ArgumentMatchers.any; import static org.mockito.Mockito.when;
 * 
 * import java.util.Arrays;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.junit.jupiter.api.extension.ExtendWith; import org.mockito.InjectMocks;
 * import org.mockito.Mock; import org.mockito.junit.jupiter.MockitoExtension;
 * import org.springframework.mock.web.MockHttpServletRequest; import
 * org.springframework.web.context.request.RequestContextHolder; import
 * org.springframework.web.context.request.ServletRequestAttributes;
 * 
 * import com.java.controller.EmployeeController; import
 * com.java.model.Employees; import com.java.repo.EmployeeService;
 * 
 * 
 * @ExtendWith(MockitoExtension.class) //@RunWith(JUnitPlatform.class) public
 * class EmployeeControllerTest {
 * 
 * @InjectMocks EmployeeController employeeController;
 * 
 * @Mock EmployeeService employeeService;
 * 
 * @Test public void testAddEmployee() { MockHttpServletRequest request = new
 * MockHttpServletRequest(); RequestContextHolder.setRequestAttributes(new
 * ServletRequestAttributes(request));
 * 
 * when(EmployeeService.addEmployee(any(Employees.class))).thenReturn(true);
 * 
 * Employees employee = new Employees("Lokesh", "Gupta");
 * employeeController.addEmployee(employee);
 * 
 * assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
 * assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo(
 * "/1"); }
 * 
 * @Test public void testFindAll() { // given Employees employee1 = new
 * Employees("Lokesh", "Gupta"); Employees employee2 = new Employees("Alex",
 * "Gussin"); Employees employees = new Employees();
 * employees.setEmployeeName(Arrays.asList(employee1, employee2));
 * 
 * when(employeeService.getAllEmployees()).thenReturn(employees);
 * 
 * // when Employees result = employeeController.getEmployees();
 * 
 * // then assertThat(result.getEmployeeList().size()).isEqualTo(2);
 * 
 * assertThat(result.getEmployeeList().get(0).getFirstName())
 * .isEqualTo(employee1.getFirstName());
 * 
 * assertThat(result.getEmployeeList().get(1).getFirstName())
 * .isEqualTo(employee2.getFirstName()); } }
 */