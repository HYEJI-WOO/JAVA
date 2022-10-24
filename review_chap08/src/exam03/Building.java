package exam03;

public abstract class Building implements Liftable, Repareable, Generatable{
	
	public void buildComplete() {
		System.out.println("�Ǽ��Ϸ�");
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
