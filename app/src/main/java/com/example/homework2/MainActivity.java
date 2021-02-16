package com.example.homework2;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import javax.security.auth.Subject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void onCLick(View v){
        String to = "To: " + EmailAddress.getText().toString();
        String subject = "Stuject: "
                + EmailSubject.getText().toString();
        String min = "Get minimum :" + MenuPopupWindow.MenuDropDownListView.getSelectedItem()).toString();
        String search = "Search :" + Search.gettext().toString();
        String Structure = Dropdown.getSelectedItem().toString();
        String data = "2-3 tree, Binary Search, Hash, Linked List, Min Heap";

        To.settext(to);
        Subject.setText(subject);
        GetMin.setText(min);
        Search.setText(search);
        Structure.compareTo(Data);
/*
if average case binary is selected and min is checked then subject = subject + "Get minimum runtime"
 so the same for insert and search
 and if average case is checked then get the return average cases
 if worst is checked return worst cases,
 put the cases in a nested loop inside worst or average since all the cases are deterimed by either worst or average


 --leave the comments for future reference
 */



        //Binary Search Tree
if (AverageCase.isChecked()) {
    subject = subject + "Average Case Time Complexity for Binary Search Tree: ";
    if (GetMin.isChecked()) {
        subject = subject + "Get Minimum: " + "O(Log(n))";
    }
    if (Insert.isChecked()) {
        subject = subject + "Insert: " + "O(Log(n))";
    }
    if (Search.isChecked()) {
        subject = subject + "Search: " + "O(Log(n))";
    }
}

if (WorstCase.isChecked()) {
    subject = subject + "Worst Case Time Complexity for Binary Search Tree: ";
    if (GetMin.isChecked()) {
        subject = subject + "Get Minimum: " + "O(n)";
    }
    if (Insert.isChecked()) {
        subject = subject + "Insert: " + "O(n)";
    }

    if (Search.isChecked()) {
        subject = subject + "Search: " + "O(n)";
    }
}

//2-3 Tree
if (AverageCase.isChecked()) {
    subject = subject + "Average Case Time Complexity for 2-3 Tree: ";
    if (GetMin.isChecked()) {
        subject = subject + "Get Minimum: " + "O(Log(n))";
    }
    if (Insert.isChecked()) {
        subject = subject + "Insert: " + "O(Log(n))";
    }
    if (Search.isChecked()) {
        subject = subject + "Search: " + " O(Log(n))";
        if (WorstCase.isChecked()) {
            subject = subject + "Worst Case Time Complexity for 2-3 Tree: ";
            if (GetMin.isChecked()) {
                subject = subject + "Get Minimum: " + "O(Log(n))";
            }
            if (Insert.isChecked()) {
                subject = subject + "Insert: " + "O(Log(n))";
            }
            if (Search.isChecked()) {
                subject = subject + "Search: " + "O(Log(n))";
            }
        }
    }
}
//Hash Table
if (AverageCase.isChecked()) {
    subject = subject + "Average Case Time Complexity for Hash Table: ";

    if (GetMin.isChecked()) {
        subject = subject + "Get Minimum: " + "O(1)";
    }
    if (Insert.isChecked()) {
        subject = subject + "Insert: " + "O(1)";
    }
    if (Search.isChecked()) {
        subject = subject + "Search: " + "O(1)";
    }
}
if (WorstCase.isChecked()) {
    subject = subject + "Worst Case Time Complexity for Hash Table: ";
    if (GetMin.isChecked()) {
        subject = subject + "Get Minimum: " + "O(n)";
    }
    if (Insert.isChecked()) {
        subject = subject + "Insert: " + "O(n)";
    }
    if (Search.isChecked()) {
        subject = subject + "Search: " + "O(n)";
    }
}

//Linked List
if (AverageCase.isChecked()) {
    subject = subject + "Average Case Time Complexity for Linked List: ";
    if (GetMin.isChecked()) {
        subject = subject + "Get Minimum: " + "O(n)";
    }
    if (Insert.isChecked()) {
        subject = subject + "Insert: " + "O(1)";
    }
    if (Search.isChecked()) {
        subject = subject + "Search: " + "O(n)";
    }
}
if (WorstCase.isChecked()) {
    subject = subject + "Worst Case Time Complexity for Linked List: ";
    if (GetMin.isChecked()) {
        subject = subject + "Get Minimum: " + "O(n)";
    }
    if (Insert.isChecked()) {
        subject = subject + "Insert: " + "O(1)";
    }
    if (Search.isChecked()) {
        subject = subject + "Search: " + "O(n)";
    }
}
//Min Heap
if (AverageCase.isChecked()) {
    subject = subject + "Average Case Time Complexity for Min Heap: ";
    if (GetMin.isChecked()) {
        subject = subject + "Get Minimum: " + "O(1)";
    }
    if (Insert.isChecked()) {
        subject = subject + "Insert: " + "O(n)";
    }
    if (Search.isChecked()) {
        subject = subject + "Search: " + "O(n)";
    }
}

if (WorstCase.isChecked()) {
    subject = subject + "Worst Case Time Complexity for Min Heap: ";
    if (GetMin.isChecked()) {
        subject = subject + "Get Minimum: " + "O(1)";
    }
    if (Insert.isChecked()) {
        subject = subject + "Insert: " + "O(n)";
    }
    if (Search.isChecked()) {
        subject = subject + "Search: " + "O(n)";
    }
}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


   // https://mkyong.com/android/android-spinner-drop-down-list-example/