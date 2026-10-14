package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() { // from class: com.applovin.exoplayer2.g.e.i.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i10) {
            return new i[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6380c;

    public i(Parcel parcel) {
        super("----");
        this.f6378a = (String) ai.a(parcel.readString());
        this.f6379b = (String) ai.a(parcel.readString());
        this.f6380c = (String) ai.a(parcel.readString());
    }

    public i(String str, String str2, String str3) {
        super("----");
        this.f6378a = str;
        this.f6379b = str2;
        this.f6380c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return ai.a((Object) this.f6379b, (Object) iVar.f6379b) && ai.a((Object) this.f6378a, (Object) iVar.f6378a) && ai.a((Object) this.f6380c, (Object) iVar.f6380c);
    }

    public int hashCode() {
        String str = this.f6378a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6379b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6380c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f6377f + ": domain=" + this.f6378a + ", description=" + this.f6379b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6377f);
        parcel.writeString(this.f6378a);
        parcel.writeString(this.f6380c);
    }
}
