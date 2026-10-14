package com.applovin.exoplayer2.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;
import l1.e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.applovin.exoplayer2.g.a.InterfaceC0092a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.c.a.1
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
    public final int f6326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f6333h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f6326a = i10;
        this.f6327b = str;
        this.f6328c = str2;
        this.f6329d = i11;
        this.f6330e = i12;
        this.f6331f = i13;
        this.f6332g = i14;
        this.f6333h = bArr;
    }

    public a(Parcel parcel) {
        this.f6326a = parcel.readInt();
        this.f6327b = (String) ai.a(parcel.readString());
        this.f6328c = (String) ai.a(parcel.readString());
        this.f6329d = parcel.readInt();
        this.f6330e = parcel.readInt();
        this.f6331f = parcel.readInt();
        this.f6332g = parcel.readInt();
        this.f6333h = (byte[]) ai.a(parcel.createByteArray());
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0092a
    public void a(ac.a aVar) {
        aVar.a(this.f6333h, this.f6326a);
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
        return this.f6326a == aVar.f6326a && this.f6327b.equals(aVar.f6327b) && this.f6328c.equals(aVar.f6328c) && this.f6329d == aVar.f6329d && this.f6330e == aVar.f6330e && this.f6331f == aVar.f6331f && this.f6332g == aVar.f6332g && Arrays.equals(this.f6333h, aVar.f6333h);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6333h) + ((((((((e.a(this.f6328c, e.a(this.f6327b, (this.f6326a + 527) * 31, 31), 31) + this.f6329d) * 31) + this.f6330e) * 31) + this.f6331f) * 31) + this.f6332g) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Picture: mimeType=");
        sbA.append(this.f6327b);
        sbA.append(", description=");
        sbA.append(this.f6328c);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6326a);
        parcel.writeString(this.f6327b);
        parcel.writeString(this.f6328c);
        parcel.writeInt(this.f6329d);
        parcel.writeInt(this.f6330e);
        parcel.writeInt(this.f6331f);
        parcel.writeInt(this.f6332g);
        parcel.writeByteArray(this.f6333h);
    }
}
