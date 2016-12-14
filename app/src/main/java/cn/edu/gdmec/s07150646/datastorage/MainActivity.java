package cn.edu.gdmec.s07150646.datastorage;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1,et2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText) findViewById(R.id.edittext1);
        et2= (EditText) findViewById(R.id.edittext2);
        tv1= (TextView) findViewById(R.id.textview);
    }
    public void spWrite(View v){
        SharedPreferences user=getSharedPreferences("user",MODE_APPEND);
        SharedPreferences.Editor editor=user.edit();
        editor.putString("account",et1.getText().toString());
        editor.putString("pass",et1.getText().toString());
        editor.commit();
        Toast.makeText(this,"Sh写入成功",Toast.LENGTH_SHORT).show();
    }
    public void spRead(View v){
        SharedPreferences user=getSharedPreferences("user",MODE_APPEND);
       String acount=user.getString("acount","meitouzhegejiangshi");
        Toast.makeText(this,"Sh写入成功",Toast.LENGTH_SHORT).show();
    }
    public void ROMWrite(View v){
       String acount= et1.getText().toString();
        String pass =et1.getText().toString();

    }
    public void ROMRead(View v){
        String acount= et1.getText().toString();
        String pass1=et1.getText().toString();

    }
    public void SDWrite(View v){
        String str= et1.getText().toString();
        String pass1=et1.getText().toString();

    }





}
