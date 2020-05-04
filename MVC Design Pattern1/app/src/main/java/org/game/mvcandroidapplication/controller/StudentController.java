package org.game.mvcandroidapplication.controller;

import org.game.mvcandroidapplication.MainActivity;
import org.game.mvcandroidapplication.model.Student;

public class StudentController {

    private Student model;
    private MainActivity view;

   // public StudentController(Student model,MainActivity view){
   public StudentController(Student model){
        this.model = model;
      // this.view = view;
        this.view = MainActivity.getInstance();
    }

     public void  setStudentName(String name){
        model.setName(name);
     }
    public void setStudentRoll(String roll){
        model.setRollNo(roll);
    }

     public String getSelectedName(){
        return model.getName();
     }

     public String getStudentRoll(){
        return model.getRollNo();
     }

     public void updateView(){
        view.printStudentDetails(model.getName(),model.getRollNo());
     }
}
