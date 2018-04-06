package com.MyApp.almohamady.worckshop005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtStr1, txtStr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtStr1 = (EditText) findViewById(R.id.txtStr_1);
        txtStr2 = (EditText) findViewById(R.id.txtStr_2);
    }

    public void concatenateString(View view) {
        String str1 = txtStr1.getText().toString();
        String str2 = txtStr2.getText().toString();
        int i = 100;
        String concat = str1 + " : " + str2 + " (" + i + ") ";
        Toast.makeText(MainActivity.this, concat, Toast.LENGTH_LONG).show();
    }

    public void replaceString(View view) {
        String str1 = txtStr1.getText().toString();
        String message = "My Name Is [NAME], Hello [NAME]";
        String message2 = "My Name Is [NAME], Hello [NAME]";
        //message = message.replace("[NAME]", str1);
        message = message.replace("N", str1);
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }

    public void splitString(View view) {
        String splitMsg = "Ahmed,Mohamed,Hani,Salah";
        String[] myNames = null;
        myNames = splitMsg.split(",");
        for (String item : myNames) {
            Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
        }
    }

    public void upperCaseString(View view) {
        String str1 = txtStr1.getText().toString();
        String result = str1.toUpperCase();
        txtStr2.setText(result);
    }

    public void lowerCaseString(View view) {
        String str1 = txtStr1.getText().toString();
        String result = str1.toLowerCase();
        txtStr2.setText(result);
    }

    public void startWithString(View view) {
        String str1 = txtStr1.getText().toString();

        if (str1.startsWith("Ahmed")) {
            Toast.makeText(MainActivity.this, "True", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "False", Toast.LENGTH_SHORT).show();
        }
    }

    public void endWithString(View view) {
        String str1 = txtStr1.getText().toString();

        if (str1.endsWith("Ahmed")) {
            Toast.makeText(MainActivity.this, "True", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "False", Toast.LENGTH_SHORT).show();
        }
    }

    public void containsString(View view) {
        String str1 = txtStr1.getText().toString();
        if (str1.contains("Ahmed")) {
            Toast.makeText(MainActivity.this, "True", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "False", Toast.LENGTH_SHORT).show();
        }
    }

    public void equalString(View view) {
        String str1 = txtStr1.getText().toString();
        String str2 = txtStr2.getText().toString();
        if (str1.equals(str2)) {
            Toast.makeText(MainActivity.this, "True", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "False", Toast.LENGTH_SHORT).show();
        }
    }

    public void isEmptyString(View view) {
        String str1 = txtStr1.getText().toString();
        if (str1.isEmpty()) {
            Toast.makeText(MainActivity.this, "True", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "False", Toast.LENGTH_SHORT).show();
        }
    }

    public void trimString(View view) {
        String str1 = txtStr1.getText().toString();

        String result = str1.trim();

        txtStr2.setText(result);

    }

    public void subStringString(View view) {
        String str1 = "Hello World, I am very Happy To see you";
        String result = str1.substring(13, 22);
        txtStr2.setText(result);
    }

    public void indexOfString(View view) {

        String str1 = "Hello World, I am very Happy To see you";
        String result = str1.substring(str1.indexOf(",") + 1, str1.indexOf("To")).trim();
        txtStr2.setText(result);

    }

    public void lengthString(View view) {
        String str1 = "Hello World, I am very Happy To see you";

        //int result =  str1.length();

        //txtStr2.setText("The Length Is:" + result);

        for (int i = 0; i <= str1.length() - 1; i++) {

            if (!Character.toString(str1.charAt(i)).trim().isEmpty()) {
                Toast.makeText(MainActivity.this, "The Index:" + i + " Have Char:" + str1.charAt(i)
                        , Toast.LENGTH_SHORT).show();
            }
        }
    }
}
