package REPORTCARDCLASS;


import java.io.BufferedReader;
import java.io.FileReader;

import javax.sound.sampled.SourceDataLine;


public class StudReport1 {
  private int rollNo;
  private String studentName;
  private int science;
  private int math;
  private int socialScience;
  private int lang1;
  private int lang2;

  public StudReport1 (int Rlnum, String studNm, int Sci, int Mat, int SSc, int l1, int l2) {
    this.rollNo = Rlnum;
    this.studentName = studNm;
    this.science = Sci;
    this.math = Mat;
    this.socialScience = SSc;
    this.lang1 = l1;
    this.lang2 = l2;

    


}

  public int getRollNo() {
    return rollNo;
  }

  public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public int getScience() {
    return science;
  }

  public void setScience(int science) {
    this.science = science;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
  }

  public int getSocialScience() {
    return socialScience;
  }

  public void setSocialScience(int socialScience) {
    this.socialScience = socialScience;
  }

  public int getLang1() {
    return lang1;
  }

  public void setLang1(int lang1) {
    this.lang1 = lang1;
  }

  public int getLang2() {
    return lang2;
  }

  public void setLang2(int lang2) {
    this.lang2 = lang2;
  }




  public static void main(String[] args) {
    
      String file = "reportCard.csv";
      
      try{
        BufferedReader br = new BufferedReader(new FileReader(file))
        {
          while ((StudReport1 = br.readLine())!= null){
            System.out.println(StudReport1);
          }
        }
      }
      catch (Exception e)
          {System.out.println(e);
          }
        }
      }
    
    


