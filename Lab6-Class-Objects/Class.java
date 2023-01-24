public class Class {
    private String subjectName;
    private Grade letterGrade;

    //default constructor
    public Class(){
        subjectName = "CECS101";
        letterGrade = new Grade();
    }

    //argument constructor    
    public Class(String subjectName, Grade letterGrade){
        this.subjectName = subjectName;
        this.letterGrade = letterGrade;
    }

    /**
     * @return a String representing the
     * class's subject name
     */
    public String getSubjectName(){
        return subjectName;
    }

    /**
     * @return a String representing the
     * letter grade achieved in the class
     */
    public String getLetterGrade(){
        return letterGrade.getGrade();
    }

    /**
     * @return an integer representing the
     * percent grade achieved in the class
     */
    public int getPercentGrade(){
        return letterGrade.getPercent();
    }

    /**
     * @return a String representing the
     * class's name and the grade achieved
     */
    public String toString(){
        return subjectName + ": " + getLetterGrade();
    }
}
