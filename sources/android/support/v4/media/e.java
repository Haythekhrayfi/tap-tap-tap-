package android.support.v4.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.d;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import d0.k;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e<T extends d> extends MediaBrowser.ConnectionCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f394a;

    public e(T t10) {
        this.f394a = t10;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnected() {
        MediaBrowserCompat.b.C0014b c0014b = (MediaBrowserCompat.b.C0014b) this.f394a;
        MediaBrowserCompat.b.a aVar = MediaBrowserCompat.b.this.f356b;
        if (aVar != null) {
            MediaBrowserCompat.d dVar = (MediaBrowserCompat.d) aVar;
            Bundle extras = ((MediaBrowser) dVar.f359b).getExtras();
            if (extras != null) {
                extras.getInt("extra_service_version", 0);
                IBinder iBinderA = k.a(extras, "extra_messenger");
                if (iBinderA != null) {
                    dVar.f363f = new MediaBrowserCompat.h(iBinderA, dVar.f360c);
                    Messenger messenger = new Messenger(dVar.f361d);
                    dVar.f364g = messenger;
                    dVar.f361d.a(messenger);
                    try {
                        MediaBrowserCompat.h hVar = dVar.f363f;
                        Context context = dVar.f358a;
                        Messenger messenger2 = dVar.f364g;
                        Objects.requireNonNull(hVar);
                        Bundle bundle = new Bundle();
                        bundle.putString("data_package_name", context.getPackageName());
                        bundle.putBundle("data_root_hints", hVar.f367b);
                        hVar.a(6, bundle, messenger2);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                android.support.v4.media.session.b bVarI0 = android.support.v4.media.session.b.a.i0(k.a(extras, "extra_session_binder"));
                if (bVarI0 != null) {
                    dVar.f365h = MediaSessionCompat.Token.a(((MediaBrowser) dVar.f359b).getSessionToken(), bVarI0);
                }
            }
        }
        MediaBrowserCompat.b.this.a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionFailed() {
        MediaBrowserCompat.b bVar = MediaBrowserCompat.b.this;
        MediaBrowserCompat.b.a aVar = bVar.f356b;
        bVar.b();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public void onConnectionSuspended() {
        MediaBrowserCompat.b.C0014b c0014b = (MediaBrowserCompat.b.C0014b) this.f394a;
        MediaBrowserCompat.b.a aVar = MediaBrowserCompat.b.this.f356b;
        if (aVar != null) {
            MediaBrowserCompat.d dVar = (MediaBrowserCompat.d) aVar;
            dVar.f363f = null;
            dVar.f364g = null;
            dVar.f365h = null;
            dVar.f361d.a(null);
        }
        MediaBrowserCompat.b.this.c();
    }
}
