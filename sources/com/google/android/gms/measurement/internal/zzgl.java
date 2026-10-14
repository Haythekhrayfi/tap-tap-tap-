package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzoz;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzgl implements Callable {
    public final /* synthetic */ zzaw zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzgq zzc;

    public zzgl(zzgq zzgqVar, zzaw zzawVar, String str) {
        this.zzc = zzgqVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzle zzleVar;
        String str;
        zzas zzasVarZzc;
        long j10;
        this.zzc.zza.zzA();
        zzii zziiVarZzr = this.zzc.zza.zzr();
        zzaw zzawVar = this.zza;
        String str2 = this.zzb;
        zziiVarZzr.zzg();
        zzfy.zzO();
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str2);
        if (!zziiVarZzr.zzs.zzf().zzs(str2, zzeb.zzS)) {
            zziiVarZzr.zzs.zzay().zzc().zzb("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        }
        if (!"_iap".equals(zzawVar.zza) && !"_iapx".equals(zzawVar.zza)) {
            zziiVarZzr.zzs.zzay().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str2, zzawVar.zza);
            return null;
        }
        com.google.android.gms.internal.measurement.zzfz zzfzVarZza = com.google.android.gms.internal.measurement.zzga.zza();
        zziiVarZzr.zzf.zzi().zzw();
        try {
            zzh zzhVarZzj = zziiVarZzr.zzf.zzi().zzj(str2);
            if (zzhVarZzj == null) {
                zziiVarZzr.zzs.zzay().zzc().zzb("Log and bundle not available. package_name", str2);
            } else if (zzhVarZzj.zzai()) {
                com.google.android.gms.internal.measurement.zzgb zzgbVarZzt = com.google.android.gms.internal.measurement.zzgc.zzt();
                zzgbVarZzt.zzad(1);
                zzgbVarZzt.zzZ("android");
                if (!TextUtils.isEmpty(zzhVarZzj.zzt())) {
                    zzgbVarZzt.zzD(zzhVarZzj.zzt());
                }
                if (!TextUtils.isEmpty(zzhVarZzj.zzv())) {
                    zzgbVarZzt.zzF((String) Preconditions.checkNotNull(zzhVarZzj.zzv()));
                }
                if (!TextUtils.isEmpty(zzhVarZzj.zzw())) {
                    zzgbVarZzt.zzG((String) Preconditions.checkNotNull(zzhVarZzj.zzw()));
                }
                if (zzhVarZzj.zzb() != -2147483648L) {
                    zzgbVarZzt.zzH((int) zzhVarZzj.zzb());
                }
                zzgbVarZzt.zzV(zzhVarZzj.zzm());
                zzgbVarZzt.zzP(zzhVarZzj.zzk());
                String strZzy = zzhVarZzj.zzy();
                String strZzr = zzhVarZzj.zzr();
                if (!TextUtils.isEmpty(strZzy)) {
                    zzgbVarZzt.zzU(strZzy);
                } else if (!TextUtils.isEmpty(strZzr)) {
                    zzgbVarZzt.zzC(strZzr);
                }
                zzai zzaiVarZzh = zziiVarZzr.zzf.zzh(str2);
                zzgbVarZzt.zzM(zzhVarZzj.zzj());
                if (zziiVarZzr.zzs.zzJ() && zziiVarZzr.zzs.zzf().zzt(zzgbVarZzt.zzap()) && zzaiVarZzh.zzi(zzah.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                    zzgbVarZzt.zzO(null);
                }
                zzgbVarZzt.zzL(zzaiVarZzh.zzh());
                if (zzaiVarZzh.zzi(zzah.AD_STORAGE) && zzhVarZzj.zzah()) {
                    Pair pairZzd = zziiVarZzr.zzf.zzs().zzd(zzhVarZzj.zzt(), zzaiVarZzh);
                    if (zzhVarZzj.zzah() && !TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                        try {
                            zzgbVarZzt.zzae(zzii.zza((String) pairZzd.first, Long.toString(zzawVar.zzd)));
                            Object obj = pairZzd.second;
                            if (obj != null) {
                                zzgbVarZzt.zzX(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e10) {
                            zziiVarZzr.zzs.zzay().zzc().zzb("Resettable device id encryption failed", e10.getMessage());
                            bArr = new byte[0];
                        }
                    }
                }
                zziiVarZzr.zzs.zzg().zzu();
                zzgbVarZzt.zzN(Build.MODEL);
                zziiVarZzr.zzs.zzg().zzu();
                zzgbVarZzt.zzY(Build.VERSION.RELEASE);
                zzgbVarZzt.zzaj((int) zziiVarZzr.zzs.zzg().zzb());
                zzgbVarZzt.zzan(zziiVarZzr.zzs.zzg().zzc());
                try {
                    if (zzaiVarZzh.zzi(zzah.ANALYTICS_STORAGE) && zzhVarZzj.zzu() != null) {
                        zzgbVarZzt.zzE(zzii.zza((String) Preconditions.checkNotNull(zzhVarZzj.zzu()), Long.toString(zzawVar.zzd)));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzj.zzx())) {
                        zzgbVarZzt.zzT((String) Preconditions.checkNotNull(zzhVarZzj.zzx()));
                    }
                    String strZzt = zzhVarZzj.zzt();
                    List listZzu = zziiVarZzr.zzf.zzi().zzu(strZzt);
                    Iterator it = listZzu.iterator();
                    do {
                        if (!it.hasNext()) {
                            zzleVar = null;
                            break;
                        }
                        zzleVar = (zzle) it.next();
                    } while (!"_lte".equals(zzleVar.zzc));
                    if (zzleVar == null || zzleVar.zze == null) {
                        zzle zzleVar2 = new zzle(strZzt, "auto", "_lte", zziiVarZzr.zzs.zzav().currentTimeMillis(), 0L);
                        listZzu.add(zzleVar2);
                        zziiVarZzr.zzf.zzi().zzL(zzleVar2);
                    }
                    zzlb zzlbVarZzu = zziiVarZzr.zzf.zzu();
                    zzlbVarZzu.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                    if (zzlbVarZzu.zzs.zzg().zze()) {
                        String strZzt2 = zzhVarZzj.zzt();
                        Preconditions.checkNotNull(strZzt2);
                        if (zzhVarZzj.zzah() && zzlbVarZzu.zzf.zzo().zzn(strZzt2)) {
                            zzlbVarZzu.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                            Iterator it2 = listZzu.iterator();
                            while (it2.hasNext()) {
                                if ("_npa".equals(((zzle) it2.next()).zzc)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            listZzu.add(new zzle(strZzt2, "auto", "_npa", zzlbVarZzu.zzs.zzav().currentTimeMillis(), 1L));
                        }
                    }
                    com.google.android.gms.internal.measurement.zzgl[] zzglVarArr = new com.google.android.gms.internal.measurement.zzgl[listZzu.size()];
                    for (int i10 = 0; i10 < listZzu.size(); i10++) {
                        com.google.android.gms.internal.measurement.zzgk zzgkVarZzd = com.google.android.gms.internal.measurement.zzgl.zzd();
                        zzgkVarZzd.zzf(((zzle) listZzu.get(i10)).zzc);
                        zzgkVarZzd.zzg(((zzle) listZzu.get(i10)).zzd);
                        zziiVarZzr.zzf.zzu().zzu(zzgkVarZzd, ((zzle) listZzu.get(i10)).zze);
                        zzglVarArr[i10] = (com.google.android.gms.internal.measurement.zzgl) zzgkVarZzd.zzaE();
                    }
                    zzgbVarZzt.zzj(Arrays.asList(zzglVarArr));
                    zzep zzepVarZzb = zzep.zzb(zzawVar);
                    zziiVarZzr.zzs.zzv().zzL(zzepVarZzb.zzd, zziiVarZzr.zzf.zzi().zzi(str2));
                    zziiVarZzr.zzs.zzv().zzM(zzepVarZzb, zziiVarZzr.zzs.zzf().zzd(str2));
                    Bundle bundle = zzepVarZzb.zzd;
                    bundle.putLong("_c", 1L);
                    zziiVarZzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                    bundle.putLong("_r", 1L);
                    bundle.putString("_o", zzawVar.zzc);
                    if (zziiVarZzr.zzs.zzv().zzae(zzgbVarZzt.zzap())) {
                        zziiVarZzr.zzs.zzv().zzO(bundle, "_dbg", 1L);
                        zziiVarZzr.zzs.zzv().zzO(bundle, "_r", 1L);
                    }
                    zzas zzasVarZzn = zziiVarZzr.zzf.zzi().zzn(str2, zzawVar.zza);
                    if (zzasVarZzn == null) {
                        str = null;
                        zzasVarZzc = new zzas(str2, zzawVar.zza, 0L, 0L, 0L, zzawVar.zzd, 0L, null, null, null, null);
                        j10 = 0;
                    } else {
                        str = null;
                        long j11 = zzasVarZzn.zzf;
                        zzasVarZzc = zzasVarZzn.zzc(zzawVar.zzd);
                        j10 = j11;
                    }
                    zziiVarZzr.zzf.zzi().zzE(zzasVarZzc);
                    zzar zzarVar = new zzar(zziiVarZzr.zzs, zzawVar.zzc, str2, zzawVar.zza, zzawVar.zzd, j10, bundle);
                    com.google.android.gms.internal.measurement.zzfr zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
                    zzfrVarZze.zzm(zzarVar.zzd);
                    zzfrVarZze.zzi(zzarVar.zzb);
                    zzfrVarZze.zzl(zzarVar.zze);
                    zzat zzatVar = new zzat(zzarVar.zzf);
                    while (zzatVar.hasNext()) {
                        String next = zzatVar.next();
                        com.google.android.gms.internal.measurement.zzfv zzfvVarZze = com.google.android.gms.internal.measurement.zzfw.zze();
                        zzfvVarZze.zzj(next);
                        Object objZzf = zzarVar.zzf.zzf(next);
                        if (objZzf != null) {
                            zziiVarZzr.zzf.zzu().zzt(zzfvVarZze, objZzf);
                            zzfrVarZze.zze(zzfvVarZze);
                        }
                    }
                    zzgbVarZzt.zzk(zzfrVarZze);
                    com.google.android.gms.internal.measurement.zzgd zzgdVarZza = com.google.android.gms.internal.measurement.zzgf.zza();
                    com.google.android.gms.internal.measurement.zzft zzftVarZza = com.google.android.gms.internal.measurement.zzfu.zza();
                    zzftVarZza.zza(zzasVarZzc.zzc);
                    zzftVarZza.zzb(zzawVar.zza);
                    zzgdVarZza.zza(zzftVarZza);
                    zzgbVarZzt.zzaa(zzgdVarZza);
                    zzgbVarZzt.zzf(zziiVarZzr.zzf.zzf().zza(zzhVarZzj.zzt(), Collections.emptyList(), zzgbVarZzt.zzat(), Long.valueOf(zzfrVarZze.zzc()), Long.valueOf(zzfrVarZze.zzc())));
                    if (zzfrVarZze.zzq()) {
                        zzgbVarZzt.zzai(zzfrVarZze.zzc());
                        zzgbVarZzt.zzQ(zzfrVarZze.zzc());
                    }
                    long jZzn = zzhVarZzj.zzn();
                    if (jZzn != 0) {
                        zzgbVarZzt.zzab(jZzn);
                    }
                    long jZzp = zzhVarZzj.zzp();
                    if (jZzp != 0) {
                        zzgbVarZzt.zzac(jZzp);
                    } else if (jZzn != 0) {
                        zzgbVarZzt.zzac(jZzn);
                    }
                    String strZzB = zzhVarZzj.zzB();
                    zzoz.zzc();
                    if (zziiVarZzr.zzs.zzf().zzs(str, zzeb.zzar) && strZzB != null) {
                        zzgbVarZzt.zzah(strZzB);
                    }
                    zzhVarZzj.zzE();
                    zzgbVarZzt.zzI((int) zzhVarZzj.zzo());
                    zziiVarZzr.zzs.zzf().zzh();
                    zzgbVarZzt.zzal(73000L);
                    zzgbVarZzt.zzak(zziiVarZzr.zzs.zzav().currentTimeMillis());
                    zzgbVarZzt.zzag(true);
                    if (zziiVarZzr.zzs.zzf().zzs(str, zzeb.zzaz)) {
                        zziiVarZzr.zzf.zzC(zzgbVarZzt.zzap(), zzgbVarZzt);
                    }
                    zzfzVarZza.zza(zzgbVarZzt);
                    zzhVarZzj.zzab(zzgbVarZzt.zzd());
                    zzhVarZzj.zzZ(zzgbVarZzt.zzc());
                    zziiVarZzr.zzf.zzi().zzD(zzhVarZzj);
                    zziiVarZzr.zzf.zzi().zzC();
                    zziiVarZzr.zzf.zzi().zzx();
                    try {
                        return zziiVarZzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzga) zzfzVarZza.zzaE()).zzbv());
                    } catch (IOException e11) {
                        zziiVarZzr.zzs.zzay().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzeo.zzn(str2), e11);
                        return str;
                    }
                } catch (SecurityException e12) {
                    zziiVarZzr.zzs.zzay().zzc().zzb("app instance id encryption failed", e12.getMessage());
                    bArr = new byte[0];
                }
            } else {
                zziiVarZzr.zzs.zzay().zzc().zzb("Log and bundle disabled. package_name", str2);
            }
            bArr = new byte[0];
            zziiVarZzr.zzf.zzi().zzx();
            return bArr;
        } catch (Throwable th) {
            zziiVarZzr.zzf.zzi().zzx();
            throw th;
        }
    }
}
