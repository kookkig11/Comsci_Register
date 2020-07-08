package Main;

import java.util.ArrayList;

public class Subject {
    private String code;
    private boolean status;
    private ArrayList<String> preSubject;

    public Subject(String code, boolean status, String preSubjectCode){
        /* check from file */
        this.code = code;
        this.status = status;
        preSubject = new ArrayList<>();

        //check num of preSubject
        if (preSubjectCode.contains(",")){ //more than 1
            String[] preSubjectStringSplit = preSubjectCode.split(",");
            for (int i = 0; i < preSubjectStringSplit.length; i++) {
                preSubject.add(preSubjectStringSplit[i]);
            }
        }
        else{
            preSubject.add(preSubjectCode);
        }
    }

    // if status change
    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public boolean isPass() {
        return status;
    }

    public ArrayList<String> getPreSubject() {
        return preSubject;
    }
}
