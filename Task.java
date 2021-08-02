
public class Task {
public String id;
public String name;
public String desc;
	
public Task (String id, String name, String desc) {
	if (id == null || id.length()>10) {
		throw new IllegalArgumentException("Invalid ID")}};
public Task (String id, String name, String desc) {
	if (name == null || name.length()>20) {
		throw new IllegalArgumentException("Invalid Name")}};
public Task (String id, String name, String desc) {
	if (desc == null || desc.length()>50) {
		throw new IllegalArgumentException("Invalid Description")}}
public Object getname() {
	// TODO Auto-generated method stub
	return name;
}
public Object getdesc() {
	// TODO Auto-generated method stub
	return desc;
};
}
