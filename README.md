# project-web-site
🥦 market brokurly 🥦
마켓 컬리를 모티브로 한 온라인 웹사이트 개발

## 🥦 소개
### 프로젝트 진행 기간
> 2021.08.9 ~ 2021.09.07

### 🥦 구현한 기능
> * 회원 가입, 회원 로그인 및 로그아웃, 회원 정보 찾기 및 비밀번호 변경
> * 회원 등급별 차등 혜택 지정
> * 전체 상품 조회, 항목별 상품 리스트 조회, 상품 세부 정보 조회, 상품별 할인율
> * 회원 마이페이지 (주문 내역, 주문 내역 상세 조회, 기간별 조회, 적립 포인트 및 만료 예정 포인트 조회, 쿠폰 조회 및 등록, 회원 정보 수정 및 탈퇴)
> * 장바구니
> * 상품결제

### 🥦 사용한 프로그램
> * [Java SE 11](https://www.oracle.com/kr/java/technologies/javase-downloads.html "java SE 11 link")
> * [Eclipse](https://www.eclipse.org/downloads/ "eclipse IDE link")
> * [Oracle XE](https://www.oracle.com/kr/database/technologies/xe-downloads.html "oracle XE link")
> * [Oracle SQL Developer 20.4.1](https://www.oracle.com/tools/downloads/sqldev-downloads.html "oracle sql developer link")
> * [Spring Framwork](https://spring.io/projects/spring-framework "spring framwork") <br>
>   [Spring Legacy Project] - Spring MVC Project <br>
>   [Maven repository] - Lombok(1.18.20 ver) <br>
>                      - Hikari Connection Pool(4.0.3 ver) <br>
>                      - MyBatis(3.4.6 ver) <br>
>                      - Logging(slf4j, log4j(1.2.17 ver)) <br>
>                      - jstl(1.2 ver) <br>
>                      - junit(4.12 ver) <br>
> * 외부 API : 카카오 주소 API, KG이니시스 결제 API

### 🥦 diagram
> * usecase diagram
> ![Use case diagram (1)](https://user-images.githubusercontent.com/80576569/129040363-6b5c8bec-a791-4598-b85b-9e5223446256.png)
> * E-R diagram
> ![그림10](https://user-images.githubusercontent.com/76691954/133967695-0d84473a-3fa0-4f20-9978-d4c8ceb9bb61.png)

### 🥦 flow chart
> <br>  ![그림11](https://user-images.githubusercontent.com/76691954/133968081-27735762-a62b-4c2a-a6ee-d2c11d343921.jpg)

## 🥦 화면 동작
#### 1. 회원가입
> ![2021-09-20 (1)](https://user-images.githubusercontent.com/76691954/133973090-13904319-c024-4221-b3dc-4f7055a96c1d.png)
> ----------------------------
> ![2021-09-20 (2)](https://user-images.githubusercontent.com/76691954/133973092-8204b3fa-5324-4b36-b3fe-812da70961fe.png)
> ----------------------------
> ![2021-09-20 (3)](https://user-images.githubusercontent.com/76691954/133973094-8d06ee2b-60cc-4378-af53-707f0ddbf4e6.png)
> ----------------------------
> ![2021-09-20 (4)](https://user-images.githubusercontent.com/76691954/133973095-34487b37-0998-4c14-b023-e6d5b70226db.png)
#### 2. 회원가입 완료
> ![2021-09-20 (5)](https://user-images.githubusercontent.com/76691954/133973096-88328fe7-a62f-48fa-b968-a1aa609509f3.png)
#### 3. 로그인
> ![2021-09-20 (6)](https://user-images.githubusercontent.com/76691954/133973098-867fc81f-20fa-46bf-bbaa-39bcbbac03f0.png)
#### 4. 상품 검색
> ![2021-09-20 (7)](https://user-images.githubusercontent.com/76691954/133973100-666f7df2-563d-4cb4-b47d-7cedeb494c62.png)
#### 5. 메인 페이지
> ![2021-09-20 (8)](https://user-images.githubusercontent.com/76691954/133973102-5b1b6079-dfd0-42d3-8fd2-2072c5be2347.png)
> ----------------
> ![2021-09-20 (9)](https://user-images.githubusercontent.com/76691954/133973104-2cd3998c-f58e-4897-84ce-12fd0a1935b4.png)
#### 6. 카테고리
> ![2021-09-20 (10)](https://user-images.githubusercontent.com/76691954/133973105-37b96ecf-6bde-4cd9-b546-42281e00e8ec.png) 
> <br><br><br>
> -------------------
> ![2021-09-20 (11)](https://user-images.githubusercontent.com/76691954/133973107-9ccd1fd2-a970-4d95-8ef4-2e94d5e5831b.png) 
> <br><br>
> --------------------
> ![2021-09-20 (12)](https://user-images.githubusercontent.com/76691954/133973113-c57f92f4-b670-4143-a749-5e00b62b3d78.png)
#### 7. 상품 목록 페이지
> ![2021-09-20 (13)](https://user-images.githubusercontent.com/76691954/133973118-2b4922a1-693f-4ec6-b433-dc1a7068b340.png)
> ---------------------
> ![2021-09-20 (14)](https://user-images.githubusercontent.com/76691954/133973120-2741c86c-1004-4099-9bf3-bafcdbcafa1e.png)
#### 8. 상세페이지
> ![2021-09-20 (15)](https://user-images.githubusercontent.com/76691954/133973122-c034f7e0-33b0-4326-ad96-8f78ebec4153.png)
> ---------------------
> ![2021-09-20 (16)](https://user-images.githubusercontent.com/76691954/133973123-60ddc45e-ac79-4757-977d-fccfe40a34e1.png)
> ---------------------
> ![2021-09-20 (27)](https://user-images.githubusercontent.com/76691954/133973089-a85d385f-3843-4388-a1e2-f304eeb0282f.png)
> ----------------------
> ![2021-09-20 (17)](https://user-images.githubusercontent.com/76691954/133973129-3e891703-e466-4a2d-af1b-adfe7c479be7.png)
#### 9. 장바구니
> ![2021-09-20 (18)](https://user-images.githubusercontent.com/76691954/133973132-f506f481-e4a5-45ac-a95a-4b4951c50d19.png)
#### 10. 마이페이지
> ![2021-09-20 (19)](https://user-images.githubusercontent.com/76691954/133973134-20da2989-b5c4-497e-af24-d0269d83f318.png)
> ----------------------
> ![2021-09-20 (20)](https://user-images.githubusercontent.com/76691954/133973069-53d68cec-60cc-4f45-9c81-1c95f1461123.png)
> -----------------------
> ![2021-09-20 (21)](https://user-images.githubusercontent.com/76691954/133973077-8d351543-9082-4b58-81da-a7eb5a64c50d.png)
> ------------------------
> ![2021-09-20 (22)](https://user-images.githubusercontent.com/76691954/133973079-5ff7757b-0ed8-4ed1-baf5-b91807c3a4a6.png)
> -----------------------
> ![2021-09-20 (23)](https://user-images.githubusercontent.com/76691954/133973081-7295f473-809d-445c-b95a-10089faad1a8.png)
#### 11. 게시판
> ![2021-09-20 (24)](https://user-images.githubusercontent.com/76691954/133973082-3c7ea4be-49a8-4633-8412-9b2b3d0dfc6a.png)
> ------------------------
> ![2021-09-20 (25)](https://user-images.githubusercontent.com/76691954/133973084-06206b40-8f7f-4080-a9c5-cd2790419a12.png)
