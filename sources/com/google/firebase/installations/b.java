package com.google.firebase.installations;

import a5.q;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import v5.g;
import y5.f;

/* JADX INFO: loaded from: classes2.dex */
public class b implements y5.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f12568m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f12569n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f12570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b6.c f12571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.c f12572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f12573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q<a6.b> f12574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y5.d f12575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f12576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f12577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ExecutorService f12578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f12579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<z5.a> f12580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<y5.e> f12581l;

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f12582c = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f12582c.getAndIncrement())));
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.installations.b$b, reason: collision with other inner class name */
    public static /* synthetic */ class C0160b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f12584b;

        static {
            int[] iArr = new int[b6.f.b.values().length];
            f12584b = iArr;
            try {
                iArr[b6.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12584b[b6.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12584b[b6.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b6.d.b.values().length];
            f12583a = iArr2;
            try {
                iArr2[b6.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12583a[b6.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public b(u4.d dVar, x5.b<g> bVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = f12569n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        dVar.a();
        b6.c cVar = new b6.c(dVar.f36011a, bVar);
        a6.c cVar2 = new a6.c(dVar);
        f fVarC = f.c();
        q<a6.b> qVar = new q<>(new a5.e(dVar));
        y5.d dVar2 = new y5.d();
        this.f12576g = new Object();
        this.f12580k = new HashSet();
        this.f12581l = new ArrayList();
        this.f12570a = dVar;
        this.f12571b = cVar;
        this.f12572c = cVar2;
        this.f12573d = fVarC;
        this.f12574e = qVar;
        this.f12575f = dVar2;
        this.f12577h = threadPoolExecutor;
        this.f12578i = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactory);
    }

    public static b f(u4.d dVar) {
        Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
        dVar.a();
        return (b) dVar.f36014d.a(y5.b.class);
    }

    @Override // y5.b
    public Task<e> a(boolean z10) {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        d dVar = new d(this.f12573d, taskCompletionSource);
        synchronized (this.f12576g) {
            this.f12581l.add(dVar);
        }
        Task<e> task = taskCompletionSource.getTask();
        this.f12577h.execute(new y5.a(this, z10, 0));
        return task;
    }

    public final void b(boolean z10) {
        a6.d dVarC;
        synchronized (f12568m) {
            u4.d dVar = this.f12570a;
            dVar.a();
            j1.c cVarB = j1.c.b(dVar.f36011a, "generatefid.lock");
            try {
                dVarC = this.f12572c.c();
                if (dVarC.i()) {
                    String strI = i(dVarC);
                    a6.c cVar = this.f12572c;
                    dVarC = dVarC.k().d(strI).g(a6.c.a.UNREGISTERED).a();
                    cVar.b(dVarC);
                }
                if (cVarB != null) {
                    cVarB.d();
                }
            } catch (Throwable th) {
                if (cVarB != null) {
                    cVarB.d();
                }
                throw th;
            }
        }
        if (z10) {
            dVarC = dVarC.k().b(null).a();
        }
        l(dVarC);
        this.f12578i.execute(new y5.a(this, z10, 1));
    }

    public final a6.d c(a6.d dVar) throws c {
        b6.f fVarF;
        b6.f.a aVarA;
        b6.f.b bVar;
        b6.c cVar = this.f12571b;
        String strD = d();
        String strC = dVar.c();
        String strG = g();
        String strE = dVar.e();
        if (!cVar.f3338c.a()) {
            throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
        }
        URL urlA = cVar.a(String.format("projects/%s/installations/%s/authTokens:generate", strG, strC));
        int i10 = 0;
        while (true) {
            if (i10 > 1) {
                throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, strD);
            try {
                httpURLConnectionC.setRequestMethod("POST");
                httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + strE);
                httpURLConnectionC.setDoOutput(true);
                cVar.h(httpURLConnectionC);
                int responseCode = httpURLConnectionC.getResponseCode();
                cVar.f3338c.b(responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    fVarF = cVar.f(httpURLConnectionC);
                } else {
                    b6.c.b(httpURLConnectionC, null, strD, strG);
                    if (responseCode == 401 || responseCode == 404) {
                        aVarA = b6.f.a();
                        bVar = b6.f.b.AUTH_ERROR;
                    } else {
                        if (responseCode == 429) {
                            throw new c("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", c.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            aVarA = b6.f.a();
                            bVar = b6.f.b.BAD_CONFIG;
                        } else {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i10++;
                        }
                    }
                    b6.b.C0056b c0056b = (b6.b.C0056b) aVarA;
                    c0056b.f3333c = bVar;
                    fVarF = c0056b.a();
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                int i11 = C0160b.f12584b[fVarF.b().ordinal()];
                if (i11 == 1) {
                    return dVar.k().b(fVarF.c()).c(fVarF.d()).h(this.f12573d.b()).a();
                }
                if (i11 == 2) {
                    return dVar.k().e("BAD CONFIG").g(a6.c.a.REGISTER_ERROR).a();
                }
                if (i11 != 3) {
                    throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
                }
                synchronized (this) {
                    this.f12579j = null;
                }
                return dVar.k().g(a6.c.a.NOT_GENERATED).a();
            } catch (IOException | AssertionError unused) {
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
    }

    public String d() {
        u4.d dVar = this.f12570a;
        dVar.a();
        return dVar.f36013c.f36024a;
    }

    public String e() {
        u4.d dVar = this.f12570a;
        dVar.a();
        return dVar.f36013c.f36025b;
    }

    public String g() {
        u4.d dVar = this.f12570a;
        dVar.a();
        return dVar.f36013c.f36030g;
    }

    @Override // y5.b
    public Task<String> getId() {
        String str;
        h();
        synchronized (this) {
            str = this.f12579j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        y5.c cVar = new y5.c(taskCompletionSource);
        synchronized (this.f12576g) {
            this.f12581l.add(cVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f12577h.execute(new androidx.activity.c(this));
        return task;
    }

    public final void h() {
        Preconditions.checkNotEmpty(e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(g(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String strE = e();
        Pattern pattern = f.f38090c;
        Preconditions.checkArgument(strE.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(f.f38090c.matcher(d()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String i(a6.d dVar) {
        String string;
        u4.d dVar2 = this.f12570a;
        dVar2.a();
        if (dVar2.f36012b.equals("CHIME_ANDROID_SDK") || this.f12570a.h()) {
            if (dVar.f() == a6.c.a.ATTEMPT_MIGRATION) {
                a6.b bVar = this.f12574e.get();
                synchronized (bVar.f154a) {
                    synchronized (bVar.f154a) {
                        string = bVar.f154a.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = bVar.a();
                    }
                }
                return TextUtils.isEmpty(string) ? this.f12575f.a() : string;
            }
        }
        return this.f12575f.a();
    }

    public final a6.d j(a6.d dVar) throws c {
        HttpURLConnection httpURLConnectionC;
        b6.d dVarE;
        String string = null;
        if (dVar.c() != null && dVar.c().length() == 11) {
            a6.b bVar = this.f12574e.get();
            synchronized (bVar.f154a) {
                for (String str : a6.b.f153c) {
                    String string2 = bVar.f154a.getString("|T|" + bVar.f155b + "|" + str, null);
                    if (string2 != null && !string2.isEmpty()) {
                        if (!string2.startsWith("{")) {
                            string = string2;
                            break;
                        }
                        try {
                            string = new JSONObject(string2).getString("token");
                            break;
                        } catch (JSONException unused) {
                            break;
                        }
                    }
                }
            }
        }
        b6.c cVar = this.f12571b;
        String strD = d();
        String strC = dVar.c();
        String strG = g();
        String strE = e();
        if (!cVar.f3338c.a()) {
            throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
        }
        URL urlA = cVar.a(String.format("projects/%s/installations", strG));
        int i10 = 0;
        while (true) {
            if (i10 > 1) {
                throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
            }
            TrafficStats.setThreadStatsTag(32769);
            httpURLConnectionC = cVar.c(urlA, strD);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    cVar.g(httpURLConnectionC, strC, strE);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    cVar.f3338c.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        dVarE = cVar.e(httpURLConnectionC);
                        break;
                    }
                    b6.c.b(httpURLConnectionC, strE, strD, strG);
                    if (responseCode == 429) {
                        throw new c("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", c.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        b6.a.b bVar2 = new b6.a.b();
                        bVar2.f3327e = b6.d.b.BAD_CONFIG;
                        dVarE = bVar2.a();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        b6.a aVar = (b6.a) dVarE;
        int i11 = C0160b.f12583a[aVar.f3322e.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return dVar.k().e("BAD CONFIG").g(a6.c.a.REGISTER_ERROR).a();
            }
            throw new c("Firebase Installations Service is unavailable. Please try again later.", c.a.UNAVAILABLE);
        }
        return dVar.k().d(aVar.f3319b).g(a6.c.a.REGISTERED).b(aVar.f3321d.c()).f(aVar.f3320c).c(aVar.f3321d.d()).h(this.f12573d.b()).a();
    }

    public final void k(Exception exc) {
        synchronized (this.f12576g) {
            Iterator<y5.e> it = this.f12581l.iterator();
            while (it.hasNext()) {
                if (it.next().b(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void l(a6.d dVar) {
        synchronized (this.f12576g) {
            Iterator<y5.e> it = this.f12581l.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar)) {
                    it.remove();
                }
            }
        }
    }
}
