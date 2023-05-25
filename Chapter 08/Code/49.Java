package core;

public class TimeTable 
{
    String dayofweek,dateofweek,hourofday;
    Faculty faculty;
    CourseDetails course;

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
this.faculty = faculty;
    }

    public CourseDetails getCourse() {
        return course;
    }

    public void setCourse(CourseDetails course) {
this.course = course;
    }

    public String getDayofweek() {
        return dayofweek;
    }

    public void setDayofweek(String dayofweek) {
this.dayofweek = dayofweek;
    }

    public String getDateofweek() {
        return dateofweek;
    }

    public void setDateofweek(String dateofweek) {
this.dateofweek = dateofweek;
    }

    public String getHourofday() {
        return hourofday;
    }

    public void setHourofday(String hourofday) {
this.hourofday = hourofday;
    }
}
