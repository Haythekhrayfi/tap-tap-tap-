package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1542bm implements Parcelable {
    public static final Parcelable.Creator<C1542bm> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<C1617em> f15853h;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.bm$a */
    public class a implements Parcelable.Creator<C1542bm> {
        @Override // android.os.Parcelable.Creator
        public C1542bm createFromParcel(Parcel parcel) {
            return new C1542bm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C1542bm[] newArray(int i10) {
            return new C1542bm[i10];
        }
    }

    public C1542bm(int i10, int i11, int i12, long j10, boolean z10, boolean z11, boolean z12, List<C1617em> list) {
        this.f15846a = i10;
        this.f15847b = i11;
        this.f15848c = i12;
        this.f15849d = j10;
        this.f15850e = z10;
        this.f15851f = z11;
        this.f15852g = z12;
        this.f15853h = list;
    }

    public C1542bm(Parcel parcel) {
        this.f15846a = parcel.readInt();
        this.f15847b = parcel.readInt();
        this.f15848c = parcel.readInt();
        this.f15849d = parcel.readLong();
        this.f15850e = parcel.readByte() != 0;
        this.f15851f = parcel.readByte() != 0;
        this.f15852g = parcel.readByte() != 0;
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C1617em.class.getClassLoader());
        this.f15853h = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1542bm.class != obj.getClass()) {
            return false;
        }
        C1542bm c1542bm = (C1542bm) obj;
        if (this.f15846a == c1542bm.f15846a && this.f15847b == c1542bm.f15847b && this.f15848c == c1542bm.f15848c && this.f15849d == c1542bm.f15849d && this.f15850e == c1542bm.f15850e && this.f15851f == c1542bm.f15851f && this.f15852g == c1542bm.f15852g) {
            return this.f15853h.equals(c1542bm.f15853h);
        }
        return false;
    }

    public int hashCode() {
        int i10 = ((((this.f15846a * 31) + this.f15847b) * 31) + this.f15848c) * 31;
        long j10 = this.f15849d;
        return this.f15853h.hashCode() + ((((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f15850e ? 1 : 0)) * 31) + (this.f15851f ? 1 : 0)) * 31) + (this.f15852g ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("UiParsingConfig{tooLongTextBound=");
        sbA.append(this.f15846a);
        sbA.append(", truncatedTextBound=");
        sbA.append(this.f15847b);
        sbA.append(", maxVisitedChildrenInLevel=");
        sbA.append(this.f15848c);
        sbA.append(", afterCreateTimeout=");
        sbA.append(this.f15849d);
        sbA.append(", relativeTextSizeCalculation=");
        sbA.append(this.f15850e);
        sbA.append(", errorReporting=");
        sbA.append(this.f15851f);
        sbA.append(", parsingAllowedByDefault=");
        sbA.append(this.f15852g);
        sbA.append(", filters=");
        return l1.f.a(sbA, this.f15853h, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15846a);
        parcel.writeInt(this.f15847b);
        parcel.writeInt(this.f15848c);
        parcel.writeLong(this.f15849d);
        parcel.writeByte(this.f15850e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15851f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15852g ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f15853h);
    }
}
