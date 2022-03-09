package in.data.student;

public class survey_and_statistics {
    char grade;
    float totalMarks;
    student[] students;
    float[] total_marks_list;

    public survey_and_statistics(evaluation_and_grading evaluationAndGrading)
    {
        this.totalMarks= evaluationAndGrading.totalMarks;
    }



    public survey_and_statistics(student students[]){
        total_marks_list=new float[students.length];

        for (int i=0;i< students.length;i++)
        {
            this.total_marks_list[i]=students[i].totalMarks;
        }
        this.students=students;

    }


    public void displaySortedList(student[] students)
    {
        float temp;
        for (int i=0;i<students.length;i++)
        {
            for(int j=i+1;j<students.length;j++)
            {
                if(total_marks_list[i] > total_marks_list[j])
                {
                    temp=total_marks_list[i];
                    total_marks_list[i]=total_marks_list[j];
                    total_marks_list[j]=temp;
                }
            }
        }

        for(int i=0;i<total_marks_list.length;i++)
        {
            for(int j=0;j<total_marks_list.length;j++)
            {
                if(total_marks_list[i]==students[j].totalMarks) {

                    System.out.print((i + 1) + " Position:- " + students[j].name + " ,Roll No: " + students[j].rollno + "\n");
                }
            }
        }

    }

    public char findGrade(){
        if(totalMarks>=80){
            grade='A';
        }
        else if(totalMarks>=60 && totalMarks<=79){
            grade='B';

        }
        else{
            grade='F';
        }
        return grade;

    }
}
