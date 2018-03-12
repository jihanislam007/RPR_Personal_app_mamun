package devsbox.jihanislam007.mamun;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TvNewsFotageActivity extends AppCompatActivity {

    TextView head, body;
    ImageView call, sms, mail;
    Dialog mDialog;
    ImageView firstcall, secondcall, thirdcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_news_fotage);

        head = (TextView) findViewById(R.id.headTextView);
        body = (TextView) findViewById(R.id.bodyTextView);

        head.setText(getIntent().getStringExtra("data_head"));
        body.setText(getIntent().getStringExtra("data_body"));

        call = (ImageView) findViewById(R.id.callImageView);
        sms = (ImageView) findViewById(R.id.smsImageView);
        mail = (ImageView) findViewById(R.id.mailImageView);

        Intent inten = getIntent();
        int id = inten.getIntExtra("identity", 0);
        if (id == 11) {
            sms.setVisibility(View.GONE);
            call.setVisibility(View.GONE);
        }
        else if(id==12){
            call.setVisibility(View.GONE);
        }


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialcall();
            }
        });
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendsms();
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendmail();
            }
        });


    }

    //////////////////////method working/////////////
    protected void dialcall() {
        Intent inten = getIntent();
        int id = inten.getIntExtra("identity", 0);
        pop();


        /*firstcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  Toast.makeText(TvNewsFotageActivity.this,"tv fotej 1" , Toast.LENGTH_LONG).show();
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01730012304"));
                startActivity(callIntent);
            }
        });

        secondcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //    Toast.makeText(TvNewsFotageActivity.this,"tv fotej 2" , Toast.LENGTH_LONG).show();
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01730012305"));
                startActivity(callIntent);

            }
        });

        thirdcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //    Toast.makeText(TvNewsFotageActivity.this,"tv fotej 3" , Toast.LENGTH_LONG).show();
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+88-01730012306"));
                startActivity(callIntent);

            }
        });
        mDialog.show();*/

        if (id == 1) {// this is only for tv newes /////

            firstcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //  Toast.makeText(TvNewsFotageActivity.this,"tv fotej 1" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+8801730012308"));
                    startActivity(callIntent);
                }
            });

            secondcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //    Toast.makeText(TvNewsFotageActivity.this,"tv fotej 2" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+8801730012309"));
                    startActivity(callIntent);

                }
            });

            thirdcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //    Toast.makeText(TvNewsFotageActivity.this,"tv fotej 3" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+8801730012307"));
                    startActivity(callIntent);

                }
            });
            mDialog.show();

        } else if (id != 1) { // this is for all.....

            firstcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 1" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+8801730012304"));
                    startActivity(callIntent);
                }
            });

            secondcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 2" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+8801730012305"));
                    startActivity(callIntent);

                }
            });

            thirdcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //  Toast.makeText(TvNewsFotageActivity.this,"Media covarage 3" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+8801730012306"));
                    startActivity(callIntent);

                }
            });
            mDialog.show();
        }

        /* else if (id == 3) {

            firstcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 1" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01730012303"));
                    startActivity(callIntent);
                }
            });

            secondcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 2" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01730012304"));
                    startActivity(callIntent);

                }
            });

            thirdcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //  Toast.makeText(TvNewsFotageActivity.this,"Media covarage 3" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01730012305"));
                    startActivity(callIntent);

                }
            });
            mDialog.show();
        } else if (id == 4) {

            firstcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 1" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01709955691"));
                    startActivity(callIntent);
                }
            });

            secondcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 2" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01709955692"));
                    startActivity(callIntent);

                }
            });

            thirdcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //  Toast.makeText(TvNewsFotageActivity.this,"Media covarage 3" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01709955693"));
                    startActivity(callIntent);

                }
            });
            mDialog.show();
        } else if (id == 5) {

            firstcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 1" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01730012303"));
                    startActivity(callIntent);
                }
            });

            secondcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 2" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01730012304"));
                    startActivity(callIntent);

                }
            });

            thirdcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //  Toast.makeText(TvNewsFotageActivity.this,"Media covarage 3" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01730012305"));
                    startActivity(callIntent);

                }
            });
            mDialog.show();
        } else if (id == 6) {

            firstcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 1" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01730012303"));
                    startActivity(callIntent);
                }
            });

            secondcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 2" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01730012304"));
                    startActivity(callIntent);

                }
            });

            thirdcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //  Toast.makeText(TvNewsFotageActivity.this,"Media covarage 3" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01730012305"));
                    startActivity(callIntent);

                }
            });
            mDialog.show();
        } else if (id == 7) {

            firstcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 1" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01709955691"));
                    startActivity(callIntent);
                }
            });

            secondcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 2" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01709955692"));
                    startActivity(callIntent);

                }
            });

            thirdcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //  Toast.makeText(TvNewsFotageActivity.this,"Media covarage 3" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01709955693"));
                    startActivity(callIntent);

                }
            });
            mDialog.show();
        } else if (id == 8) {

            firstcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 1" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01974012300"));
                    startActivity(callIntent);
                }
            });

            secondcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 2" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01975012300"));
                    startActivity(callIntent);

                }
            });

            thirdcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //  Toast.makeText(TvNewsFotageActivity.this,"Media covarage 3" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01976012300"));
                    startActivity(callIntent);

                }
            });
            mDialog.show();
        } else if (id == 9) {

            firstcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 1" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01971012300"));
                    startActivity(callIntent);
                }
            });

            secondcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 2" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01972012300"));
                    startActivity(callIntent);

                }
            });

            thirdcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //  Toast.makeText(TvNewsFotageActivity.this,"Media covarage 3" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01973012300"));
                    startActivity(callIntent);

                }
            });
            mDialog.show();
        } else if (id == 10) {

            firstcall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Toast.makeText(TvNewsFotageActivity.this,"Media covarage 1" , Toast.LENGTH_LONG).show();
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:+88-01730012300"));
                    startActivity(callIntent);
                }
            });


            secondcall.setVisibility(View.GONE);

            thirdcall.setVisibility(View.GONE);

            mDialog.show();
        }*/

    }

    protected void sendsms() {

        Intent inten = getIntent();
        int id = inten.getIntExtra("identity", 0);

        Intent sms = new Intent(TvNewsFotageActivity.this, SendTvfotejMessageActivity.class);

        if (id == 1) {
            int sms_value = 1;
            sms.putExtra("sms_value", sms_value);
        }
        if (id == 2) {
            int sms_value = 2;
            sms.putExtra("sms_value", sms_value);
        }
        if (id == 3) {
            int sms_value = 3;
            sms.putExtra("sms_value", sms_value);
        }
        if (id == 4) {
            int sms_value = 4;
            sms.putExtra("sms_value", sms_value);
        }
        if (id == 5) {
            int sms_value = 5;
            sms.putExtra("sms_value", sms_value);
        }
        if (id == 6) {
            int sms_value = 6;
            sms.putExtra("sms_value", sms_value);
        }
        if (id == 7) {
            int sms_value = 7;
            sms.putExtra("sms_value", sms_value);
        }
        if (id == 8) {
            int sms_value = 8;
            sms.putExtra("sms_value", sms_value);
        }
        if (id == 9) {
            int sms_value = 9;
            sms.putExtra("sms_value", sms_value);
        }
        if (id == 10) {
            int sms_value = 10;
            sms.putExtra("sms_value", sms_value);
        }
        if (id == 11) {
            int sms_value = 11;
            sms.putExtra("sms_value", sms_value);
        }
        if (id == 12) {
            int sms_value = 12;
            sms.putExtra("sms_value", sms_value);
        }
        startActivity(sms);
    }

    protected void sendmail() {

        Intent in = getIntent();
        int id = in.getIntExtra("identity",0);

        String[] TO = {"info.rapidpr@gmail.com ,sishakhor@gmail.com , rapidprbd@gmail.com , bdm7.rapidpr@gmail.com"};
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
            Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
        }

        /*if(id==1) {
            Log.i("Send email", "");
            String[] TO = {"info.rapidpr@gmail.com , mkt3.rapidpr@gmail.com , rapidprbd@gmail.com,gso2.rapidpr@gmail.com , mkt2.rapidpr@gmail.com"};
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
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
        else if(id==2){
            Log.i("Send email", "");
            String[] TO = {"info.rapidpr@gmail.com ,mkt3.rapidpr@gmail.com  ,mkt9.rapidpr@gmail.com ,gso2.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com"};
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
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
        else if(id==3){
            Log.i("Send email", "");
            String[] TO = {"info.rapidpr@gmail.com ,mkt3.rapidpr@gmail.com  ,mkt4.rapidpr@gmail.com ,gso2.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com"};
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
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
        else if(id==4){
            Log.i("Send email", "");
            String[] TO = {"info.rapidpr@gmail.com ,mkt3.rapidpr@gmail.com  ,mkt4.rapidpr@gmail.com ,gso2.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com"};
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
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
        else if(id==5){
            Log.i("Send email", "");
            String[] TO = {"info.rapidpr@gmail.com ,mkt3.rapidpr@gmail.com  ,mkt9.rapidpr@gmail.com ,gso2.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com"};
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
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
        else if(id==6){
            Log.i("Send email", "");
            String[] TO = {"info.rapidpr@gmail.com ,mkt3.rapidpr@gmail.com  ,mkt4.rapidpr@gmail.com ,gso2.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com"};
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
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
        else if(id==7){
            Log.i("Send email", "");
            String[] TO = {"info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com "};
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
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
        else if(id==8){
            Log.i("Send email", "");
            String[] TO = {"tours.rapidpr@gmail.com , info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com"};
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
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
        else if(id==9){
            Log.i("Send email", "");
            String[] TO = {"tours.rapidpr@gmail.com , info.rapidpr@gmail.com , mkt2.rapidpr@gmail.com  , mkt3.rapidpr@gmail.com"};
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
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
        else if(id==10){
            Log.i("Send email", "");
            String[] TO = {"info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com"};
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
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
        else if(id==11){
            Log.i("Send email", "");
            String[] TO = {"career.rapidpr@gmail.com , info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com"};
            String[] CC = {""};
            Intent emailIntent = new Intent(Intent.ACTION_SEND);

            emailIntent.setData(Uri.parse("mailto:"));
            emailIntent.setType("text/plain");
            emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
            emailIntent.putExtra(Intent.EXTRA_CC, CC);
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Job in RAPID PR");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "আপনার ইমেইলটি লিখুন ... ");

            try {
                startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                //    finish();
                Log.i("sending Finished ...", "");
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }
        }
        else if(id==12){
            Log.i("Send email", "");
            String[] TO = {"info.rapidpr@gmail.com ,mkt2.rapidpr@gmail.com , mkt3.rapidpr@gmail.com"};
            String[] CC = {""};
            Intent emailIntent = new Intent(Intent.ACTION_SEND);

            emailIntent.setData(Uri.parse("mail to:"));
            emailIntent.setType("text/plain");
            emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
            emailIntent.putExtra(Intent.EXTRA_CC, CC);
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Complain ... ");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "আপনার ইমেইলটি লিখুন ... ");

            try {
                startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                //    finish();
                Log.i("sending Finished ...", "");
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(TvNewsFotageActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
            }

        }else{
            Intent inte = new Intent(TvNewsFotageActivity.this,HomeActivity.class);
            startActivity(inte);
        }*/

    }

    public void pop() {

        mDialog = new Dialog(TvNewsFotageActivity.this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.pop_up_window);

        firstcall = (ImageView) mDialog.findViewById(R.id.firstcallimageView);
        secondcall = (ImageView) mDialog.findViewById(R.id.secondcallimageView);
        thirdcall = (ImageView) mDialog.findViewById(R.id.thirdcallimageView);


    }
}