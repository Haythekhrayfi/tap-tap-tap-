package android.support.v4.media;

import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.v4.media.h;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i<T extends h> extends g<T> {
    public i(T t10) {
        super(t10);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((h) this.f395a).b(str, list, bundle);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public void onError(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((h) this.f395a).a(str, bundle);
    }
}
