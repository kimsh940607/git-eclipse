### Spring Study Project
[2023-08-12]
인프런 강의
*[인프런 강의 스프링 핵심 원리 기본편]*
	- 인터페이스 DIP 위반 정책
		- DI 관심사의 분리(Config)
	- IoC, DI, 컨테이너
		- 프레임워크 vs 라이브러리 
			-   내가 작성한 코드를 제어하고, 대신 실행하면 그것은 프레임워크가 맞다. (JUnit)
			- 반면에 내가 작성한 코드가 직접 제어의 흐름을 담당한다면 그것은 프레임워크가 아니라 라이브러리다
	- DI
		- AppConfig 처럼 객체를 생성하고 관리하면서 의존관계를 연결해 주는 것
	
	-Spring 전환
		- AppConfig -> @Configuration
		- @Bean 추가, ApplicationContext
		- AppConfig가 annotation(@Configuration, @Bean) 기반으로 설정 되어 있기 때문에 AnnotaionConfiguration으로 지정
		- @Bean의 경우 기본적으로 Method 이름으로 Bean 이름을 설정한다.
	
	Spring Container init 
		- 지정한 Config 파일 기준으로 해당하는 Method를 Bean 객체로 만든다.
		
	Spring Bean 조회 (스프링 빈 조회 - 기본, 스프링 빈 조회 - 동일한 타입 둘 이상, 스프링 빈 조회 - 상속 관계(재수강))
		- ApplicationContext.getBean("빈 이름", 빈 타입);
		
	BeanFactory
		- 스프링 컨테이션의 최상위 인터페이스
		- BeanFactory vs ApplicationContext
			- ApplicationContext의 경우 BeanFactory의 모든 기능을 상속 받고 있으며 부가적으로 MessageSource, 환경 설정 등 많은 부분은 상속 받고 있음.
			
