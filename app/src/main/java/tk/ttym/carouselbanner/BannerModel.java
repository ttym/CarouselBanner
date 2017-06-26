package tk.ttym.carouselbanner;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ttym on 2017/6/26.
 */

public class BannerModel  {

    public String bannerImage;
    public String bannerUrl;
    public int height, width;

    public BannerModel() {
        super();
    }


    protected void parseData(JSONObject dataObj) throws JSONException {
        this.bannerImage = dataObj.optString("image");
        this.bannerUrl = dataObj.optString("url");
        this.height = dataObj.optInt("h");
        this.width = dataObj.optInt("w");
    }

    public String getBannerImage() {
        return bannerImage;
    }

    public void setBannerImage(String bannerImage) {
        this.bannerImage = bannerImage;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
