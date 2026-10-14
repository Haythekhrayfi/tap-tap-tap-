package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbek extends NativeAd.AdChoicesInfo {
    private final zzbej zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbek(zzbej zzbejVar) {
        IBinder iBinder;
        this.zza = zzbejVar;
        try {
            this.zzc = zzbejVar.zzg();
        } catch (RemoteException e10) {
            zzbzr.zzh("", e10);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbejVar.zzh()) {
                zzber zzbepVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbepVar = iInterfaceQueryLocalInterface instanceof zzber ? (zzber) iInterfaceQueryLocalInterface : new zzbep(iBinder);
                }
                if (zzbepVar != null) {
                    this.zzb.add(new zzbes(zzbepVar));
                }
            }
        } catch (RemoteException e11) {
            zzbzr.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
