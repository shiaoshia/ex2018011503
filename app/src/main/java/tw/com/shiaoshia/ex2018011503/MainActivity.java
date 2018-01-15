package tw.com.shiaoshia.ex2018011503;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //利用SharedPreferences存檔
    public void click01(View v) {
        SharedPreferences sp = getSharedPreferences("mydata",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        EditText et = (EditText)findViewById(R.id.editText);
        editor.putString("data1",et.getText().toString());
        editor.commit();
    }
    //利用SharedPreferences讀檔
    public void click02(View v) {
        SharedPreferences sp = getSharedPreferences("mydata",MODE_PRIVATE);
        String str = sp.getString("data1","");
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(str);
    }
}
