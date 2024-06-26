# 박제민 202130138
## 3월 15일 강의
내용 정리  
자바 쓸 때 파일을 만들고 .java를 붙여서 자바 파일 생성
## 3월 22일 강의
**저급 언어** = 컴퓨터의 기본 언어  
**고급 언어** = 우리가 알고 있는 99%의 컴퓨터 언어  
자바 언어를 컴파일 하면 클래스
c/c++를 컴파일 하면 최종적으로 .exe파일  
**서블릿이란?** 웹서버에서 실행되는 자바 프로그램  
### 자바의 특성
1. 플랫폼 독립성
   * 하드웨어, 운영체제에 종속되지 않는 바이트 코드로 플랫폼 독립성
2. 객체 지향
   * 캡슐화 독립성
3. 클래스로 캡슐화  
   * 자바의 모든 변수나 함수는 클래스 내에 선언
   * 클래스 안에서 클래스(내부 클래스) 작성 가능
4. 소스와 클래스 파일
   * 하나의 소스파일에 여러 클래스르 작성 가능
   * 소스 파일의 이름과 public으로 선언된 클래스 이름은 같아야 함
   * 클래스 파일에는 하나의 클래스만 존재
5. 실행 코드 배포
   * 자바 응용 프로그램의 실행은 메소드에서 시작
6. 패키지
   * 서로 관련 있는 여러 클래스를 패키지로 묶어 관리
   * 패키지는 폴더 개념
7. 멀티 스레드 
   * 여러 스레드의 동시 수행 원격 지원
8. 가비지 컬렉션 
   * 자바 안에는 메모리의 할당 기능은 있어도 메모리의 반환 기능 없음
      * 사용하지 않는 메모리는 자바 가상 기계에 의해 자돈 반환-가비지 컬렉션
9. 실시간 응용프로그램에 부적합
    * 실행 도중 예측할 수 없는 시점에 가비지 컬렉션 실행 때문
10. 자바 프로그램은 안전
    * 타임 체크 엄격
    * 물리적 주소를 사용하는 포인터 개념 없음
11. 프로그램 작성 쉬움
    * 포인터 개념 없음 
    * 동적 메모리 반환 하지 않음
    * 다양한 라이브러리 지원
12. 실행 속도 개선을 위한 JIT 컴파일러 사용 
    * 자바는 바이트 코드를 인터프리터 방식으로 실행
      * 기계어가 실행되는 것보다 느림
    * JIT 컴파일 기법으로 실행 속도 개선  

### 식별자
**식별자란 ?** 
식별자란 클래스, 변수, 상수, 메소드에 붙이는 이름을 말한다.

### 자바의 기본 타입
**특징**  
기본 타입의 크기는 CPU나 운영체제에 따라 변하지 않음

### 문자열
* 문자열은 기본 타입이 아님
* String 클래스로 문자열 표현

### 변수
* 프로그램 실행 중에 값을 임시 저장하기 위한 공간

### 리터럴
* 프로그램에서 직접 표현한 값
* 정수, 실수, 문자, 논리, 문자열 리터럴 있음
* **실수 리터럴** 소수점 형태나 지수 형태로 표현한 실수
   * 실수리터럴은 double 사용
* **문자 리터럴** 단일 인용부호로 문자 표현
   * 특수문자 리터럴은 백슬레시(\)로 시작
* 논리 값 표시
   * true 또는 flase

### 상수
**상수 선언**
* final 키워드 사용
* 선언 시 조건값 지정
* 실행 중 값 변경 불가(다른 값을 추가 불가)  
### var 키워드
* JAVA 10부터 도입
* 기존의 변수 선업 방식 : 변수의 타입 반드시 지정
* var 키워드
  * 타입을 생략하고 변수 선언 가능
  * 캄파일러가 추론하여 변수 타입 결정
  * 변수 선언 시 초깃값이 주어지지 않으면 컴파일 오류
  * var는 지역 변수 선언에만 한정  
## 3월 29일 강의

