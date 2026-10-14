package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.applovin.exoplayer2.g.e.f.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6371d;

    public f(Parcel parcel) {
        super("GEOB");
        this.f6368a = (String) ai.a(parcel.readString());
        this.f6369b = (String) ai.a(parcel.readString());
        this.f6370c = (String) ai.a(parcel.readString());
        this.f6371d = (byte[]) ai.a(parcel.createByteArray());
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f6368a = str;
        this.f6369b = str2;
        this.f6370c = str3;
        this.f6371d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return ai.a((Object) this.f6368a, (Object) fVar.f6368a) && ai.a((Object) this.f6369b, (Object) fVar.f6369b) && ai.a((Object) this.f6370c, (Object) fVar.f6370c) && Arrays.equals(this.f6371d, fVar.f6371d);
    }

    public int hashCode() {
        String str = this.f6368a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6369b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6370c;
        return Arrays.hashCode(this.f6371d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f6377f + ": mimeType=" + this.f6368a + ", filename=" + this.f6369b + ", description=" + this.f6370c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6368a);
        parcel.writeString(this.f6369b);
        parcel.writeString(this.f6370c);
        parcel.writeByteArray(this.f6371d);
    }
}
