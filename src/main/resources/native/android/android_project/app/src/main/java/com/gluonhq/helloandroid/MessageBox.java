package com.gluonhq.helloandroid;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MessageBox
{
    void show(String title, String message)
    {
        dialog = new AlertDialog.Builder(MainActivity.instance) // Pass a reference to your main activity here
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        dialog.cancel();
                    }
                })
                .show();
    }

    private AlertDialog dialog;
}