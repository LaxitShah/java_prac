package doubts;

public class AdminDao {

	public void getData(AdminBean ab) {
		System.out.print("Id:" + ab.getId());
		System.out.print(" Name:" + ab.getName());
		System.out.println(" Email:" + ab.getEmail());
		System.out.println("---------------------------");

	}

}
