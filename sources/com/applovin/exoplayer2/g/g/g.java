package com.applovin.exoplayer2.g.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.y;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: com.applovin.exoplayer2.g.g.g.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6455b;

    private g(long j10, long j11) {
        this.f6454a = j10;
        this.f6455b = j11;
    }

    public static long a(y yVar, long j10) {
        long jH = yVar.h();
        if ((128 & jH) != 0) {
            return 8589934591L & ((((jH & 1) << 32) | yVar.o()) + j10);
        }
        return -9223372036854775807L;
    }

    public static g a(y yVar, long j10, ag agVar) {
        long jA = a(yVar, j10);
        return new g(jA, agVar.b(jA));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f6454a);
        parcel.writeLong(this.f6455b);
    }
}
