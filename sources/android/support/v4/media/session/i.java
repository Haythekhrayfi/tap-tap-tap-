package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.h;

/* JADX INFO: loaded from: classes.dex */
public class i<T extends h> extends g<T> {
    public i(T t10) {
        super(t10);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromUri(Uri uri, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((h) this.f451a).r(uri, bundle);
    }
}
