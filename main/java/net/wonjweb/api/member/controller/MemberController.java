package net.wonjweb.api.member.controller;

import lombok.RequiredArgsConstructor;
import net.wonjweb.api.member.domain.CalcDTO;
import net.wonjweb.api.member.domain.MemberDTO;
import net.wonjweb.api.member.service.MemberService;
import org.springframework.web.bind.annotation.*;

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
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

   private final MemberService service;

   @PostMapping("/bmi")
   public String bmi(@RequestBody MemberDTO bmi){
       return service.bmi(bmi);
   }
   @PostMapping("/grade")
   public String grade(@RequestBody MemberDTO grade){
       return service.grade(grade);
   }
   @PostMapping("/login")
   public String login(@RequestBody MemberDTO login){
       return service.login(login);
   }

   @PostMapping("/calc")
   public String calc(@RequestBody CalcDTO calc){
     return service.calc(calc);
   }


}