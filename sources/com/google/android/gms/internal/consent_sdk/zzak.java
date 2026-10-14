package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import w0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzak implements zzg {
    private final Application zza;
    private final zzam zzb;
    private final Executor zzc;

    public zzak(Application application, zzam zzamVar, Executor executor) {
        this.zza = application;
        this.zzb = zzamVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final Executor zza() {
        return this.zzc;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final boolean zzb(String str, JSONObject jSONObject) {
        byte b10;
        int iHashCode = str.hashCode();
        if (iHashCode != 94746189) {
            if (iHashCode == 113399775 && str.equals("write")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
        } else if (str.equals("clear")) {
            b10 = 1;
        } else {
            b10 = -1;
        }
        if (b10 == 0) {
            zzbz zzbzVar = new zzbz(this.zza);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                String strValueOf = String.valueOf(objOpt);
                Log.d("UserMessagingPlatform", a.a(new StringBuilder(String.valueOf(next).length() + 23 + strValueOf.length()), "Writing to storage: [", next, "] ", strValueOf));
                if (zzbzVar.zzc(next, objOpt)) {
                    this.zzb.zzc().add(next);
                } else {
                    String strValueOf2 = String.valueOf(next);
                    Log.d("UserMessagingPlatform", strValueOf2.length() != 0 ? "Failed writing key: ".concat(strValueOf2) : new String("Failed writing key: "));
                }
            }
            this.zzb.zze();
            zzbzVar.zzb();
            return true;
        }
        if (b10 != 1) {
            return false;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            String strValueOf3 = String.valueOf(jSONObject.toString());
            Log.d("UserMessagingPlatform", strValueOf3.length() != 0 ? "Action[clear]: wrong args.".concat(strValueOf3) : new String("Action[clear]: wrong args."));
        } else {
            HashSet hashSet = new HashSet();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String strOptString = jSONArrayOptJSONArray.optString(i10);
                if (TextUtils.isEmpty(strOptString)) {
                    StringBuilder sb2 = new StringBuilder(46);
                    sb2.append("Action[clear]: empty key at index: ");
                    sb2.append(i10);
                    Log.d("UserMessagingPlatform", sb2.toString());
                } else {
                    hashSet.add(strOptString);
                }
            }
            zzca.zzb(this.zza, hashSet);
        }
        return true;
    }
}
