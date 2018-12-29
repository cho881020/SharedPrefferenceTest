package tjeit.kr.sharedprefferencetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import tjeit.kr.sharedprefferencetest.utils.ContextUtil;

public class MainActivity extends BaseActivity {

    private android.widget.EditText emailEdt;
    private android.widget.Button emailSaveBtn;

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

        emailSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContextUtil.setEmail(mContext, emailEdt.getText().toString());

                Toast.makeText(mContext, "입력한 이메일 저장됨", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void setValues() {
        emailEdt.setText(ContextUtil.getEmail(mContext));
    }

    @Override
    public void bindViews() {
        this.emailSaveBtn = (Button) findViewById(R.id.emailSaveBtn);
        this.emailEdt = (EditText) findViewById(R.id.emailEdt);
    }
}
