package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.applovin.impl.mediation.b.a.c;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcdk implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzcdl zze;

    public zzcdk(zzcdl zzcdlVar, String str, String str2, String str3, String str4) {
        this.zze = zzcdlVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b10;
        HashMap mapA = c.a("event", "precacheCanceled");
        mapA.put("src", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            mapA.put("cachedSrc", this.zzb);
        }
        switch (this.zzc) {
            case "interrupted":
                b10 = 3;
                break;
            case "badUrl":
                b10 = 8;
                break;
            case "inProgress":
                b10 = 2;
                break;
            case "downloadTimeout":
                b10 = 9;
                break;
            case "contentLengthMissing":
                b10 = 0;
                break;
            case "playerFailed":
                b10 = 5;
                break;
            case "sizeExceeded":
                b10 = 11;
                break;
            case "externalAbort":
                b10 = 10;
                break;
            case "noop":
                b10 = 4;
                break;
            case "error":
                b10 = 1;
                break;
            case "expireFailed":
                b10 = 6;
                break;
            case "noCacheDir":
                b10 = 7;
                break;
            default:
                b10 = -1;
                break;
        }
        String str = "internal";
        switch (b10) {
            case 6:
            case 7:
                str = "io";
                break;
            case 8:
            case 9:
                str = "network";
                break;
            case 10:
            case 11:
                str = "policy";
                break;
        }
        mapA.put("type", str);
        mapA.put("reason", this.zzc);
        if (!TextUtils.isEmpty(this.zzd)) {
            mapA.put("message", this.zzd);
        }
        zzcdl.zze(this.zze, "onPrecacheEvent", mapA);
    }
}
