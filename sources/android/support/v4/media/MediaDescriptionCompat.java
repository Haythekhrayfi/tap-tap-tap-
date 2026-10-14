package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap f377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Uri f378h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f379i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Uri f380j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f381k;

    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CharSequence f383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bitmap f386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Uri f387f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bundle f388g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Uri f389h;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f373c = str;
        this.f374d = charSequence;
        this.f375e = charSequence2;
        this.f376f = charSequence3;
        this.f377g = bitmap;
        this.f378h = uri;
        this.f379i = bundle;
        this.f380j = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        b bVar = new b();
        MediaDescription mediaDescription = (MediaDescription) obj;
        bVar.f382a = mediaDescription.getMediaId();
        bVar.f383b = mediaDescription.getTitle();
        bVar.f384c = mediaDescription.getSubtitle();
        bVar.f385d = mediaDescription.getDescription();
        bVar.f386e = mediaDescription.getIconBitmap();
        bVar.f387f = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            MediaSessionCompat.a(extras);
            uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = extras;
        } else if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
            extras.remove("android.support.v4.media.description.MEDIA_URI");
            extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = extras;
        }
        bVar.f388g = bundle;
        if (uri != null) {
            bVar.f389h = uri;
        } else {
            bVar.f389h = mediaDescription.getMediaUri();
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(bVar.f382a, bVar.f383b, bVar.f384c, bVar.f385d, bVar.f386e, bVar.f387f, bVar.f388g, bVar.f389h);
        mediaDescriptionCompat.f381k = obj;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f374d) + ", " + ((Object) this.f375e) + ", " + ((Object) this.f376f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        Object objBuild = this.f381k;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f373c);
            builder.setTitle(this.f374d);
            builder.setSubtitle(this.f375e);
            builder.setDescription(this.f376f);
            builder.setIconBitmap(this.f377g);
            builder.setIconUri(this.f378h);
            builder.setExtras(this.f379i);
            builder.setMediaUri(this.f380j);
            objBuild = builder.build();
            this.f381k = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i10);
    }
}
