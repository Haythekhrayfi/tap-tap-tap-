package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.w;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzads implements zzby {
    public static final Parcelable.Creator<zzads> CREATOR = new zzadr();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzads(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = bArr;
    }

    public zzads(Parcel parcel) {
        this.zza = parcel.readInt();
        String string = parcel.readString();
        int i10 = zzfj.zza;
        this.zzb = string;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }

    public static zzads zzb(zzfa zzfaVar) {
        int iZze = zzfaVar.zze();
        String strZzx = zzfaVar.zzx(zzfaVar.zze(), zzfot.zza);
        String strZzx2 = zzfaVar.zzx(zzfaVar.zze(), zzfot.zzc);
        int iZze2 = zzfaVar.zze();
        int iZze3 = zzfaVar.zze();
        int iZze4 = zzfaVar.zze();
        int iZze5 = zzfaVar.zze();
        int iZze6 = zzfaVar.zze();
        byte[] bArr = new byte[iZze6];
        zzfaVar.zzB(bArr, 0, iZze6);
        return new zzads(iZze, strZzx, strZzx2, iZze2, iZze3, iZze4, iZze5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzads.class == obj.getClass()) {
            zzads zzadsVar = (zzads) obj;
            if (this.zza == zzadsVar.zza && this.zzb.equals(zzadsVar.zzb) && this.zzc.equals(zzadsVar.zzc) && this.zzd == zzadsVar.zzd && this.zze == zzadsVar.zze && this.zzf == zzadsVar.zzf && this.zzg == zzadsVar.zzg && Arrays.equals(this.zzh, zzadsVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + 527) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        return w.a("Picture: mimeType=", this.zzb, ", description=", this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbtVar) {
        zzbtVar.zza(this.zzh, this.zza);
    }
}
