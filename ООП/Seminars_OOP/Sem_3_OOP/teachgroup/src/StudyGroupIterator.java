import java.util.Iterator;
import java.util.List;

class StudyGroupIterator implements Iterator<Student>{
    private int index;
    private List<Student> studentList;

    public StudyGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }
}