### System.in
* 키보드와 연결된 자바의 표준 입력 스트림
* 입력되는 키를 바이트로 리턴하는 저수준 스트림
* System.in을 직접 사용하면 바이트를 문자나 숫자로 변환하는 많은 어려움 있음

### Scanner
* 읽은 바이트를 문자, 정수, 실수, 문자열 등 다양한 타입으로 변환하여 리턴
* 개발자가 원하는 타입 값으로 쉽게 읽을 수 있음

### 식과 연산자
* 연산
  * 주어진 식을 계산하여 결과를 얻어내는 과정
* 조건 연산
   * 3개의 피연산자로 구성된 상항 연산자
* 비트 연산
  * 비트 논리 연산
    * 비트끼리 AND, OR, XOR, NOT 연산
    * 비트를 오른쪽이나 왼쪽으로 이동

### 조건문
- 단순if문
  - if의 괄화 안에 조건식(논리형 변수나 논리 연산)
    - 실행문장이 단일 문장인 경우 둘러싸는 () 생략 가능
- if-else문
  - 조건식이 true면 실행문장1, false면 실행문장2 실행
- 다중 if-else문
  - 조건문이 너무 많은 경우, switch문 사용 
- switch문
  - switch문은 식과 case문의 값과 비교
    - care의 비교 값과 일치하면 해당 case의 실행문장 수행
    - case의 비교 값과 일치하는 것이 없으면 default문 실행
- case문의 값
  - 문자, 정수, 문자열 리터럴(JDK 1.7부터)만 허용
  - 실수 리터럴은 허용되지 않음

### 반복문

- for문
- while문
-continue문
  - 반복문을 빠져나가지 않으면서 즉시 다음 반복으로 넘어가고자할 떄 사용
- break문 
  - 반복문 하나를 즉시 벗어날 떄 사용
- 자바 배열
  - 배열 
   - 인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조
     - 배열을 이용하면 한 번에 많은 메모리 공간 선언 가능
   - 배열은 같은 타입의 데이터들이 순차적으로 저장되는 공간
   - 배열 인덱스
     - 0에서부터 시작
   - 배열 선언 
   - 배열 생성
   - 배열 초기화
- 배열과 for-each문
  - for문을 변형한 for-each문은 배열이나 나열의 크기만큼 루프를 돌면서 각 원소를 순차적으로 접근하는데 매우 유용하다
- 2차원 배열
  - 2차원 배열의 선언과 생성
    - 1차원 배열과 마찬가지로 2차원 배열에서도 레퍼런스 변수 선언 후 배열을 생성한다.
## 4월 5일 강의
### 반복문
- 예외
  - 실행 중 오동작이나 결과에 악영향을 미치는 예상치 못한 상황 발생
- 실행 중 예외가 발생하면
  - 자바 플랫폼은 응용프로그램이 예외를 처리하도록 호출
- 예외 발생 경우
  - 정수를 0으로 나누는 경우
  - 배열의 크기보다 큰 인덱스로 배열의 원소를 접근 하는 경우
  - 정수를 읽는 코드가 실행되고 있을 때 사용자가 문자를 입력한 경우
- 예외 처리
  - 발생한 예외에 대해 개발자가 작성한 프로그램 코드에ㅓ 대응하는 것
  - try-catch-filally문 사용
### 객체
- 캡슐화 : 객체를 캡슐로 싸서 ㅐ부를 볼 수 없게 하는 것
  - 객체의 가장 본질적인 특징
- 자바의 캡슐화 
  - 클래스 : 객체 모양을 선언한 틀(캡슐화하는 틀)
  - 객체 : 생성된 실체(instance)
    - 클래스 내에 메소드와 필드 구현
- 상속
  - 상위 개체의 속성이 하위 개체에 물려짐
  - 하위 개체가 상위 개체의 속성을 모두 가지는 관계
- 자바 상속
    - 상위 클래스의 멤버를 하위 클래스가 물려받음
      - 상위 클래스 : 수퍼 클래스
      - 하위 클래스 : 서브 클래스, 수퍼 클래스 코드의 재사용,  새로운 특성 추가 가능
