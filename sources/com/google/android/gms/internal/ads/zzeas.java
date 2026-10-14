package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.activity.k;
import j1.d;

/* JADX INFO: loaded from: classes2.dex */
final class zzeas extends zzebn {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzl zzb;
    private final com.google.android.gms.ads.internal.util.zzbr zzc;
    private final String zzd;
    private final String zze;

    public /* synthetic */ zzeas(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, com.google.android.gms.ads.internal.util.zzbr zzbrVar, String str, String str2, zzear zzearVar) {
        this.zza = activity;
        this.zzb = zzlVar;
        this.zzc = zzbrVar;
        this.zzd = str;
        this.zze = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        com.google.android.gms.ads.internal.util.zzbr zzbrVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzebn) {
            zzebn zzebnVar = (zzebn) obj;
            if (this.zza.equals(zzebnVar.zza()) && ((zzlVar = this.zzb) != null ? zzlVar.equals(zzebnVar.zzb()) : zzebnVar.zzb() == null) && ((zzbrVar = this.zzc) != null ? zzbrVar.equals(zzebnVar.zzc()) : zzebnVar.zzc() == null) && ((str = this.zzd) != null ? str.equals(zzebnVar.zzd()) : zzebnVar.zzd() == null)) {
                String str2 = this.zze;
                String strZze = zzebnVar.zze();
                if (str2 != null ? str2.equals(strZze) : strZze == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzlVar == null ? 0 : zzlVar.hashCode())) * 1000003;
        com.google.android.gms.ads.internal.util.zzbr zzbrVar = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (zzbrVar == null ? 0 : zzbrVar.hashCode())) * 1000003;
        String str = this.zzd;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zze;
        return iHashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzc);
        String str = this.zzd;
        String str2 = this.zze;
        StringBuilder sbA = q2.a.a("OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf, ", workManagerUtil=");
        d.a(sbA, strValueOf2, ", gwsQueryId=", str, ", uri=");
        return k.a(sbA, str2, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzebn
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzebn
    public final com.google.android.gms.ads.internal.overlay.zzl zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzebn
    public final com.google.android.gms.ads.internal.util.zzbr zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzebn
    public final String zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzebn
    public final String zze() {
        return this.zze;
    }
}
