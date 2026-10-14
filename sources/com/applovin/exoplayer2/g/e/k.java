package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() { // from class: com.applovin.exoplayer2.g.e.k.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6387b;

    public k(Parcel parcel) {
        super("PRIV");
        this.f6386a = (String) ai.a(parcel.readString());
        this.f6387b = (byte[]) ai.a(parcel.createByteArray());
    }

    public k(String str, byte[] bArr) {
        super("PRIV");
        this.f6386a = str;
        this.f6387b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return ai.a((Object) this.f6386a, (Object) kVar.f6386a) && Arrays.equals(this.f6387b, kVar.f6387b);
    }

    public int hashCode() {
        String str = this.f6386a;
        return Arrays.hashCode(this.f6387b) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f6377f + ": owner=" + this.f6386a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6386a);
        parcel.writeByteArray(this.f6387b);
    }
}
