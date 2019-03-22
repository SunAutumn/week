/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.max.week.demo.service.impl;

import cn.max.week.demo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description of DemoServiceImpl
 *
 * @author suncx
 * @created on 2019-03-21 11:26
 */
@RestController
@RequestMapping("/demo")
public class DemoServiceImpl implements DemoService {

    public String sayHello(@RequestParam("name") String name) {
        return "Hello " + name;
    }
}
