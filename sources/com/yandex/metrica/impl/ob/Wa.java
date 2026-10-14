package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class Wa implements Parcelable {
    public static final Parcelable.Creator<Wa> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15380b;

    public class a implements Parcelable.Creator<Wa> {
        @Override // android.os.Parcelable.Creator
        public Wa createFromParcel(Parcel parcel) {
            return new Wa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Wa[] newArray(int i10) {
            return new Wa[i10];
        }
    }

    public Wa(long j10, int i10) {
        this.f15379a = j10;
        this.f15380b = i10;
    }

    public Wa(Parcel parcel) {
        this.f15379a = parcel.readLong();
        this.f15380b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DiagnosticsConfig{expirationTimestampSeconds=");
        sbA.append(this.f15379a);
        sbA.append(", intervalSeconds=");
        return h0.f.a(sbA, this.f15380b, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f15379a);
        parcel.writeInt(this.f15380b);
    }
}
