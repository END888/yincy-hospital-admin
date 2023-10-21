package com.yincy.boot.framework.common.util.object;


import com.yincy.boot.framework.common.pojo.PageParam;

/**
 * {@link PageParam} 工具类
 *
 * @author ycy
 */
public class PageUtils {

    public static int getStart(PageParam pageParam) {
        return (pageParam.getPageNo() - 1) * pageParam.getPageSize();
    }

}
