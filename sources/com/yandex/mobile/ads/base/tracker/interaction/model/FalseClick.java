package com.yandex.mobile.ads.base.tracker.interaction.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class FalseClick implements Parcelable {
    public static final Parcelable.Creator<FalseClick> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18228b;

    public class a implements Parcelable.Creator<FalseClick> {
        @Override // android.os.Parcelable.Creator
        public final FalseClick createFromParcel(Parcel parcel) {
            return new FalseClick(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FalseClick[] newArray(int i10) {
            return new FalseClick[i10];
        }
    }

    public FalseClick(Parcel parcel) {
        this.f18227a = parcel.readString();
        this.f18228b = parcel.readLong();
    }

    public FalseClick(String str, long j10) {
        this.f18227a = str;
        this.f18228b = j10;
    }

    public final long c() {
        return this.f18228b;
    }

    public final String d() {
        return this.f18227a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FalseClick falseClick = (FalseClick) obj;
        if (this.f18228b != falseClick.f18228b) {
            return false;
        }
        return this.f18227a.equals(falseClick.f18227a);
    }

    public final int hashCode() {
        int iHashCode = this.f18227a.hashCode() * 31;
        long j10 = this.f18228b;
        return iHashCode + ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18227a);
        parcel.writeLong(this.f18228b);
    }
}
