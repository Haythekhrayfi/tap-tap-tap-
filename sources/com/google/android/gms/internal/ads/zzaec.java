package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaec extends zzaen {
    public static final Parcelable.Creator<zzaec> CREATOR = new zzaeb();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzaen[] zzg;

    public zzaec(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i10 = zzfj.zza;
        this.zza = string;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int i11 = parcel.readInt();
        this.zzg = new zzaen[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.zzg[i12] = (zzaen) parcel.readParcelable(zzaen.class.getClassLoader());
        }
    }

    public zzaec(String str, int i10, int i11, long j10, long j11, zzaen[] zzaenVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = j11;
        this.zzg = zzaenVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaen, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaec.class == obj.getClass()) {
            zzaec zzaecVar = (zzaec) obj;
            if (this.zzb == zzaecVar.zzb && this.zzc == zzaecVar.zzc && this.zzd == zzaecVar.zzd && this.zze == zzaecVar.zze && zzfj.zzC(this.zza, zzaecVar.zza) && Arrays.equals(this.zzg, zzaecVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((this.zzb + 527) * 31) + this.zzc;
        int i11 = (int) this.zzd;
        int i12 = (int) this.zze;
        String str = this.zza;
        return (((((i10 * 31) + i11) * 31) + i12) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzaen zzaenVar : this.zzg) {
            parcel.writeParcelable(zzaenVar, 0);
        }
    }
}
