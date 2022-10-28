package com.aop.aspect;

import com.aop.PO.User;
import com.aop.result.ResultBody;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
/**
 * @Author liuziyang
 * @Description
 * @Date  2022/10/28
 * @Param
 * @return
 **/
@Aspect
@Component
public class AspectTest {
    @Pointcut("execution(public * com.aop.controller.*.*(..))")
    public void doOperation() {
    }

    @Around("doOperation()")
    public ResultBody before(JoinPoint joinPoint) throws Throwable{
        Object[] objs = joinPoint.getArgs();
        ResultBody resultBody = new ResultBody();
        User user =(User) objs[0];
        String name = user.getName();
        Long id = user.getId();
        System.out.println(name+id);
        if(id < 0) {
            resultBody.setCode("403");
            resultBody.setMessage("illegal id");
        }
        else if(!name.equals("admin")) {
            resultBody.setCode("403");
            resultBody.setMessage("not admin");
        }
        else {
            resultBody.setCode("200");
            resultBody.setMessage("success");
        }
        return resultBody;
    }
}