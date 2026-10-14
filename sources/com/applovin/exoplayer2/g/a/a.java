package com.applovin.exoplayer2.g.a;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.k;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.applovin.exoplayer2.g.a.InterfaceC0092a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.a.a.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) com.applovin.exoplayer2.l.a.b(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6314b;

    public a(int i10, String str) {
        this.f6313a = i10;
        this.f6314b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Ait(controlCode=");
        sbA.append(this.f6313a);
        sbA.append(",url=");
        return k.a(sbA, this.f6314b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6314b);
        parcel.writeInt(this.f6313a);
    }
}
