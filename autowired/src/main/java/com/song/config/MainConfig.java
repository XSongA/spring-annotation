package com.song.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配：
 */
@Configuration
@ComponentScan({"com.song.controller", "com.song.service", "com.song.repository"})
public class MainConfig {

}
