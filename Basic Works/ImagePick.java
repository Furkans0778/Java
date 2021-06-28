package com.furkan.instaclonefire;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import java.io.IOException;


public class resimSecme extends AppCompatActivity {
    Uri resimBilgisi;  path
    Bitmap secilenResim; resimGosterme cast islem


    ImageView resimGosterme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload);
        resimGosterme = findViewById(R.id.resimSecUi);

    }


    public void resimSec(View view) {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
        } else {
            Intent goGaleri = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(goGaleri, 2);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if (requestCode == 1) {
            if (grantResults.length  0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Intent goGaleri = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(goGaleri, 2);
            }
        }

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (requestCode == 2 && resultCode == RESULT_OK && data != null) {
            resimBilgisi = data.getData();

            try {
                if (Build.VERSION.SDK_INT = 28) {
                    ImageDecoder.Source source = ImageDecoder.createSource(this.getContentResolver(), resimBilgisi);
                    secilenResim = ImageDecoder.decodeBitmap(source);
                    resimGosterme.setImageBitmap(secilenResim);
                } else {
                    secilenResim = MediaStore.Images.Media.getBitmap(this.getContentResolver(), resimBilgisi);
                    resimGosterme.setImageBitmap(secilenResim);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        super.onActivityResult(requestCode, resultCode, data);
    }
}

