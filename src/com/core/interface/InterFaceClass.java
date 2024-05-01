interface a3{}
interface a2{}

public interface InterFaceClass extends a3,a2 {
void show();
void show2();

}


class B implements InterFaceClass
{
void methode()
{
	}
	@Override
	public void show() {
		InterFaceClass a=new B();
	a.show2();
		
	}
	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
	}
	}