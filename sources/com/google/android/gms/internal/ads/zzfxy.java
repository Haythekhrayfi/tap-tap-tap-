package com.google.android.gms.internal.ads;

import android.support.v4.media.j;
import com.applovin.exoplayer2.common.base.Ascii;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfxy {
    private final List zza = new ArrayList();
    private final zzghn zzb = zzghn.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzfxw) it.next()).zza = false;
        }
    }

    public final zzfxy zza(zzfxw zzfxwVar) {
        if (zzfxwVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzfxwVar.zza) {
            zzd();
        }
        zzfxwVar.zzf = this;
        this.zza.add(zzfxwVar);
        return this;
    }

    public final zzfyb zzb() throws GeneralSecurityException {
        int i10;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        zzgku zzgkuVarZzd = zzgkx.zzd();
        List list = this.zza;
        for (int i11 = 0; i11 < list.size() - 1; i11++) {
            if (((zzfxw) list.get(i11)).zze == zzfxx.zza && ((zzfxw) list.get(i11 + 1)).zze != zzfxx.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzfxw zzfxwVar : this.zza) {
            zzfxs unused = zzfxwVar.zzb;
            if (zzfxwVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i12 = 3;
            if (zzfxwVar.zze == zzfxx.zza) {
                i10 = 0;
                while (true) {
                    if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i13 = 0;
                    while (i13 == 0) {
                        secureRandom.nextBytes(bArr);
                        i13 = ((bArr[0] & Ascii.DEL) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    }
                    i10 = i13;
                }
            } else {
                zzfxx unused2 = zzfxwVar.zze;
                i10 = 0;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(j.a("Id ", i10, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzfxw.zza(zzfxwVar);
            zzfyf zzfyfVar = zzfxwVar.zzd;
            zzfxs zzfxsVarZzc = zzfxwVar.zzc();
            if (!zzfxs.zza.equals(zzfxsVarZzc)) {
                if (zzfxs.zzb.equals(zzfxsVarZzc)) {
                    i12 = 4;
                } else {
                    if (!zzfxs.zzc.equals(zzfxsVarZzc)) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    i12 = 5;
                }
            }
            zzgfb zzgfbVar = (zzgfb) (zzfyfVar instanceof zzgdx ? ((zzgdx) zzfyfVar).zza() : zzgeg.zzc().zzd(zzfyfVar, zzgfb.class));
            zzgkk zzgkkVarZza = zzfyp.zza(zzgfbVar.zzb());
            zzgkv zzgkvVarZzd = zzgkw.zzd();
            zzgkvVarZzd.zzb(i10);
            zzgkvVarZzd.zzd(i12);
            zzgkvVarZzd.zza(zzgkkVarZza);
            zzgkvVarZzd.zzc(zzgfbVar.zzb().zzf());
            zzgkuVarZzd.zza((zzgkw) zzgkvVarZzd.zzal());
            if (zzfxwVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                num = numValueOf;
            }
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzgkuVarZzd.zzb(num.intValue());
        return zzfyb.zzb((zzgkx) zzgkuVarZzd.zzal(), this.zzb);
    }
}
