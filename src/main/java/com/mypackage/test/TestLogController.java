package com.mypackage.test;

import com.mypackage.test.annotation.Logable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jlguo on 18/06/2017.
 */
@RestController
public class TestLogController {


    @RequestMapping("/testYes")
    @Logable(operator = "admin",operate = "do do do do nothing!!!!")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping("/testNO")
    public String index2(){
        return "Hello World!";
    }

}
