// list
let newbtn = document.querySelector("#newbtn");
newbtn?.addEventListener('click', () => {
    location.href = '/board/write';
});

// write
let newbdbtn = document.querySelector("#newbdbtn");
newbdbtn?.addEventListener('click', () => {
    let frm = document.forms.writefrm;
    if (grecaptcha.getResponse() === '') { alert('자동 쓰기 방지를 체크하세요.!!')}
    else {
        alert('쓰기 완료');

    }
});