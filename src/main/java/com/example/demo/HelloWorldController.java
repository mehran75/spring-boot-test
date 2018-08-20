package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping
public class HelloWorldController {


    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping
    public LocalDateTime sayTime() {
        return LocalDateTime
                .now();
    }


    @RequestMapping("/request")
    public String request(@RequestParam String first, @RequestParam(defaultValue = "10") int second) {
        return "first request parameter : " + first + "\nsecond request parameter : " + second;
    }

    @RequestMapping("/requestWithParamClass")
    public String request(Param param) {
        return "first request parameter : " + param.getFirst() + "\nsecond request parameter : " + param.getSecond();
    }

    @RequestMapping(value = "/requestPost",method = RequestMethod.POST)
    public String requestPost(Param param) {
        return "first request parameter : " + param.getFirst() + "\nsecond request parameter : " + param.getSecond();
    }


    @PostMapping(value = "/requestPostMapping")
    public String requestPostMapping(@RequestBody Param param) {
        return "first request parameter : " + param.getFirst() + "\nsecond request parameter : " + param.getSecond();
    }

//    @RequestMapping("/requestWithPath/{first}/{second}")
//    public String requestWithPath(Param param) {
//        return "first request parameter : " + param.getFirst() + "\nsecond request parameter : " + param.getSecond();
//    }

    @RequestMapping("/requestWithPath/{first}/{second}")
    public String requestWithPathExplicit(@PathVariable String first, @PathVariable String second) {
        return "first request parameter : " + first + "\nsecond request parameter : " + second;
    }



    static class Param {
        String first;
        int second = 20; // default value

        public void setFirst(String first) {
            this.first = first;
        }

        public void setSecond(int second) {
            this.second = second;
        }

        public int getSecond() {
            return second;
        }

        public String getFirst() {
            return first;
        }
    }


}
