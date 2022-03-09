package in.data.student;

public class evaluation_and_grading {
    float sub1marks;
    float sub2marks;
    float sub3marks;
    float totalMarks;
    float classTotalMarks;
    float classAverage;
    float sub1average;
    float sub1TotalMarks;
    float sub2average;
    float sub2TotalMarks;
    float sub3average;
    float sub3TotalMarks;
    student[] students;
   public evaluation_and_grading(student[] students){
       this.students=students;
   }
    public evaluation_and_grading(student Student){
        sub1marks=Student.sub1marks;
        sub2marks=Student.sub2marks;
        sub3marks=Student.sub3marks;


    }

    public float calculateTotalMarks(){
        totalMarks=sub1marks+sub2marks+sub3marks;
        return totalMarks;


    }
    public  float calculateClassAverage(){
        for(student i:students){
            classTotalMarks+=totalMarks;

        }
        classAverage=classTotalMarks/students.length;
        return classAverage;


    }
    public float calculateSub1average(){
        for(student i:students){
            sub1TotalMarks+=sub1marks;
            sub1average=sub1TotalMarks/students.length;
        }
        return sub1average;
    }
    public float calculateSub2average(){
        for(student i:students){
            sub2TotalMarks+=sub2marks;
            sub2average=sub2TotalMarks/students.length;
        }
        return sub2average;
    }
    public float calculateSub3average(){
        for(student i:students){
            sub3TotalMarks+=sub3marks;
            sub3average=sub3TotalMarks/students.length;
        }
        return sub3average;
    }
}
