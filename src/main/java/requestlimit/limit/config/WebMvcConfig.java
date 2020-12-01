package requestlimit.limit.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import requestlimit.limit.filter.RequestLimitIntercept;

/**
 * @ClassName：WebMvcConfig
 * @Description:
 * @Author：maczk
 * @Date：2020/12/1 2:43 下午
 * @Versiion：1.0
 */
@Component
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class WebMvcConfig implements WebMvcConfigurer {

    private final RequestLimitIntercept requestLimitIntercept;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("添加进拦截器！");
        registry.addInterceptor(requestLimitIntercept);
    }
}
