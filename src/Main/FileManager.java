package Main;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
    private String filePath = "checkCurriculum.txt";
    private ArrayList<Subject> subjects;

    public FileManager() throws IOException {
        subjects = new ArrayList<>();
        readFile(subjects);
    }

    public void readFile(ArrayList<Subject> subjects) throws IOException {
        this.subjects.clear();

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine(); //read per line
        while (line != null && !line.isEmpty()){
            String[] checkSubject = line.split(" ");
            /*
            checkSubject[1] = check status of this subject
            checkSubject[2] = preSubject
            */
            if (checkSubject[1].equals("P")){
                subjects.add(new Subject(checkSubject[0], true, checkSubject[2]));
            }
            if (checkSubject[1].equals("N")){
                subjects.add(new Subject(checkSubject[0], false, checkSubject[2]));
            }
            line = bufferedReader.readLine();
        }
    }

    // change status
    public void toggleStatusSubject(Subject subject){
        if (!subject.isPass()){
            subject.setStatus(true);
        }
        else {
            subject.setStatus(false);
        }
        writeFile();
    }

    //create String set and save to file(overwrite)
    public void writeFile(){
        StringBuilder stringSet = new StringBuilder();

        for (Subject i : subjects){
            stringSet.append(i.getCode() + " ");
            //check this subject pass or not
            if (i.isPass()){
                stringSet.append("P ");
            }
            else{
                stringSet.append("N ");
            }

            //check preSubject of this subject
            if (i.getPreSubject().size() > 0){
                StringBuilder preSubjectSet = new StringBuilder();
                for (String preSubject : i.getPreSubject()){
                    preSubjectSet.append(preSubject + ",");
                }
                stringSet.append(preSubjectSet.toString().substring(0, preSubjectSet.toString().length()-1));
            }
            else {
                stringSet.append("null");
            }

            stringSet.append("\n");
        }

        try (PrintWriter printWriter = new PrintWriter(filePath)){
            printWriter.print(stringSet.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Subject getSubjects(String code) {
        for (Subject i : subjects){
            if (code.equals(i.getCode())){
                return i;
            }
        }
        return null;
    }
}