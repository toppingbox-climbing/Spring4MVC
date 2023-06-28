/* join */

let joinbtn = document.querySelector("#joinbtn");
joinbtn?.addEventListener('click', () => {
    let frm = document.forms.joinfrm;

    if (frm.userid.value === '') alert('아이디를 작성하세요!');
    else  if (frm.passwd.value === '') alert('비밀번호를 작성하세요!');
    else  if (frm.repwd.value === '') alert('비밀번호 확인을 작성하세요!');
    else  if (frm.repwd.value !== frm.passwd.value) alert('비밀번호가 일치하지 않아요!');
    else  if (frm.name.value === '') alert('이름을 작성하세요!');
    else  if (frm.email.value === '') alert('이메일을 작성하세요!');
    else {
        frm.method = 'post'; //요청하는 방식, 메서드가 다르면 불일치. 실행 안됨.
        frm.action = '/member/join';
        frm.submit();
    }


});

/*login */

let loginbtn = document.querySelector("#loginbtn");
loginbtn?.addEventListener('click', () => {
        let frm= document.forms.loginfrm;

        if (frm.userid.value === '') alert('아이디를 작성하세요!');
        else if (frm.passwd.value === '') alert('비밀번호를 작성하세요!');
        else {
            frm.method = 'post';
            frm.action = '/member/login';
            frm.submit();

        }
});


