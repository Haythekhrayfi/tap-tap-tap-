package com.applovin.exoplayer2.g.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.applovin.exoplayer2.g.e.b.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6353a;

    public b(Parcel parcel) {
        super((String) ai.a(parcel.readString()));
        this.f6353a = (byte[]) ai.a(parcel.createByteArray());
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f6353a = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6377f.equals(bVar.f6377f) && Arrays.equals(this.f6353a, bVar.f6353a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6353a) + l1.e.a(this.f6377f, 527, 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6377f);
        parcel.writeByteArray(this.f6353a);
    }
}
