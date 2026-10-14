package com.applovin.exoplayer2.g.f;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;
import l1.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.applovin.exoplayer2.g.a.InterfaceC0092a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.f.a.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6405d;

    private a(Parcel parcel) {
        this.f6402a = (String) ai.a(parcel.readString());
        this.f6403b = (byte[]) ai.a(parcel.createByteArray());
        this.f6404c = parcel.readInt();
        this.f6405d = parcel.readInt();
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f6402a = str;
        this.f6403b = bArr;
        this.f6404c = i10;
        this.f6405d = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6402a.equals(aVar.f6402a) && Arrays.equals(this.f6403b, aVar.f6403b) && this.f6404c == aVar.f6404c && this.f6405d == aVar.f6405d;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f6403b) + e.a(this.f6402a, 527, 31)) * 31) + this.f6404c) * 31) + this.f6405d;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("mdta: key=");
        sbA.append(this.f6402a);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6402a);
        parcel.writeByteArray(this.f6403b);
        parcel.writeInt(this.f6404c);
        parcel.writeInt(this.f6405d);
    }
}
