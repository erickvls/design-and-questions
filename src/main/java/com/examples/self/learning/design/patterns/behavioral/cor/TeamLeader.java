package com.examples.self.learning.design.patterns.behavioral.cor;

public class TeamLeader extends LeaveHandler{

    //"reasonType" is not going to be considered under TeamLeader & ProjectLeader
    //Team Leader can approve up to 7 days, otherwise it will pass to the Project Leader

    @Override
    public String applyLeave(Leave leave) {
        if(leave.getNumberOfDays() <= 7){
            //Employee tier should be 4 or above to get approved
            if(leave.getEmpTier() <= 4){
                return "Your leave days has been APPROVED by TeamLeader";
            }else{
                return "You employee Tier level is too low for request " + leave.getNumberOfDays() + " days";
            }
        }
        return nextHandler.applyLeave(leave);
    }
}
