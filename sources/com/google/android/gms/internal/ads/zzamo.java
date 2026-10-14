package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zzamo extends zzalk {
    private final Object zza;
    private final zzalp zzb;

    public zzamo(int i10, String str, zzalp zzalpVar, zzalo zzaloVar) {
        super(i10, str, zzaloVar);
        this.zza = new Object();
        this.zzb = zzalpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalk
    public final zzalq zzh(zzalg zzalgVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzalgVar.zzb;
            Map map = zzalgVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                    String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzalgVar.zzb);
        }
        return zzalq.zzb(str, zzamh.zzb(zzalgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzalk
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzalp zzalpVar;
        synchronized (this.zza) {
            zzalpVar = this.zzb;
        }
        zzalpVar.zza(str);
    }
}
