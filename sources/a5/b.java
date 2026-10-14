package a5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import f5.c0;
import f5.d0;
import f5.e0;
import f5.h0;
import f5.i0;
import f5.m0;
import f5.n0;
import f5.o0;
import f5.q0;
import f5.x;
import f5.y;
import f5.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f78b;

    public /* synthetic */ b(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.f77a = 2;
        this.f78b = crashlyticsRegistrar;
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.f77a = i10;
        this.f78b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x032e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0401 A[Catch: Exception -> 0x043e, TryCatch #2 {Exception -> 0x043e, blocks: (B:67:0x0337, B:69:0x03d9, B:70:0x03de, B:72:0x0401, B:77:0x0410, B:79:0x041e, B:85:0x042a), top: B:111:0x0337 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x040b  */
    /* JADX WARN: Code duplicated, block: B:75:0x040d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0427  */
    /* JADX WARN: Code duplicated, block: B:85:0x042a A[Catch: Exception -> 0x043e, TRY_LEAVE, TryCatch #2 {Exception -> 0x043e, blocks: (B:67:0x0337, B:69:0x03d9, B:70:0x03de, B:72:0x0401, B:77:0x0410, B:79:0x041e, B:85:0x042a), top: B:111:0x0337 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0461  */
    @Override // a5.f
    public final Object a(d dVar) {
        Task<Void> task;
        ExecutorService executorService;
        Task taskOnSuccessTask;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zExists;
        Context context;
        boolean z13;
        boolean z14;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        m5.d dVarA;
        switch (this.f77a) {
            case 0:
                return this.f78b;
            case 1:
                return this.f78b;
            default:
                Objects.requireNonNull((CrashlyticsRegistrar) this.f78b);
                u4.d dVar2 = (u4.d) dVar.a(u4.d.class);
                x5.a aVarE = dVar.e(c5.a.class);
                x5.a aVarE2 = dVar.e(y4.a.class);
                y5.b bVar = (y5.b) dVar.a(y5.b.class);
                dVar2.a();
                Context context2 = dVar2.f36011a;
                String packageName = context2.getPackageName();
                c5.d dVar3 = c5.d.f3604c;
                String str = "Initializing Firebase Crashlytics 18.3.1 for " + packageName;
                if (dVar3.a(4)) {
                    Log.i(dVar3.f3605a, str, null);
                }
                k5.c cVar = new k5.c(context2);
                d0 d0Var = new d0(dVar2);
                i0 i0Var = new i0(context2, packageName, bVar, d0Var);
                c5.b bVar2 = new c5.b(aVarE);
                b5.b bVar3 = new b5.b(aVarE2);
                x xVar = new x(dVar2, i0Var, bVar2, d0Var, new b5.a(bVar3, 0), new b5.a(bVar3, 1), cVar, h0.a("Crashlytics Exception Handler"));
                dVar2.a();
                String str2 = dVar2.f36013c.f36025b;
                String strE = f5.e.e(context2);
                dVar3.b("Mapping file ID is: " + strE);
                c5.c cVar2 = new c5.c(context2);
                try {
                    String packageName2 = context2.getPackageName();
                    String strD = i0Var.d();
                    PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(packageName2, 0);
                    String string = Integer.toString(packageInfo.versionCode);
                    String str3 = packageInfo.versionName;
                    if (str3 == null) {
                        str3 = "0.0";
                    }
                    f5.a aVar = new f5.a(str2, strE, strD, packageName2, string, str3, cVar2);
                    dVar3.e("Installer package name is: " + aVar.f29233c);
                    ExecutorService executorServiceA = h0.a("com.google.firebase.crashlytics.startup");
                    j5.b bVar4 = new j5.b();
                    String str4 = aVar.f29235e;
                    String str5 = aVar.f29236f;
                    String strD2 = i0Var.d();
                    n0 n0Var = new n0();
                    m5.h hVar = new m5.h(n0Var);
                    m5.a aVar2 = new m5.a(cVar);
                    Locale locale = Locale.US;
                    m5.c cVar3 = new m5.c(String.format(locale, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str2), bVar4);
                    String str6 = String.format(locale, "%s/%s", i0Var.e(Build.MANUFACTURER), i0Var.e(Build.MODEL));
                    String strE2 = i0Var.e(Build.VERSION.INCREMENTAL);
                    String strE3 = i0Var.e(Build.VERSION.RELEASE);
                    String[] strArr = {f5.e.e(context2), str2, str5, str4};
                    ArrayList arrayList = new ArrayList();
                    int i10 = 0;
                    while (i10 < 4) {
                        String str7 = strArr[i10];
                        if (str7 != null) {
                            arrayList.add(str7.replace("-", "").toLowerCase(Locale.US));
                        }
                        i10++;
                        strArr = strArr;
                        executorServiceA = executorServiceA;
                    }
                    ExecutorService executorService2 = executorServiceA;
                    Collections.sort(arrayList);
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                    }
                    String string2 = sb2.toString();
                    m5.g gVar = new m5.g(context2, new m5.k(str2, str6, strE2, strE3, i0Var, string2.length() > 0 ? f5.e.l(string2) : null, str5, str4, e0.determineFrom(strD2).getId()), n0Var, hVar, aVar2, cVar3, d0Var);
                    m5.e eVar = m5.e.USE_CACHE;
                    if ((!f5.e.g(gVar.f33206a).getString("existing_instance_identifier", "").equals(gVar.f33207b.f33221f)) || (dVarA = gVar.a(eVar)) == null) {
                        m5.d dVarA2 = gVar.a(m5.e.IGNORE_CACHE_EXPIRATION);
                        if (dVarA2 != null) {
                            gVar.f33213h.set(dVarA2);
                            gVar.f33214i.get().trySetResult(dVarA2);
                        }
                        d0 d0Var2 = gVar.f33212g;
                        Task<Void> task2 = d0Var2.f29260g.getTask();
                        synchronized (d0Var2.f29256c) {
                            task = d0Var2.f29257d.getTask();
                            break;
                        }
                        ExecutorService executorService3 = q0.f29336a;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        o0 o0Var = new o0(taskCompletionSource, 0);
                        executorService = executorService2;
                        task2.continueWith(executorService, o0Var);
                        task.continueWith(executorService, o0Var);
                        taskOnSuccessTask = taskCompletionSource.getTask().onSuccessTask(executorService, new m5.f(gVar));
                    } else {
                        gVar.f33213h.set(dVarA);
                        gVar.f33214i.get().trySetResult(dVarA);
                        taskOnSuccessTask = Tasks.forResult(null);
                        executorService = executorService2;
                    }
                    taskOnSuccessTask.continueWith(executorService, new com.google.firebase.crashlytics.a());
                    Context context3 = xVar.f29351a;
                    if (context3 == null || (resources = context3.getResources()) == null) {
                        z10 = true;
                    } else {
                        int iF = f5.e.f(context3, "com.crashlytics.RequireBuildId", "bool");
                        if (iF > 0) {
                            z10 = resources.getBoolean(iF);
                        } else {
                            int iF2 = f5.e.f(context3, "com.crashlytics.RequireBuildId", "string");
                            if (iF2 > 0) {
                                z10 = Boolean.parseBoolean(context3.getString(iF2));
                            } else {
                                z10 = true;
                            }
                        }
                    }
                    String str8 = r37.f29232b;
                    if (z10) {
                        if (TextUtils.isEmpty(str8)) {
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", ".     |  | ");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                            Log.e("FirebaseCrashlytics", ".    \\    /");
                            Log.e("FirebaseCrashlytics", ".     \\  /");
                            Log.e("FirebaseCrashlytics", ".      \\/");
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", ".      /\\");
                            Log.e("FirebaseCrashlytics", ".     /  \\");
                            Log.e("FirebaseCrashlytics", ".    /    \\");
                            Log.e("FirebaseCrashlytics", ".   / |  | \\");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".");
                            z11 = false;
                        }
                        if (z11) {
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                        }
                        new f5.d(xVar.f29358h);
                        String str9 = f5.d.f29253b;
                        try {
                            xVar.f29356f = new z("crash_marker", xVar.f29359i);
                            xVar.f29355e = new z("initialization_marker", xVar.f29359i);
                            g5.g gVar2 = new g5.g(str9, xVar.f29359i, xVar.f29363m);
                            g5.c cVar4 = new g5.c(xVar.f29359i);
                            xVar.f29357g = new f5.q(xVar.f29351a, xVar.f29363m, xVar.f29358h, xVar.f29352b, xVar.f29359i, xVar.f29356f, aVar, gVar2, cVar4, m0.b(xVar.f29351a, xVar.f29358h, xVar.f29359i, r37, cVar4, gVar2, new n5.a(1024, new n5.c(10)), gVar, xVar.f29353c), xVar.f29364n, xVar.f29361k);
                            zExists = xVar.f29355e.b().exists();
                            try {
                                Boolean.TRUE.equals((Boolean) q0.a(xVar.f29363m.b(new y(xVar))));
                            } catch (Exception unused) {
                            }
                            f5.q qVar = xVar.f29357g;
                            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                            qVar.f29322d.b(new f5.t(qVar, str9));
                            c0 c0Var = new c0(new f5.k(qVar), gVar, defaultUncaughtExceptionHandler, qVar.f29327i);
                            qVar.f29330l = c0Var;
                            Thread.setDefaultUncaughtExceptionHandler(c0Var);
                            if (zExists) {
                                context = xVar.f29351a;
                                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13 || ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting())) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    c5.d.f3604c.b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                                    xVar.b(gVar);
                                    z12 = false;
                                }
                                Tasks.call(executorService, new com.google.firebase.crashlytics.b(z12, xVar, gVar));
                                return new b5.d(xVar);
                            }
                            c5.d.f3604c.b("Successfully configured exception handler.");
                            z12 = true;
                        } catch (Exception e10) {
                            c5.d dVar4 = c5.d.f3604c;
                            if (dVar4.a(6)) {
                                Log.e(dVar4.f3605a, "Crashlytics was not started due to an exception during initialization", e10);
                            }
                            xVar.f29357g = null;
                        }
                        Tasks.call(executorService, new com.google.firebase.crashlytics.b(z12, xVar, gVar));
                        return new b5.d(xVar);
                    }
                    c5.d.f3604c.e("Configured not to require a build ID.");
                    z11 = true;
                    if (z11) {
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                    }
                    new f5.d(xVar.f29358h);
                    String str10 = f5.d.f29253b;
                    xVar.f29356f = new z("crash_marker", xVar.f29359i);
                    xVar.f29355e = new z("initialization_marker", xVar.f29359i);
                    g5.g gVar3 = new g5.g(str10, xVar.f29359i, xVar.f29363m);
                    g5.c cVar5 = new g5.c(xVar.f29359i);
                    xVar.f29357g = new f5.q(xVar.f29351a, xVar.f29363m, xVar.f29358h, xVar.f29352b, xVar.f29359i, xVar.f29356f, aVar, gVar3, cVar5, m0.b(xVar.f29351a, xVar.f29358h, xVar.f29359i, r37, cVar5, gVar3, new n5.a(1024, new n5.c(10)), gVar, xVar.f29353c), xVar.f29364n, xVar.f29361k);
                    zExists = xVar.f29355e.b().exists();
                    Boolean.TRUE.equals((Boolean) q0.a(xVar.f29363m.b(new y(xVar))));
                    f5.q qVar2 = xVar.f29357g;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    qVar2.f29322d.b(new f5.t(qVar2, str10));
                    c0 c0Var2 = new c0(new f5.k(qVar2), gVar, defaultUncaughtExceptionHandler2, qVar2.f29327i);
                    qVar2.f29330l = c0Var2;
                    Thread.setDefaultUncaughtExceptionHandler(c0Var2);
                    if (zExists) {
                        context = xVar.f29351a;
                        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (z14) {
                            c5.d.f3604c.b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                            xVar.b(gVar);
                            z12 = false;
                        }
                        Tasks.call(executorService, new com.google.firebase.crashlytics.b(z12, xVar, gVar));
                        return new b5.d(xVar);
                    }
                    c5.d.f3604c.b("Successfully configured exception handler.");
                    z12 = true;
                    Tasks.call(executorService, new com.google.firebase.crashlytics.b(z12, xVar, gVar));
                    return new b5.d(xVar);
                } catch (PackageManager.NameNotFoundException e11) {
                    c5.d dVar5 = c5.d.f3604c;
                    if (dVar5.a(6)) {
                        Log.e(dVar5.f3605a, "Error retrieving app package info.", e11);
                    }
                    return null;
                }
        }
    }
}
