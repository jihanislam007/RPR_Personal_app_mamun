package devsbox.jihanislam007.mamun;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Service_main extends AppCompatActivity {

    ImageButton tvNewes;
    ImageButton media_covareg;
    ImageButton media_monitoring;
    ImageButton evnt;
    ImageButton email_marketing;
    ImageButton agm;
    ImageButton video;
    ImageButton biman;
    ImageButton tours;
    ImageButton rapid;
    ImageButton cv;
    ImageButton complain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_main);

        tvNewes = (ImageButton) findViewById(R.id.tvNewsViewTextView);
        media_covareg = (ImageButton) findViewById(R.id.media_covaragViewTextView);
        media_covareg = (ImageButton) findViewById(R.id.media_covaragViewTextView);
        media_monitoring = (ImageButton) findViewById(R.id.media_monitoring);
        evnt = (ImageButton) findViewById(R.id.event_managment);
        email_marketing = (ImageButton) findViewById(R.id.email_marketing);
        agm = (ImageButton) findViewById(R.id.agm);
        video = (ImageButton) findViewById(R.id.vedio);
        biman = (ImageButton) findViewById(R.id.biman);
        tours = (ImageButton) findViewById(R.id.toures);
        rapid = (ImageButton) findViewById(R.id.rapid);
        cv = (ImageButton) findViewById(R.id.cv);
        complain = (ImageButton) findViewById(R.id.complain);

        tvNewes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "টিভি নিউজ ফুটেজ";
                String data_body = "র\u200D্যাপিড পিআর বাংলাদেশের প্রথম ডিজিটাল মিডিয়া আর্কাইভ । ২০০০ সাল থেকে দেশের সবকটি টেলিভিশনে প্রচারিত সব ফুটেজ আর্কাইভে সংরক্ষণ করে আসছে । " +
                        "আপনার প্রয়োজনে Call, SMS অথবা Email করুন ।";
                int identity = 1;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

        media_covareg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "মিডিয়া কাভারেজ";
                String data_body = "র\u200D্যাপিড পিআর দেশের উল্লেখযোগ্য সংখ্যক প্রতিষ্ঠানের প্রমোশনাল নিউজ , বিভিন্ন টেলিভিশনের বাণিজ্য সংবাদে প্রচারে ব্যবস্থা করে থাকে ।আপনার প্রয়োজনে Call, SMS অথবা Email করুন ।";
                int identity = 2;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

        media_monitoring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "মিডিয়া মনিটরিং ";
                String data_body = "র\u200D্যাপিড পিআর সরকারী / বেসরকারী প্রতিষ্ঠান , সংস্থা ও ব্যাক্তি পর্যায়ের গবেষকদের জন্যে ২৫ টি টেলিভিশন এবং ৫৬ টি পত্রিকা ,৬ টি রেডিও এবং ২০ টি অনলাইন পোর্টাল মনিটরিং করে থাকে ।"+
                        "আপনার প্রয়োজনে Call, SMS অথবা Email করুন ।";
                int identity = 3;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

        evnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "ইভেন্ট ম্যানেজমেন্ট";
                String data_body = "র\u200D্যাপিড পিআর রাষ্ট্রীয় , প্রাতিষ্ঠানিক, সামাজিক ও ব্যক্তিগত পর্যায়ের সব ইভেন্ট ম্যানেজমেন্ট করে থাকে ।আপনার প্রয়োজনে Call, SMS অথবা Email করুন ।";
                int identity = 4;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

        email_marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "ইমেইল মার্কেটিং";
                String data_body = "র\u200D্যাপিড পিআর বাংলাদেশের সবচেয়ে বড় আকারের কর্পোরেট ইমেইল ডাটাবেজ নিয়ে সরকারী/বেসরকারী বিভিন্ন প্রতিষ্ঠানের ইলেক্ট্রনিক প্রচার করে থাকে ।আপনার প্রয়োজনে Call, SMS অথবা Email করুন ।";
                int identity = 5;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

        agm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "এ জি এম কনফারেন্স";
                String data_body = "র\u200D্যাপিড পিআর বাণিজ্যিক প্রতিষ্ঠানসমূহের এ জি এম , কনফারেন্স উদ্বোধন , সাংস্কৃতিক অনুষ্ঠানের সব ধরনের আয়োজন করে থাকে ।" + "আপনার প্রয়োজনে Call, SMS অথবা Email করুন ।";
                int identity = 6;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "ভিডিওগ্রাফি, ফটোগ্রাফি";
                String data_body = "র\u200D্যাপিড পিআর যে কোন কর্পোরেট প্রতিষ্ঠানের ভিডিওগ্রাফী ও ফটোগ্রাফী এবং ডকুমেন্টারী নির্মাণ করে থাকে ।"+"আপনার প্রয়োজনে Call, SMS অথবা Email করুন ।";
                int identity = 7;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

        biman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "বিমান টিকেট ";
                String data_body = "র\u200D্যাপিড পিআর এ অভ্যন্তরীণ  ও আন্তর্জাতিক সকল রুটের বিমান টিকেট পাওয়া যায় ।আপনার প্রয়োজনে Call, SMS অথবা Email করুন ।";
                int identity = 8;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

        tours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "সিটি ট্যুরস";
                String data_body = "বাংলাদেশকে বিদেশী মেহমানদের কাছে নান্দনিকভাবে তুলে ধরতে র\u200D্যাপিড পিআর চালু করছে সিটি ট্যুরস ।আপনার প্রয়োজনে Call, SMS অথবা Email করুন ।";
                int identity = 9;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

        rapid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "র\u200D্যাপিড পিআর ";
                String data_body = "২০০০ সালের ১ লা জানুয়ারী যাত্রা শুরু করে বাংলাদেশের প্রথম ডিজিটাল মিডিয়া আর্কাইভ র\u200D্যাপিড পিআর । " +
                        "যে সব সার্ভিসের অন্তর্ভুক্ত তা হল -\n\n" +
                        "টিভি মিডিয়া কভারেজ\n" +
                        "মিডিয়া মনিটরিং \n" +
                        "ইভেন্ট ম্যানেজমেন্ট\n" +
                        "ইমেইল মার্কেটিং\n" +
                        "প্রোডাক্ট লঞ্ছিং\n" +
                        "নিউজপেপার কভারেজ\n" +
                        "কালচারাল শো\n" +
                        "নিউজ আর্কাইভ\n" +
                        "এ জি এম\n" +
                        "এস এম এস মার্কেটিং\n" +
                        "ফ্যাশন শো\n" +
                        "অনলাইন মার্কেটিং\n" +
                        "রোড শো\n" +
                        "রেডিও সম্প্রচার\n" +
                        "সেট ডিজাইন\n" +
                        "ডকুমেন্টারী ফিল্ম । আপনার প্রয়োজনে Call, SMS অথবা Email করুন ।";
                int identity = 10;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "সিভি";
                String data_body = "র\u200D্যাপিড পিআর চায় দেশে দক্ষ জনশক্তি গড়ে উঠুক । এই অগ্রযাত্রায় আপনি যোগ দিতে চাইলে আজই আপনার সিভি পাঠান ।" +"আপনার প্রয়োজনে Email করুন ।";
                int identity = 11;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

        complain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data_head = "কমপ্লেইন বক্স";
                String data_body = "সামগ্রিক কাজ করতে যেয়ে আমাদের ছোটখাটো ভুল ভ্রান্তি থাকতেই পারে । একজন শুভাকাঙ্ক্ষী হিসেবে আমরা আপনার অভিযোগ বা সুচিন্তিত পরামর্শ কামনা করছি । " +
                        "আপনার সুন্দর পরামর্শে আরো অধিক গতিময় হবে র\u200D্যাপিড পিআর।আপনার প্রয়োজনে  SMS অথবা Email করুন ।";
                int identity = 12;
                Intent tv = new Intent(Service_main.this, TvNewsFotageActivity.class);
                tv.putExtra("data_head", data_head);
                tv.putExtra("data_body", data_body);
                tv.putExtra("identity", identity);
                startActivity(tv);
            }
        });

    }
}