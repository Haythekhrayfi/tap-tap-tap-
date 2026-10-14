package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbi {
    public final Uri zzb;
    public final List zzf;
    public final zzfsc zzh;

    @Deprecated
    public final List zzi;
    public final Object zzj;
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);
    private static final String zzq = Integer.toString(6, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzbg
    };
    public final String zzc = null;
    public final zzbb zzd = null;
    public final zzaq zze = null;
    public final String zzg = null;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zzbi(Uri uri, String str, zzbb zzbbVar, zzaq zzaqVar, List list, String str2, zzfsc zzfscVar, Object obj, zzbh zzbhVar) {
        this.zzb = uri;
        this.zzf = list;
        this.zzh = zzfscVar;
        zzfrz zzfrzVar = new zzfrz();
        if (zzfscVar.size() > 0) {
            throw null;
        }
        this.zzi = zzfrzVar.zzi();
        this.zzj = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbi)) {
            return false;
        }
        zzbi zzbiVar = (zzbi) obj;
        return this.zzb.equals(zzbiVar.zzb) && zzfj.zzC(null, null) && zzfj.zzC(null, null) && zzfj.zzC(null, null) && this.zzf.equals(zzbiVar.zzf) && zzfj.zzC(null, null) && this.zzh.equals(zzbiVar.zzh) && zzfj.zzC(null, null);
    }

    public final int hashCode() {
        return (((this.zzf.hashCode() + (this.zzb.hashCode() * 923521)) * 961) + this.zzh.hashCode()) * 31;
    }
}
