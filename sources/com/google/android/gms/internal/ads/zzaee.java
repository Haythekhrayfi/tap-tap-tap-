package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaee extends zzaen {
    public static final Parcelable.Creator<zzaee> CREATOR = new zzaed();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzaen[] zze;

    public zzaee(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i10 = zzfj.zza;
        this.zza = string;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = parcel.createStringArray();
        int i11 = parcel.readInt();
        this.zze = new zzaen[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.zze[i12] = (zzaen) parcel.readParcelable(zzaen.class.getClassLoader());
        }
    }

    public zzaee(String str, boolean z10, boolean z11, String[] strArr, zzaen[] zzaenVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = strArr;
        this.zze = zzaenVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaee.class == obj.getClass()) {
            zzaee zzaeeVar = (zzaee) obj;
            if (this.zzb == zzaeeVar.zzb && this.zzc == zzaeeVar.zzc && zzfj.zzC(this.zza, zzaeeVar.zza) && Arrays.equals(this.zzd, zzaeeVar.zzd) && Arrays.equals(this.zze, zzaeeVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((this.zzb ? 1 : 0) + 527) * 31) + (this.zzc ? 1 : 0);
        String str = this.zza;
        return (i10 * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzaen zzaenVar : this.zze) {
            parcel.writeParcelable(zzaenVar, 0);
        }
    }
}
