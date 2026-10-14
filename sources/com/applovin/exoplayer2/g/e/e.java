package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.applovin.exoplayer2.g.e.e.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6367c;

    public e(Parcel parcel) {
        super("COMM");
        this.f6365a = (String) ai.a(parcel.readString());
        this.f6366b = (String) ai.a(parcel.readString());
        this.f6367c = (String) ai.a(parcel.readString());
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f6365a = str;
        this.f6366b = str2;
        this.f6367c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return ai.a((Object) this.f6366b, (Object) eVar.f6366b) && ai.a((Object) this.f6365a, (Object) eVar.f6365a) && ai.a((Object) this.f6367c, (Object) eVar.f6367c);
    }

    public int hashCode() {
        String str = this.f6365a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6366b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6367c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f6377f + ": language=" + this.f6365a + ", description=" + this.f6366b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6377f);
        parcel.writeString(this.f6365a);
        parcel.writeString(this.f6367c);
    }
}
