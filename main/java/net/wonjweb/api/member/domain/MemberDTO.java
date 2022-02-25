package net.wonjweb.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * packageName: net.wonjweb.api.common.domain
 * fileName   : MemberDTO
 * author     : Jangwonjong
 * date       : 2022-02-11
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-11     Jangwonjong       최초 생성
 */
@Data
@Component
public class MemberDTO {

    private String userid;
    private String name;
    private String address;
    private String phone;
    private double height;
    private double weight;
    private String regdate;
    private int kor;
    private int eng;
    private int math;

}

