package apputils.zhangxu.zhangxuutils.materialdesign.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import apputils.zhangxu.zhangxuutils.R;

public class DesignWidgetActivity extends AppCompatActivity {

    private FloatingActionButton fab_mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_widget);

        final TextInputLayout til = (TextInputLayout) findViewById(R.id.til);
        EditText et = til.getEditText();
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 10){
                    til.setError("输入的长度不能大于10");
                    til.setErrorEnabled(true);
                }else{
                    til.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

         fab_mail = (FloatingActionButton) findViewById(R.id.fab_mail);
         fab_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar = Snackbar.make(fab_mail,"确定",Snackbar.LENGTH_LONG);
                snackbar.show();
                snackbar.setAction("关闭", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        snackbar.dismiss();
                    }
                });
            }
        });
    }
}
