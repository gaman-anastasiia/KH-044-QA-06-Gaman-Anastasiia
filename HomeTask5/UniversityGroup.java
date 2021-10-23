import java.util.ArrayList;
public class UniversityGroup {

    private String groupName;
    private int startYear;
    private int endYear;
    private ArrayList<String> studentList = new ArrayList<String>();

    public String getGroupName() {
        return groupName;
        }
        public int getStartYear() {
            return startYear;
        }

        public int getEndYear() {
            return endYear;
        }

        public ArrayList<String> getStudentList() {
            return studentList;
        }

        public UniversityGroup(String groupName, int startYear) {
            this.groupName = groupName;
            this.startYear = startYear;
            this.endYear = startYear + 5;
        }

        public UniversityGroup(String groupName, int startYear, ArrayList<String> studentList) {
            this.groupName = groupName;
            this.startYear = startYear;
            this.studentList = studentList;
            this.endYear = startYear + 5;
        }

        public void addStudent(String student) {
            studentList.add(student);
        }

        public boolean removeStudent(String student) {
            return studentList.remove(student); }

            public void getGroupDescription() {
        System.out.println("groupName="+getGroupName());
        System.out.println("startYear="+getStartYear());
        System.out.println("endYear="+getEndYear());
        System.out.println(("studenList="+getStudentList()));
    }
public static void main (String[]args) {
    UniversityGroup group1 = new UniversityGroup("Group1", 2018);
    group1.addStudent("Anna");
    group1.addStudent("Philipp");
    group1.addStudent("Alisa");
    group1.addStudent("Elsa");
    group1.addStudent("Theodor");

    UniversityGroup group2 = new UniversityGroup("Group2", 2020);
    group2.addStudent("Luisa");
    group2.addStudent("Albert");
    group2.addStudent("Nina");
    group2.addStudent("Olexandr");
    group2.addStudent("Katia");

    group1.removeStudent("Anna");
    group2.removeStudent("Nina");

    group1.getGroupDescription();
    group2.getGroupDescription();
}
}

