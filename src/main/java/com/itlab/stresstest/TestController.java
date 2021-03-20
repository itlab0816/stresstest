package com.itlab.stresstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 스트레스 테스트를 하기 위한 controller
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    @ResponseBody
    public String test() {

        String test = testService.getTest();

        return test;
    }

    @RequestMapping("stressTest")
    @ResponseBody
    public String stressTest(String test) {

        int count = testService.createStressTest(test);

        return String.valueOf(count);
    }
}
