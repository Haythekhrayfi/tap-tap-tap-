package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.d0;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;
import w0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh {
    private final Executor zza;

    public zzh(Executor executor) {
        this.zza = executor;
    }

    public final Executor zza() {
        return this.zza;
    }

    public final void zzb(final String str, final String str2, final zzg... zzgVarArr) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zze
            @Override // java.lang.Runnable
            public final void run() {
                String strA;
                final JSONObject jSONObject;
                String strA2;
                Throwable e10;
                String str3 = str;
                String str4 = str2;
                zzg[] zzgVarArr2 = zzgVarArr;
                if (!TextUtils.isEmpty(str3)) {
                    final String lowerCase = str3.toLowerCase();
                    if (TextUtils.isEmpty(str4)) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = new JSONObject(str4);
                        } catch (JSONException unused) {
                            strA = a.a(new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str4).length()), "Action[", lowerCase, "]: failed to parse args: ", str4);
                        }
                    }
                    String strValueOf = String.valueOf(jSONObject);
                    Log.d("UserMessagingPlatform", a.a(new StringBuilder(String.valueOf(lowerCase).length() + 10 + strValueOf.length()), "Action[", lowerCase, "]: ", strValueOf));
                    for (final zzg zzgVar : zzgVarArr2) {
                        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzf
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return Boolean.valueOf(zzgVar.zzb(lowerCase, jSONObject));
                            }
                        });
                        zzgVar.zza().execute(futureTask);
                        try {
                            if (((Boolean) futureTask.get()).booleanValue()) {
                                return;
                            }
                        } catch (InterruptedException e11) {
                            e10 = e11;
                            strA2 = d0.a(new StringBuilder(String.valueOf(lowerCase).length() + 33), "Thread interrupted for Action[", lowerCase, "]: ");
                            Log.d("UserMessagingPlatform", strA2, e10);
                        } catch (ExecutionException e12) {
                            strA2 = d0.a(new StringBuilder(String.valueOf(lowerCase).length() + 24), "Failed to run Action[", lowerCase, "]: ");
                            e10 = e12.getCause();
                            Log.d("UserMessagingPlatform", strA2, e10);
                        }
                    }
                    return;
                }
                strA = "Error on action: empty action name";
                Log.d("UserMessagingPlatform", strA);
            }
        });
    }
}