- 다형성 
  - 같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현되는 것
  - 다형성 사례
    - 메소드 오버로딩 : 한 클래스 내에서 같은 이름이지만 다르게 작동하는 여러 메소드
    - 메소드 오버라이딩 : 슈퍼 클래스의 메소드를 동일한 이름으로 서브 클래스마다 다르게 구현
### 객체 지향 언어의 목적
- 소프트웨어의 생산성 향상
  - 컴퓨터 산업 발전에 따라 소프트 우어의 생명 주기 단축
   - 소프트웨어를 빠른 속도로 생산할 필요성 중대
  - 객체 지향 언어
    - 상속, 다양성, 객체, 캡슐화 등 소츠트웨어 재사용을 위한 여러 장치 내장
    - 소프트웨어 재사용과 부분 수정 빠름
    - 소프트웨어를 다시 만드는 부담 대폭 줄임
    - 소프트 웨어 생산성 향상
### 절차 지향 프로그래밍과 객체 지향 프로그래밍
- 절차 지향 프로그래밍
  - 작업 순서를 표현하는 컴퓨터 명령 집합
  - 함수들의 집합으로 프로그램 작성
- 객체 지향 프로그래밍
  - 컴퓨터가 수행하는 작업을 객체들간의 상호 작용으로 표현
  - 클래스 혹은 객체들의 집합으로 프로그램 작성 
### 클래스와 객체
- 클래스
  - 객체의 속성과 행위 선언
  - 객체의 설계도 혹은 틀
- 객체 
  - 클래스의 틀로 찍어낸 실체
    - 프로그램 실행 중에 생성되는 실체
    - 메모리 공간을 갖는 구체적인 실체
    - 인스턴스라고도 부름
- 사례 
  - 클래스: 소나타 자동차 - 객체: 출고된 실제 소나타 100대
  - 클래스: 벽시계  - 객체: 우리집 벽에 걸린 벽시계들
  - 클래스: 책상  - 객체: 우리가 사용중인 실제 책상
- 클래스
  - class 키워드로 선언
  - 멤버 : 클래스 구성요소
### 생성자
- 생성자 : 객체가 생성될 떄 초기화를 위해 실행 되는 메소드
- 클래스에 생성자가 선언되어 있는 경우
  - 컴파일러는 기본 생성자를 자동 생성해 주지 않는다.
### this 래퍼런스
- this 
  - 객체 자신에 대한 래퍼런스
    - 컴파일러에 의해 자동 관리, 개발자는 사용하기만 하면 됨
    - this 멤버 형태로 멤버를 접근할 떄 사용
- this()
  - 같은 클래스의 다른 생성자 호출
  - 생성자 내에서만 사용 가능
  -  생성자 코드의 제일 처음에 있어야 함
### 객체 배열
- 자바의 객체 배열
  - 객체에 대한 래퍼런스 배열
- 자바의 객체 배열 만들기 3단계
  - 배열 래퍼런스 변수 선언
  - 래퍼런스 배열 생성
  - 객체 생성
### 메소드
- 메소드
  - 메소드는 C/C++의 함수와 동일
  - 자바의 모든 매소드는 클래스안에 있어야 한다.
- 메소드 오버로딩
  - 오버로딩 
    - 한 클래스 내에서 두 개 이상의 이름이 같은 메소드 작성
      - 메소드 이름이 동일하여야 함
      - 메게 변수의 개수가 서로 다르거나, 타입이 서로 달라야 함
- 객체 소멸
  - new에 의해 할당 받은 객체와 배열 메모리를 자바 가상 기계로 되돌려 주는 행위
  - 소멸된 객체 고안은 가용 메모리에 포함
- 자바에서 사용자 임의로 객체 소멸안됨
  - 자바는 객체 소멸 연산자 없음
    - 객체 생성 연산자 : new
