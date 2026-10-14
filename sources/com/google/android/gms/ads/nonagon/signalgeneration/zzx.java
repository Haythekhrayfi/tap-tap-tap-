package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzfgr;
import com.google.android.gms.internal.ads.zzfvy;
import java.util.ArrayList;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
final class zzx implements zzfvy {
    public final /* synthetic */ zzbsi zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzaa zzc;

    public zzx(zzaa zzaaVar, zzbsi zzbsiVar, boolean z10) {
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
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            if (this.zzc.zzt || this.zzb) {
                for (Uri uri : arrayList) {
                    if (this.zzc.zzO(uri)) {
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
