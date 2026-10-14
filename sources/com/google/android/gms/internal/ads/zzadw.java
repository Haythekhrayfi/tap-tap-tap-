package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadw implements zzby {
    public static final Parcelable.Creator<zzadw> CREATOR = new zzadv();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzadw(int i10, String str, String str2, String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        zzdy.zzd(z11);
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = i11;
    }

    public zzadw(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i10 = zzfj.zza;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadw.class == obj.getClass()) {
            zzadw zzadwVar = (zzadw) obj;
            if (this.zza == zzadwVar.zza && zzfj.zzC(this.zzb, zzadwVar.zzb) && zzfj.zzC(this.zzc, zzadwVar.zzc) && zzfj.zzC(this.zzd, zzadwVar.zzd) && this.zze == zzadwVar.zze && this.zzf == zzadwVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza + 527;
        String str = this.zzb;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i11 = i10 * 31;
        String str2 = this.zzc;
        int iHashCode2 = (((i11 + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzd;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zzb;
        int i10 = this.zza;
        int i11 = this.zzf;
        StringBuilder sbA = q2.a.a("IcyHeaders: name=\"", str, "\", genre=\"", str2, "\", bitrate=");
        sbA.append(i10);
        sbA.append(", metadataInterval=");
        sbA.append(i11);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        boolean z10 = this.zze;
        int i11 = zzfj.zza;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbtVar) {
        String str = this.zzc;
        if (str != null) {
            zzbtVar.zzp(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbtVar.zzi(str2);
        }
    }
}
