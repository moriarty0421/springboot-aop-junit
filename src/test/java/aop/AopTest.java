package aop;

import com.aop.AopDemoApplication;
import com.aop.PO.User;
import com.aop.controller.PermissionController;
import com.aop.result.ResultBody;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertEquals;

/**
 *
 * @Description: AOP Demo
 * @author liuziyang
 * @date 2022/10/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AopDemoApplication.class)
public class AopTest {
    @Autowired
    private PermissionController permissionController;

    @Test
    public void PermissionTest1() {
        // 构造入参
        ResultBody resultBody = new ResultBody();
        resultBody.setCode("200");
        resultBody.setMessage("success");
        User user = new User();
        user.setId(1L);
        user.setName("admin");
        assertEquals(resultBody.toString(), permissionController.getGroupList(user).toString());
    }

    @Test
    public void PermissionTest2() {
        // 构造入参
        ResultBody resultBody = new ResultBody();
        resultBody.setCode("403");
        resultBody.setMessage("illegal id");
        User user = new User();
        user.setId(-1L);
        user.setName("admin");
        assertEquals(resultBody.toString(), permissionController.getGroupList(user).toString());
    }

    @Test
    public void PermissionTest3() {
        // 构造入参
        ResultBody resultBody = new ResultBody();
        resultBody.setCode("403");
        resultBody.setMessage("not admin");
        User user = new User();
        user.setId(1L);
        user.setName("liuziyang");
        assertEquals(resultBody.toString(), permissionController.getGroupList(user).toString());
    }
}
