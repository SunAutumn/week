/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.max.week.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description of EurekaRegistryServerApplication
 *
 * @author suncx
 * @created on 2019-03-20 16:12
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaRegistryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRegistryServerApplication.class, args);
    }
}
