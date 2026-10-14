package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.k;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaei extends zzaen {
    public static final Parcelable.Creator<zzaei> CREATOR = new zzaeh();
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzaei(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i10 = zzfj.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.createByteArray();
    }

    public zzaei(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaei.class == obj.getClass()) {
            zzaei zzaeiVar = (zzaei) obj;
            if (zzfj.zzC(this.zza, zzaeiVar.zza) && zzfj.zzC(this.zzb, zzaeiVar.zzb) && zzfj.zzC(this.zzc, zzaeiVar.zzc) && Arrays.equals(this.zzd, zzaeiVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.zzb;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i10 = iHashCode + 527;
        String str3 = this.zzc;
        return Arrays.hashCode(this.zzd) + (((((i10 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final String toString() {
        String str = this.zzf;
        String str2 = this.zza;
        String str3 = this.zzb;
        return k.a(q2.a.a(str, ": mimeType=", str2, ", filename=", str3), ", description=", this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }
}
