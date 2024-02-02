package org.gotomove.flashsale.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.gotomove.flashsale.pojo.User;
import org.gotomove.flashsale.vo.RespBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author gotomove
 * @since 2024-01-16
 */
@Controller
@RequestMapping("/user")
@Api(value = "用户表", tags = "用户表")
public class UserController {
    @RequestMapping("/info")
    @ResponseBody
    @ApiOperation("返回用户信息")
    public RespBean info(User user) {
        return RespBean.success(user);
    }
}
