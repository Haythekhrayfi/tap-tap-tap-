package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
public final class zzfcb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfcb> CREATOR = new zzfcc();

    @Nullable
    public final Context zza;
    public final zzfby zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfby[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfcb(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i14, @SafeParcelable.Param(id = 7) int i15) {
        zzfby[] zzfbyVarArrValues = zzfby.values();
        this.zzh = zzfbyVarArrValues;
        int[] iArrZza = zzfbz.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = zzfca.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i10;
        this.zzb = zzfbyVarArrValues[i10];
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = str;
        this.zzj = i14;
        this.zzg = iArrZza[i14];
        this.zzk = i15;
        int i16 = iArrZza2[i15];
    }

    private zzfcb(@Nullable Context context, zzfby zzfbyVar, int i10, int i11, int i12, String str, String str2, String str3) {
        this.zzh = zzfby.values();
        this.zzl = zzfbz.zza();
        this.zzm = zzfca.zza();
        this.zza = context;
        this.zzi = zzfbyVar.ordinal();
        this.zzb = zzfbyVar;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        int i13 = 2;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i13 = 3;
        }
        this.zzg = i13;
        this.zzj = i13 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }

    @Nullable
    public static zzfcb zza(zzfby zzfbyVar, Context context) {
        if (zzfbyVar == zzfby.Rewarded) {
            return new zzfcb(context, zzfbyVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgg)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgm)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgo)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgq), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgi), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgk));
        }
        if (zzfbyVar == zzfby.Interstitial) {
            return new zzfcb(context, zzfbyVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgh)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgn)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgp)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgr), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgj), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgl));
        }
        if (zzfbyVar != zzfby.AppOpen) {
            return null;
        }
        return new zzfcb(context, zzfbyVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgu)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgw)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgx)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgs), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgt), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzgv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
