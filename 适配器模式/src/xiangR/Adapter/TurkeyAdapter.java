package xiangR.Adapter;

public class TurkeyAdapter implements Duck{

	//我们使用一个 turkey 的实例去  实例化一个 Duck
	
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		for(int i = 0; i < 5; i ++) {
			turkey.fly();
		}
	}

	
}
