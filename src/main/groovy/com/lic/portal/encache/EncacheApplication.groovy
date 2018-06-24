package com.lic.portal.encache

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class EncacheApplication {

    static void main(String[] args) {
        SpringApplication.run EncacheApplication, args
    }
}
