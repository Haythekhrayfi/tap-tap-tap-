package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.webkit.WebSettings;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzv {
    private final Application zza;
    private final zzac zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zzam zze;
    private final zzba zzf;
    private final zzn zzg;
    private final zzz zzh;
    private final zzh zzi;

    public zzv(Application application, zzac zzacVar, Handler handler, Executor executor, zzam zzamVar, zzba zzbaVar, zzn zznVar, zzz zzzVar, zzh zzhVar) {
        this.zza = application;
        this.zzb = zzacVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzamVar;
        this.zzf = zzbaVar;
        this.zzg = zznVar;
        this.zzh = zzzVar;
        this.zzi = zzhVar;
    }

    private final zzbw zzd(zzbu zzbuVar) throws zzj {
        String str;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent(this.zza));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str2 = zzbuVar.zza;
                    if (str2 != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str2);
                    }
                    Boolean bool = zzbuVar.zzb;
                    if (bool != null) {
                        jsonWriter.name("is_lat");
                        jsonWriter.value(bool.booleanValue());
                    }
                    String str3 = zzbuVar.zzc;
                    if (str3 != null) {
                        jsonWriter.name("adid");
                        jsonWriter.value(str3);
                    }
                    zzbq zzbqVar = zzbuVar.zzd;
                    if (zzbqVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i10 = zzbqVar.zzc;
                        if (i10 != 1) {
                            jsonWriter.name("os_type");
                            if (i10 == 0) {
                                throw null;
                            }
                            zzbp zzbpVar = zzbp.DEBUG_PARAM_UNKNOWN;
                            jsonWriter.value(i10 + (-1) != 0 ? "ANDROID" : "UNKNOWN");
                        }
                        String str4 = zzbqVar.zza;
                        if (str4 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str4);
                        }
                        Integer num = zzbqVar.zzb;
                        if (num != null) {
                            jsonWriter.name("android_api_level");
                            jsonWriter.value(num);
                        }
                        jsonWriter.endObject();
                    }
                    String str5 = zzbuVar.zze;
                    if (str5 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str5);
                    }
                    Boolean bool2 = zzbuVar.zzf;
                    if (bool2 != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool2.booleanValue());
                    }
                    Map<String, String> map = zzbuVar.zzg;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            jsonWriter.name(entry.getKey());
                            jsonWriter.value(entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    zzbs zzbsVar = zzbuVar.zzh;
                    if (zzbsVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = zzbsVar.zza;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = zzbsVar.zzb;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d10 = zzbsVar.zzc;
                        if (d10 != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d10);
                        }
                        List<zzbr> list = zzbsVar.zzd;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (zzbr zzbrVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = zzbrVar.zza;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = zzbrVar.zzb;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = zzbrVar.zzc;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = zzbrVar.zzd;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    zzbo zzboVar = zzbuVar.zzi;
                    if (zzboVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str6 = zzboVar.zza;
                        if (str6 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = zzboVar.zzb;
                        if (str7 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str7);
                        }
                        String str8 = zzboVar.zzc;
                        if (str8 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str8);
                        }
                        jsonWriter.endObject();
                    }
                    zzbt zzbtVar = zzbuVar.zzj;
                    if (zzbtVar != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        String str9 = zzbtVar.zza;
                        if (str9 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str9);
                        }
                        jsonWriter.endObject();
                    }
                    List<zzbp> list2 = zzbuVar.zzk;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        for (zzbp zzbpVar2 : list2) {
                            zzbp zzbpVar3 = zzbp.DEBUG_PARAM_UNKNOWN;
                            int iOrdinal = zzbpVar2.ordinal();
                            if (iOrdinal == 0) {
                                str = "DEBUG_PARAM_UNKNOWN";
                            } else if (iOrdinal == 1) {
                                str = "ALWAYS_SHOW";
                            } else if (iOrdinal == 2) {
                                str = "GEO_OVERRIDE_EEA";
                            } else if (iOrdinal == 3) {
                                str = "GEO_OVERRIDE_NON_EEA";
                            } else if (iOrdinal == 4) {
                                str = "PREVIEWING_DEBUG_MESSAGES";
                            }
                            jsonWriter.value(str);
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        String next = new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(next).length() + 31);
                        sb2.append("Http error code - ");
                        sb2.append(responseCode);
                        sb2.append(".\n");
                        sb2.append(next);
                        throw new IOException(sb2.toString());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        zzbw zzbwVarZza = zzbw.zza(new JsonReader(new StringReader(headerField)));
                        zzbwVarZza.zza = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return zzbwVarZza;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            zzbw zzbwVarZza2 = zzbw.zza(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return zzbwVarZza2;
                        } catch (Throwable th) {
                            try {
                                jsonReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        jsonWriter.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (Throwable th7) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        } catch (SocketTimeoutException e10) {
            throw new zzj(4, "The server timed out.", e10);
        } catch (IOException e11) {
            throw new zzj(2, "Error making request.", e11);
        }
    }

    public final /* synthetic */ void zza(final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener) {
        Handler handler = this.zzc;
        Objects.requireNonNull(onConsentInfoUpdateSuccessListener);
        handler.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzu
            @Override // java.lang.Runnable
            public final void run() {
                onConsentInfoUpdateSuccessListener.onConsentInfoUpdateSuccess();
            }
        });
    }

    public final /* synthetic */ void zzb(Activity activity, ConsentRequestParameters consentRequestParameters, final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        try {
            ConsentDebugSettings consentDebugSettings = consentRequestParameters.getConsentDebugSettings();
            if (consentDebugSettings == null || !consentDebugSettings.isTestDevice()) {
                String strZza = zzbx.zza(this.zza);
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + 95);
                sb2.append("Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"");
                sb2.append(strZza);
                sb2.append("\") to set this as a debug device.");
                Log.i("UserMessagingPlatform", sb2.toString());
            }
            zzaa zzaaVarZza = new zzy(this.zzh, zzd(this.zzg.zzd(activity, consentRequestParameters))).zza();
            this.zze.zzf(zzaaVarZza.zza);
            this.zzf.zzb(zzaaVarZza.zzb);
            this.zzi.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzr
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(onConsentInfoUpdateSuccessListener);
                }
            });
        } catch (zzj e10) {
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(e10.zza());
                }
            });
        } catch (RuntimeException e11) {
            String strValueOf = String.valueOf(Log.getStackTraceString(e11));
            final zzj zzjVar = new zzj(1, strValueOf.length() != 0 ? "Caught exception when trying to request consent info update: ".concat(strValueOf) : new String("Caught exception when trying to request consent info update: "));
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzt
                @Override // java.lang.Runnable
                public final void run() {
                    onConsentInfoUpdateFailureListener.onConsentInfoUpdateFailure(zzjVar.zza());
                }
            });
        }
    }

    public final void zzc(final Activity activity, final ConsentRequestParameters consentRequestParameters, final ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, final ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(activity, consentRequestParameters, onConsentInfoUpdateSuccessListener, onConsentInfoUpdateFailureListener);
            }
        });
    }
}
