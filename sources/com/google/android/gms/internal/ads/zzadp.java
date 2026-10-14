package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import r.e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadp implements zzby {
    public static final Parcelable.Creator<zzadp> CREATOR;
    private static final zzam zzf;
    private static final zzam zzg;
    public final String zza;
    public final String zzb;
    public final long zzc;
    public final long zzd;
    public final byte[] zze;
    private int zzh;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzS("application/id3");
        zzf = zzakVar.zzY();
        zzak zzakVar2 = new zzak();
        zzakVar2.zzS("application/x-scte35");
        zzg = zzakVar2.zzY();
        CREATOR = new zzado();
    }

    public zzadp(Parcel parcel) {
        String string = parcel.readString();
        int i10 = zzfj.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.createByteArray();
    }

    public zzadp(String str, String str2, long j10, long j11, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadp.class == obj.getClass()) {
            zzadp zzadpVar = (zzadp) obj;
            if (this.zzc == zzadpVar.zzc && this.zzd == zzadpVar.zzd && zzfj.zzC(this.zza, zzadpVar.zza) && zzfj.zzC(this.zzb, zzadpVar.zzb) && Arrays.equals(this.zze, zzadpVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzh;
        if (i10 != 0) {
            return i10;
        }
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j10 = this.zzc;
        long j11 = this.zzd;
        int iHashCode3 = ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.zze);
        this.zzh = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        String str = this.zza;
        long j10 = this.zzd;
        long j11 = this.zzc;
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j10);
        e.a(sb2, ", durationMs=", j11, ", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeByteArray(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
