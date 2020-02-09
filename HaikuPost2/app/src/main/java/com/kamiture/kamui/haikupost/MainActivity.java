package com.kamiture.kamui.haikupost;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends Activity
        implements View.OnClickListener {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference refMsg = database.getReference();

    EditText kamiku;
    EditText nakaku;
    EditText simoku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        kamiku = (EditText) findViewById(R.id.kamiku);
        nakaku = (EditText) findViewById(R.id.nakaku);
        simoku = (EditText) findViewById(R.id.simoku);

        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button:
                String Kamiku = kamiku.getText().toString();
                String Nakaku = nakaku.getText().toString();
                String Simoku = simoku.getText().toString();

                Toast.makeText(this, "データをPOSTします", Toast.LENGTH_SHORT).show();
                Post post = new Post(Kamiku, Nakaku, Simoku);
                refMsg.child("haiku").push().setValue(post).addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(MainActivity.this, "データの保存に成功しました！！", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
                break;
        }

    }


}
