package top.xiaorang.design.pattern.factorymethod.goods;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liulei
 * @description 实体奖品服务
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">...</a>
 * @Copyright 博客：<a href="https://xiaorang.top">...</a>  - show me the code
 * @since 2022/8/17 1:43
 */
@Slf4j
public class GoodsService {
    /**
     * @param deliverReq 交付请求
     * @return 是否成功
     */
    public Boolean deliverGoods(DeliverReq deliverReq) {
        log.info("模拟发货实物商品一个：{}", JSON.toJSONString(deliverReq));
        return true;
    }
}
