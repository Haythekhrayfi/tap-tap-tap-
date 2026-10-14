package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzue implements zztm, zztl {
    private final zztm[] zza;
    private zztl zze;
    private zzvn zzf;
    private final zzsz zzi;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzvh zzh = new zzsy(new zzvh[0]);
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zztm[] zzg = new zztm[0];

    public zzue(zzsz zzszVar, long[] jArr, zztm... zztmVarArr) {
        this.zzi = zzszVar;
        this.zza = zztmVarArr;
        for (int i10 = 0; i10 < zztmVarArr.length; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                this.zza[i10] = new zzuc(zztmVarArr[i10], j10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zza(long j10, zzlm zzlmVar) {
        zztm[] zztmVarArr = this.zzg;
        return (zztmVarArr.length > 0 ? zztmVarArr[0] : this.zza[0]).zza(j10, zzlmVar);
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zzd() {
        long j10 = -9223372036854775807L;
        for (zztm zztmVar : this.zzg) {
            long jZzd = zztmVar.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j10 != -9223372036854775807L && zztmVar.zze(j10) != j10) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j10 == -9223372036854775807L) {
                for (zztm zztmVar2 : this.zzg) {
                    if (zztmVar2 == zztmVar) {
                        break;
                    }
                    if (zztmVar2.zze(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j10 = jZzd;
            } else if (jZzd != j10) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final long zze(long j10) {
        long jZze = this.zzg[0].zze(j10);
        int i10 = 1;
        while (true) {
            zztm[] zztmVarArr = this.zzg;
            if (i10 >= zztmVarArr.length) {
                return jZze;
            }
            if (zztmVarArr[i10].zze(jZze) != jZze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zztm
    public final long zzf(zzxa[] zzxaVarArr, boolean[] zArr, zzvf[] zzvfVarArr, boolean[] zArr2, long j10) {
        int length;
        Integer num;
        int length2 = zzxaVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzxaVarArr.length;
            num = null;
            if (i11 >= length) {
                break;
            }
            zzvf zzvfVar = zzvfVarArr[i11];
            num = zzvfVar != null ? (Integer) this.zzb.get(zzvfVar) : null;
            iArr[i11] = num == null ? -1 : num.intValue();
            zzxa zzxaVar = zzxaVarArr[i11];
            if (zzxaVar != null) {
                String str = zzxaVar.zze().zzc;
                iArr2[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i11] = -1;
            }
            i11++;
        }
        this.zzb.clear();
        zzvf[] zzvfVarArr2 = new zzvf[length];
        Object[] objArr = new zzxa[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j11 = j10;
        int i12 = 0;
        Object[] objArr2 = new zzvf[length];
        while (i12 < this.zza.length) {
            for (int i13 = i10; i13 < zzxaVarArr.length; i13++) {
                objArr2[i13] = iArr[i13] == i12 ? zzvfVarArr[i13] : num;
                if (iArr2[i13] == i12) {
                    zzxa zzxaVar2 = zzxaVarArr[i13];
                    Objects.requireNonNull(zzxaVar2);
                    zzcy zzcyVar = (zzcy) this.zzd.get(zzxaVar2.zze());
                    Objects.requireNonNull(zzcyVar);
                    objArr[i13] = new zzub(zzxaVar2, zzcyVar);
                } else {
                    objArr[i13] = num;
                }
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            Object[] objArr3 = objArr2;
            Object[] objArr4 = objArr;
            long jZzf = this.zza[i12].zzf(objArr, zArr, objArr2, zArr2, j11);
            if (i14 == 0) {
                j11 = jZzf;
            } else if (jZzf != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < zzxaVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    Object obj = objArr3[i15];
                    Objects.requireNonNull(obj);
                    zzvfVarArr2[i15] = obj;
                    this.zzb.put(obj, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    zzdy.zzf(objArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.zza[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            objArr2 = objArr3;
            objArr = objArr4;
            i10 = 0;
            num = null;
        }
        int i16 = i10;
        System.arraycopy(zzvfVarArr2, i16, zzvfVarArr, i16, length);
        zztm[] zztmVarArr = (zztm[]) arrayList.toArray(new zztm[i16]);
        this.zzg = zztmVarArr;
        this.zzh = new zzsy(zztmVarArr);
        return j11;
    }

    @Override // com.google.android.gms.internal.ads.zzvg
    public final /* bridge */ /* synthetic */ void zzg(zzvh zzvhVar) {
        zztl zztlVar = this.zze;
        Objects.requireNonNull(zztlVar);
        zztlVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final zzvn zzh() {
        zzvn zzvnVar = this.zzf;
        Objects.requireNonNull(zzvnVar);
        return zzvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final void zzi(zztm zztmVar) {
        this.zzc.remove(zztmVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i10 = 0;
        for (zztm zztmVar2 : this.zza) {
            i10 += zztmVar2.zzh().zzc;
        }
        zzcy[] zzcyVarArr = new zzcy[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            zztm[] zztmVarArr = this.zza;
            if (i11 >= zztmVarArr.length) {
                this.zzf = new zzvn(zzcyVarArr);
                zztl zztlVar = this.zze;
                Objects.requireNonNull(zztlVar);
                zztlVar.zzi(this);
                return;
            }
            zzvn zzvnVarZzh = zztmVarArr[i11].zzh();
            int i13 = zzvnVarZzh.zzc;
            int i14 = 0;
            while (i14 < i13) {
                zzcy zzcyVarZzb = zzvnVarZzh.zzb(i14);
                zzcy zzcyVarZzc = zzcyVarZzb.zzc(i11 + ":" + zzcyVarZzb.zzc);
                this.zzd.put(zzcyVarZzc, zzcyVarZzb);
                zzcyVarArr[i12] = zzcyVarZzc;
                i14++;
                i12++;
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzj(long j10, boolean z10) {
        for (zztm zztmVar : this.zzg) {
            zztmVar.zzj(j10, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzk() throws IOException {
        for (zztm zztmVar : this.zza) {
            zztmVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zztm
    public final void zzl(zztl zztlVar, long j10) {
        this.zze = zztlVar;
        Collections.addAll(this.zzc, this.zza);
        for (zztm zztmVar : this.zza) {
            zztmVar.zzl(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final void zzm(long j10) {
        this.zzh.zzm(j10);
    }

    public final zztm zzn(int i10) {
        zztm zztmVar = this.zza[i10];
        return zztmVar instanceof zzuc ? ((zzuc) zztmVar).zza : zztmVar;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final boolean zzo(long j10) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(j10);
        }
        int size = this.zzc.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zztm) this.zzc.get(i10)).zzo(j10);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zztm, com.google.android.gms.internal.ads.zzvh
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
