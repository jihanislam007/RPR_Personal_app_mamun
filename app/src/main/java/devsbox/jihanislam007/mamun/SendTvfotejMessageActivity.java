package devsbox.jihanislam007.mamun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

public class SendTvfotejMessageActivity extends AppCompatActivity {

    EditText name, mobile, email, date_time, header, bodyer;
    Button sendsms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_tvfotej_message);

        name = (EditText) findViewById(R.id.NameEditText);
        mobile = (EditText) findViewById(R.id.MobilEditText);
        email = (EditText) findViewById(R.id.EmailEditText);
        date_time = (EditText) findViewById(R.id.DateEditText);
        header = (EditText) findViewById(R.id.SubjectEditText);
        bodyer = (EditText) findViewById(R.id.OvijugEditText);
        sendsms = (Button) findViewById(R.id.sendButton);


/////////////////////date and time picker////////////////////////////
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        //tv.setText(currentDateTimeString);
        final String date = currentDateTimeString;
        //   Toast.makeText(SendTvfotejMessageActivity.this, date , Toast.LENGTH_LONG).show();

        /////////////////editView////////////////////////
        Intent in = getIntent();
        final int smsValue = in.getIntExtra("sms_value", 0);

        if (smsValue == 1) {
            header.setHint(" বিষয় লিখুন ");
            bodyer.setHint(" টিভির নাম, অনুষ্ঠানের তারিখ,\nকোন অনুষ্ঠানের ফুটেজ,\nসংশ্লিষ্ট শিল্পী/সংবাদ পাঠক বা \nউক্ত অনুষ্ঠানের প্রধান অতিথি কে - তা লিখুন ");

            date_time.setVisibility(View.GONE);
        } else if (smsValue == 2) {
            email.setHint("পরবর্তী যোগাযোগের জন্য ইমেইলটি লিখুন ");
            date_time.setHint("ইভেন্টের তারিখ");
            header.setHint(" ইভেন্টের স্থান ");
            bodyer.setHint(" ইভেন্টের সময়");
        } else if (smsValue == 3) {
            email.setHint("পরবর্তী যোগাযোগের জন্য ইমেইলটি লিখুন ");
            header.setHint("মনিটরিং এর বিষয় কি ?");
            bodyer.setHint("বিস্তারিত তথ্য লিখুন.....");

            date_time.setVisibility(View.GONE);
        } else if (smsValue == 4) {
            email.setHint("পরবর্তী যোগাযোগের জন্য ইমেইলটি লিখুন ");
            date_time.setHint("ইভেন্টের তারিখ");
            header.setHint(" ভেনু কোথায় ?");
            bodyer.setHint(" কি ইভেন্ট করতে চান ?");

        } else if (smsValue == 5) {
            email.setHint("পরবর্তী যোগাযোগের জন্য ইমেইলটি লিখুন ");
            header.setHint("কোন পণ্যের প্রচার করবেন ?");
            bodyer.setHint("বিস্তারিত তথ্য লিখুন.....");

            date_time.setVisibility(View.GONE);
        } else if (smsValue == 6) {
            email.setHint("পরবর্তী যোগাযোগের জন্য ইমেইলটি লিখুন ");
            date_time.setHint("ইভেন্টের তারিখ");
            header.setHint(" ইভেন্টের স্থান ");
            bodyer.setHint(" ইভেন্টের সময়");

        } else if (smsValue == 7) {
            email.setHint("পরবর্তী যোগাযোগের জন্য ইমেইলটি লিখুন ");
            date_time.setHint("ইভেন্টের তারিখ");
            header.setHint(" ইভেন্টের স্থান ");
            bodyer.setHint(" ইভেন্টের সময়");

        } else if (smsValue == 8) {
            email.setHint("পরবর্তী যোগাযোগের জন্য ইমেইলটি লিখুন ");
            date_time.setHint("যাত্রা শুরুর স্থান");
            header.setHint("যাত্রা শেষের স্থান ");
            bodyer.setHint("বিস্তারিত তথ্য লিখুন.....");

        } else if (smsValue == 9) {
            email.setHint("পরবর্তী যোগাযোগের জন্য ইমেইলটি লিখুন ");
            date_time.setHint("কোন তারিখের জন্য ?");
            header.setHint("যাত্রা শুরুর স্থান ");
            bodyer.setHint("বিস্তারিত তথ্য লিখুন.....");

        } else if (smsValue == 10) {
            email.setHint("পরবর্তী যোগাযোগের জন্য ইমেইলটি লিখুন ");
            header.setHint(" বিষয় লিখুন ");
            bodyer.setHint("বিস্তারিত তথ্য লিখুন.....");

            date_time.setVisibility(View.GONE);
        } else if (smsValue == 11) {
        } else if (smsValue == 12) {
            email.setHint("পরবর্তী যোগাযোগের জন্য ইমেইলটি লিখুন ");
            bodyer.setHint("তারিখ , সময় উল্লেখ করে\n আপনার  অভিযোগ বিস্তারিত লিখুন...");

            date_time.setVisibility(View.GONE);
            header.setVisibility(View.GONE);
        }

        sendsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String namedata = name.getText().toString();
                String mobildata = mobile.getText().toString();
                String emaildata = email.getText().toString();
                String date_time_value = date_time.getText().toString();
                String head = header.getText().toString();
                String body = bodyer.getText().toString();

                Intent in = getIntent();
                final int smsValue = in.getIntExtra("sms_value", 0);

                if(smsValue==1){
                    String one = "+8801730012308";
                    String two = "+8801730012309";
                    String three = "+8801730012307";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one + ";" + two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();

                }else if(smsValue==2){

                    String one = "+8801730012304";
                    String two = "+8801730012305";
                    String three = "+8801730012306";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one + ";" + two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();

                }

                else if(smsValue==3){

                    String one = "+8801730012304";
                    String two = "+8801730012305";
                    String three = "+8801730012306";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one + ";" + two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();

                }

                else if(smsValue==4){

                    String one = "+8801730012304";
                    String two = "+8801730012305";
                    String three = "+8801730012306";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one + ";" + two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();

                }

                else if(smsValue==5){

                    String one = "+8801730012304";
                    String two = "+8801730012305";
                    String three = "+8801730012306";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one + ";" + two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();

                }

                else if(smsValue==6){

                    String one = "+8801730012304";
                    String two = "+8801730012305";
                    String three = "+8801730012306";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one + ";" + two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();

                }

                else if(smsValue==7){

                    String one = "+8801730012304";
                    String two = "+8801730012305";
                    String three = "+8801730012306";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one + ";"+ two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();

                }

                else if(smsValue==8){
                    /////////////////biman ticket/////////////

                    String one = "+8801730012304";
                    String two = "+8801730012305";
                    String three = "+8801730012306";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();

                }

                else if(smsValue==9){
////city tours///////////
                    String one = "+8801730012304";
                    String two = "+8801730012305";
                    String three = "+8801730012306";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one + ";" + two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();
                }

                else if(smsValue==10){

                    String one = "+8801730012304";
                    String two = "+8801730012305";
                    String three = "+8801730012306";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one + ";" + two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();
                }

                else if(smsValue==11){
////cv pathan///////////
                    String one = "+8801730012304";
                    String two = "+8801730012305";
                    String three = "+8801730012306";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one + ";" + two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();
                }

                else if(smsValue==12){
////cv pathan///////////
                    String one = "+8801730012304";
                    String two = "+8801730012305";
                    String three = "+8801730012306";
                    String four = "+8801730012300";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one + ";" + two + ";" + three+ ";" + four);
                    smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                    startActivity(smsIntent);


                    Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                    finish();
                }

               /* switch (smsValue) {
                    case 1:


                        if (namedata.isEmpty() || mobildata.isEmpty() || head.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01730012303";
                            String two = "01730012304";
                            String three = "01730012308";
                            String four = "01709955701";
                            String five = "01730012300";
                            String six = "01711425005";
                            String seven = "01730012302";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven);
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }
                        break;

                    case 2:


                        if (namedata.isEmpty() || mobildata.isEmpty() || date_time_value.isEmpty() || head.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01730012309";
                            String two = "01730012303";
                            String three = "01730012304";
                            String four = "01972012300";
                            String five = "01730012300";
                            String six = "01711425005";
                            String seven = "01730012302";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven);
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Event Date: " + date_time_value + "\n\n" + "Event Place" + head + "\n\n" + "Event Time: " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }
                        break;
                    case 3:


                        if (namedata.isEmpty() || mobildata.isEmpty() || head.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01730012303";
                            String two = "01730012304";
                            String three = "01730012305";
                            String four = "01709955701";
                            String five = "01972012300";
                            String six = "01730012300";
                            String seven = "01730012302";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven);
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }

                        break;

                    case 4:


                        if (namedata.isEmpty() || mobildata.isEmpty() || date_time_value.isEmpty() || head.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01709955691";
                            String two = "01709955692";
                            String three = "01709955693";
                            String four = "01678590037";
                            String five = "01730012300";
                            String six = "01711425005";
                            String seven = "01730012302";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven);
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Event Date: " + date_time_value + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }
                        break;

                    case 5:


                        if (namedata.isEmpty() || mobildata.isEmpty() || head.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01730012303";
                            String two = "01730012304";
                            String three = "01730012305";
                            String four = "01972012300";
                            String five = "01730012300";
                            String six = "01711425005";
                            String seven = "01730012302";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven);
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }
                        break;

                    case 6:


                        if (namedata.isEmpty() || mobildata.isEmpty() || date_time_value.isEmpty() || head.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01730012303";
                            String two = "01730012304";
                            String three = "01730012305";
                            String four = "01709955701";
                            String five = "01730012300";
                            String six = "01972012300";
                            String seven = "01730012302";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven);
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Event Date: " + date_time_value + "\n\n" + "Event Place" + head + "\n\n" + "Event Time: " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }
                        break;

                    case 7:


                        if (namedata.isEmpty() || mobildata.isEmpty() || date_time_value.isEmpty() || head.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01709955691";
                            String two = "01709955692";
                            String three = "01709955693";
                            String four = "01678590037";
                            String five = "01711425005";
                            String six = "01730012300";
                            String seven = "01730012302";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven);
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Event Date: " + date_time_value + "\n\n" + "Event Place" + head + "\n\n" + "Event Time: " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }
                        break;

                    case 8:


                        if (namedata.isEmpty() || mobildata.isEmpty() || date_time_value.isEmpty() || head.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01974012300";
                            String two = "01975012300";
                            String three = "01976012300";
                            String four = "01972012300";
                            String five = "01711425005";
                            String six = "01730012300";
                            String seven = "01730012302";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven);
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "From : " + date_time_value + "\n\n" + "To" + head + "\n\n" + "Event Time: " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }
                        break;

                    case 9:


                        if (namedata.isEmpty() || mobildata.isEmpty() || date_time_value.isEmpty() || head.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {


                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01971012300";
                            String two = "01972012300";
                            String three = "01973012300";
                            String four = "01711425005";
                            String five = "01730012300";
                            String seven = "01730012302";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + seven);
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Tour Date : " + date_time_value + "\n\n" + "Start Place" + head + "\n\n" + "Details : " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }
                        break;

                    case 10:


                        if (namedata.isEmpty() || mobildata.isEmpty() || head.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01730012300";
                            String seven = "01730012302";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one + ";" + seven);
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }
                        break;

                    case 11:
                       *//* if (namedata.isEmpty() || mobildata.isEmpty() || head.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01730012300";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one );
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Subject: " + head + "\n\n" + "Body: " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }*//*
                        break;

                    case 12:


                        if (namedata.isEmpty() || mobildata.isEmpty() || body.isEmpty()) {
                            Toast.makeText(SendTvfotejMessageActivity.this, "খালিঘর সঠিকভাবে লিখুন ...", Toast.LENGTH_LONG).show();
                        } else {

                            Toast.makeText(SendTvfotejMessageActivity.this, "1", Toast.LENGTH_LONG).show();
                            //Getting intent and PendingIntent instance
                            String one = "01730012300";
                            String seven = "01730012302";
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setType("vnd.android-dir/mms-sms");
                            smsIntent.putExtra("address", one + ";" + seven);
                            smsIntent.putExtra("sms_body", ("Sending Date: " + date + "\n\n" + "Name: " + namedata + "\n\n" + "Mobile: " + mobildata + "\n\n" + "Email: " + emaildata + "\n\n" + "Body: " + body));
                            startActivity(smsIntent);


                            Toast.makeText(SendTvfotejMessageActivity.this, "আপনার বার্তার জন্য আপনাকে ধন্যবাদ ", Toast.LENGTH_LONG).show();
                            finish();

                        }
                        break;
                    default:
                        break;
                }*/

            }
        });
    }

}