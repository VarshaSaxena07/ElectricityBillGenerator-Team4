package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ElectricityBillingCalculatorApplicationTests {

	@Test
	void contextLoads(){
	}

}



//package com.example.demo;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.Arrays;
//import java.util.List;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.example.demo.DAO.AdminDAO;
//import com.example.demo.Entity.Admin;
//import com.example.demo.Services.AdminServices;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@RunWith(SpringRunner.class)
////@WebMvcTest(AdminController.class)
//class ElectricityBillingCalculatorApplicationTests {
//
//	@Autowired
//	private MockMvc mockMvc;
//	@MockBean
//	private AdminDAO adminDAO;
//	@MockBean
//	
//	private AdminServices adminServices ;
//	@Autowired
//	private MockMvc mockMvc; 
//	@Autowired
//	 private ObjectMapper objectMapper;
//	private List<Admin> adminList;
////	@Before                          
////    void setUp() { 
////		this.adminList=new ArrayList<>();
////		Admin a1=new Admin(1,"Varsha","varsha@123");
////		Admin a2=new Admin(2,"Amit","admin123");
////		Admin a3=new Admin(3,"Nidhi","nidhi@123");
////		this.adminList.add(a1);
////		this.adminList.add(a2);
////		this.adminList.add(a3);
////	}
//	
//	@Test
//	void contextLoads() {
//	}
//	
//	@Test
//	  void shouldCreateAdmin() throws Exception {
//	    	Admin admin = new Admin(3,"Varsha","varsha@123");
//
//	    mockMvc.perform(post("/admin/creating").contentType(MediaType.APPLICATION_JSON)
//	        .content(objectMapper.writeValueAsString(admin)))
//	        .andExpect(status().isOk())
//	        .andDo(print());
//	    System.out.println("Success");
//	  }
////@Test
////void shouldReturnTutorial() throws Exception {
////  int id = 1;
////  Admin admin = new Admin(id, "Varsha", "varsha@123");
////
////  when(adminDAO.findById(id)).thenReturn(Optional.of(admin));
////  mockMvc.perform(get("/admin/{id}", id)).andExpect(status().isOk())
////      .andExpect(jsonPath("$.adminId").value(id))
////      .andExpect(jsonPath("$.adminName").value(admin.getAdminName()))
////      .andExpect(jsonPath("$.password").value(admin.getPassword()))
////      .andDo(print());
////}
//	@Test
//	  public void testfindAll() throws Exception {
//	    Admin admin = new Admin(1,"Lokesh", "Gupta");
//	    List<Admin> list = Arrays.asList(admin);
//	 
//	    when(adminDAO.findAll()).thenReturn(list);
//	 
//	    mockMvc.perform(get("/admin/getAll/admin"))
//	    .andExpect(jsonPath("$.adminId").value(admin.getAdminId()))
//      .andExpect(jsonPath("$.adminName").value(admin.getAdminName()))
//      .andExpect(jsonPath("$.password").value(admin.getPassword()))
//      .andDo(print());
//	  }
////	.andExpect(status().isOk())
////	.andExpect(jsonPath("$.ad", Matchers.hasSize(1)))
////	.andExpect(jsonPath("$[0].firstName", Matchers.is("Lokesh")));
////}
//	
//	
//}
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
////	
////	@Test
////	public void test1() {
////		assertThat(adminController).isNull();
////	}
////	@Test
////	public void findAdminById() throws Exception {
////		final int id=1;
////		final Admin admin=new Admin(1,"Varsha","varsha@123");
////		when(adminDAO.findById(1)).then(null)
////	}
////	 @Test
////	    public void testFindAll() {
////	        
////	        when(adminDAO.findAll()).thenReturn(adminList);
////
////	        Admin result = adminController.getAllConsumers();
////
////	        assertThat(result.getEmployeeList().size()).isEqualTo(2);
////	        assertThat(result.getEmployeeList().get(0).getFirstName()).isEqualTo(employee1.getFirstName());
////	        assertThat(result.getEmployeeList().get(1).getFirstName()).isEqualTo(employee2.getFirstName());
////	    }
////
////}
