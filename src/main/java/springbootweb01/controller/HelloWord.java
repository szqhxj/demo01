package springbootweb01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Sun Zhiqi
 * @Date: 2022/8/11 - 08 - 11 - 18:50
 * @Description: springbootweb01.controller
 * @version: 1.0
 */
@RestController
public class HelloWord {

    @RequestMapping("hello")
    public String test01() {
        return "你好，世界";
    }


}
