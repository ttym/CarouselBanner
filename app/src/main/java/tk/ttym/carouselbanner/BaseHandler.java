package tk.ttym.carouselbanner;

import android.os.Handler;
import android.os.Message;

import java.lang.ref.WeakReference;

/**
 * 使用弱引用建立Handler
 * Created by ttym on 2017/6/26.
 */

public abstract class BaseHandler<T> extends Handler {

    private WeakReference<T> weakReference;

    public BaseHandler(T t) {
        this.weakReference = new WeakReference<>(t);
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        T t = weakReference.get();
        if (t == null) return;
        handleMessageProcess(msg, t);
    }

    public abstract void handleMessageProcess(Message msg, T t);
}
