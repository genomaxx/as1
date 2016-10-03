package com.example.maxwell.jmdougla_habittracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;

public class ListHabitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.habits);
        ListView listView = (ListView) findViewById(R.id.listofHabitsView);
        Collection<Habit> habits = HabitListController.getHabitList().getHabits();
        final ArrayList<Habit> list = new ArrayList<Habit>(habits);
        ArrayAdapter<Habit> habitAdapter = new ArrayAdapter<Habit>(this,android.R.layout
                .simple_list_item_1, list);
        listView.setAdapter(habitAdapter);
    }
/* Working on implementing listeners
    HabitListController.getHabitList().addListener(new Listener() {
        @Override
        public void update() {
            list.clear();
            Collection<Habit> habits = HabitListController.getHabitList().getHabits();
            list.addAll(habits);

        }
    });
*/
    public void viewEditHabits(View v) {
        Toast.makeText(this, "edit some habits!",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(ListHabitsActivity.this, editHabitActivity.class);
        startActivity(intent);
    }

    public void habitSavebutton(View v) {
        Toast.makeText(this, "Saved a habit!", Toast.LENGTH_SHORT).show();
        HabitListController hlc = new HabitListController();
        EditText textView = (EditText) findViewById(R.id.habit_name);
        EditText textView2 = (EditText) findViewById(R.id.habit_descriptionText);

        hlc.addHabit(new Habit(textView.getText().toString()));

    }
}
