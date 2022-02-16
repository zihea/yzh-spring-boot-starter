package com.yang;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yangzihe
 * @date 2022/2/16
 */
@ConfigurationProperties(prefix = "yzh.hello")
@Data
public class HelloProperties {

    private String name = "default";

}