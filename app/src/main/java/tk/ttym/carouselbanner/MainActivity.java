package tk.ttym.carouselbanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FlyBanner flyBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flyBanner = (FlyBanner) findViewById(R.id.fly_banner);
        flyBanner.setAdData(buildTestData());
    }


    public ArrayList<BannerModel> buildTestData(){
        ArrayList<BannerModel> mList = new ArrayList<>();
        BannerModel model = new BannerModel();
        model.setBannerImage("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1498447116&di=0d19de06ce81258594f45111547009b6&src=http://pic.58pic.com/58pic/13/21/22/71g58PICBQT_1024.jpg");
        model.setBannerUrl("http://baidu.com");
        mList.add(model);
        BannerModel model2 = new BannerModel();
        model2.setBannerImage("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1498457198658&di=ac7ac3a461777d615b86b3b07fd0db90&imgtype=0&src=http%3A%2F%2Fpic2.ooopic.com%2F10%2F55%2F16%2F14b1OOOPIC4d.jpg");
        model2.setBannerUrl("http://baidu.com");
        mList.add(model2);
        return mList;
    }
}
