package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class Il implements Parcelable {
    public static final Parcelable.Creator<Il> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1542bm f14236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Kl f14237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Kl f14238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Kl f14239h;

    public class a implements Parcelable.Creator<Il> {
        @Override // android.os.Parcelable.Creator
        public Il createFromParcel(Parcel parcel) {
            return new Il(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Il[] newArray(int i10) {
            return new Il[i10];
        }
    }

    public Il(Parcel parcel) {
        this.f14232a = parcel.readByte() != 0;
        this.f14233b = parcel.readByte() != 0;
        this.f14234c = parcel.readByte() != 0;
        this.f14235d = parcel.readByte() != 0;
        this.f14236e = (C1542bm) parcel.readParcelable(C1542bm.class.getClassLoader());
        this.f14237f = (Kl) parcel.readParcelable(Kl.class.getClassLoader());
        this.f14238g = (Kl) parcel.readParcelable(Kl.class.getClassLoader());
        this.f14239h = (Kl) parcel.readParcelable(Kl.class.getClassLoader());
    }

    public Il(Qi qi) {
        this(qi.f().f17346k, qi.f().f17348m, qi.f().f17347l, qi.f().f17349n, qi.T(), qi.S(), qi.R(), qi.U());
    }

    public Il(boolean z10, boolean z11, boolean z12, boolean z13, C1542bm c1542bm, Kl kl, Kl kl2, Kl kl3) {
        this.f14232a = z10;
        this.f14233b = z11;
        this.f14234c = z12;
        this.f14235d = z13;
        this.f14236e = c1542bm;
        this.f14237f = kl;
        this.f14238g = kl2;
        this.f14239h = kl3;
    }

    public boolean a() {
        return (this.f14236e == null || this.f14237f == null || this.f14238g == null || this.f14239h == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Il.class != obj.getClass()) {
            return false;
        }
        Il il = (Il) obj;
        if (this.f14232a != il.f14232a || this.f14233b != il.f14233b || this.f14234c != il.f14234c || this.f14235d != il.f14235d) {
            return false;
        }
        C1542bm c1542bm = this.f14236e;
        if (c1542bm == null ? il.f14236e != null : !c1542bm.equals(il.f14236e)) {
            return false;
        }
        Kl kl = this.f14237f;
        if (kl == null ? il.f14237f != null : !kl.equals(il.f14237f)) {
            return false;
        }
        Kl kl2 = this.f14238g;
        if (kl2 == null ? il.f14238g != null : !kl2.equals(il.f14238g)) {
            return false;
        }
        Kl kl3 = this.f14239h;
        Kl kl4 = il.f14239h;
        if (kl3 != null) {
            return kl3.equals(kl4);
        }
        return kl4 == null;
    }

    public int hashCode() {
        int i10 = (((((((this.f14232a ? 1 : 0) * 31) + (this.f14233b ? 1 : 0)) * 31) + (this.f14234c ? 1 : 0)) * 31) + (this.f14235d ? 1 : 0)) * 31;
        C1542bm c1542bm = this.f14236e;
        int iHashCode = (i10 + (c1542bm != null ? c1542bm.hashCode() : 0)) * 31;
        Kl kl = this.f14237f;
        int iHashCode2 = (iHashCode + (kl != null ? kl.hashCode() : 0)) * 31;
        Kl kl2 = this.f14238g;
        int iHashCode3 = (iHashCode2 + (kl2 != null ? kl2.hashCode() : 0)) * 31;
        Kl kl3 = this.f14239h;
        return iHashCode3 + (kl3 != null ? kl3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("UiAccessConfig{uiParsingEnabled=");
        sbA.append(this.f14232a);
        sbA.append(", uiEventSendingEnabled=");
        sbA.append(this.f14233b);
        sbA.append(", uiCollectingForBridgeEnabled=");
        sbA.append(this.f14234c);
        sbA.append(", uiRawEventSendingEnabled=");
        sbA.append(this.f14235d);
        sbA.append(", uiParsingConfig=");
        sbA.append(this.f14236e);
        sbA.append(", uiEventSendingConfig=");
        sbA.append(this.f14237f);
        sbA.append(", uiCollectingForBridgeConfig=");
        sbA.append(this.f14238g);
        sbA.append(", uiRawEventSendingConfig=");
        sbA.append(this.f14239h);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f14232a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14233b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14234c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f14235d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f14236e, i10);
        parcel.writeParcelable(this.f14237f, i10);
        parcel.writeParcelable(this.f14238g, i10);
        parcel.writeParcelable(this.f14239h, i10);
    }
}
