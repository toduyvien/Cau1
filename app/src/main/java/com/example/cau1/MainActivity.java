package com.example.cau1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText taikhoan,matkhau;
    Button btndangnhap;
    CheckBox check ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        ControlButon();
    }
    private void ControlButon (){
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this,android.R.style.Theme_DeviceDefault_Dialog);
                if (check.isChecked()) {
                    builder.setIcon(android.R.drawable.sym_def_app_icon);
                    builder.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }
                else
                    builder.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");

                builder.show();
            }
        });
    }
    private void AnhXa(){
        taikhoan = (EditText)findViewById(R.id.txttaikhoan);
        matkhau = (EditText)findViewById(R.id.txtmatkhau);
        btndangnhap = (Button)findViewById(R.id.button);
        check = (CheckBox)findViewById(R.id.checkBox);
    }
}
