package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
public final class zzady extends zzaen {
    public static final Parcelable.Creator<zzady> CREATOR = new zzadx();
    public final String zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzady(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i10 = zzfj.zza;
        this.zza = string;
        this.zzb = parcel.readString();
        this.zzc = parcel.readInt();
        this.zzd = parcel.createByteArray();
    }

    public zzady(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzady.class == obj.getClass()) {
            zzady zzadyVar = (zzady) obj;
            if (this.zzc == zzadyVar.zzc && zzfj.zzC(this.zza, zzadyVar.zza) && zzfj.zzC(this.zzb, zzadyVar.zzb) && Arrays.equals(this.zzd, zzadyVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzc + 527;
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i11 = i10 * 31;
        String str2 = this.zzb;
        return Arrays.hashCode(this.zzd) + ((((i11 + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final String toString() {
        return q.a(this.zzf, ": mimeType=", this.zza, ", description=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaen, com.google.android.gms.internal.ads.zzby
    public final void zza(zzbt zzbtVar) {
        zzbtVar.zza(this.zzd, this.zzc);
    }
}
