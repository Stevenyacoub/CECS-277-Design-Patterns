public class Grade {
    private String finalGrade;

    //default constructor
    public Grade(){
        finalGrade = "";
    }

    //argument constructor
    public Grade(String finalGrade){
        this.finalGrade = finalGrade;
    }

    /**
     * @return a String representing the
     * letter grade achieved
     */
    public String getGrade(){
        return finalGrade;
    }

    /**
     * @return an int representing the
     * percent grade achieved
     */
    public int getPercent(){
        switch(finalGrade){
            default:
                return 0;
            case("A"):
                return 90;
            case ("B"):
                return 80;
            case("C"):
                return 70;
            case("D"):
                return 60;
            case("F"):
                return 50;
        }
    }
}
