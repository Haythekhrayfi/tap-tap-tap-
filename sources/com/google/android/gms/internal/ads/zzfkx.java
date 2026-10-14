package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkx {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfke zze;
    private boolean zzf;

    public zzfkx(Context context, int i10, zzfke zzfkeVar, boolean z10) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i10 - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfkeVar;
        this.zzf = z10;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzatm zzatmVar) {
        zzato zzatoVarZze = zzatp.zze();
        zzatoVarZze.zze(zzatmVar.zzd().zzk());
        zzatoVarZze.zza(zzatmVar.zzd().zzj());
        zzatoVarZze.zzb(zzatmVar.zzd().zza());
        zzatoVarZze.zzd(zzatmVar.zzd().zzd());
        zzatoVarZze.zzc(zzatmVar.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzatp) zzatoVarZze.zzal()).zzax());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i10, long j10) {
        this.zze.zza(i10, j10);
    }

    private final void zzj(int i10, long j10, String str) {
        this.zze.zzb(i10, j10, str);
    }

    private final zzatp zzk(int i10) {
        SharedPreferences sharedPreferences;
        String strZzg;
        int i11;
        if (i10 == 1) {
            sharedPreferences = this.zzc;
            strZzg = zzh();
        } else {
            sharedPreferences = this.zzc;
            strZzg = zzg();
        }
        String string = sharedPreferences.getString(strZzg, null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgoe zzgoeVar = zzgoe.zzb;
            return zzatp.zzi(zzgoe.zzv(bArrStringToBytes, 0, bArrStringToBytes.length), this.zzf ? zzgoy.zza() : zzgoy.zzb());
        } catch (zzgpy unused) {
            return null;
        } catch (NullPointerException unused2) {
            i11 = 2029;
            zzi(i11, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i11 = 2032;
            zzi(i11, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzatm zzatmVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfkr.zze(new File(zze(zzatmVar.zzd().zzk()), "pcbc"), zzatmVar.zze().zzA())) {
                zzi(4020, jCurrentTimeMillis);
                return false;
            }
            String strZzf = zzf(zzatmVar);
            SharedPreferences.Editor editorEdit = this.zzc.edit();
            editorEdit.putString(zzh(), strZzf);
            boolean zCommit = editorEdit.commit();
            if (zCommit) {
                zzi(5015, jCurrentTimeMillis);
            } else {
                zzi(4021, jCurrentTimeMillis);
            }
            return zCommit;
        }
    }

    public final boolean zzb(zzatm zzatmVar, zzfkw zzfkwVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzatp zzatpVarZzk = zzk(1);
            String strZzk = zzatmVar.zzd().zzk();
            if (zzatpVarZzk != null && zzatpVarZzk.zzk().equals(strZzk)) {
                zzi(4014, jCurrentTimeMillis);
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            File fileZze = zze(strZzk);
            if (fileZze.exists()) {
                zzj(4023, jCurrentTimeMillis2, "d:" + (true != fileZze.isDirectory() ? "0" : "1") + ",f:" + (true != fileZze.isFile() ? "0" : "1"));
                zzi(4015, jCurrentTimeMillis2);
            } else if (!fileZze.mkdirs()) {
                zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? "0" : "1"));
                zzi(4015, jCurrentTimeMillis2);
                return false;
            }
            File fileZze2 = zze(strZzk);
            File file = new File(fileZze2, "pcam.jar");
            File file2 = new File(fileZze2, "pcbc");
            if (!zzfkr.zze(file, zzatmVar.zzf().zzA())) {
                zzi(4016, jCurrentTimeMillis);
                return false;
            }
            if (!zzfkr.zze(file2, zzatmVar.zze().zzA())) {
                zzi(4017, jCurrentTimeMillis);
                return false;
            }
            if (zzfkwVar != null && !zzfkwVar.zza(file)) {
                zzi(4018, jCurrentTimeMillis);
                zzfkr.zzd(fileZze2);
                return false;
            }
            String strZzf = zzf(zzatmVar);
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            String string = this.zzc.getString(zzh(), null);
            SharedPreferences.Editor editorEdit = this.zzc.edit();
            editorEdit.putString(zzh(), strZzf);
            if (string != null) {
                editorEdit.putString(zzg(), string);
            }
            if (!editorEdit.commit()) {
                zzi(4019, jCurrentTimeMillis3);
                return false;
            }
            HashSet hashSet = new HashSet();
            zzatp zzatpVarZzk2 = zzk(1);
            if (zzatpVarZzk2 != null) {
                hashSet.add(zzatpVarZzk2.zzk());
            }
            zzatp zzatpVarZzk3 = zzk(2);
            if (zzatpVarZzk3 != null) {
                hashSet.add(zzatpVarZzk3.zzk());
            }
            for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                if (!hashSet.contains(file3.getName())) {
                    zzfkr.zzd(file3);
                }
            }
            zzi(5014, jCurrentTimeMillis);
            return true;
        }
    }

    public final zzfkp zzc(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzatp zzatpVarZzk = zzk(1);
            if (zzatpVarZzk == null) {
                zzi(4022, jCurrentTimeMillis);
                return null;
            }
            File fileZze = zze(zzatpVarZzk.zzk());
            File file = new File(fileZze, "pcam.jar");
            if (!file.exists()) {
                file = new File(fileZze, "pcam");
            }
            File file2 = new File(fileZze, "pcbc");
            File file3 = new File(fileZze, "pcopt");
            zzi(5016, jCurrentTimeMillis);
            return new zzfkp(zzatpVarZzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzatp zzatpVarZzk = zzk(1);
            if (zzatpVarZzk == null) {
                zzi(4025, jCurrentTimeMillis);
                return false;
            }
            File fileZze = zze(zzatpVarZzk.zzk());
            if (!new File(fileZze, "pcam.jar").exists()) {
                zzi(4026, jCurrentTimeMillis);
                return false;
            }
            if (new File(fileZze, "pcbc").exists()) {
                zzi(5019, jCurrentTimeMillis);
                return true;
            }
            zzi(4027, jCurrentTimeMillis);
            return false;
        }
    }
}
