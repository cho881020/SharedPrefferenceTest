package tjeit.kr.sharedprefferencetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import tjeit.kr.sharedprefferencetest.Utills.ContextUtill;

public class MainActivity extends BaseActivity {

    private android.widget.EditText emailEdt;
    private android.widget.Button emailBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        emailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContextUtill.setEmail(mContext, emailEdt.getText().toString());

                Toast.makeText(mContext, "입력 이메일 저장됨", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void setValues() {

        emailEdt.setText(ContextUtill.getEmail(mContext));

    }

    @Override
    public void bindViews() {

        this.emailBtn = (Button) findViewById(R.id.emailBtn);
        this.emailEdt = (EditText) findViewById(R.id.emailEdt);

    }
}
