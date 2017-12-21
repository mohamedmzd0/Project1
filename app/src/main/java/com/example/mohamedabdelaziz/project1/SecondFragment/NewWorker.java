package com.example.mohamedabdelaziz.project1.SecondFragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.mohamedabdelaziz.project1.R;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class NewWorker extends AppCompatActivity {

    private EditText name, work, phone;
    private Button add;
    private ImageButton image;
    final static int RESULT_LOAD_IMG = 100;
    Bitmap selectedImage = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_worker);
        name = (EditText) findViewById(R.id.text_name);
        work = (EditText) findViewById(R.id.text_work);
        phone = (EditText) findViewById(R.id.text_phone);
        image = (ImageButton) findViewById(R.id.image_btn);
        add = (Button) findViewById(R.id.add_BTN);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                    photoPickerIntent.setType("image/*");
                    startActivityForResult(photoPickerIntent, RESULT_LOAD_IMG);
                } catch (Exception e) {
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(name.getText().toString())) {
                    name.setError("مطلوب");
                    return;
                }
                if (TextUtils.isEmpty(work.getText().toString())) {
                    work.setError("مطلوب");
                    return;
                }
                if (TextUtils.isEmpty(phone.getText().toString())) {
                    phone.setError("مطلوب");
                    return;
                }
                if (phone.getText().toString().length() != 11 || !phone.getText().toString().startsWith("01")) {
                    phone.setError("غير صحيح");
                    return;
                }
                if (selectedImage == null) {
                    Toast.makeText(NewWorker.this, "لم يتم اضافه صوره البطاقه", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    send_to_url(name.getText().toString(), work.getText().toString(), phone.getText().toString());
                }
            }
        });
    }


    @Override
    protected void onActivityResult(int reqCode, int resultCode, Intent data) {
        super.onActivityResult(reqCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            try {
                final Uri imageUri = data.getData();
                final InputStream imageStream = getContentResolver().openInputStream(imageUri);
                selectedImage = BitmapFactory.decodeStream(imageStream);
                image.setImageBitmap(selectedImage);
                image.getLayoutParams().height = 200;
                image.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(this, "Something went wrong", Toast.LENGTH_LONG).show();
            }

        } else {
            Toast.makeText(this, "You haven't picked Image", Toast.LENGTH_LONG).show();
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    private void send_to_url(String name, String work, String phone) {
    }
}
