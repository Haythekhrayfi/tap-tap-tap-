package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f12644a;

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f12645d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f12646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f12647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f12648c;

        public a(String str, String str2, long j10) {
            this.f12646a = str;
            this.f12647b = str2;
            this.f12648c = j10;
        }

        public static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        public static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }
    }

    public g(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f12644a = sharedPreferences;
        Object obj = e0.a.f28964a;
        File file = new File(e0.a.c.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sbA = defpackage.a.a("Error creating file in no backup dir: ");
                sbA.append(e10.getMessage());
                Log.d("FirebaseMessaging", sbA.toString());
            }
        }
    }

    public final String a(String str, String str2) {
        return q.a(str, "|T|", str2, "|", Marker.ANY_MARKER);
    }
}
