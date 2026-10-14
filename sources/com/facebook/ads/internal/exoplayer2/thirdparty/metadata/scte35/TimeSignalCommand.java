package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0914Hf;
import com.facebook.ads.redexgen.X.C0926Hr;
import com.facebook.ads.redexgen.X.Db;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static String[] A02 = {"sG", "SKgiCa5d9ZEELz", "pKJUtOIsmSdeWRhSmfkg", "RYqFvMPt4ygOGY", "4ulFqSy6k9HwIYoxn5tcLFNrNsE", "F6U", "Ool37D46w9DvUWXVHkToeSd93UD8I33w", "iJFoxGzstNUDxHZj"};
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Db();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public /* synthetic */ TimeSignalCommand(long j10, long j11, Db db2) {
        this(j10, j11);
    }

    public static long A00(C0914Hf c0914Hf, long j10) {
        long jA0E = c0914Hf.A0E();
        if ((128 & jA0E) == 0) {
            return -9223372036854775807L;
        }
        long j11 = (1 & jA0E) << 32;
        long jA0M = c0914Hf.A0M();
        String[] strArr = A02;
        if (strArr[7].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "aue9bKRLYwGt4M";
        strArr2[3] = "U8dfBAcmUh1N3t";
        return ((j11 | jA0M) + j10) & 8589934591L;
    }

    public static TimeSignalCommand A01(C0914Hf c0914Hf, long j10, C0926Hr c0926Hr) {
        long jA00 = A00(c0914Hf, j10);
        return new TimeSignalCommand(jA00, c0926Hr.A07(jA00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
