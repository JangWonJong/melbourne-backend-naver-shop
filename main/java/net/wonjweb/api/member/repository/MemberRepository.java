package net.wonjweb.api.member.repository;

import net.wonjweb.api.member.domain.CalcDTO;
import net.wonjweb.api.member.domain.MemberDTO;

/**
 * packageName: net.wonjweb.api.common.repository
 * fileName   : MemberRepository
 * author     : Jangwonjong
 * date       : 2022-02-11
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-11     Jangwonjong       최초 생성
 */
public interface MemberRepository {
    String calc(CalcDTO calc);

    String bmi(MemberDTO bmi);

    String grade(MemberDTO grade);

    String login(MemberDTO login);
}
