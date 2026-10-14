package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.applovin.exoplayer2.g.e.d.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f6363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h[] f6364e;

    public d(Parcel parcel) {
        super("CTOC");
        this.f6360a = (String) ai.a(parcel.readString());
        this.f6361b = parcel.readByte() != 0;
        this.f6362c = parcel.readByte() != 0;
        this.f6363d = (String[]) ai.a(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f6364e = new h[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f6364e[i11] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.f6360a = str;
        this.f6361b = z10;
        this.f6362c = z11;
        this.f6363d = strArr;
        this.f6364e = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6361b == dVar.f6361b && this.f6362c == dVar.f6362c && ai.a((Object) this.f6360a, (Object) dVar.f6360a) && Arrays.equals(this.f6363d, dVar.f6363d) && Arrays.equals(this.f6364e, dVar.f6364e);
    }

    public int hashCode() {
        int i10 = (((527 + (this.f6361b ? 1 : 0)) * 31) + (this.f6362c ? 1 : 0)) * 31;
        String str = this.f6360a;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6360a);
        parcel.writeByte(this.f6361b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6362c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f6363d);
        parcel.writeInt(this.f6364e.length);
        for (h hVar : this.f6364e) {
            parcel.writeParcelable(hVar, 0);
        }
    }
}
