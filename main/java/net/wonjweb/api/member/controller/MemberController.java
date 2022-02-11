package net.wonjweb.api.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName: net.wonjweb.api.common.controller
 * fileName   : CommonController
 * author     : Jangwonjong
 * date       : 2022-02-11
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-11     Jangwonjong       최초 생성
 */
@RestController
public class MemberController {
    @GetMapping("/")
    public String now (){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }

}
