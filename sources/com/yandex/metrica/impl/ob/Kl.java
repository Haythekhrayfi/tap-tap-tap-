package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Kl implements Parcelable {
    public static final Parcelable.Creator<Kl> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f14366h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14367i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14369k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f14370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f14371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f14372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f14373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List<C1617em> f14374p;

    public class a implements Parcelable.Creator<Kl> {
        @Override // android.os.Parcelable.Creator
        public Kl createFromParcel(Parcel parcel) {
            return new Kl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Kl[] newArray(int i10) {
            return new Kl[i10];
        }
    }

    public Kl(Parcel parcel) {
        this.f14359a = parcel.readByte() != 0;
        this.f14360b = parcel.readByte() != 0;
        this.f14361c = parcel.readByte() != 0;
        this.f14362d = parcel.readByte() != 0;
        this.f14363e = parcel.readByte() != 0;
        this.f14364f = parcel.readByte() != 0;
        this.f14365g = parcel.readByte() != 0;
        this.f14366h = parcel.readByte() != 0;
        this.f14367i = parcel.readByte() != 0;
        this.f14368j = parcel.readByte() != 0;
        this.f14369k = parcel.readInt();
        this.f14370l = parcel.readInt();
        this.f14371m = parcel.readInt();
        this.f14372n = parcel.readInt();
        this.f14373o = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, C1617em.class.getClassLoader());
        this.f14374p = arrayList;
    }

    public Kl(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i10, int i11, int i12, int i13, int i14, List<C1617em> list) {
        this.f14359a = z10;
        this.f14360b = z11;
        this.f14361c = z12;
        this.f14362d = z13;
        this.f14363e = z14;
        this.f14364f = z15;
        this.f14365g = z16;
        this.f14366h = z17;
        this.f14367i = z18;
        this.f14368j = z19;
        this.f14369k = i10;
        this.f14370l = i11;
        this.f14371m = i12;
        this.f14372n = i13;
        this.f14373o = i14;
        this.f14374p = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Kl.class != obj.getClass()) {
            return false;
        }
        Kl kl = (Kl) obj;
        if (this.f14359a == kl.f14359a && this.f14360b == kl.f14360b && this.f14361c == kl.f14361c && this.f14362d == kl.f14362d && this.f14363e == kl.f14363e && this.f14364f == kl.f14364f && this.f14365g == kl.f14365g && this.f14366h == kl.f14366h && this.f14367i == kl.f14367i && this.f14368j == kl.f14368j && this.f14369k == kl.f14369k && this.f14370l == kl.f14370l && this.f14371m == kl.f14371m && this.f14372n == kl.f14372n && this.f14373o == kl.f14373o) {
            return this.f14374p.equals(kl.f14374p);
        }
        return false;
    }

    public int hashCode() {
        return this.f14374p.hashCode() + ((((((((((((((((((((((((((((((this.f14359a ? 1 : 0) * 31) + (this.f14360b ? 1 : 0)) * 31) + (this.f14361c ? 1 : 0)) * 31) + (this.f14362d ? 1 : 0)) * 31) + (this.f14363e ? 1 : 0)) * 31) + (this.f14364f ? 1 : 0)) * 31) + (this.f14365g ? 1 : 0)) * 31) + (this.f14366h ? 1 : 0)) * 31) + (this.f14367i ? 1 : 0)) * 31) + (this.f14368j ? 1 : 0)) * 31) + this.f14369k) * 31) + this.f14370l) * 31) + this.f14371m) * 31) + this.f14372n) * 31) + this.f14373o) * 31);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("UiCollectingConfig{textSizeCollecting=");
        sbA.append(this.f14359a);
        sbA.append(", relativeTextSizeCollecting=");
        sbA.append(this.f14360b);
        sbA.append(", textVisibilityCollecting=");
        sbA.append(this.f14361c);
        sbA.append(", textStyleCollecting=");
        sbA.append(this.f14362d);
        sbA.append(", infoCollecting=");
        sbA.append(this.f14363e);
        sbA.append(", nonContentViewCollecting=");
        sbA.append(this.f14364f);
        sbA.append(", textLengthCollecting=");
        sbA.append(this.f14365g);
        sbA.append(", viewHierarchical=");
        sbA.append(this.f14366h);
        sbA.append(", ignoreFiltered=");
        sbA.append(this.f14367i);
        sbA.append(", webViewUrlsCollecting=");
        sbA.append(this.f14368j);
        sbA.append(", tooLongTextBound=");
        sbA.append(this.f14369k);
        sbA.append(", truncatedTextBound=");
        sbA.append(this.f14370l);
        sbA.append(", maxEntitiesCount=");
        sbA.append(this.f14371m);
        sbA.append(", maxFullContentLength=");
        sbA.append(this.f14372n);
        sbA.append(", webViewUrlLimit=");
        sbA.append(this.f14373o);
        sbA.append(", filters=");
        return l1.f.a(sbA, this.f14374p, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f14359a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14360b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14361c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14362d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14363e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14364f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14365g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14366h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14367i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14368j ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f14369k);
        parcel.writeInt(this.f14370l);
        parcel.writeInt(this.f14371m);
        parcel.writeInt(this.f14372n);
        parcel.writeInt(this.f14373o);
        parcel.writeList(this.f14374p);
    }
}
