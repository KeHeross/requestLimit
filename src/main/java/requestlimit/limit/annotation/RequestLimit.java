package requestlimit.limit.annotation;

import java.lang.annotation.*;

/**
 * @ClassName：RequestLimit
 * @Description:
 * @Author：maczk
 * @Date：2020/12/1 2:12 下午
 * @Versiion：1.0
 */
@Documented
@Inherited
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestLimit {
    // 在 second 秒内，最大只能请求 maxCount 次
    int second() default 1;
    int maxCount() default 1;
}