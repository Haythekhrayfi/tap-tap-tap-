package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeaf extends zzeag {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcuk zzd;
    private final TelephonyManager zze;
    private final zzdzx zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzazm.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzazm zzazmVar = zzazm.CONNECTING;
        sparseArray.put(iOrdinal, zzazmVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzazmVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzazmVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzazm.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzazm zzazmVar2 = zzazm.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzazmVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzazmVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzazmVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzazmVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzazmVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzazm.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzazmVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzazmVar);
    }

    public zzeaf(Context context, zzcuk zzcukVar, zzdzx zzdzxVar, zzdzt zzdztVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzdztVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcukVar;
        this.zzf = zzdzxVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzazd zza(zzeaf zzeafVar, Bundle bundle) {
        zzayw zzaywVarZza = zzazd.zza();
        int i10 = bundle.getInt("cnt", -2);
        int i11 = bundle.getInt("gnt", 0);
        int i12 = 2;
        if (i10 == -1) {
            zzeafVar.zzg = 2;
        } else {
            zzeafVar.zzg = 1;
            if (i10 == 0) {
                zzaywVarZza.zzb(2);
            } else if (i10 != 1) {
                zzaywVarZza.zzb(1);
            } else {
                zzaywVarZza.zzb(3);
            }
            switch (i11) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i12 = 3;
                    break;
                case 13:
                    i12 = 5;
                    break;
                default:
                    i12 = 1;
                    break;
            }
            zzaywVarZza.zza(i12);
        }
        return (zzazd) zzaywVarZza.zzal();
    }

    public static /* bridge */ /* synthetic */ zzazm zzb(zzeaf zzeafVar, Bundle bundle) {
        return (zzazm) zzb.get(zzfat.zza(zzfat.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzazm.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] zze(zzeaf zzeafVar, boolean z10, ArrayList arrayList, zzazd zzazdVar, zzazm zzazmVar) {
        zzazh zzazhVarZzg = zzazi.zzg();
        zzazhVarZzg.zza(arrayList);
        zzazhVarZzg.zzi(zzg(Settings.Global.getInt(zzeafVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzazhVarZzg.zzj(com.google.android.gms.ads.internal.zzt.zzq().zzj(zzeafVar.zzc, zzeafVar.zze));
        zzazhVarZzg.zzf(zzeafVar.zzf.zze());
        zzazhVarZzg.zze(zzeafVar.zzf.zzb());
        zzazhVarZzg.zzb(zzeafVar.zzf.zza());
        zzazhVarZzg.zzc(zzazmVar);
        zzazhVarZzg.zzd(zzazdVar);
        zzazhVarZzg.zzk(zzeafVar.zzg);
        zzazhVarZzg.zzl(zzg(z10));
        zzazhVarZzg.zzh(zzeafVar.zzf.zzd());
        zzazhVarZzg.zzg(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
        zzazhVarZzg.zzm(zzg(Settings.Global.getInt(zzeafVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return ((zzazi) zzazhVarZzg.zzal()).zzax();
    }

    private static final int zzg(boolean z10) {
        return z10 ? 2 : 1;
    }

    public final void zzd(boolean z10) {
        zzfwc.zzq(this.zzd.zzb(), new zzeae(this, z10), zzcae.zzf);
    }
}
