package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.support.v4.media.f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g<T extends f> extends MediaBrowser.SubscriptionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f395a;

    public g(T t10) {
        this.f395a = t10;
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
        this.f395a.c(str, list);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onError(String str) {
        this.f395a.onError(str);
    }
}
