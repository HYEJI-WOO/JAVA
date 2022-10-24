package exam03;

public abstract class Building implements Liftable, Repareable, Generatable{
	
	public void buildComplete() {
		System.out.println("건설완료");
	}
}

class DummyA{}
class DummyB{}

interface Liftable{
	void lift();
}
interface Repareable{
	void repare();
}
interface Generatable{
	void generate();
}
