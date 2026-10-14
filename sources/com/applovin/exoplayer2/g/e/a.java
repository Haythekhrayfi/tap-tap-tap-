package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.e.a.1
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
    public final String f6349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6352d;

    public a(Parcel parcel) {
        super("APIC");
        this.f6349a = (String) ai.a(parcel.readString());
        this.f6350b = parcel.readString();
        this.f6351c = parcel.readInt();
        this.f6352d = (byte[]) ai.a(parcel.createByteArray());
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f6349a = str;
        this.f6350b = str2;
        this.f6351c = i10;
        this.f6352d = bArr;
    }

    @Override // com.applovin.exoplayer2.g.a.InterfaceC0092a
    public void a(ac.a aVar) {
        aVar.a(this.f6352d, this.f6351c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6351c == aVar.f6351c && ai.a((Object) this.f6349a, (Object) aVar.f6349a) && ai.a((Object) this.f6350b, (Object) aVar.f6350b) && Arrays.equals(this.f6352d, aVar.f6352d);
    }

    public int hashCode() {
        int i10 = (527 + this.f6351c) * 31;
        String str = this.f6349a;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6350b;
        return Arrays.hashCode(this.f6352d) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.applovin.exoplayer2.g.e.h
    public String toString() {
        return this.f6377f + ": mimeType=" + this.f6349a + ", description=" + this.f6350b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6349a);
        parcel.writeString(this.f6350b);
        parcel.writeInt(this.f6351c);
        parcel.writeByteArray(this.f6352d);
    }
}
