package com.example.homework2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;

import javax.security.auth.Subject;

public class MainActivity extends AppCompatActivity {
    public boolean iconcheck = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    //@Override
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
     public boolean onOptionsItemSelected(MenuItem item) {
        if(iconcheck){
            sendEmail();
            item.setIcon(R.drawable.ic_baseline_email_24);
            iconcheck = false;
        }else{
            item.setIcon(R.drawable.ic_baseline_edit_24);
            iconcheck = true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void sendEmail() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: "));
        String emailAddress = ((TextView) findViewById(R.id.editText_Email_Address)).getText().toString();
        String emailSubject = ((TextView) findViewById(R.id.editText_email_subject)).getText().toString();
        String emailContent = ((TextView) findViewById(R.id.textViewEmail)).getText().toString();
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {emailAddress});
        intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
        intent.putExtra(Intent.EXTRA_TEXT, emailContent);
        Spinner spinner = findViewById(R.id.spinner);
        String spinnertext = spinner.getSelectedItem().toString();

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        String [][][] runtime = {
                {{"O(log n)", "O(log n)", "O(log n)"},  // worstcase 2-3 Tree
                        {"O(log n)", "O(log n)", "O(log n)"}}, // averagecase 2-3 Tree

                {{"O(n)", "O(n)", "O(n)"},  // worstcase BST
                        {"O(log n)", "O(log n)", "O(log n)"}}, //averagecase BST

                {{"O(n)", "O(n)", "O(n)"},  // worstcase Hash Table
                        {"O(n)", "O(1)", "O(1)"}}, //averagecase Hash Table

                {{"O(n)", "O(1)", "O(n)"},  // worstcase Linked List
                        {"O(n)", "O(1)", "O(n)"}}, // averagecase Linked List

                {{"O(1)", "O(log n)", "O(n)"},  // worstcase Min Heap
                        {"O(1)", "O(log n)", "O(n)"}}}; // averagecase Min Heap

        StringBuilder result = new StringBuilder();
        CheckBox GetMin = findViewById(R.id.getMin_Checkbox);
        CheckBox Insert = findViewById(R.id.insert_CheckBox);
        CheckBox Search = findViewById(R.id.search_Checkbox);
        final RadioButton AverageCase = findViewById(R.id.averageCase_RadioButton);
        final RadioButton WorstCase = findViewById(R.id.worstCase_RadioButton);
        int casetest = 0;

        AverageCase.setOnClickListener(view -> {
            AverageCase.setChecked(true);
            if (WorstCase.isChecked()) {
                WorstCase.setChecked(false);
            }
        });

        WorstCase.setOnClickListener(view -> {
            WorstCase.setChecked(true);

            if (AverageCase.isChecked()) {
                WorstCase.setChecked(false);
            }
        });

        result.append(emailSubject).append("\n");
        if (WorstCase.isChecked()) {
            result.append("Worst Case Time Complexity for ").append(spinnertext).append(":\n");
            casetest = 0;
        } else if (AverageCase.isChecked()) {
            result.append("Average Case Time Complexity for ").append(spinnertext).append(":\n");
            casetest = 1;
        }

        int spinnercase = 0;
        switch(spinnertext){
            case "2-3 Tree":
                spinnercase = 0;
                break;
            case "Binary Search Tree":
                spinnercase = 1;
                break;
            case "Hash Table":
                spinnercase = 2;
                break;
            case "Linked List":
                spinnercase = 3;
                break;
            case "Min Heap":
                spinnercase = 4;
                break;
        }

        if (GetMin.isChecked()) {
            result.append("Get Minimum: ").append(runtime[spinnercase][casetest][0]).append("\n");
        }
        if (Insert.isChecked()) {
            result.append("Insert: ").append(runtime[spinnercase][casetest][1]).append("\n");
        }
        if (Search.isChecked()) {
            result.append("Search: ").append(runtime[spinnercase][casetest][2]).append("\n");
        }

        final TextView To = findViewById(R.id.textViewTo);
        final TextView SubjectTextView = findViewById(R.id.TextViewSubject);
        final String tostring = getString(R.string.to) +" "+ emailAddress;
        final String Subjecttext = getString(R.string.subject)+" " + result;
        To.setText(tostring);
        SubjectTextView.setText(Subjecttext);

    }


}


// https://mkyong.com/android/android-spinner-drop-down-list-example/
