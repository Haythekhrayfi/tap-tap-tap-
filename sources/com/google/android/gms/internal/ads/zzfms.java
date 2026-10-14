package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
final class zzfms extends zzfnl {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    public /* synthetic */ zzfms(IBinder iBinder, boolean z10, String str, int i10, float f10, int i11, String str2, int i12, String str3, zzfmr zzfmrVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = f10;
        this.zze = i12;
        this.zzf = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfnl) {
            zzfnl zzfnlVar = (zzfnl) obj;
            if (this.zza.equals(zzfnlVar.zze())) {
                zzfnlVar.zzi();
                String str = this.zzb;
                if (str != null ? str.equals(zzfnlVar.zzg()) : zzfnlVar.zzg() == null) {
                    if (this.zzc == zzfnlVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfnlVar.zza())) {
                        zzfnlVar.zzb();
                        zzfnlVar.zzh();
                        if (this.zze == zzfnlVar.zzd()) {
                            String str2 = this.zzf;
                            String strZzf = zzfnlVar.zzf();
                            if (str2 != null ? str2.equals(strZzf) : strZzf == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = ((((((((((iHashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd)) * 583896283) ^ this.zze) * 1000003;
        String str2 = this.zzf;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        String str = this.zzb;
        int i10 = this.zzc;
        float f10 = this.zzd;
        int i11 = this.zze;
        String str2 = this.zzf;
        StringBuilder sbA = q2.a.a("OverlayDisplayShowRequest{windowToken=", string, ", stableSessionToken=false, appId=", str, ", layoutGravity=");
        sbA.append(i10);
        sbA.append(", layoutVerticalMargin=");
        sbA.append(f10);
        sbA.append(", displayMode=0, sessionToken=null, windowWidthPx=");
        sbA.append(i11);
        sbA.append(", adFieldEnifd=");
        sbA.append(str2);
        sbA.append("}");
        return sbA.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final int zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final IBinder zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final String zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final String zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final String zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfnl
    public final boolean zzi() {
        return false;
    }
}
