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
