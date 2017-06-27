package com.test.hanchengyang.photogallery;

import android.os.HandlerThread;
import android.util.Log;

/**
 * Project : PhotoGallery
 * Created by Hancheng Yang ( hancheng.yang@eptender.com )
 * Date : 27/06/2017, 18:08
 * Description :
 **/
public class ThumbnailDownloader<T> extends HandlerThread {
    private static final String TAG = "ThumbnailDownloader";
    private boolean mHasQuit = false;
    public ThumbnailDownloader() {
        super(TAG);
    }

    @Override
    public boolean quit() {
        mHasQuit = true;
        return super.quit();
    }

    public void queueThumbnail(T target, String url) {
        Log.i(TAG, "Got a URL: " + url);
    }

}