- 객체 소멸은 자바 가상 기계의 고유한 역할
- 자바 개발자에게는 매우 다행스러운 기능
  - C/C++에서는 할당 받은 객체를 개발자가 프로그램 내에서 삭제해야 함
  - C/C++의 프로그램 작성을 어렵게 만드는 요인
  - 자바에서는 사용하지 않는 객체나 배열을 돌려주는 코딩 책임으로부터 개발자 해방
### 가비지
  - 가비지 
    - 가리키는 래퍼런스가 하나도 없는 객체
      - 더 이상 접근할 수 없어 사용할 수 없게 된 메모리
  - 가비지 컬렉션
    - 자바 가상 기계의 가비지 컬렉터가 자동으로 가비지 수집, 반환
    - 자바 가상 기계가 가비지 자동 회수
      - 가용 메모리 공간이 일정 이하로 부족해질 떄
      - 가비지를 수거하여 가용 메모리 공간으로 확보
    - 가비지 컬렉터에 의해 자동 수행

  - 강제 가비지 컬렉션 강제 수행
    - system 또는 Runtime 객체의 gc() 메소드를 호출하여, 자바 플랫폼에 가비지 컬렉션을 요청할 수 있다
### 자바의 패키지 개념
  - 패키지
    - 상호 관련 있는 클래스 파일을 저장하여 관리하는 디렉터리
### 접근 지정자
  - 자바의 접근 지정자
    - 4가지
      - private, protected, public, 접근 지정자 생략(디폴트 접근 지정)
  - 접근 지정자의 목적
    - 클래스나 일부 멤버를 공개하여 다른 클래스에서 접근하도록 허용
    - 객체 지향 언어의 캡슐화 정책은 멤버를 보호하는 것
  - 클래스 접근지정
    - 다른 클래스에서 사용하도록 허용할 지 지정
    - public 클래스 
      - 다른 모든 클래스에게 접근 허용
    - 디폴트 클래스(접근지정자 생략)
      - 같은 패키지의 클래스에만 접근 허용
### static 멤버 사용
- 클래스 이름으로 접근 가능
- 객체의 멤버로 접근 가능
- non-static 멤버는 클래스 이름으로 접근 안 됨
## 4월 12일 강의
### static 메소드의 제약 조건1
- static 메소드는 오직 static 멤버만 접근 가능
  - 객체가 생성되지 않은 상황에서도 static 메소드는 실행될 수 있기 때문에, non-static 멤버 사용 가능
  - non-static 메소드는 static 멤버 사용 가능
### static 메도스의 제약 조건 2
- static 메소드는 this 사용 불가
  - static 메소드는 객체 없이도 사용 가능하므로, this 래퍼런스를 사용 할 수 없음
### final 클래스와 메소드
- final 클래스 - 더 이상 클래스 상속 불가능
- final 메소드 - 더 이상 오버라이딩 불가능
- final 필드, 상수 선언
  - 상수를 선언할 때 사용
- 상수 필드는 선언 시에 초기 값을 지정하여야 한다
- 상수 필드는 실행 중에 값을 변경할 수 없다
### 클래스 상속과 객체
- 상속 선언
  - extends 키워드로 선언
    - 부모 클래스를 물려받아 확장한다는 의미
  - 부모 클래스 -> 슈퍼 클래스
  - 자식 클래스 -> 서브 클래스
  ### 슈퍼 클래스 객체의 모양
  - 슈퍼 클래스 객체와 서브 클래스의 객체는 별개
  - 서브 클래스 객체는 슈퍼 클래스 멤버 포함
  ### 슈퍼 클래스의 멤버에 대한 서브 클래스의 접근
  - 슈퍼 클래스의 private 멤버
   - 서브 클래스에서 접근할 수 없음
  - 슈퍼 클래스의 디폴트 멤버
    - 서브 클래스가 동일한 패키지에 있을 떄 사용 가능
  ### propected 멤버
  - propected 멤버에 대한 접근 
    - 같은 패키지의 모든 클래스에게 허용
    - 상속되는 서브 클래스에게 허용
  ### 슈퍼 클래스와 서브 클래스
  - 각각 여러 개의 생성자 작성 가능
  - 서브 클래스의 객체가 생성될 떄 
    - 슈퍼 클래스 생성자 1개와 서브 클래스 생성자 1개가 실행
  ### 업캐스팅과 instanceof 연산자
  - 캐스팅이란 타입 변환을 말한다. 자바에서 클래스에 대한 캐스팅은 업캐스팅과 다운 캐스팅으로 나뉜다
  - 업캐스팅이란 서브 클래스는 슈퍼 클래스의 속성을 상속 받는다. 그러므로 서브 클래스는 슈퍼 클래스로 취급될 수 있다
  - 다운 캐스팅이란 업캐스팅 된 것을 다시 돌리는 것
  - instanceof 연산자 사용
    - instance 연산자
      - 래퍼런스가 가리키는 객체의 타입 식별
  ### 추상 클래스
  - 추상 메소드
    - abstract로 선언된 메소드, 메소드의 코는 없고 원형만 선언
  - 추상 클래스
    - 추상 메소드를 가지며, abstract로 선언된 클래스
    - 추상 메소드 없이 abstract로 선언한 클래스
