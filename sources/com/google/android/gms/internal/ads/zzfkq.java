package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkq {
    public final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfkq(Context context, int i10) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfkr.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfkr.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i10;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        return android.support.v4.media.a.a("FBAMTD", this.zzd - 1);
    }

    private final String zzf() {
        return android.support.v4.media.a.a("LATMTD", this.zzd - 1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    public final boolean zza(zzatm zzatmVar, zzfkw zzfkwVar) {
        boolean z10;
        String strZzk = zzatmVar.zzd().zzk();
        byte[] bArrZzA = zzatmVar.zzf().zzA();
        byte[] bArrZzA2 = zzatmVar.zze().zzA();
        if (!TextUtils.isEmpty(strZzk) && bArrZzA2 != null && bArrZzA2.length != 0) {
            zzfkr.zzd(this.zza);
            this.zza.mkdirs();
            zzfkr.zzc(strZzk, this.zza).mkdirs();
            File fileZzb = zzfkr.zzb(strZzk, "pcam.jar", this.zza);
            if ((bArrZzA == null || bArrZzA.length <= 0 || zzfkr.zze(fileZzb, bArrZzA)) && zzfkr.zze(zzfkr.zzb(strZzk, "pcbc", this.zza), bArrZzA2)) {
                File fileZzb2 = zzfkr.zzb(zzatmVar.zzd().zzk(), "pcam.jar", this.zza);
                if (fileZzb2.exists() && zzfkwVar != null && !zzfkwVar.zza(fileZzb2)) {
                    return false;
                }
                String strZzk2 = zzatmVar.zzd().zzk();
                if (TextUtils.isEmpty(strZzk2)) {
                    z10 = false;
                } else {
                    File fileZzb3 = zzfkr.zzb(strZzk2, "pcam.jar", this.zza);
                    File fileZzb4 = zzfkr.zzb(strZzk2, "pcbc", this.zza);
                    File fileZzb5 = zzfkr.zzb(strZzk2, "pcam.jar", zzd());
                    File fileZzb6 = zzfkr.zzb(strZzk2, "pcbc", zzd());
                    if ((!fileZzb3.exists() || fileZzb3.renameTo(fileZzb5)) && fileZzb4.exists() && fileZzb4.renameTo(fileZzb6)) {
                        zzato zzatoVarZze = zzatp.zze();
                        zzatoVarZze.zze(zzatmVar.zzd().zzk());
                        zzatoVarZze.zza(zzatmVar.zzd().zzj());
                        zzatoVarZze.zzb(zzatmVar.zzd().zza());
                        zzatoVarZze.zzd(zzatmVar.zzd().zzd());
                        zzatoVarZze.zzc(zzatmVar.zzd().zzc());
                        zzatp zzatpVar = (zzatp) zzatoVarZze.zzal();
                        zzatp zzatpVarZzb = zzb(1);
                        SharedPreferences.Editor editorEdit = this.zzc.edit();
                        if (zzatpVarZzb != null && !zzatpVar.zzk().equals(zzatpVarZzb.zzk())) {
                            editorEdit.putString(zze(), Hex.bytesToStringLowercase(zzatpVarZzb.zzax()));
                        }
                        editorEdit.putString(zzf(), Hex.bytesToStringLowercase(zzatpVar.zzax()));
                        if (editorEdit.commit()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                }
                HashSet hashSet = new HashSet();
                zzatp zzatpVarZzb2 = zzb(1);
                if (zzatpVarZzb2 != null) {
                    hashSet.add(zzatpVarZzb2.zzk());
                }
                zzatp zzatpVarZzb3 = zzb(2);
                if (zzatpVarZzb3 != null) {
                    hashSet.add(zzatpVarZzb3.zzk());
                }
                for (File file : zzd().listFiles()) {
                    String name = file.getName();
                    if (!hashSet.contains(name)) {
                        zzfkr.zzd(zzfkr.zzc(name, zzd()));
                    }
                }
                return z10;
            }
        }
        return false;
    }

    public final zzatp zzb(int i10) {
        SharedPreferences sharedPreferences;
        String strZze;
        if (i10 == 1) {
            sharedPreferences = this.zzc;
            strZze = zzf();
        } else {
            sharedPreferences = this.zzc;
            strZze = zze();
        }
        String string = sharedPreferences.getString(strZze, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgoe zzgoeVar = zzgoe.zzb;
            zzatp zzatpVarZzh = zzatp.zzh(zzgoe.zzv(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZzk = zzatpVarZzh.zzk();
            File fileZzb = zzfkr.zzb(strZzk, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = zzfkr.zzb(strZzk, "pcam", zzd());
            }
            File fileZzb2 = zzfkr.zzb(strZzk, "pcbc", zzd());
            if (fileZzb.exists() && fileZzb2.exists()) {
                return zzatpVarZzh;
            }
            return null;
        } catch (zzgpy unused) {
        }
    }

    public final zzfkp zzc(int i10) {
        zzatp zzatpVarZzb = zzb(1);
        if (zzatpVarZzb == null) {
            return null;
        }
        String strZzk = zzatpVarZzb.zzk();
        File fileZzb = zzfkr.zzb(strZzk, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = zzfkr.zzb(strZzk, "pcam", zzd());
        }
        return new zzfkp(zzatpVarZzb, fileZzb, zzfkr.zzb(strZzk, "pcbc", zzd()), zzfkr.zzb(strZzk, "pcopt", zzd()));
    }
}
