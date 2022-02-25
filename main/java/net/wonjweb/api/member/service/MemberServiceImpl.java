package net.wonjweb.api.member.service;

import lombok.RequiredArgsConstructor;
import net.wonjweb.api.member.domain.CalcDTO;
import net.wonjweb.api.member.domain.MemberDTO;
import net.wonjweb.api.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

/**
 * packageName: net.wonjweb.api.common.service
 * fileName   : MemberServiceImpl
 * author     : Jangwonjong
 * date       : 2022-02-11
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-11     Jangwonjong       최초 생성
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        String op = calc.getOpcode();
        switch (op){
            case "+": res =a + b; break;
            case "-": res =a - b; break;
            case "*": res =a * b; break;
            case "/": res =a / b; break;
            case "%": res =a % b; break;
        }
        return String.format("%d %s %d = %d",a, op, b, res);
    }

    @Override
    public String bmi(MemberDTO bmi) {
        double a = bmi.getWeight() / bmi.getHeight() * bmi.getHeight()*10000;
        String s = "";
        if(a>=35){
            s = "고도비만 입니다";
        }else if(a<34.9){
            s = "중(重)도 비만 (2단계 비만)";
        }else if(a<29.9){
            s = "경도 비만 (1단계 비만)";
        }else if(a<24.9){
            s = "과체중";
        }else if(a<22.9){
            s = "정상";
        }else if(a<18.5) {
            s = "저체중";
        }
        return s;
        }

    @Override
    public String grade(MemberDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total/3;
        String res = (avg>=60) ? "합격" : "불합격";
        for(int i=1; i<3; i++){
            System.out.println(i+"번학생 : 이름, 국어, 영어, 수학");
        }

        return String.format("########## 성적표 ########\n" +
                        " *  * 이름: %s\n" +
                        " *  * > 국어: %d점\n" +
                        " *  * > 영어: %d점\n" +
                        " *  * > 수학: %d점\n" +
                        " *  * 총점: %d점\n" +
                        " *  * 평균(정수): %d점\n" +
                        " *  * 합격여부: %s\n" +
                        " *  * #######################",grade.getName(),grade.getKor(),
                grade.getEng(),grade.getMath(),total,avg,res);
    }

    @Override
    public String login(MemberDTO login) {
        return String.format((login.getPw().equals(MemberDTO.PASSWORD)) ?
                String.format(" %s 님의 비번 %s 가 맞습니다. 로그인 성공 ",login.getName(),login.getPw())
                : String.format(" %s 의 ID 는 맞고, 비번 %s 가 틀립니다. 로그인 실패 ",login.getName(),login.getPw()));

    }


}