## 4월 19일 강의
### 추상 클래스
- 추상 클래스는 온전한 클래스가 아니기 떄문에 인스턴스를 생성할 수 없음
- 추상 클래스 상속
  - 추상 클래스를 상속 받으면 추상 클래스가 됨
  - 서브 클래스도 abstract로 선언해야함
- 추상 클래스 구현
  - 서브 클래스에서 슈퍼 클래스의 추상 메소드 구현(오버라이딩)
  - 추상 클래스를 구현한 서브 클래스는 추상 클래스 아님
### 추상 클래스의 목적
- 추상 클래스의 목적
  - 상속을 위한 슈퍼 클래스로 활용하는 것
  - 서브 클래스에서 추상 메소드 구현
  - 다형성 실현
### 자바의 인터페이스
- 자바의 인터페이스
  - 클래스가 구현해야 할 메소드들이 선언되는 추상형
  - 인터페이스 선언
    - interface 키워드로 선언
- 자바 인터페이스에 대한 변화
  - Java 7까지
    - 인터페이스는 상수와 추상 메소드로만 구성
  - Java 8부터
    - 상수와 추상메소드 포함
    - default 메소드 포함
    - private 메소드 포함
    - static 메소드 포함
### 자바 인터페이스 특징
- 인터페이스의 객체 생성 불가
### 인터페이스 상속
- 인터페이스 간에 상속 가능
  - 인터페이스를 상속하며 확장된 인터페이스 작성 가능
  - extends 키워드로 상속 선언
- 인터페이스 다중 상속 허용
### 패키지란
-------
- 패키지
  - 서로 관련된 클래스와 인터페이스를 컴파일한 클래스 파일들을 묶어 놓은 디렉터리
  - 하나의 응용프로그램은 한 개 이상의 패키지로 작성
  - 패키지는 jar 파일로 압축할 수 있음
- 모듈
  - 여러패키지와 이미지 등의 자원을 모아 놓은 컨테이너
  - 하나의 모둘을 하나의 .jmod 파일에 저장
- 모듈화의 목적
  - Java 9부터 자바 API를 여러 모듈로 분할
  - 응용프로그램이 실행할 때 꼭 필요한 모듈들로만 실행 환경 구축
- 모듈의 현실
  - Java 9부터 전면적으로 도입
  - 복잡한 개념
  - 큰 자바 응용프로그램에는 개발, 유지보수 등에 적합
  - 현실적으로 모듈로 나누어 자바 프로그램을 작성할 필요 없음
- 다른 패키지에 작성된 클래스 사용
  - import를 이용하지 않는 경우
- 필요한 클래스만 import
  - 소스 시작 부분에 클래스의 경로명 import
  - import 패키지 ㅡㄹ래스
  - 소스에는 클래스 명만 제시하면 됨
- 패키지 전체를 import
  - 소스 시작 부분에 패키지의 경로면 import
