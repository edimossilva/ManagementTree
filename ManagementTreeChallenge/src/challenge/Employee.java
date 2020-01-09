package challenge;

public class Employee {
	public Employee(int id, int managerId, String name) {
		this.id = id;
		this.managerId = managerId;
		this.name = name;
	}

	private int id, managerId;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return getName();
	}
	
}
