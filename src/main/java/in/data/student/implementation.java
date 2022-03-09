package in.data.student;

public class implementation {
    public static void main(String args[])
    {
        student student1=new student(10,"supriya",100,100,100);
        student student2=new student(20,"brunda",50,50,50);
        student student3=new student(30,"harini",10,10,10);

        student students[]=new student[3];
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;
        //Display total Marks
        evaluation_and_grading evaluationOfStudent1=new evaluation_and_grading(student1);
        evaluation_and_grading evaluationOfStudent2=new evaluation_and_grading(student2);
        evaluation_and_grading evaluationOfStudent3=new evaluation_and_grading(student3);
        student1.totalMarks=evaluationOfStudent1. calculateTotalMarks();
        student2.totalMarks=evaluationOfStudent2. calculateTotalMarks();
        student3.totalMarks=evaluationOfStudent3. calculateTotalMarks();
        System.out.println("Total Marks of "+student1.name+" is "+student1.totalMarks);
        System.out.println("Total Marks of "+student2.name+" is "+student2.totalMarks);
        System.out.println("Total Marks of "+student3.name+" is "+student3.totalMarks);


        //Display grades
        survey_and_statistics survey1=new survey_and_statistics(evaluationOfStudent1);
        survey_and_statistics survey2=new survey_and_statistics(evaluationOfStudent2);
        survey_and_statistics survey3=new survey_and_statistics(evaluationOfStudent3);
        System.out.println("Grade of "+student1.name+" is "+survey1.findGrade());
        System.out.println("Grade of "+student2.name+" is "+survey2.findGrade());
        System.out.println("Grade of "+student3.name+" is "+survey3.findGrade());

        //Display result status
        report_generation reportOfStudent1= new report_generation(survey1);
        report_generation reportOfStudent2=new report_generation(survey2);
        report_generation reportOfStudent3=new report_generation(survey3);
        System.out.println();
        System.out.println("\n ------RESULT STATUS------");
        System.out.println("Result of "+student1.name+" : "+reportOfStudent1.findResultStatus());
        System.out.println("Result of "+student2.name+" : "+reportOfStudent2.findResultStatus());
        System.out.println("Result of "+student3.name+" : "+reportOfStudent3.findResultStatus());
        //Display student details in sorted order of total marks

        survey_and_statistics sortedList=new survey_and_statistics(students);

        System.out.println("\n-------BOARD--------");

        sortedList.displaySortedList(students);
        //Display top scorer
        report_generation topScorer=new report_generation(students);
        topScorer.displayTopScorer(students);








    }




}
