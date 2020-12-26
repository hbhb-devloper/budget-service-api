package com.hbhb.cw.budgetservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangxiaogang
 */
public interface NoticeApi {
    
    @GetMapping("/count")
    Long countNotice(@RequestParam("id") Integer id);
}