- 패키지 만들기
  - 클래스 파일이 저장되는 위치는 ?
    - 클래스나 인터페이스가 컴파일되면 클래스 파일 생성
- 스트링 리터럴과 new String()
  - 스트링 리터럴
    - 자바 가상 기계 내부에서 리터럴 테이블에 저장되고 관리됨
    - 응용프로그램에서 공유됨
  - 스트링 객체는 수정 불가능
- Math 클래스
  - 기본 산술 연산 메소드를 저장
## 5월 3일 강의
  ### 컬렉션의 특징
  - 컬렉션은 제네릭 기법을 구현
    - 제네릭
      - 특정 타입만 다루지 않고, 여러 종류의 타입으로 변신할 수 있도록 클래스나 메소드를 일반화 시키는 기법
      - 클래스나 인터페이스 이름에 <E> <K> <V>  등 타입매게변수 포함
    - 제네릭 컬렉션 사례 : 벡터 <E>
      - <E>에서 E에 구체적인 타입을 주어 구체적인 타입만 다루는 벡터로 활용
      - 정수만 다루는 컬렉션 벡터 <Integer>
      - 문자열만 다루는 걸렉션 벡터 <String>
- 제네릭 
  - 클래스나 메소드를 형판에서 찍어내듯이 생산할 수 있도록 일반화된 형판을 만드는 기법
  - 모든 종류의 데이터 타입을 다룰 수 있도록 일반화된 타입 매개 변수로 클래스(인터페이스)나 메소드를 작성하는 기법
  - C++의 템플릿과 동일
### Vector<E>
- 특성
  - <E>에 사용할 요소의 특정 타입으로 구체화
  - 배열을 가변 크기로 다룰 수 있게 하는 컨테이너
    - 배열의 길이 제한 극복
    - 요소의 개수가 넘치면 자동으로 길이 조절
  - 요소, 객체들을 삽입, 삭제, 검색하는 컨테이너
    - 삽입, 삭제에 따라 자동으로 요소의 위치 조정
  - Vector에 삽입 가능한 것
    - 객체,null
    - 기본 타입의 값은 Wrapper 객체로 만들어 저장
  - Vector에 객체 삽입
    - 벡터의 맨 뒤, 중간에 객체 삽입 가능
  - Vector에서 객체 삭제
    - 임의의 위치에 있는 객체 삭제 가능 
## 5월 24일 강의
### 이벤트 기반 프로그래밍
  - 이벤트의 발생에 의해 프로그램 흐름이 결정되는 방식
    - 이벤트가 발생하면 이벤트를 처리하는 루틴 실행
    - 실행될 코드는 이벤트의 발생에 의해 전적으로 결정
  - 반대되는 개념 배치 실행
    - 프로그램의 개발자가 프로그램의 흐름을 결정하는 방식
  - 이벤트 종류
    - 사용자의 입력, 마우스 드래그, 마우스 클릭, 키보드 누름 등
    - 센서로부터의 입력, 네트워크로부터 데이터 송수신
    - 다른 응용프로그램이나 다른 스레드로부터의 메시지
  - 이벤트 기반 응용프로그램의 구조
    - 각 이벤트마다 처리하는 리스너 코드 보유
  - GUI 응용프로그램은 이벤트 기반 프로그래밍으로 작성됨
### 자바 스윙 프로그램에서 이벤트 처리 과정
- 이벤트가 처리 되는 과정
  - 이벤트 발생
  - 이벤트 객체 생성
  - 응용프로그램에 작성된 이벤트 리스너 찾기
  - 이벤트 리스너 실행
    - 리스너에 이벤트 객체 전달
    - 리스너 코드 실행
### 이벤트 객체
- 이벤트 객체
  - 발생한 이벤트에 관한 정보를 가진 객체
  - 이벤트리스너에 전달함
    - 이벤트 리스너 코드가 발생한 이벤트에 대한 상황을 처리할 수 있게 함
