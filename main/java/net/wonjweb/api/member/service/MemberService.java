package net.wonjweb.api.member.service;

/**
 * packageName: net.wonjweb.api.common.service
 * fileName   : MemberService
 * author     : Jangwonjong
 * date       : 2022-02-11
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-11     Jangwonjong       최초 생성
 */
public interface MemberService {
    String membershipList();
    String membershipInfo();
    String viewListShipments();
    String registerSendEmail();
    String savingMoneyList();
    String viewSavingMoney();
    String calc();
    String bmi();
    String grade();
}
