package devsbox.jihanislam007.mamun;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {


    ImageView call ,sms ,mail, fb , imo , messanger , vaiver , whatsapp;
    Button footer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        footer = (Button) findViewById(R.id.bottom);
        call = (ImageView) findViewById(R.id.imageViewCall);
        sms = (ImageView) findViewById(R.id.imageViewSms);
        mail = (ImageView) findViewById(R.id.imageViewmail);

        footer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(HomeActivity.this,Service_main.class);
                startActivity(in);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01817511628"));
                startActivity(callIntent);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*String one = "+88-01817511628";
                Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                smsIntent.setType("vnd.android-dir/mms-sms");
                smsIntent.putExtra("address", one);
                //smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                startActivity(smsIntent);*/

                String one = "+88-01817511628";
                Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                smsIntent.setType("vnd.android-dir/mms-sms");
                smsIntent.putExtra("address", one );
            //    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                startActivity(smsIntent);


                Toast.makeText(HomeActivity.this, "আপনার বার্তা পাঠানোর জন্য তৈরী ", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("Send email", "");
                String[] TO = {"info.rapidpr@gmail.com"};
                String[] CC = {""};
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "আপনার বিষয় ...");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "আপনার ইমেইলটি লিখুন ... ");

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    //    finish();
                    Log.i("sending Finished ...", "");
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(HomeActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        /*fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uri = "https://www.facebook.com/shahidulislamshakhor";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        imo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                *//*Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01730012300"));
                startActivity(callIntent);*//*

            //    Log.i("Send email", "");
                String[] TO = {"+88-01730012300"};
           //     String[] CC = {""};
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setData(Uri.parse("Call to:"));
                emailIntent.setType("Audio/Video");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
           //     emailIntent.putExtra(Intent.EXTRA_CC, CC);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "আপনার বিষয় ...");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "আপনার ইমেইলটি লিখুন ... ");

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    //    finish();
                    Log.i("sending Finished ...", "");
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(MainActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        messanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String uri = "https://www.facebook.com/messages/t/shahidulislamshakhor";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        vaiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01730012300"));
                startActivity(callIntent);
            }
        });

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01730012300"));
                startActivity(callIntent);
            }
        });*/
    }
}