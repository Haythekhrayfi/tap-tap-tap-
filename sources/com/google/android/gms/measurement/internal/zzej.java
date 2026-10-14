package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.activity.j;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
public final class zzej {
    public static final AtomicReference zza = new AtomicReference();
    public static final AtomicReference zzb = new AtomicReference();
    public static final AtomicReference zzc = new AtomicReference();
    private final zzei zzd;

    public zzej(zzei zzeiVar) {
        this.zzd = zzeiVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Object obj = strArr[i10];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sbA = defpackage.a.a("[");
        for (Object obj : objArr) {
            String strZzb = obj instanceof Bundle ? zzb((Bundle) obj) : String.valueOf(obj);
            if (strZzb != null) {
                if (sbA.length() != 1) {
                    sbA.append(", ");
                }
                sbA.append(strZzb);
            }
        }
        sbA.append("]");
        return sbA.toString();
    }

    public final String zzb(Bundle bundle) {
        String strZza;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sbA = defpackage.a.a("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbA.length() != 8) {
                sbA.append(", ");
            }
            sbA.append(zze(str));
            sbA.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strZza = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strZza = zza((Object[]) obj);
            } else {
                strZza = obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbA.append(strZza);
        }
        sbA.append("}]");
        return sbA.toString();
    }

    public final String zzc(zzaw zzawVar) {
        String string;
        if (!this.zzd.zza()) {
            return zzawVar.toString();
        }
        StringBuilder sbA = defpackage.a.a("origin=");
        sbA.append(zzawVar.zzc);
        sbA.append(",name=");
        sbA.append(zzd(zzawVar.zza));
        sbA.append(",params=");
        zzau zzauVar = zzawVar.zzb;
        if (zzauVar == null) {
            string = null;
        } else {
            string = !this.zzd.zza() ? zzauVar.toString() : zzb(zzauVar.zzc());
        }
        sbA.append(string);
        return sbA.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgv.zzc, zzgv.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgw.zzb, zzgw.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        if (this.zzd.zza()) {
            return str.startsWith("_exp_") ? j.a("experiment_id(", str, ")") : zzg(str, zzgx.zzb, zzgx.zza, zzc);
        }
        return str;
    }
}
