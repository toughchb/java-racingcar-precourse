# 출력 메세지 정의

## messsage.properies

- [x] 자동차 이름 리스트 입력 메세지
- [x] 시도할 회수 입력 메세지
- [x] 실행 과정 출력
- [x] 우승자 리스트 출력 메세지
- [x] 에러 메세지
    1. [ERROR] 시도 횟수는 숫자여야 한다.
    2. [ERROR] 자동차 이름은 5 글자를 넘어갈 수 없습니다.

---

## GameView

---

## ErrorView

# Controller 계층

## RacingGameController

### 기능 정의

- 게임의 흐름을 관리 한다.
- 사용자로 부터 입력을 받는다.
- 입력 받은 정보를 RacingGameService로 전달 한다.

---

# Domain 계층

## Car

- [x] Car 는 이름(CarName)과 위치 정보(Position)를 가진다.
- [x] 자동차는 들어온 숫자 값이 4 이상이면 위치 정보를 1 증가 시킨다.
  ### Position
    - [x] 위치 값을 증가 시킬 수 있다.
    - [x] equals 메소드
    - [x] 음수값 검증
  ### CarName
    - [x] 생성 시 이름을 검증 한다.
    - [x] equals 메소드

## Cars
- [x] Car들의 리스트를 가진다.
- [x] Car들중 가장 큰 Position을 구한다.
- [x] Car들중 가장 큰 Position을 가진 Car 리스트를 구한다.