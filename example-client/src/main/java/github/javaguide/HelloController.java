package github.javaguide;

import github.javaguide.annotation.RpcReference;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author smile2coder
 */
@Slf4j
@Component
public class HelloController {

    @RpcReference(version = "version1", group = "test1")
    private HelloService helloService;

    public void test() throws InterruptedException {
        String hello = this.helloService.hello(new Hello("111", "222"));
        //如需使用 assert 断言，需要在 VM options 添加参数：-ea
        log.debug("i am daddy");
        log.debug("上划线");
        log.debug("1111");
        log.debug("3333");
        log.debug("2222");
        log.debug("4444");
        log.debug("下划线");
        log.debug("下划线");
        log.debug("下划线");
        log.debug("上划线");
        log.debug("下划线");
        log.debug("下划线");
        log.debug("下划线");
        assert "Hello description is 222".equals(hello);
        log.debug("上划线");
        Thread.sleep(12000);
        for (int i = 0; i < 5; i++) {
            System.out.println(helloService.hello(new Hello("111", "222")));
        }
    }
}
