package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**
     *  عرفوا مصفوفة بإسم students
     *  define an arraylist named students
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        /**
         *  إكتبوا الكود بعد هذا السطر
         *  ضيفوا عناصر من الكلاس
         *  add objects from class Student
         */

        ArrayList<Student> students = new ArrayList<>();
        Student S1 = new Student("Yousef",14,12,R.drawable.boy1);
        Student S2 = new Student("Salman",13,10,R.drawable.boy1);
        Student S3 = new Student("Majed",15,11,R.drawable.boy1);


        students.add(S1);
        students.add(S2);
        students.add(S3);


        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);

        listView.setAdapter(studentAdapter);
    }
}