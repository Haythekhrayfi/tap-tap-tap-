package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f349b = Log.isLoggable("MediaBrowserCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f350a;

    public static class CustomActionResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public void a(int i10, Bundle bundle) {
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public void a(int i10, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i10 != 0 || bundle == null || !bundle.containsKey("media_item")) {
                Objects.requireNonNull(null);
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                Objects.requireNonNull(null);
                throw null;
            }
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f351c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaDescriptionCompat f352d;

        public static class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public MediaItem[] newArray(int i10) {
                return new MediaItem[i10];
            }
        }

        public MediaItem(Parcel parcel) {
            this.f351c = parcel.readInt();
            this.f352d = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.f373c)) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f351c = i10;
            this.f352d = mediaDescriptionCompat;
        }

        public static List<MediaItem> a(List<?> list) {
            MediaItem mediaItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                    mediaItem = new MediaItem(MediaDescriptionCompat.a(mediaItem2.getDescription()), mediaItem2.getFlags());
                } else {
                    mediaItem = null;
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f351c + ", mDescription=" + this.f352d + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f351c);
            this.f352d.writeToParcel(parcel, i10);
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        @Override // android.support.v4.os.ResultReceiver
        public void a(int i10, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            if (i10 != 0 || bundle == null || !bundle.containsKey("search_results")) {
                Objects.requireNonNull(null);
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<g> f353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<Messenger> f354b;

        public a(g gVar) {
            this.f353a = new WeakReference<>(gVar);
        }

        public void a(Messenger messenger) {
            this.f354b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f354b;
            if (weakReference == null || weakReference.get() == null || this.f353a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            g gVar = this.f353a.get();
            Messenger messenger = this.f354b.get();
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    gVar.b(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i10 == 2) {
                    gVar.e(messenger);
                } else if (i10 != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.a(bundle3);
                    gVar.c(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    gVar.e(messenger);
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f355a = new android.support.v4.media.e(new C0014b());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f356b;

        public interface a {
        }

        /* JADX INFO: renamed from: android.support.v4.media.MediaBrowserCompat$b$b, reason: collision with other inner class name */
        public class C0014b implements android.support.v4.media.d {
            public C0014b() {
            }
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }
    }

    public interface c {
        MediaSessionCompat.Token a();

        void d();

        void disconnect();
    }

    public static class d implements c, g, b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a f361d = new a(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final q.a<String, i> f362e = new q.a<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public h f363f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Messenger f364g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public MediaSessionCompat.Token f365h;

        public d(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            this.f358a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f360c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bVar.f356b = this;
            this.f359b = new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) bVar.f355a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public MediaSessionCompat.Token a() {
            if (this.f365h == null) {
                this.f365h = MediaSessionCompat.Token.a(((MediaBrowser) this.f359b).getSessionToken(), null);
            }
            return this.f365h;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void c(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f364g != messenger) {
                return;
            }
            i orDefault = this.f362e.getOrDefault(str, null);
            if (orDefault != null) {
                orDefault.a(bundle);
            } else if (MediaBrowserCompat.f349b) {
                Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void d() {
            ((MediaBrowser) this.f359b).connect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void disconnect() {
            Messenger messenger;
            h hVar = this.f363f;
            if (hVar != null && (messenger = this.f364g) != null) {
                try {
                    hVar.a(7, null, messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            ((MediaBrowser) this.f359b).disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.g
        public void e(Messenger messenger) {
        }
    }

    public static class e extends d {
        public e(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    public static class f extends e {
        public f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    public interface g {
        void b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void c(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void e(Messenger messenger);
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Messenger f366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bundle f367b;

        public h(IBinder iBinder, Bundle bundle) {
            this.f366a = new Messenger(iBinder);
            this.f367b = bundle;
        }

        public final void a(int i10, Bundle bundle, Messenger messenger) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i10;
            messageObtain.arg1 = 1;
            messageObtain.setData(bundle);
            messageObtain.replyTo = messenger;
            this.f366a.send(messageObtain);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<j> f368a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Bundle> f369b = new ArrayList();

        public j a(Bundle bundle) {
            for (int i10 = 0; i10 < this.f369b.size(); i10++) {
                Bundle bundle2 = this.f369b.get(i10);
                boolean z10 = true;
                if (bundle2 != bundle && (bundle2 != null ? bundle != null ? bundle2.getInt("android.media.browse.extra.PAGE", -1) != bundle.getInt("android.media.browse.extra.PAGE", -1) || bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) != bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) : bundle2.getInt("android.media.browse.extra.PAGE", -1) != -1 || bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1 : bundle.getInt("android.media.browse.extra.PAGE", -1) != -1 || bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1)) {
                    z10 = false;
                }
                if (z10) {
                    return this.f368a.get(i10);
                }
            }
            return null;
        }
    }

    public static abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IBinder f370a = new Binder();

        public class a implements android.support.v4.media.f {
            public a() {
            }

            @Override // android.support.v4.media.f
            public void c(String str, List<?> list) {
                Objects.requireNonNull(j.this);
                j jVar = j.this;
                MediaItem.a(list);
                Objects.requireNonNull(jVar);
            }

            @Override // android.support.v4.media.f
            public void onError(String str) {
                Objects.requireNonNull(j.this);
            }
        }

        public class b extends a implements android.support.v4.media.h {
            public b() {
                super();
            }

            @Override // android.support.v4.media.h
            public void a(String str, Bundle bundle) {
                Objects.requireNonNull(j.this);
            }

            @Override // android.support.v4.media.h
            public void b(String str, List<?> list, Bundle bundle) {
                j jVar = j.this;
                MediaItem.a(list);
                Objects.requireNonNull(jVar);
            }
        }

        public j() {
            if (Build.VERSION.SDK_INT >= 26) {
                new android.support.v4.media.i(new b());
            } else {
                new android.support.v4.media.g(new a());
            }
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        this.f350a = Build.VERSION.SDK_INT >= 26 ? new f(context, componentName, bVar, bundle) : new e(context, componentName, bVar, bundle);
    }
}
