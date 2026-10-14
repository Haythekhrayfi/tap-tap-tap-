package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.applovin.exoplayer2.g.g.a.1
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
    public final long f6418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f6420c;

    private a(long j10, byte[] bArr, long j11) {
        this.f6418a = j11;
        this.f6419b = j10;
        this.f6420c = bArr;
    }

    private a(Parcel parcel) {
        this.f6418a = parcel.readLong();
        this.f6419b = parcel.readLong();
        this.f6420c = (byte[]) ai.a(parcel.createByteArray());
    }

    public static a a(y yVar, int i10, long j10) {
        long jO = yVar.o();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        yVar.a(bArr, 0, i11);
        return new a(jO, bArr, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6418a);
        parcel.writeLong(this.f6419b);
        parcel.writeByteArray(this.f6420c);
    }
}
