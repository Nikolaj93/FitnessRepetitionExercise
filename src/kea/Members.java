package kea;

public class Members {

    private String memberName;
    private String memberCPR;
    private String memberType;
    private String membershipFee;

    public String getMemberName(){
        return this.memberName;
    }
    public void setMemberName(String value){
        this.memberName = value;
    }

    public String getMemberCPR(){
        return this.memberCPR;
    }
    public void setMemberCPR(String value){
        this.memberCPR = value;
    }

    public String getMemberType(){
        return this.memberType;
    }
    public void setMemberType(String value){
        this.memberType = value;
    }

    public String getMembershipFee(){
        return this.membershipFee;
    }
    public void setMembershipFee(String value){
        this.membershipFee = value;
    }

    public Members(String memberName, String memberCPR, String memberType, String membershipFee){
        this.memberName = memberName;
        this.memberCPR = memberCPR;
        this.memberType = memberType;
        this.membershipFee = membershipFee;
    }

    @Override
    public String toString(){
        return "Name: " + memberName + "CPR: " + memberCPR + "Type: " + memberType + "Membership Fee: " + membershipFee;
    }

}
