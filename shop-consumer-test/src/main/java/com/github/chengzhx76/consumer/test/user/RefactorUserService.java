package com.github.chengzhx76.consumer.test.user;

import com.github.chengzhx76.service.user.api.service.UserService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Desc:
 * Author: chengzhx76@qq.com
 * Date: 2017/8/21
 */
@FeignClient("user-service")
public interface RefactorUserService extends UserService {
}
