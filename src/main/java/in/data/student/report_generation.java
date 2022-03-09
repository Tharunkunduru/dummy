package in.data.student;

import static in.data.student.survey_and_statistics.grade;

public class report_generation {
    char grade;
    float totalMarks;
    String resultStatus;
    student[] students;
    float[] total_marks_list;
    float topScore;
    public report_generation(survey_and_statistics survey)
    {
        this.grade= survey.grade;
    }
    public report_generation(evaluation_and_grading eval){
        this.totalMarks=totalMarks;
    }


    public report_generation(student[] students)
    {

            
        total_marks_list=new float[students.length];

        for (int i=0;i< total_marks_list.length;i++)
        {
            total_marks_list[i]=students[i].totalMarks;
        }
        this.students=students;

    }

    public String findResultStatus()
    {
        if (grade=='A'||grade=='B')
        {
            resultStatus="PASSED";

        }
        else if (grade=='F')
        {
            resultStatus="REAPPEAR";

        }
        return resultStatus;
    }

    public void displayTopScorer(student[] students)
    {
        for(int i=0;i< students.length;i++)
        {
            for (int j=i+1;j< students.length;j++)
            {
                if(total_marks_list[i]>total_marks_list[j])
                {
                    topScore=total_marks_list[i];
                }

            }
        }
        for(int i=0;i< students.length;i++)
        {
            if(topScore==students[i].totalMarks)
            {

                System.out.print("Top Scorer: "+students[i].name);
            }
        }

    }

}




