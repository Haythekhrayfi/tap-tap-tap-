package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator<m>() { // from class: com.applovin.exoplayer2.g.e.m.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6391b;

    public m(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f6390a = parcel.readString();
        this.f6391b = (String) ai.a(parcel.readString());
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f6390a = str2;
        this.f6391b = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f6377f.equals(mVar.f6377f) && ai.a((Object) this.f6390a, (Object) mVar.f6390a) && ai.a((Object) this.f6391b, (Object) mVar.f6391b);
    }

    public int hashCode() {
        int iA = l1.e.a(this.f6377f, 527, 31);
        String str = this.f6390a;
        int iHashCode = (iA + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6391b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f6377f + ": url=" + this.f6391b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6377f);
        parcel.writeString(this.f6390a);
        parcel.writeString(this.f6391b);
    }
}
