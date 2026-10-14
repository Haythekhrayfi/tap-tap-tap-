package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcem extends zzcbr implements zzhg, zzlv {
    public static final /* synthetic */ int zza = 0;
    private final Context zzb;
    private final zzcdx zzc;
    private final zzwy zzd;
    private final zzcbz zze;
    private final WeakReference zzf;
    private final zzuu zzg;
    private zzis zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private zzcbq zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private final String zzo;
    private final int zzp;
    private Integer zzr;
    private final ArrayList zzs;
    private volatile zzcdz zzt;
    private final Object zzq = new Object();
    private final Set zzu = new HashSet();

    /* JADX WARN: Code duplicated, block: B:21:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e9  */
    public zzcem(Context context, zzcbz zzcbzVar, zzcca zzccaVar, Integer num) {
        final boolean z10;
        final zzgd zzgdVar;
        this.zzb = context;
        this.zze = zzcbzVar;
        this.zzr = num;
        this.zzf = new WeakReference(zzccaVar);
        zzcdx zzcdxVar = new zzcdx();
        this.zzc = zzcdxVar;
        zzwy zzwyVar = new zzwy(context);
        this.zzd = zzwyVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
        }
        zzcbr.zzD().incrementAndGet();
        zzln zzlnVar = new zzln(context, new zzcei(this));
        zzlnVar.zzb(zzwyVar);
        zzlnVar.zza(zzcdxVar);
        zzlo zzloVarZzc = zzlnVar.zzc();
        this.zzh = zzloVarZzc;
        zzloVarZzc.zzz(this);
        this.zzl = 0;
        this.zzn = 0L;
        this.zzm = 0;
        this.zzs = new ArrayList();
        this.zzt = null;
        this.zzo = (String) zzfpd.zzd(zzccaVar != null ? zzccaVar.zzbl() : null).zzb("");
        this.zzp = zzccaVar != null ? zzccaVar.zzf() : 0;
        final String strZzc = com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzccaVar.zzn().zza);
        if (!this.zzj || this.zzi.limit() <= 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbR)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue()) {
                    z10 = zzcbzVar.zzj ? false : true;
                }
            } else if (zzcbzVar.zzj) {
            }
            final zzgd zzgdVar2 = zzcbzVar.zzm ? new zzgd() { // from class: com.google.android.gms.internal.ads.zzced
                @Override // com.google.android.gms.internal.ads.zzgd
                public final zzge zza() {
                    return this.zza.zzW(strZzc, z10);
                }
            } : zzcbzVar.zzi > 0 ? new zzgd() { // from class: com.google.android.gms.internal.ads.zzcee
                @Override // com.google.android.gms.internal.ads.zzgd
                public final zzge zza() {
                    return this.zza.zzX(strZzc, z10);
                }
            } : new zzgd() { // from class: com.google.android.gms.internal.ads.zzcef
                @Override // com.google.android.gms.internal.ads.zzgd
                public final zzge zza() {
                    return this.zza.zzY(strZzc, z10);
                }
            };
            zzgdVar = zzcbzVar.zzj ? new zzgd() { // from class: com.google.android.gms.internal.ads.zzceg
                @Override // com.google.android.gms.internal.ads.zzgd
                public final zzge zza() {
                    return this.zza.zzZ(zzgdVar2);
                }
            } : zzgdVar2;
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzi.limit()];
                this.zzi.get(bArr);
                zzgdVar = new zzgd() { // from class: com.google.android.gms.internal.ads.zzceh
                    @Override // com.google.android.gms.internal.ads.zzgd
                    public final zzge zza() {
                        zzgd zzgdVar3 = zzgdVar;
                        byte[] bArr2 = bArr;
                        int i10 = zzcem.zza;
                        return new zzcea(new zzfz(bArr2), bArr2.length, zzgdVar3.zza());
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.zzi.limit()];
            this.zzi.get(bArr2);
            zzgdVar = new zzgd() { // from class: com.google.android.gms.internal.ads.zzceb
                @Override // com.google.android.gms.internal.ads.zzgd
                public final zzge zza() {
                    return new zzfz(bArr2);
                }
            };
        }
        this.zzg = new zzuu(zzgdVar, new zzut(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzo)).booleanValue() ? new zzabd() { // from class: com.google.android.gms.internal.ads.zzcek
            @Override // com.google.android.gms.internal.ads.zzabd
            public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
                int i10 = zzabc.zza;
                int i11 = zzcem.zza;
                return new zzaaw[]{new zzagy(0), new zzafp(0), new zzagt(0, null)};
            }
        } : new zzabd() { // from class: com.google.android.gms.internal.ads.zzcel
            @Override // com.google.android.gms.internal.ads.zzabd
            public final /* synthetic */ zzaaw[] zza(Uri uri, Map map) {
                int i10 = zzabc.zza;
                int i11 = zzcem.zza;
                return new zzaaw[]{new zzagy(0), new zzafp(0)};
            }
        }));
    }

    private final boolean zzad() {
        return this.zzt != null && this.zzt.zzq();
    }

    public final void finalize() {
        zzcbr.zzD().decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final long zzA() {
        if (zzad()) {
            return 0L;
        }
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final long zzB() {
        if (zzad()) {
            return this.zzt.zzl();
        }
        synchronized (this.zzq) {
            while (!this.zzs.isEmpty()) {
                long j10 = this.zzn;
                Map mapZze = ((zzhb) this.zzs.remove(0)).zze();
                long j11 = 0;
                if (mapZze != null) {
                    for (Map.Entry entry : mapZze.entrySet()) {
                        if (entry != null) {
                            try {
                                if (entry.getKey() != null && zzfon.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                    j11 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.zzn = j10 + j11;
            }
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final Integer zzC() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzF(Uri[] uriArr, String str) {
        zzG(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10) {
        zztq zzugVar;
        if (this.zzh != null) {
            this.zzi = byteBuffer;
            this.zzj = z10;
            int length = uriArr.length;
            if (length == 1) {
                zzugVar = zzaa(uriArr[0]);
            } else {
                zztq[] zztqVarArr = new zztq[length];
                for (int i10 = 0; i10 < uriArr.length; i10++) {
                    zztqVarArr[i10] = zzaa(uriArr[i10]);
                }
                zzugVar = new zzug(false, false, zztqVarArr);
            }
            this.zzh.zzB(zzugVar);
            this.zzh.zzp();
            zzcbr.zzE().incrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzH() {
        zzis zzisVar = this.zzh;
        if (zzisVar != null) {
            zzisVar.zzA(this);
            this.zzh.zzq();
            this.zzh = null;
            zzcbr.zzE().decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzI(long j10) {
        zzm zzmVar = (zzm) this.zzh;
        zzmVar.zza(zzmVar.zzd(), j10, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzJ(int i10) {
        this.zzc.zzk(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzK(int i10) {
        this.zzc.zzl(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzL(zzcbq zzcbqVar) {
        this.zzk = zzcbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzM(int i10) {
        this.zzc.zzm(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzN(int i10) {
        this.zzc.zzn(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzO(boolean z10) {
        this.zzh.zzr(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzP(Integer num) {
        this.zzr = num;
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzQ(boolean z10) {
        if (this.zzh == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            this.zzh.zzy();
            if (i10 >= 2) {
                return;
            }
            zzwy zzwyVar = this.zzd;
            zzwk zzwkVarZzc = zzwyVar.zzd().zzc();
            zzwkVarZzc.zzo(i10, !z10);
            zzwyVar.zzk(zzwkVarZzc);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzR(int i10) {
        Iterator it = this.zzu.iterator();
        while (it.hasNext()) {
            zzcdw zzcdwVar = (zzcdw) ((WeakReference) it.next()).get();
            if (zzcdwVar != null) {
                zzcdwVar.zzm(i10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzS(Surface surface, boolean z10) {
        zzis zzisVar = this.zzh;
        if (zzisVar != null) {
            zzisVar.zzs(surface);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzT(float f10, boolean z10) {
        zzis zzisVar = this.zzh;
        if (zzisVar != null) {
            zzisVar.zzt(f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final void zzU() {
        this.zzh.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final boolean zzV() {
        return this.zzh != null;
    }

    public final /* synthetic */ zzge zzW(String str, boolean z10) {
        zzcbz zzcbzVar = this.zze;
        return new zzcep(str, true != z10 ? null : this, zzcbzVar.zzd, zzcbzVar.zzf, zzcbzVar.zzn, zzcbzVar.zzo);
    }

    public final /* synthetic */ zzge zzX(String str, boolean z10) {
        zzcbz zzcbzVar = this.zze;
        zzcdw zzcdwVar = new zzcdw(str, true != z10 ? null : this, zzcbzVar.zzd, zzcbzVar.zzf, zzcbzVar.zzi);
        this.zzu.add(new WeakReference(zzcdwVar));
        return zzcdwVar;
    }

    public final /* synthetic */ zzge zzY(String str, boolean z10) {
        zzgm zzgmVar = new zzgm();
        zzgmVar.zzf(str);
        zzgmVar.zze(true != z10 ? null : this);
        zzgmVar.zzc(this.zze.zzd);
        zzgmVar.zzd(this.zze.zzf);
        zzgmVar.zzb(true);
        return zzgmVar.zza();
    }

    public final /* synthetic */ zzge zzZ(zzgd zzgdVar) {
        return new zzcdz(this.zzb, zzgdVar.zza(), this.zzo, this.zzp, this, new zzcec(this));
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zza(zzge zzgeVar, zzgj zzgjVar, boolean z10, int i10) {
        this.zzl += i10;
    }

    public final zztq zzaa(Uri uri) {
        zzar zzarVar = new zzar();
        zzarVar.zzb(uri);
        zzbp zzbpVarZzc = zzarVar.zzc();
        zzuu zzuuVar = this.zzg;
        zzuuVar.zza(this.zze.zzg);
        return zzuuVar.zzb(zzbpVarZzc);
    }

    public final /* synthetic */ void zzab(boolean z10, long j10) {
        zzcbq zzcbqVar = this.zzk;
        if (zzcbqVar != null) {
            zzcbqVar.zzi(z10, j10);
        }
    }

    public final /* synthetic */ zzli[] zzac(Handler handler, zzzr zzzrVar, zzot zzotVar, zzvq zzvqVar, zzso zzsoVar) {
        Context context = this.zzb;
        zzry zzryVar = zzry.zzb;
        zzoe zzoeVar = zzoe.zza;
        zzdr[] zzdrVarArr = new zzdr[0];
        zzpn zzpnVar = new zzpn();
        if (zzoeVar == null) {
            Objects.requireNonNull(zzoeVar, "Both parameters are null");
        }
        zzpnVar.zzc(zzoeVar);
        zzpnVar.zzd(zzdrVarArr);
        zzpz zzpzVarZze = zzpnVar.zze();
        zzro zzroVar = zzro.zza;
        return new zzli[]{new zzqf(context, zzroVar, zzryVar, false, handler, zzotVar, zzpzVarZze), new zzyu(this.zzb, zzroVar, zzryVar, 0L, false, handler, zzzrVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zzb(zzge zzgeVar, zzgj zzgjVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zzc(zzge zzgeVar, zzgj zzgjVar, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzhg
    public final void zzd(zzge zzgeVar, zzgj zzgjVar, boolean z10) {
        if (zzgeVar instanceof zzhb) {
            synchronized (this.zzq) {
                this.zzs.add((zzhb) zzgeVar);
            }
        } else if (zzgeVar instanceof zzcdz) {
            this.zzt = (zzcdz) zzgeVar;
            final zzcca zzccaVar = (zzcca) this.zzf.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue() && zzccaVar != null && this.zzt.zzn()) {
                final HashMap map = new HashMap();
                map.put("gcacheHit", String.valueOf(this.zzt.zzp()));
                map.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcej
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcca zzccaVar2 = zzccaVar;
                        Map map2 = map;
                        int i10 = zzcem.zza;
                        zzccaVar2.zzd("onGcacheInfoEvent", map2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zze(zzlt zzltVar, zzam zzamVar, zzia zziaVar) {
        zzcca zzccaVar = (zzcca) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue() || zzccaVar == null || zzamVar == null) {
            return;
        }
        HashMap map = new HashMap();
        String str = zzamVar.zzl;
        if (str != null) {
            map.put("audioMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            map.put("audioSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            map.put("audioCodec", str3);
        }
        zzccaVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzf(zzlt zzltVar, int i10, long j10, long j11) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzg(zzlt zzltVar, zztk zztkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzh(zzlt zzltVar, int i10, long j10) {
        this.zzm += i10;
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzi(zzcp zzcpVar, zzlu zzluVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzj(zzlt zzltVar, zztf zztfVar, zztk zztkVar, IOException iOException, boolean z10) {
        zzcbq zzcbqVar = this.zzk;
        if (zzcbqVar != null) {
            if (this.zze.zzk) {
                zzcbqVar.zzl("onLoadException", iOException);
            } else {
                zzcbqVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzk(zzlt zzltVar, int i10) {
        zzcbq zzcbqVar = this.zzk;
        if (zzcbqVar != null) {
            zzcbqVar.zzm(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzl(zzlt zzltVar, zzcf zzcfVar) {
        zzcbq zzcbqVar = this.zzk;
        if (zzcbqVar != null) {
            zzcbqVar.zzk("onPlayerError", zzcfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzm(zzlt zzltVar, zzco zzcoVar, zzco zzcoVar2, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzn(zzlt zzltVar, Object obj, long j10) {
        zzcbq zzcbqVar = this.zzk;
        if (zzcbqVar != null) {
            zzcbqVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final /* synthetic */ void zzo(zzlt zzltVar, zzhz zzhzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzp(zzlt zzltVar, zzam zzamVar, zzia zziaVar) {
        zzcca zzccaVar = (zzcca) this.zzf.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue() || zzccaVar == null || zzamVar == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(zzamVar.zzt));
        map.put("bitRate", String.valueOf(zzamVar.zzi));
        map.put("resolution", zzamVar.zzr + "x" + zzamVar.zzs);
        String str = zzamVar.zzl;
        if (str != null) {
            map.put("videoMime", str);
        }
        String str2 = zzamVar.zzm;
        if (str2 != null) {
            map.put("videoSampleMime", str2);
        }
        String str3 = zzamVar.zzj;
        if (str3 != null) {
            map.put("videoCodec", str3);
        }
        zzccaVar.zzd("onMetadataEvent", map);
    }

    @Override // com.google.android.gms.internal.ads.zzlv
    public final void zzq(zzlt zzltVar, zzdn zzdnVar) {
        zzcbq zzcbqVar = this.zzk;
        if (zzcbqVar != null) {
            zzcbqVar.zzD(zzdnVar.zzc, zzdnVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final int zzr() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final int zzt() {
        return this.zzh.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final long zzv() {
        return this.zzh.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final long zzw() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final long zzx() {
        if (zzad() && this.zzt.zzp()) {
            return Math.min(this.zzl, this.zzt.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final long zzy() {
        return this.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcbr
    public final long zzz() {
        return this.zzh.zzl();
    }
}
