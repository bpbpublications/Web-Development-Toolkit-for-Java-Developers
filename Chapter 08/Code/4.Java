public class StudentBean {

    String id, name, program;
    int semester;
    double marks1, marks2, marks3;
    String grade;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
this.program = program;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
this.semester = semester;
    }

    public double getMarks1() {
        return marks1;
    }

    public void setMarks1(double marks1) {
this.marks1 = marks1;
    }

    public double getMarks2() {
        return marks2;
    }

    public void setMarks2(double marks2) {
this.marks2 = marks2;
    }

    public double getMarks3() {
        return marks3;
    }

    public void setMarks3(double marks3) {
this.marks3 = marks3;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade() {
        double per = (marks1 + marks2 + marks3) / 3; // each subject is of 100 marks

        if (marks1 <= 35 || marks2 <= 35 || marks3 <= 35) {
            grade = "FF";
        } else if (per >= 80) {
            grade = "AA";
        } else if (per >= 70) {
            grade = "BB";
        } else if (per >= 60) {
            grade = "CC";
        } else {
            grade = "DD";
        }
    }
}
