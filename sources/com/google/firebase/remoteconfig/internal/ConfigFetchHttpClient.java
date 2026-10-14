package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.material.datepicker.UtcDates;
import h6.e;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigFetchHttpClient {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f12672h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12679g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j10, long j11) {
        this.f12673a = context;
        this.f12674b = str;
        this.f12675c = str2;
        Matcher matcher = f12672h.matcher(str);
        this.f12676d = matcher.matches() ? matcher.group(1) : null;
        this.f12677e = str3;
        this.f12678f = j10;
        this.f12679g = j11;
    }

    public final JSONObject a(String str, String str2, Map<String, String> map, Long l10) throws h6.b {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new h6.b("Fetch failed: Firebase installation id is null.");
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.f12674b);
        Locale locale = this.f12673a.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        int i10 = Build.VERSION.SDK_INT;
        map2.put("languageCode", locale.toLanguageTag());
        map2.put("platformVersion", Integer.toString(i10));
        map2.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.f12673a.getPackageManager().getPackageInfo(this.f12673a.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put("appBuild", Long.toString(i10 >= 28 ? f0.a.b(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put("packageName", this.f12673a.getPackageName());
        map2.put("sdkVersion", "21.2.0");
        map2.put("analyticsUserProperties", new JSONObject(map));
        if (l10 != null) {
            long jLongValue = l10.longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
            map2.put("firstOpenTime", simpleDateFormat.format(Long.valueOf(jLongValue)));
        }
        return new JSONObject(map2);
    }

    public HttpURLConnection b() throws h6.c {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", this.f12676d, this.f12677e)).openConnection();
        } catch (IOException e10) {
            throw new h6.c(e10.getMessage());
        }
    }

    public final JSONObject c(URLConnection uRLConnection) throws JSONException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read();
            if (i10 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i10);
        }
    }

    public final void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @Keep
    public c.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l10, Date date) throws h6.c {
        String strBytesToStringUppercase;
        boolean z10;
        JSONObject jSONObject;
        JSONArray jSONArray;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f12678f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f12679g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty(CctTransportBackend.API_KEY_HEADER_KEY, this.f12675c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f12673a.getPackageName());
        JSONObject jSONObject2 = null;
        try {
            Context context = this.f12673a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f12673a.getPackageName());
                strBytesToStringUppercase = null;
            } else {
                strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            StringBuilder sbA = defpackage.a.a("No such package: ");
            sbA.append(this.f12673a.getPackageName());
            Log.e("FirebaseRemoteConfig", sbA.toString(), e10);
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strBytesToStringUppercase);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            try {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        try {
            d(httpURLConnection, a(str, str2, map, l10).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new e(responseCode, httpURLConnection.getResponseMessage());
            }
            String headerField = httpURLConnection.getHeaderField("ETag");
            JSONObject jSONObjectC = c(httpURLConnection);
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            try {
                z10 = !jSONObjectC.get("state").equals("NO_CHANGE");
            } catch (JSONException unused3) {
                z10 = true;
            }
            if (!z10) {
                return new c.a(date, 1, null, null);
            }
            try {
                Date date2 = b.f12686f;
                JSONObject jSONObject3 = new JSONObject();
                Date date3 = b.f12686f;
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject = jSONObjectC.getJSONObject("entries");
                } catch (JSONException unused4) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    try {
                        jSONObject3 = new JSONObject(jSONObject.toString());
                    } catch (JSONException unused5) {
                    }
                }
                try {
                    jSONArray = jSONObjectC.getJSONArray("experimentDescriptions");
                } catch (JSONException unused6) {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    try {
                        jSONArray2 = new JSONArray(jSONArray.toString());
                    } catch (JSONException unused7) {
                    }
                }
                try {
                    jSONObject2 = jSONObjectC.getJSONObject("personalizationMetadata");
                } catch (JSONException unused8) {
                }
                if (jSONObject2 != null) {
                    try {
                        jSONObject4 = new JSONObject(jSONObject2.toString());
                    } catch (JSONException unused9) {
                    }
                }
                b bVar = new b(jSONObject3, date, jSONArray2, jSONObject4);
                return new c.a(bVar.f12689c, 0, bVar, headerField);
            } catch (JSONException e11) {
                throw new h6.b("Fetch failed: fetch response could not be parsed.", e11);
            }
        } catch (IOException | JSONException e12) {
            throw new h6.b("The client had an error while calling the backend!", e12);
        }
    }
}
