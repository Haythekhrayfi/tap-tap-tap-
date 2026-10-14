package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.j;

/* JADX INFO: loaded from: classes.dex */
public class k<T extends j> extends i<T> {
    public k(T t10) {
        super(t10);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepare() {
        ((j) this.f451a).j();
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromMediaId(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((j) this.f451a).g(str, bundle);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromSearch(String str, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((j) this.f451a).q(str, bundle);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPrepareFromUri(Uri uri, Bundle bundle) {
        MediaSessionCompat.a(bundle);
        ((j) this.f451a).k(uri, bundle);
    }
}
