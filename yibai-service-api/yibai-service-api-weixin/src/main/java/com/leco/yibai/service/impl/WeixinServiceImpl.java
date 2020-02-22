package com.leco.yibai.service.impl;

import com.leco.yibai.service.IWeixinService;
import org.springframework.stereotype.Service;

/**
 * <h1></h1>
 *
 * @author wangheng
 * @version 1.0
 * @date 2020-02-21 23:40
 */
@Service
public class WeixinServiceImpl implements IWeixinService {

    @Override
    public String test() {
        return "wangheng";
    }
}
