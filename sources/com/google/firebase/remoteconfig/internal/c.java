package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.common.util.Clock;
import h6.e;
import i.f;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f12692j = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f12693k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y5.b f12694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x5.b<y4.a> f12695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f12696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Clock f12697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f12698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.a f12699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConfigFetchHttpClient f12700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f12701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<String, String> f12702i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f12703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f12704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f12705c;

        public a(Date date, int i10, b bVar, String str) {
            this.f12703a = i10;
            this.f12704b = bVar;
            this.f12705c = str;
        }
    }

    public c(y5.b bVar, x5.b<y4.a> bVar2, Executor executor, Clock clock, Random random, com.google.firebase.remoteconfig.internal.a aVar, ConfigFetchHttpClient configFetchHttpClient, d dVar, Map<String, String> map) {
        this.f12694a = bVar;
        this.f12695b = bVar2;
        this.f12696c = executor;
        this.f12697d = clock;
        this.f12698e = random;
        this.f12699f = aVar;
        this.f12700g = configFetchHttpClient;
        this.f12701h = dVar;
        this.f12702i = map;
    }

    public final a a(String str, String str2, Date date) throws h6.c {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.f12700g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f12700g;
            Map<String, String> mapB = b();
            String string = this.f12701h.f12708a.getString("last_fetch_etag", null);
            Map<String, String> map = this.f12702i;
            y4.a aVar = this.f12695b.get();
            a aVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapB, string, map, aVar == null ? null : (Long) aVar.a(true).get("_fot"), date);
            String str4 = aVarFetch.f12705c;
            if (str4 != null) {
                d dVar = this.f12701h;
                synchronized (dVar.f12709b) {
                    dVar.f12708a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f12701h.b(0, d.f12707e);
            return aVarFetch;
        } catch (e e10) {
            int i10 = e10.f30929c;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                int i11 = this.f12701h.a().f12711a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f12693k;
                long millis = timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]);
                this.f12701h.b(i11, new Date(date.getTime() + (millis / 2) + ((long) this.f12698e.nextInt((int) millis))));
            }
            d.a aVarA = this.f12701h.a();
            int i12 = e10.f30929c;
            if (aVarA.f12711a > 1 || i12 == 429) {
                throw new h6.d(aVarA.f12712b.getTime());
            }
            if (i12 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i12 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i12 == 429) {
                    throw new h6.b("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i12 != 500) {
                    switch (i12) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new e(e10.f30929c, f.a("Fetch failed: ", str3), e10);
        }
    }

    public final Map<String, String> b() {
        HashMap map = new HashMap();
        y4.a aVar = this.f12695b.get();
        if (aVar == null) {
            return map;
        }
        for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        return map;
    }
}
