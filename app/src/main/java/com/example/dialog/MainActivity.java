package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
  Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
    }

    public void ShowDialog(View view) {
        AlertDialog.Builder builder= new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Dialog Title");
        builder.setMessage("ALERT,I am the message");
        builder.setCancelable(false);
      builder.setPositiveButton("Positive",
              new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int i) {
                   makeText( MainActivity.this,"positive", LENGTH_LONG).show();
                  }
              });
      builder.setNegativeButton("Negetive",
              new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int i) {
                      Toast.makeText(MainActivity.this,"Negetive clicked",LENGTH_LONG).show();
                  }
              });
      AlertDialog alertDialog= builder.create();
      alertDialog.show();


    }
}