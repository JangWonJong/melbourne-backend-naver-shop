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
   public String getBmi(@RequestBody MemberDTO member){
      System.out.println(" 리액트에서 넘어온 이름: "+member.getName());
      System.out.println(" 리액트에서 넘어온 키: "+member.getHeight());
      System.out.println(" 리액트에서 넘어온 몸무게: "+member.getWeight());
      return "BMI는  정상";

   }

   @PostMapping("/calc")
   public String Calc(@RequestBody CalcDTO calc){
      System.out.println("리액트에서 넘어온 숫자1: "+calc.getNum1());
      System.out.println("리액트에서 넘어온 연산자: "+calc.getOpcode());
      System.out.println("리액트에서 넘어온 숫자2: "+calc.getNum2());
      return "";
   }

   @PostMapping("/grade")
   public String getGrade(@RequestBody MemberDTO member) {
      System.out.println(" 리액트에서 넘어온 이름: " + member.getName());
      System.out.println(" 리액트에서 넘어온 국어점수: " +member.getKor());
      System.out.println(" 리액트에서 넘어온 영어점수: " +member.getEng() );
      System.out.println(" 리액트에서 넘어온 수학점수: " +member.getMath());
      return "";
   }

   @PostMapping("/login")
   public String login(@PathVariable String username,
                         @PathVariable String password)
                         {
      System.out.println("리액트에서 넘어온 이름: "+username);
      System.out.println("리액트에서 넘어온 비밀번호: "+password);
      return "";
   }
}