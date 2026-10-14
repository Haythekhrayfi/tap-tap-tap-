package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaet extends zzaen {
    public static final Parcelable.Creator<zzaet> CREATOR = new zzaes();
    public final String zza;
    public final byte[] zzb;

    public zzaet(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i10 = zzfj.zza;
        this.zza = string;
        this.zzb = parcel.createByteArray();
    }

    public zzaet(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaet.class == obj.getClass()) {
            zzaet zzaetVar = (zzaet) obj;
            if (zzfj.zzC(this.zza, zzaetVar.zza) && Arrays.equals(this.zzb, zzaetVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return Arrays.hashCode(this.zzb) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzaen
    public final String toString() {
        return j.a(this.zzf, ": owner=", this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }
}
