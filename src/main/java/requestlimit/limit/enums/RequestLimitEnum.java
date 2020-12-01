package requestlimit.limit.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @ClassName：RequestLimitEnum 枚举类
 * @Description:
 * @Author：maczk
 * @Date：2020/12/1 2:27 下午
 * @Versiion：1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum  RequestLimitEnum {

    LIMIT(1,"请求重复");
    private Integer code;
    private String message;


}
