package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.applovin.exoplayer2.g.e.c.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6358e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h[] f6359g;

    public c(Parcel parcel) {
        super("CHAP");
        this.f6354a = (String) ai.a(parcel.readString());
        this.f6355b = parcel.readInt();
        this.f6356c = parcel.readInt();
        this.f6357d = parcel.readLong();
        this.f6358e = parcel.readLong();
        int i10 = parcel.readInt();
        this.f6359g = new h[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f6359g[i11] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, h[] hVarArr) {
        super("CHAP");
        this.f6354a = str;
        this.f6355b = i10;
        this.f6356c = i11;
        this.f6357d = j10;
        this.f6358e = j11;
        this.f6359g = hVarArr;
    }

    @Override // com.applovin.exoplayer2.g.e.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6355b == cVar.f6355b && this.f6356c == cVar.f6356c && this.f6357d == cVar.f6357d && this.f6358e == cVar.f6358e && ai.a((Object) this.f6354a, (Object) cVar.f6354a) && Arrays.equals(this.f6359g, cVar.f6359g);
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f6355b) * 31) + this.f6356c) * 31) + ((int) this.f6357d)) * 31) + ((int) this.f6358e)) * 31;
        String str = this.f6354a;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6354a);
        parcel.writeInt(this.f6355b);
        parcel.writeInt(this.f6356c);
        parcel.writeLong(this.f6357d);
        parcel.writeLong(this.f6358e);
        parcel.writeInt(this.f6359g.length);
        for (h hVar : this.f6359g) {
            parcel.writeParcelable(hVar, 0);
        }
    }
}
