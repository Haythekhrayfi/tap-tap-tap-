package com.facebook.ads.redexgen.X;

import android.os.Parcel;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DZ {
    public final int A00;
    public final long A01;

    public DZ(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public /* synthetic */ DZ(int i10, long j10, DY dy) {
        this(i10, j10);
    }

    public static DZ A00(Parcel parcel) {
        return new DZ(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
