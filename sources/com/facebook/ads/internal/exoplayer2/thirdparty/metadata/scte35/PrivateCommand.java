package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0914Hf;
import com.facebook.ads.redexgen.X.DU;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new DU();
    public final long A00;
    public final long A01;
    public final byte[] A02;

    public PrivateCommand(long j10, byte[] bArr, long j11) {
        this.A01 = j11;
        this.A00 = j10;
        this.A02 = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.A02 = bArr;
        parcel.readByteArray(bArr);
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, DU du) {
        this(parcel);
    }

    public static PrivateCommand A00(C0914Hf c0914Hf, int i10, long j10) {
        long jA0M = c0914Hf.A0M();
        byte[] bArr = new byte[i10 - 4];
        c0914Hf.A0c(bArr, 0, bArr.length);
        return new PrivateCommand(jA0M, bArr, j10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeByteArray(this.A02);
    }
}
