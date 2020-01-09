package cn.fanchencloud.kills;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chen
 */
@MapperScan("cn.fanchencloud.kills.dao")
@SpringBootApplication
public class KillsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KillsApplication.class, args);
    }
}
