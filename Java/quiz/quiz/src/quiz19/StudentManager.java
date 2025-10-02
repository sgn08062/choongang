package quiz19;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 학생관리 클래스
 */
class StudentManager {
    private HashMap<String, String> students;
    
    public StudentManager() {
        // TODO: HashMap 초기화
    }
    
    // TODO: 학생 추가 - HashMap put() 메서드 사용
    public void addStudent(String studentId, String studentName) {
        students.put(studentId, studentName);
    }
    
    // TODO: 학생 조회 - containsKey()로 존재 확인 후 get()으로 값 반환, 없으면 "없습니다" 반환
    public String getStudent(String studentId) {
        if(students.containsKey(studentId)){
            return students.get(studentId);
        }else{
            return "없습니다";
        }
    }
 
    // TODO: 학생 삭제 - containsKey()로 존재 확인 후 remove()로 삭제, boolean 반환
    public boolean removeStudent(String studentId) {
        if(students.containsKey(studentId)){
            students.remove(studentId);
            return true;
        }else{
            return false;
        }
    }
    
    // TODO: 전체 학생 수 - HashMap size() 메서드 사용
    public int getStudentCount() {
        return students.size();
    }
    
    // TODO: 모든 학생 출력 - keySet()으로 키 순회, get()으로 값 조회
    public void printAllStudents() {
        Iterator<String> it = students.keySet().iterator();

        while(it.hasNext()){
            System.out.println(students.get(it.next()));
        }
    }
}