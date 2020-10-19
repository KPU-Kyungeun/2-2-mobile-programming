package com.cookandroid.project5_1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edt;
    Button btn;
    TextView tview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        // 레이아웃 생성 및 보여주기
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(220, 220, 220));
        setContentView(baseLayout, params);

        // EditText 생성 및 추가
        edt = new EditText(this);
        edt.setHint("여기에 입력하세요.");
        baseLayout.addView(edt);

        // Button 생성 및 추가
        btn = new Button(this);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.MAGENTA);
        baseLayout.addView(btn);

        // TextView 생성 및 추가
        tview = new TextView(this);
        tview.setText("텍스트뷰입니다.");
        tview.setTextSize(20);
        tview.setTextColor(Color.MAGENTA);
        baseLayout.addView(tview);

        // 버튼이 클릭될 때
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "코드로 생성한 버튼입니다", Toast.LENGTH_SHORT).show();
                tview.setText(edt.getText().toString());
            }
        });
    }
}