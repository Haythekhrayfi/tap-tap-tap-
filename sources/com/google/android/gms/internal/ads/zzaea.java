package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaea extends zzaen {
    public static final Parcelable.Creator<zzaea> CREATOR = new zzadz();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzaea(Parcel parcel) {
        String string = parcel.readString();
        int i10 = zzfj.zza;
        super(string);
        this.zza = parcel.createByteArray();
    }

    public zzaea(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaea.class == obj.getClass()) {
            zzaea zzaeaVar = (zzaea) obj;
            if (this.zzf.equals(zzaeaVar.zzf) && Arrays.equals(this.zza, zzaeaVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }
}
