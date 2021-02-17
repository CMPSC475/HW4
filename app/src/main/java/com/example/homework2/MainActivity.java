package com.example.homework2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        final TextView To = findViewById(R.id.textViewTo);
        final TextView TextViewSubject = findViewById(R.id.TextViewSubject);
        final CheckBox GetMin = findViewById(R.id.getMin_Checkbox);
        final CheckBox Search = findViewById(R.id.search_Checkbox);
        final CheckBox Insert = findViewById(R.id.insert_CheckBox);
        final TextView SubjectTextView = findViewById(R.id.TextViewSubject);
        //RadioGroup RadioGroupCases = findViewById(R.id.RadioGroup);
        //final RadioButton AverageCase = findViewById(R.id.averageCase_RadioButton);
       // final RadioButton WorstCase = findViewById(R.id.worstCase_RadioButton);
        Spinner spinner = findViewById(R.id.spinner);
        TextViewSubject.setText(getString(R.string.subject));
        GetMin.setText(getString(R.string.getMin));
        Search.setText(getString(R.string.search));


        fab.setOnClickListener(view -> {
            /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();

             */
            TextView EmailAddress = findViewById(R.id.editText_Email_Address);
            TextView EmailSubject = findViewById(R.id.editText_email_subject);
            String spinnertext = spinner.getSelectedItem().toString();
            String totext = "To: " + EmailAddress.getText().toString();
            String subjectText = "Subject: "+ EmailSubject.getText().toString() + "\n";
            final String[] radioText = {""};
            final int[] casetest = {0};
            casetest[0] = 2;
            final boolean[] changed = {false};
            RadioGroup radioGroup = findViewById(R.id.RadioGroup);
            radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
                if (checkedId == R.id.worstCase_RadioButton) {
                    radioText[0] = "Worst Case Time Complexity for " + spinnertext+ ":";
                    casetest[0] = 1;
                    changed[0] = true;

                } else if (checkedId == R.id.averageCase_RadioButton) {
                    radioText[0] = "Average Case Time Complexity for " + spinnertext+":";
                    casetest[0] = 2;
                    changed[0] = true;
                }
            });


            if(!changed[0]){    //case 1 is worst case 2 is average
                radioText[0] ="Average Case Time Complexity for " + spinnertext;
            }

            if(spinnertext.equals("2-3 Tree"))
                {
                    subjectText += radioText[0];
                    if (casetest[0] == 1) {

                        if (GetMin.isChecked()) {
                            subjectText +="\nGet Minimum: " + "O(Log(n))";
                        }
                        if (Insert.isChecked()) {
                            subjectText += "\nInsert: " + "O(Log(n))";
                        }
                        if (Search.isChecked()) {
                            subjectText += "\nSearch: " + "O(Log(n))";
                        }
                    } else if (casetest[0] == 2) {
                        if (GetMin.isChecked()) {
                            subjectText += "\nGet Minimum: " + "O(Log(n))";
                        }
                        if (Insert.isChecked()) {
                            subjectText += "\nInsert: " + "O(Log(n))";
                        }
                        if (Search.isChecked()) {
                            subjectText += "\nSearch: " + " O(Log(n))";
                        }
                    }
                }
            else if(spinnertext.equals("Binary Search Tree"))
                {
                    subjectText += radioText[0];
                    if (casetest[0] == 1) {
                        if (GetMin.isChecked()) {
                            subjectText +=  "\nGet Minimum: " + "O(n)";
                        }
                        if (Insert.isChecked()) {
                            subjectText +=  "\nInsert: " + "O(n)";
                        }

                        if (Search.isChecked()) {
                            subjectText += "\nSearch: " + "O(n)";
                        }
                    } else if (casetest[0] == 2) {
                        if (GetMin.isChecked()) {
                            subjectText +=  "\nGet Minimum: " + "O(Log(n))";
                        }
                        if (Insert.isChecked()) {
                            subjectText +=  "\nInsert: " + "O(Log(n))";
                        }
                        if (Search.isChecked()) {
                            subjectText +=  "\nSearch: " + "O(Log(n))";
                        }
                    }
                }
            else if(spinnertext.equals("Hash Table"))
                {
                    subjectText += radioText[0];
                    if (casetest[0] == 1) {
                        if (GetMin.isChecked()) {
                            subjectText += "\nGet Minimum: " + "O(n)";
                        }
                        if (Insert.isChecked()) {
                            subjectText +=  "\nInsert: " + "O(n)";
                        }
                        if (Search.isChecked()) {
                            subjectText +=  "\nSearch: " + "O(n)";
                        }
                    } else if (casetest[0] == 2) {
                        if (GetMin.isChecked()) {
                            subjectText += "\nGet Minimum: " + "O(1)";
                        }
                        if (Insert.isChecked()) {
                            subjectText += "\nInsert: " + "O(1)";
                        }
                        if (Search.isChecked()) {
                            subjectText +=  "\nSearch: " + "O(1)";
                        }
                    }
                }else if(spinnertext.equals("Linked List"))
                {
                    subjectText += radioText[0];
                    if (casetest[0] == 1) {
                        if (GetMin.isChecked()) {
                            subjectText += "\nGet Minimum: " + "O(n)";
                        }
                        if (Insert.isChecked()) {
                            subjectText +=  "\nInsert: " + "O(1)";
                        }
                        if (Search.isChecked()) {
                            subjectText +=  "\nSearch: " + "O(n)";
                        }
                    } else if (casetest[0] == 2) {
                        if (GetMin.isChecked()) {
                            subjectText +=  "\nGet Minimum: " + "O(n)";
                        }
                        if (Insert.isChecked()) {
                            subjectText +=  "\nInsert: " + "O(1)";
                        }
                        if (Search.isChecked()) {
                            subjectText +=  "\nSearch: " + "O(n)";
                        }
                    }

                }else if(spinnertext.equals("Min Heap"))
                {
                    subjectText += radioText[0];
                    if (casetest[0] == 1) {
                        if (GetMin.isChecked()) {
                            subjectText += "\nGet Minimum: " + "O(1)";
                        }
                        if (Insert.isChecked()) {
                            subjectText +=  "\nInsert: " + "O(n)";
                        }
                        if (Search.isChecked()) {
                            subjectText +=  "\nSearch: " + "O(n)";
                        }
                    } else if (casetest[0] == 2) {
                        if (GetMin.isChecked()) {
                            subjectText +=  "\nGet Minimum: " + "O(1)";
                        }
                        if (Insert.isChecked()) {
                            subjectText +=  "\nInsert: " + "O(n)";
                        }
                        if (Search.isChecked()) {
                            subjectText +=  "\nSearch: " + "O(n)";
                        }
                    }

                }
            To.setText(totext);
            SubjectTextView.setText(subjectText);
        });
    }



    //@Override
   public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}




// https://mkyong.com/android/android-spinner-drop-down-list-example/