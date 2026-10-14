package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
import l1.e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzac implements Parcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzab();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    public zzac(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String string = parcel.readString();
        int i10 = zzfj.zza;
        this.zzc = string;
        this.zzd = parcel.createByteArray();
    }

    public zzac(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.zza = uuid;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzac)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzac zzacVar = (zzac) obj;
        return zzfj.zzC(this.zzb, zzacVar.zzb) && zzfj.zzC(this.zzc, zzacVar.zzc) && zzfj.zzC(this.zza, zzacVar.zza) && Arrays.equals(this.zzd, zzacVar.zzd);
    }

    public final int hashCode() {
        int i10 = this.zze;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int iA = e.a(this.zzc, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31) + Arrays.hashCode(this.zzd);
        this.zze = iA;
        return iA;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }
}