- 이벤트 객체가 포함하는 정보
  - 이벤트 종류와 이벤트 소스
  - 이벤특 발생한 화면 좌표 및 컴포넌트 내 좌표
  - 이벤트가 발생한 버튼이나 메뉴 아이템의 문자열
  - 클릭된 마우스 버튼 번호 및 마우스의 클릭 횟수
  - 키의코드 값과 문자 값
  - 페크박스 라디오버튼 등과 같은 컴포넌트에 이벤트가 발생하였다면 체크 상태
- 이벤트 소스를 알아 내는 메소드
  - Object getSource()
    - 발생한 이벤트의 소스 컴포넌트 리턴
    - object 타입으로 리턴하므로 캐스팅하여 사용
    - 또는 이벤트 객체에 대해 사용
### 리스너 인터페이스
- 이벤트 리스너
  - 이벤트를 처리하는 자바 프로그램 코드, 클래스로 작성
- 받는 다양한 리스너 인터페이스 제공
- 사용자의 이벤트 리스너 작성
  - 자바의 리스터 인터페이스 를 상속받아 구현
  - 리스너 인터페이스의 모든 추상 메소드 구현
### 이벤트 리스너 작성 과정 사례
1. 이벤트와 이베트 리스너 선택
  - 버튼 클릭을 처리하고자 하는 경우
    - 이벤트 : Action 이벤트, 이벤트 리스너, 
2. 이벤트 리스너 클래스 작성 ActionListener 인터페이스 구현
3. 이벤트 리스너 등록
  - 이벤트를 받아 처리하고자 하는 컴포넌트에 이벤트 리스너 등록
### 이벤트 리스너 작성 방법
- 3가지 방법
  - 독립 클래스로 작성
    - 이벤트 리스너를 완전한 클래스로 작성
    - 이벤트 리스너를 여러곳에서 상ㅇ할 떄 적합
  - 내부 클래스로 작성
    - 클래스안에 멤버처럼 클래스 작성
    - 이벤트 리스너를 특정 클래스에서만 사영할 떄 적합
  - 익명 클래스로 작성
    - 클래스의 이름 없이 간단히 리스너 작성
### 익명 클래스로 이벤트 리스너 작성
- 익명 클래스 : 이름 없는 클래스
  - (클래스 선언 + 인스턴스 생성)을 한번에 달성
  - 간단한 리스너의 경우 익명 클래스 사용 추천
### 어댑터 클래스
- 이벤트 리스너 구현에 따른 부담
  - 리스너의 추상 메소드를 모두 구현해야 하는 부담
  - 예) 마우스 리스너에서 마우스가 눌려지는 경우만 처리하고자 하는 예
### Key 이벤트와 포커스 
- 키 입력 시, 다음 세 경우 각각 key 이벤트 발생
  - 키를 누를 순간 
  - 누른 키를 떼는 순간
  - 누른 키를 떼는 순간(Unicode 키의 경우에만)
- 키 이벤트를 받을 수 있는 조건
  - 모든 컴포넌트
  - 현재 포커스를 가진 컴포넌트가 키 이밴트 독점
- 포커스
  - 컴포넌트나 응용프로그램이 키 이벤트를 독점하는 방면
### KeyListener
- 응용프로그램에서 keyListener룰 상속받아 키 리스너 구현
### 유니고트 키
- 유니코드 키의 특징
  - 국제 산업 표준
  - 전 세계의 문자를 컴퓨터에서 일관되게 표현하기 위한 코드 체계
  - 문자들에 대해서만 키 코드 값 정의
  - 문자가 아닌 키 경우에는 표준화된 키 코드 값 없음
- 유니코드 키가 입력되는 경우
  - keyPressed(), keyTyped(), keyReleased()가 순서대로 호출
  - 유니코드 키가 아닌 경우
    - keyPressed(), keyReleased만 호출 됨
### 가상 키와 입력된 키 판별
- keyEvent 객체
  - 입력된 키 정보를 가진 이벤트 객체
  - keyEvent 객체의 메소드로 입력된 키 판별
### 가상 키
- 가상 키는 keyEvent 클래스에 상수로 선언