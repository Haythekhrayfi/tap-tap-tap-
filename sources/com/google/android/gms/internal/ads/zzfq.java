package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfq implements zzby {
    public static final Parcelable.Creator<zzfq> CREATOR = new zzfo();
    public final float zza;
    public final float zzb;

    public zzfq(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        zzdy.zze(z10, "Invalid latitude or longitude");
        this.zza = f10;
        this.zzb = f11;
    }

    public /* synthetic */ zzfq(Parcel parcel, zzfp zzfpVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfq.class == obj.getClass()) {
            zzfq zzfqVar = (zzfq) obj;
            if (this.zza == zzfqVar.zza && this.zzb == zzfqVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + Float.valueOf(this.zzb).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final /* synthetic */ void zza(zzbt zzbtVar) {
    }
}
