package com.example.patrickkarungari.quizzapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    int increment = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitValues(View view) {
        /*
        GET THE NAME OF THE USER
         */
        EditText nameEditText = findViewById(R.id.name);
        String name = nameEditText.getText().toString();
        /*
        CHECK WHETHER FIRST RADIO BUTTON OF THE FIRST QUESTION IS CHECKED
         */
        RadioButton DataTypeRadioButton = findViewById(R.id.DataType);
        boolean DataType = DataTypeRadioButton.isChecked();
         /*
         CHECK WHETHER THE SECOND RADIO BUTTON OF THE SECOND QUESTION IS CHECKED
         */
        RadioButton stringRadioButton = findViewById(R.id.string);
        boolean string = stringRadioButton.isChecked();
        /*
        CHECK WHETHER THE FIRST RADIO BUTTON OF THE THIRD QUESTION IS CHECKED
         */
        RadioButton memoryLocationRadioButton = findViewById(R.id.memoryLocation);
        boolean memoryLocation = memoryLocationRadioButton.isChecked();
        counter = gradeAnswer(DataType, string, memoryLocation);

        /*
        adding a toast
        */
        Context context = getApplicationContext();
        CharSequence text = "Hello, " + name + "\nYou got " + counter + " marks.\nTHANK YOU!!!";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        finish();
        startActivity(getIntent());
    }
    public int quiz4Checklist(View view) {
        // Is the checkbox now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox button was clicked
        switch (view.getId()) {
            case R.id.tableview:
                if (checked)
                    counter = counter + increment;
                break;
            case R.id.linearlayout:
                if (checked)
                    counter = counter + increment;
                break;
            default:
                counter = counter + 2;
        }
        return counter;
    }

    /*
    THIS METHOD GRADES THE ANSWERS GIVEN BY THE USER
     */
    private int gradeAnswer(boolean DataType, boolean string, boolean memoryLocation) {
        if (DataType) {
            counter = counter + 2;
        }
        if (string) {
            counter = counter + 2;
        }
        if (memoryLocation) {
            counter = counter + 2;
        }
return  counter;
    }
}
