package de.markusdamm.financesharer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.markusdamm.financesharer.data.SingleFinancer;
import de.markusdamm.financesharer.utils.Strings;

public class SingleFinance extends AppCompatActivity {

    private SingleFinancer singleFinancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_finance);
        Intent intent = this.getIntent();
        setTitle(intent.getStringExtra(Strings.SINGLE_FINANCE_INTENT));
    }

    private void setSingleFinancer(String name){
        this.singleFinancer = new SingleFinancer(0, name);
    }
}
