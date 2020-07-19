package sizhe.chen.spring.boot.demo.controller.test;

import org.junit.*;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


/**
 * @ClassName : TestHelloController
 * @Description :
 * @Author : Clark Chen
 * @Date: 2020-07-18 08:15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestHelloController {

    @Autowired
    private MockMvc mvc;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @Before
    public void setUp(){
        System.out.println("before method");
    }

    @Test
    public void hello() throws Exception {
        MvcResult result = mvc.perform(MockMvcRequestBuilders.get("/")
                .param("name", "IMOOC")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(content()
                        .string("Hello IMOOC"))
                .andReturn();

        System.out.println("==="+result.getResponse().getContentAsString()+"===");
    }

    @Test
    public void hello2() throws Exception {
        MvcResult result = mvc.perform(get("/")
                .param("name", "IMOOC")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(content()
                        .string("Hello IMOOC"))
                .andReturn();

        System.out.println("==="+result.getResponse().getContentAsString()+"===");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("===after method===");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("===after class===");
    }


}
