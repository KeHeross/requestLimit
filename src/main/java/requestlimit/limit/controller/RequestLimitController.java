package requestlimit.limit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import requestlimit.limit.annotation.RequestLimit;

/**
 * @ClassName：RequestLimitController
 * @Description: 接口防止重复
 * @Author：maczk
 * @Date：2020/12/1 2:05 下午
 * @Versiion：1.0
 */
@RestController
@RequestMapping("/requestLimit")
public class RequestLimitController {

    @GetMapping("/test")
    @RequestLimit(second = 1,maxCount = 1)
    public String test(){
        return "request!";
    }

}
