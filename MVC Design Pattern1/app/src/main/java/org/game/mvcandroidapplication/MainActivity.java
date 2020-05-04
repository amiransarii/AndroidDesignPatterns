package org.game.mvcandroidapplication;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.game.mvcandroidapplication.controller.StudentController;
import org.game.mvcandroidapplication.model.Student;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String TAG = MainActivity.class.getSimpleName();
    private StudentController controller;
    private Button button_UpdateView;
    private TextView textView_student;
    private static MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivity = this;
        //MainActivity view = new MainActivity();
        button_UpdateView = (Button)findViewById(R.id.btn_update);
        textView_student =(TextView)findViewById(R.id.text_st_view);
        button_UpdateView.setOnClickListener(this);


        Student model = retriveStudetnFromDatabase();
        controller = new StudentController(model);
        // controller = new StudentController(model,view);
        controller.updateView();

    }

    private Student retriveStudetnFromDatabase(){
        Student student = new Student();
        student.setName("Amir Ansari");
        student.setRollNo("1005015");
        return student;
    }

    public void printStudentDetails(String studentName, String studentRollNo){
        Log.d(TAG, "printStudentDetails: "+"Name: " + studentName);
        Log.d(TAG, "printStudentDetails: "+"Roll No: " + studentRollNo);

        System.out.println("TextView "+textView_student);
        System.out.println("Button "+button_UpdateView);
        textView_student.setText("Student Name "+ studentName +"\n"+ "Student Roll No "+studentRollNo);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_update:
                updateView();
                break;

        }
    }

     private void updateView(){
        //update model
         controller.setStudentName("Akil Ansari");
         controller.setStudentRoll("1005020");
         controller.updateView();

     }


    //get instance of activity
    public static MainActivity getInstance() {
        return mainActivity;
    }
}
