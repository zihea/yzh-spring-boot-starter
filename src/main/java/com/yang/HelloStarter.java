package com.yang;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yangzihe
 * @date 2022/2/16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HelloStarter {

    private HelloProperties helloProperties;

    public String hello() {
        return "welcome " + helloProperties.getName() + "！";
    }

}