package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f431g;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(int i10, int i11, int i12, int i13, int i14) {
        this.f427c = i10;
        this.f428d = i11;
        this.f429e = i12;
        this.f430f = i13;
        this.f431g = i14;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f427c = parcel.readInt();
        this.f429e = parcel.readInt();
        this.f430f = parcel.readInt();
        this.f431g = parcel.readInt();
        this.f428d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f427c);
        parcel.writeInt(this.f429e);
        parcel.writeInt(this.f430f);
        parcel.writeInt(this.f431g);
        parcel.writeInt(this.f428d);
    }
}
