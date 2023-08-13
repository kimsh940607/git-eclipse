package hello.core.singleton;

/**
 * @Author sh.kim
 * @Date 2023. 8. 14.
 * Singleton TEST Service
 */ 
public class SingletonService {
	/* 클레스 레벨에서 SingletonService는 딱 1개만 호출 된다. static 영역 */
	private static final SingletonService instance = new SingletonService();
	
	public static SingletonService getInstance() {
		return instance;
	}

	private SingletonService() {}
	
	public static void main(String[] args) {
		
	}
}
