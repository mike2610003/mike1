package mike.study.entity;

public class User {
	
	private Integer id;
	private String name;
	private Integer old;
	
	
	public User() {
		super();
	}


	public User(Integer id, String name, Integer old) {
		super();
		this.id = id;
		this.name = name;
		this.old = old;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOld() {
		return old;
	}
	public void setOld(Integer old) {
		this.old = old;
	}
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", old=" + old + "]";
	}
	
	
}
