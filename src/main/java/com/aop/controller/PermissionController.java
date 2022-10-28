package com.aop.controller;

import com.aop.PO.User;
import org.springframework.web.bind.annotation.*;
import com.aop.result.ResultBody;

/**
 *
 * @Description: AOP Demo
 * @author liuziyang
 * @date 2022/10/28
 */

@RestController
@RequestMapping(value = "/permission")
public class PermissionController {

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public ResultBody getGroupList(@RequestBody User user) {
        ResultBody resultBody = new ResultBody();
        return resultBody;
    }
}
