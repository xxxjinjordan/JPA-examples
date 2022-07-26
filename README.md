# JPA-examples
To see how to use JPA

# @Entity
* 해당 어노테이션이 붙은 Class는 JPA에 의해 관리된다.
* 객체와 테이블을 매핑할 때 해당 Class에 필수적이다.
* 기본 생성자가 필수적이다.
  * @NoArgsConstructor
 * final Class (X)
 * enum, interface, inner Class (X)
 * 저장할 필드에는 final을 사용하지 않는다.
 
 ---
# @Table
* 엔티티와 매핑할 테이블을 지정한다.

ex)
```java
@Entity
@Table(name = "Sample")
public class Member{
...(생략)
```

* 위와 같은 코드에서는 insert into Sample로 쿼리가 나간다.

|속성|기능|기본값|
|------|---|---|
|name|매핑할 테이블 이름|엔티티 이름을 사용|
|catalog|데이터베이스 catalog 매핑|
|schema|데이터베이스 schema 매핑|
|uniqueConstraints|DDL 생성 시 unique 제약 조건 생성||
