package requestlimit.limit;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;
import requestlimit.limit.controller.RequestLimitController;
import static org.junit.Assert.*;


@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
class LimitApplicationTests {
    private final RequestLimitController requestLimitController;
    private final WebApplicationContext context;

    @Before
    public void before(){
        log.info("123!");
    }

    @Test
    void contextLoads() {
//        assertEquals("request!",new RequestLimitController().test());
    }

}
