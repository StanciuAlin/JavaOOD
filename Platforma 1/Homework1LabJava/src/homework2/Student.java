/**
 * 
 */
package homework2;

/**
 * @author Alin Stanciu
 *
 */
public class Student {
	private String name;
	private String surname;
	private int group;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the group
	 */
	public int getGroup() {
		return group;
	}
	/**
	 * @param group the group to set
	 */
	public void setGroup(int group) {
		this.group = group;
	}
	/**
	 * @param name
	 * @param surname
	 * @param group
	 */
	public Student(String name, String surname, int group) {
		super();
		this.name = name;
		this.surname = surname;
		this.group = group;
	}
}
