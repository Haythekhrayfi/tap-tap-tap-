package com.yandex.mobile.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.mp0;

/* JADX INFO: loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f18615c;

    public class a implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        public final PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivateCommand[] newArray(int i10) {
            return new PrivateCommand[i10];
        }
    }

    private PrivateCommand(long j10, byte[] bArr, long j11) {
        this.f18613a = j11;
        this.f18614b = j10;
        this.f18615c = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.f18613a = parcel.readLong();
        this.f18614b = parcel.readLong();
        this.f18615c = (byte[]) da1.a(parcel.createByteArray());
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, int i10) {
        this(parcel);
    }

    public static PrivateCommand a(mp0 mp0Var, int i10, long j10) {
        long jV = mp0Var.v();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        mp0Var.a(bArr, 0, i11);
        return new PrivateCommand(jV, bArr, j10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f18613a);
        parcel.writeLong(this.f18614b);
        parcel.writeByteArray(this.f18615c);
    }
}
