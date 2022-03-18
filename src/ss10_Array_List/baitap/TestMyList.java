package ss10_Array_List.baitap;

public class TestMyList {
    public class Student{
        private int id;
        private String name;

        public Student(){
        }

        public Student(int id,String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public void main(String[] args) {
        Student a = new Student(1,"Duy");
        Student b = new Student(1,"Phuc");
        Student c = new Student(1,"Huy");
        Student d = new Student(1,"Lien");
        Student e = new Student(1,"Vuong");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);

        for(int i = 0;i<studentMyList.size();i++){
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }

    }


}
