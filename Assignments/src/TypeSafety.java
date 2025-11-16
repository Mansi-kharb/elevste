import java.util.*;

public class TypeSafety {
    public static void main(String[] args) {
        List<Integer> students = List.of(201, 202, 203);

        for (Integer studentId : students) {
            System.out.println(studentId);
        }
    }
}
