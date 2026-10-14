package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.mp0;

/* JADX INFO: loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18647b;

    public class a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand[] newArray(int i10) {
            return new TimeSignalCommand[i10];
        }
    }

    private TimeSignalCommand(long j10, long j11) {
        this.f18646a = j10;
        this.f18647b = j11;
    }

    public /* synthetic */ TimeSignalCommand(long j10, long j11, int i10) {
        this(j10, j11);
    }

    public static long a(long j10, mp0 mp0Var) {
        long jT = mp0Var.t();
        if ((128 & jT) != 0) {
            return 8589934591L & ((((jT & 1) << 32) | mp0Var.v()) + j10);
        }
        return -9223372036854775807L;
    }

    public static TimeSignalCommand a(mp0 mp0Var, long j10, a71 a71Var) {
        long jA = a(j10, mp0Var);
        return new TimeSignalCommand(jA, a71Var.b(jA));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f18646a);
        parcel.writeLong(this.f18647b);
    }
}
