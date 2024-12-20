# java-lotto-precourse
# 로또

## 기능목록

- [x]  로또 발행
    - [x]  숫자 범위는 1~45
    - [x]  오름차순 정렬
    - [x]  중복되지 않는 6개의 숫자
    - [x]  구입 금액에 해당하는 만큼 로또를 발행
- [x]  입력
    - [x]  구입금액 입력
    - [x]  당첨 번호 입력 (번호는 쉼표(,)를 기준으로 구분)
    - [x]  보너스 번호 입력
- [x]  출력
    - [x]  발행한 로또 수량 및 번호를 출력 (오름차순으로 정렬)
    - [x]  당첨 내역 출력
    - [x]  수익률 출력 (수익률은 소수점 둘째 자리에서 반올림 - 62.5%)
    - [x]  에러 문구출력 ("[ERROR]"로 시작)

## 예외 상황

→ "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시

- [x]  구입금액
    - [x]  숫자가 아니면 예외
    - [x]  0원 입력하면 예외
    - [x]  1000원 단위 아닐때 예외
- [x]  당첨번호 입력
    - [x]  숫자 범위 1~45
    - [x]  6개의 숫자
    - [x]  숫자가 아니면 예외
    - [x]  쉼표가 아닌 문자 있으면 예외
    - [x]  공백이 들어가면 예외
    - [x]  중복이 되면 예외
- [x]  보너스 번호 입력
    - [x]  숫자 범위 1~45
    - [x]  숫자가 아니면 예외
    - [x]  담청번호와 중복이 되면 예외

### 프로그래밍 요구사항

- [x]  indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현
- [x]  3항 연산자를 쓰지 않는다.
- [x]  함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현
- [x]  else 예약어를 쓰지 않는다.
- [x]  Java Enum을 적용

### 마지막 확인

- [x]  코드 포맷팅