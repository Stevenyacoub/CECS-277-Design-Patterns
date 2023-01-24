public class Education {
    private String degree;
    private String major;
    private int research;

    public Education(){
        this.degree = "MS";
        this.major = "General Education";
        this.research = 1;
    }

    public Education(String degree, String major, int research){
        this.degree = degree;
        this.major = major;
        this.research = research;
    }

    public String getDegree(){
        return degree;
    }

    public void setDegree(String degree){
        this.degree = degree;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public int getResearch(){
        return research;
    }

    public void setResearch(int research){
        this.research = research;
    }
}
