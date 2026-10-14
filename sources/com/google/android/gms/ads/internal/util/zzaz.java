package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzfbi;
import com.google.android.gms.internal.ads.zzfpw;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "ExceptionParcelCreator")
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();

    @SafeParcelable.Field(id = 1)
    public final String zza;

    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzaz(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i10) {
        this.zza = str == null ? "" : str;
        this.zzb = i10;
    }

    public static zzaz zzb(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarZza = zzfbi.zza(th);
        return new zzaz(zzfpw.zzd(th.getMessage()) ? zzeVarZza.zzb : th.getMessage(), zzeVarZza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzay zza() {
        return new zzay(this.zza, this.zzb);
    }
}
