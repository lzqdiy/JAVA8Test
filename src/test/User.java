package test;

public class User {
	private String id;
	private int age;
	
	public User() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}
	

	public User(int age) {
		super();
		this.age = age;
	}


	public User(String id, int age) {
		super();
		this.id = id;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + "]";
	}


}
