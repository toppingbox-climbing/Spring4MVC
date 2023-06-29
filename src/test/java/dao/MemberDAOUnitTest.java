package dao;

import cherry.hello.spring4.dao.MemberDAO;
import cherry.hello.spring4.model.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/servlet-context.xml",
        "classpath:spring/root-context.xml"})
@WebAppConfiguration
public class MemberDAOUnitTest {

    //테스트할 대상 객체를 주입받음
    @Autowired MemberDAO mdao;

    @Test
    @Transactional //데이터 입력 후 자동 삭제
    public void insertMember() throws Exception {
        Member m = new Member(
                null, "abc123a","987xyz","abc123","abc123@987xyz.co.kr",null);
        //assertEquals(테스트메서드, 검증값)
       assertEquals(mdao.insertMember(m), 1);
    }

    @Test
    public void loginMember() throws Exception {
        Member m = new Member();
        m.setUserid("abc123a");
        m.setPasswd("987xyz");

        //assertEquals(테스트메서드, 검증값)
        // System.out.println(mdao.loginMember(m));

        //abc123a 가 들어가면 expected 1, actual 0 왜냐면 없는 값이니까

        assertNotNull(mdao.loginMember(m));

    }

}
