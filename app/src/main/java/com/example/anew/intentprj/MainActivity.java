package com.example.anew.intentprj;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dial(View view) {
        EditText et = findViewById(R.id.et);
        Intent i = new Intent();

        i.setAction(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:" + et.getText().toString()));
        startActivity(i);
    }

    public void browser(View view) {
        Intent i = new Intent();
        EditText et1 = findViewById(R.id.et1);
        String str = et1.getText().toString();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www." + str + ".com"));
        startActivity(i);
    }

    public void image(View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_GET_CONTENT);
        i.setType("image/*");
        startActivity(i);
    }

    public void Text(View view)
    {
        Intent i3 = new Intent(this,Welcome.class);
        EditText et3=findViewById(R.id.et3);
        EditText et4=findViewById(R.id.et4);
        i3.putExtra("uname",et3.getText().toString());
        i3.putExtra("pword",et4.getText().toString());
        startActivity(i3);
    }

    public void Whatsapp(View view)
    {
        Intent i1 = getPackageManager().getLaunchIntentForPackage("com.facebook.lite");
        if (i1 != null)
        {
            startActivity(i1);
        }
        else
            {
                Intent i2=new Intent();
                i2.setAction(Intent.ACTION_VIEW);
                i2.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.facebook.lite"));
                startActivity(i2);
            }
    }
}
