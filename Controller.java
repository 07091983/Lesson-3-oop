import java.util.List;

public class Controller {

    private final StudentGroupService studentGroupService = new StudentGroupService();

    public void removeStudentByFIO(String firstName,String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }
    
    public List<Student> getSortedStudentList() {
        studentGroupService.getSortedStudentList();

    }

    public List<Student> getSortedStudentByFIO() {
        return studentGroupService.getSortedStudentByFIO();
    }

    public List<Potoc> getSortedPotocList() {
        potocGroupService.getSortedPotocList();
    }

    public List<Potoc> getSortedPotocByNG() {
        return potocGroupService.getSortedPotocByNG();
    }
}

