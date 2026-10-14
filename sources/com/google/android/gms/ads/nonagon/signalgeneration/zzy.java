package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzfgr;
import com.google.android.gms.internal.ads.zzfvy;
import java.util.List;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
final class zzy implements zzfvy {
    public final /* synthetic */ zzbsi zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzaa zzc;

    public zzy(zzaa zzaaVar, zzbsi zzbsiVar, boolean z10) {
        this.zzc = zzaaVar;
        this.zza = zzbsiVar;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        zzfgr zzfgrVar;
        String string;
        List<Uri> list = (List) obj;
        try {
            zzaa.zzF(this.zzc, list);
            this.zza.zzf(list);
            if (this.zzc.zzu || this.zzb) {
                for (Uri uri : list) {
                    if (this.zzc.zzN(uri)) {
                        Uri uriZzW = zzaa.zzW(uri, this.zzc.zzC, "1");
                        zzfgrVar = this.zzc.zzs;
                        string = uriZzW.toString();
                    } else {
                        if (((Boolean) zzba.zzc().zzb(zzbbm.zzhk)).booleanValue()) {
                            zzfgrVar = this.zzc.zzs;
                            string = uri.toString();
                        }
                    }
                    zzfgrVar.zzc(string, null);
                }
            }
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
        }
    }
}
