package com.google.android.gms.internal.ads;

import androidx.fragment.app.w;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfyb {
    private final zzgkx zza;
    private final List zzb;
    private final zzghn zzc;

    private zzfyb(zzgkx zzgkxVar, List list) {
        this.zza = zzgkxVar;
        this.zzb = list;
        this.zzc = zzghn.zza;
    }

    private zzfyb(zzgkx zzgkxVar, List list, zzghn zzghnVar) {
        this.zza = zzgkxVar;
        this.zzb = list;
        this.zzc = zzghnVar;
    }

    public static final zzfyb zza(zzgkx zzgkxVar) throws GeneralSecurityException {
        zzi(zzgkxVar);
        return new zzfyb(zzgkxVar, zzh(zzgkxVar));
    }

    public static final zzfyb zzb(zzgkx zzgkxVar, zzghn zzghnVar) throws GeneralSecurityException {
        zzi(zzgkxVar);
        return new zzfyb(zzgkxVar, zzh(zzgkxVar), zzghnVar);
    }

    public static final zzfyb zzc(zzfyf zzfyfVar) throws GeneralSecurityException {
        zzfxy zzfxyVar = new zzfxy();
        zzfxw zzfxwVar = new zzfxw(zzfyfVar, null);
        zzfxwVar.zze();
        zzfxwVar.zzd();
        zzfxyVar.zza(zzfxwVar);
        return zzfxyVar.zzb();
    }

    private static zzgfa zzf(zzgkw zzgkwVar) {
        try {
            return zzgfa.zza(zzgkwVar.zzc().zzg(), zzgkwVar.zzc().zzf(), zzgkwVar.zzc().zzc(), zzgkwVar.zzf(), zzgkwVar.zzf() == zzglq.RAW ? null : Integer.valueOf(zzgkwVar.zza()));
        } catch (GeneralSecurityException e10) {
            throw new zzgfl("Creating a protokey serialization failed", e10);
        }
    }

    @Nullable
    private static Object zzg(zzgdj zzgdjVar, zzgkw zzgkwVar, Class cls) throws GeneralSecurityException {
        try {
            zzgkk zzgkkVarZzc = zzgkwVar.zzc();
            int i10 = zzfyp.zza;
            return zzfyp.zzc(zzgkkVarZzc.zzg(), zzgkkVarZzc.zzf(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e10) {
            if (e10.getMessage().contains("No key manager found for key type ") || e10.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e10;
        }
    }

    private static List zzh(zzgkx zzgkxVar) {
        zzfxs zzfxsVar;
        ArrayList arrayList = new ArrayList(zzgkxVar.zza());
        for (zzgkw zzgkwVar : zzgkxVar.zzh()) {
            int iZza = zzgkwVar.zza();
            try {
                zzfxn zzfxnVarZza = zzgeg.zzc().zza(zzf(zzgkwVar), zzfyq.zza());
                int iZzk = zzgkwVar.zzk() - 2;
                if (iZzk == 1) {
                    zzfxsVar = zzfxs.zza;
                } else if (iZzk == 2) {
                    zzfxsVar = zzfxs.zzb;
                } else {
                    if (iZzk != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zzfxsVar = zzfxs.zzc;
                }
                arrayList.add(new zzfya(zzfxnVarZza, zzfxsVar, iZza, iZza == zzgkxVar.zzc(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzi(zzgkx zzgkxVar) throws GeneralSecurityException {
        if (zzgkxVar == null || zzgkxVar.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    @Nullable
    private static final Object zzj(zzgdj zzgdjVar, zzfxn zzfxnVar, Class cls) throws GeneralSecurityException {
        try {
            return zzgee.zza().zzc(zzfxnVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        zzgkx zzgkxVar = this.zza;
        Charset charset = zzfyr.zza;
        zzgkz zzgkzVarZza = zzglc.zza();
        zzgkzVarZza.zzb(zzgkxVar.zzc());
        for (zzgkw zzgkwVar : zzgkxVar.zzh()) {
            zzgla zzglaVarZza = zzglb.zza();
            zzglaVarZza.zzc(zzgkwVar.zzc().zzg());
            zzglaVarZza.zzd(zzgkwVar.zzk());
            zzglaVarZza.zzb(zzgkwVar.zzf());
            zzglaVarZza.zza(zzgkwVar.zza());
            zzgkzVarZza.zza((zzglb) zzglaVarZza.zzal());
        }
        return ((zzglc) zzgkzVarZza.zzal()).toString();
    }

    public final zzgkx zzd() {
        return this.zza;
    }

    public final Object zze(zzfxl zzfxlVar, Class cls) throws GeneralSecurityException {
        Class clsZzb = zzfyp.zzb(cls);
        if (clsZzb == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        zzgkx zzgkxVar = this.zza;
        Charset charset = zzfyr.zza;
        int iZzc = zzgkxVar.zzc();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzgkw zzgkwVar : zzgkxVar.zzh()) {
            if (zzgkwVar.zzk() == 3) {
                if (!zzgkwVar.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgkwVar.zza())));
                }
                if (zzgkwVar.zzf() == zzglq.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgkwVar.zza())));
                }
                if (zzgkwVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgkwVar.zza())));
                }
                if (zzgkwVar.zza() == iZzc) {
                    if (z10) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z10 = true;
                }
                z11 &= zzgkwVar.zzc().zzc() == zzgkj.ASYMMETRIC_PUBLIC;
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        zzfyh zzfyhVar = new zzfyh(clsZzb, null);
        zzfyhVar.zzc(this.zzc);
        for (int i11 = 0; i11 < this.zza.zza(); i11++) {
            zzgkw zzgkwVarZze = this.zza.zze(i11);
            if (zzgkwVarZze.zzk() == 3) {
                zzgdj zzgdjVar = (zzgdj) zzfxlVar;
                Object objZzg = zzg(zzgdjVar, zzgkwVarZze, clsZzb);
                Object objZzj = this.zzb.get(i11) != null ? zzj(zzgdjVar, ((zzfya) this.zzb.get(i11)).zza(), clsZzb) : null;
                if (objZzj == null && objZzg == null) {
                    throw new GeneralSecurityException(w.a("Unable to get primitive ", clsZzb.toString(), " for key of type ", zzgkwVarZze.zzc().zzg()));
                }
                if (zzgkwVarZze.zza() == this.zza.zzc()) {
                    zzfyhVar.zzb(objZzj, objZzg, zzgkwVarZze);
                } else {
                    zzfyhVar.zza(objZzj, objZzg, zzgkwVarZze);
                }
            }
        }
        return zzgee.zza().zzd(zzfyhVar.zzd(), cls);
    }
}
