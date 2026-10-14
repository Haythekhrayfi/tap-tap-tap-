package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f396a;

    public static class MediaControllerImplApi21 implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f398b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f399c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public HashMap<a, a> f400d = new HashMap<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaSessionCompat.Token f401e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public WeakReference<MediaControllerImplApi21> f402c;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f402c = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f402c.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f398b) {
                    mediaControllerImplApi21.f401e.f413d = android.support.v4.media.session.b.a.i0(d0.k.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    mediaControllerImplApi21.f401e.f414e = bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                    mediaControllerImplApi21.b();
                }
            }
        }

        public static class a extends a.b {
            public a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void G(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void J() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void L(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void h0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void s(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.b, android.support.v4.media.session.a
            public void t(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.f401e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f412c);
            this.f397a = mediaController;
            if (token.f413d == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean a(KeyEvent keyEvent) {
            return ((MediaController) this.f397a).dispatchMediaButtonEvent(keyEvent);
        }

        public void b() {
            if (this.f401e.f413d == null) {
                return;
            }
            for (a aVar : this.f399c) {
                a aVar2 = new a(aVar);
                this.f400d.put(aVar, aVar2);
                aVar.f403a = aVar2;
                try {
                    this.f401e.f413d.h(aVar2);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            }
            this.f399c.clear();
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.support.v4.media.session.a f403a;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        public static class C0015a implements android.support.v4.media.session.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference<a> f404a;

            public C0015a(a aVar) {
                this.f404a = new WeakReference<>(aVar);
            }
        }

        public static class b extends android.support.v4.media.session.a.AbstractBinderC0017a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final WeakReference<a> f405c;

            public b(a aVar) {
                this.f405c = new WeakReference<>(aVar);
            }

            public void G(CharSequence charSequence) throws RemoteException {
                this.f405c.get();
            }

            public void J() throws RemoteException {
                this.f405c.get();
            }

            public void L(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                this.f405c.get();
            }

            public void h0(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                this.f405c.get();
            }

            public void s(Bundle bundle) throws RemoteException {
                this.f405c.get();
            }

            public void t(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                this.f405c.get();
            }
        }

        public a() {
            new android.support.v4.media.session.d(new C0015a(this));
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
        }
    }

    public interface b {
        boolean a(KeyEvent keyEvent);
    }

    public static class c extends MediaControllerImplApi21 {
        public c(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }
    }

    public static class d extends c {
        public d(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) throws RemoteException {
        new HashSet();
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f396a = new d(context, token);
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        new HashSet();
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        d dVar = null;
        try {
            dVar = new d(context, mediaSessionCompat.f407a.a());
        } catch (RemoteException e10) {
            Log.w("MediaControllerCompat", "Failed to create MediaControllerImpl.", e10);
        }
        this.f396a = dVar;
    }
}
