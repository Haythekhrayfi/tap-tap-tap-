package com.yandex.mobile.ads.exo.offline;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18667c;

    public class a implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        public final StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey[] newArray(int i10) {
            return new StreamKey[i10];
        }
    }

    public StreamKey(int i10, int i11, int i12) {
        this.f18665a = i10;
        this.f18666b = i11;
        this.f18667c = i12;
    }

    public StreamKey(Parcel parcel) {
        this.f18665a = parcel.readInt();
        this.f18666b = parcel.readInt();
        this.f18667c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i10 = this.f18665a - streamKey2.f18665a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f18666b - streamKey2.f18666b;
        return i11 == 0 ? this.f18667c - streamKey2.f18667c : i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.f18665a == streamKey.f18665a && this.f18666b == streamKey.f18666b && this.f18667c == streamKey.f18667c;
    }

    public final int hashCode() {
        return (((this.f18665a * 31) + this.f18666b) * 31) + this.f18667c;
    }

    public final String toString() {
        return this.f18665a + "." + this.f18666b + "." + this.f18667c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18665a);
        parcel.writeInt(this.f18666b);
        parcel.writeInt(this.f18667c);
    }
}
