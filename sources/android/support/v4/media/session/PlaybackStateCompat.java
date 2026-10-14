package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f438i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f439j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<CustomAction> f440k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f441l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f442m;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f443c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CharSequence f444d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f445e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bundle f446f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f447g;

        public static class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f443c = parcel.readString();
            this.f444d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f445e = parcel.readInt();
            this.f446f = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f443c = str;
            this.f444d = charSequence;
            this.f445e = i10;
            this.f446f = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Action:mName='");
            sbA.append((Object) this.f444d);
            sbA.append(", mIcon=");
            sbA.append(this.f445e);
            sbA.append(", mExtras=");
            sbA.append(this.f446f);
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f443c);
            TextUtils.writeToParcel(this.f444d, parcel, i10);
            parcel.writeInt(this.f445e);
            parcel.writeBundle(this.f446f);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f432c = i10;
        this.f433d = j10;
        this.f434e = j11;
        this.f435f = f10;
        this.f436g = j12;
        this.f437h = i11;
        this.f438i = charSequence;
        this.f439j = j13;
        this.f440k = new ArrayList(list);
        this.f441l = j14;
        this.f442m = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f432c = parcel.readInt();
        this.f433d = parcel.readLong();
        this.f435f = parcel.readFloat();
        this.f439j = parcel.readLong();
        this.f434e = parcel.readLong();
        this.f436g = parcel.readLong();
        this.f438i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f440k = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f441l = parcel.readLong();
        this.f442m = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f437h = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {");
        sb2.append("state=");
        sb2.append(this.f432c);
        sb2.append(", position=");
        sb2.append(this.f433d);
        sb2.append(", buffered position=");
        sb2.append(this.f434e);
        sb2.append(", speed=");
        sb2.append(this.f435f);
        sb2.append(", updated=");
        sb2.append(this.f439j);
        sb2.append(", actions=");
        sb2.append(this.f436g);
        sb2.append(", error code=");
        sb2.append(this.f437h);
        sb2.append(", error message=");
        sb2.append(this.f438i);
        sb2.append(", custom actions=");
        sb2.append(this.f440k);
        sb2.append(", active item id=");
        return e.a(sb2, this.f441l, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f432c);
        parcel.writeLong(this.f433d);
        parcel.writeFloat(this.f435f);
        parcel.writeLong(this.f439j);
        parcel.writeLong(this.f434e);
        parcel.writeLong(this.f436g);
        TextUtils.writeToParcel(this.f438i, parcel, i10);
        parcel.writeTypedList(this.f440k);
        parcel.writeLong(this.f441l);
        parcel.writeBundle(this.f442m);
        parcel.writeInt(this.f437h);
    }
}
