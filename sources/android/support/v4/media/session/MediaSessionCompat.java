package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f406b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f407a;

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MediaDescriptionCompat f408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f410e;

        public static class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f408c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f409d = parcel.readLong();
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            this(null, mediaDescriptionCompat, j10);
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j10 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f408c = mediaDescriptionCompat;
            this.f409d = j10;
            this.f410e = obj;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("MediaSession.QueueItem {Description=");
            sbA.append(this.f408c);
            sbA.append(", Id=");
            return android.support.v4.media.session.e.a(sbA, this.f409d, " }");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f408c.writeToParcel(parcel, i10);
            parcel.writeLong(this.f409d);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ResultReceiver f411c;

        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f411c = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.f411c = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            this.f411c.writeToParcel(parcel, i10);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public android.support.v4.media.session.b f413d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f414e;

        public static class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        public Token(Object obj) {
            this.f412c = obj;
            this.f413d = null;
            this.f414e = null;
        }

        public Token(Object obj, android.support.v4.media.session.b bVar, Bundle bundle) {
            this.f412c = obj;
            this.f413d = bVar;
            this.f414e = bundle;
        }

        public static Token a(Object obj, android.support.v4.media.session.b bVar) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f412c;
            Object obj3 = ((Token) obj).f412c;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f412c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.f412c, i10);
        }

        public Token(Object obj, android.support.v4.media.session.b bVar) {
            this.f412c = obj;
            this.f413d = bVar;
            this.f414e = null;
        }
    }

    public class a extends c {
        public a(MediaSessionCompat mediaSessionCompat) {
        }
    }

    public class b extends c {
        public b(MediaSessionCompat mediaSessionCompat) {
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<d> f416b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f418d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f417c = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f415a = new k(new d());

        public class a extends Handler {
            public a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    c.this.a((androidx.media.a) message.obj);
                }
            }
        }

        public class b implements android.support.v4.media.session.f {
            public b() {
            }

            @Override // android.support.v4.media.session.f
            public void a() {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.f
            public void b() {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.f
            public void c(String str, Bundle bundle, ResultReceiver resultReceiver) {
                c cVar;
                Parcelable parcelable;
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        e eVar = (e) c.this.f416b.get();
                        if (eVar != null) {
                            Bundle bundle2 = new Bundle();
                            Token token = eVar.f424b;
                            android.support.v4.media.session.b bVar = token.f413d;
                            d0.k.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", bVar == null ? null : bVar.asBinder());
                            bundle2.putBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE", token.f414e);
                            resultReceiver.send(0, bundle2);
                            return;
                        }
                        return;
                    }
                    if (!str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                            cVar = c.this;
                            bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                        } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            cVar = c.this;
                            parcelable = bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        } else {
                            if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                                return;
                            }
                            cVar = c.this;
                        }
                        Objects.requireNonNull(cVar);
                    }
                    cVar = c.this;
                    parcelable = bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    Objects.requireNonNull(cVar);
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
            }

            @Override // android.support.v4.media.session.f
            public void d(long j10) {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.f
            public void e(Object obj) {
                c cVar = c.this;
                RatingCompat.a(obj);
                Objects.requireNonNull(cVar);
            }

            @Override // android.support.v4.media.session.f
            public void f() {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.f
            public void h() {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.f
            public boolean i(Intent intent) {
                return c.this.b(intent);
            }

            @Override // android.support.v4.media.session.f
            public void l(String str, Bundle bundle) {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.f
            public void m(String str, Bundle bundle) {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.f
            public void n() {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.f
            public void o(long j10) {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.f
            public void onPause() {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.f
            public void onStop() {
                Objects.requireNonNull(c.this);
            }

            /* JADX WARN: Code duplicated, block: B:4:0x0013  */
            @Override // android.support.v4.media.session.f
            public void p(String str, Bundle bundle) {
                String str2;
                String str3;
                MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                } else if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                    if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        str3 = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        str3 = "android.support.v4.media.session.action.ARGUMENT_QUERY";
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    } else {
                        if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            str2 = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            str2 = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        }
                        bundle.getInt(str2);
                    }
                    bundle.getString(str3);
                }
                Objects.requireNonNull(c.this);
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$c$c, reason: collision with other inner class name */
        public class C0016c extends b implements h {
            public C0016c() {
                super();
            }

            @Override // android.support.v4.media.session.h
            public void r(Uri uri, Bundle bundle) {
                Objects.requireNonNull(c.this);
            }
        }

        public class d extends C0016c implements j {
            public d() {
                super();
            }

            @Override // android.support.v4.media.session.j
            public void g(String str, Bundle bundle) {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.j
            public void j() {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.j
            public void k(Uri uri, Bundle bundle) {
                Objects.requireNonNull(c.this);
            }

            @Override // android.support.v4.media.session.j
            public void q(String str, Bundle bundle) {
                Objects.requireNonNull(c.this);
            }
        }

        public void a(androidx.media.a aVar) {
            if (this.f418d) {
                this.f418d = false;
                this.f417c.removeMessages(1);
                d dVar = this.f416b.get();
                if (dVar == null) {
                    return;
                }
                PlaybackStateCompat playbackState = dVar.getPlaybackState();
                long j10 = playbackState == null ? 0L : playbackState.f436g;
                if (playbackState == null || playbackState.f432c == 3) {
                }
                if ((j10 & 514) != 0) {
                }
                dVar.b(aVar);
                dVar.b(null);
            }
        }

        public boolean b(Intent intent) {
            d dVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27 || (dVar = this.f416b.get()) == null || this.f417c == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            androidx.media.a aVarC = dVar.c();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(aVarC);
                return false;
            }
            if (keyEvent.getRepeatCount() > 0) {
                a(aVarC);
            } else if (this.f418d) {
                this.f417c.removeMessages(1);
                this.f418d = false;
                dVar.getPlaybackState();
            } else {
                this.f418d = true;
                a aVar = this.f417c;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, aVarC), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void c(d dVar, Handler handler) {
            this.f416b = new WeakReference<>(dVar);
            a aVar = this.f417c;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.f417c = new a(handler.getLooper());
        }
    }

    public interface d {
        Token a();

        void b(androidx.media.a aVar);

        androidx.media.a c();

        PlaybackStateCompat getPlaybackState();
    }

    public static class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Token f424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RemoteCallbackList<android.support.v4.media.session.a> f425c = new RemoteCallbackList<>();

        public class a extends android.support.v4.media.session.b.a {
            public a() {
            }

            @Override // android.support.v4.media.session.b
            public void A() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void B(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void C(long j10) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean F(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void H(int i10, int i11, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void I(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void K(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void M(boolean z10) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int N() {
                Objects.requireNonNull(e.this);
                return 0;
            }

            @Override // android.support.v4.media.session.b
            public void P(int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean Q() {
                Objects.requireNonNull(e.this);
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void R(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> S() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void T(int i10) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void U() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int W() {
                Objects.requireNonNull(e.this);
                return 0;
            }

            @Override // android.support.v4.media.session.b
            public void X(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Y(boolean z10) throws RemoteException {
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo Z() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void d0(int i10) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String e() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String e0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long f() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void g(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat getPlaybackState() {
                Objects.requireNonNull(e.this);
                Objects.requireNonNull(e.this);
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void h(android.support.v4.media.session.a aVar) {
                String str;
                Objects.requireNonNull(e.this);
                MediaSession mediaSession = (MediaSession) e.this.f423a;
                try {
                    str = (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                    Log.e("MediaSessionCompatApi24", "Cannot execute MediaSession.getCallingPackage()", e10);
                    str = null;
                }
                if (str == null) {
                    str = "android.media.session.MediaController";
                }
                e.this.f425c.register(aVar, new androidx.media.a(str, Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // android.support.v4.media.session.b
            public boolean i() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void j(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void k(int i10, int i11, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void l(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void m(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean n() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void o(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent p() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void play() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int q() {
                Objects.requireNonNull(e.this);
                return 0;
            }

            @Override // android.support.v4.media.session.b
            public void r(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence u() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void v(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void w(android.support.v4.media.session.a aVar) {
                e.this.f425c.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public void y(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void z(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }
        }

        public e(Context context, String str, Bundle bundle) {
            MediaSession mediaSession = new MediaSession(context, str);
            this.f423a = mediaSession;
            this.f424b = new Token(mediaSession.getSessionToken(), new a(), bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public Token a() {
            return this.f424b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public void b(androidx.media.a aVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public androidx.media.a c() {
            return null;
        }

        public void d(c cVar, Handler handler) {
            ((MediaSession) this.f423a).setCallback((MediaSession.Callback) (cVar == null ? null : cVar.f415a), handler);
            if (cVar != null) {
                cVar.c(this, handler);
            }
        }

        public void e(PendingIntent pendingIntent) {
            ((MediaSession) this.f423a).setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d
        public PlaybackStateCompat getPlaybackState() {
            return null;
        }
    }

    public static class f extends e {
        public f(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e, android.support.v4.media.session.MediaSessionCompat.d
        public void b(androidx.media.a aVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e, android.support.v4.media.session.MediaSessionCompat.d
        public final androidx.media.a c() {
            return new androidx.media.a(((MediaSession) this.f423a).getCurrentControllerInfo());
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        e eVar;
        c bVar;
        Handler handler;
        new ArrayList();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null) {
            int i10 = h1.a.f30486a;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else {
                if (listQueryBroadcastReceivers.size() > 1) {
                    Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                }
                componentName = null;
            }
            if (componentName == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 0);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            eVar = new f(context, str, bundle);
            this.f407a = eVar;
            bVar = new a(this);
            handler = new Handler();
        } else {
            eVar = new e(context, str, bundle);
            this.f407a = eVar;
            bVar = new b(this);
            handler = new Handler();
        }
        eVar.d(bVar, handler);
        eVar.e(pendingIntent);
        new MediaControllerCompat(context, this);
        if (f406b == 0) {
            f406b = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public MediaSessionCompat(Context context, String str, Bundle bundle) {
        this(context, str, null, null, bundle);
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
