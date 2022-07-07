import com.imooc.miaosha.redis.MiaoshaKey;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ICDM_王顺
 * @Classname TestAll
 * @Description TODO
 * @Date 2022/6/14 15:55
 * @Created by TheKing_Shun
 */

public class TestAll {
    @Test
    public void test() {
        String[] split = "172.16.254.1".split(".");
        for (String str  : split) {
            System.out.println(split);
        }
    }
    @Test
    public void test2() {
        Integer a = -127;
        Integer b = -127;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a == b);
        System.out.println(c == d);

    }
}
