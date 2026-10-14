package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import d6.c0;
import d6.l;
import d6.o;
import d6.r;
import d6.w;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f12587n = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static g f12588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SuppressLint({"FirebaseUnknownNullness"})
    public static TransportFactory f12589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static ScheduledExecutorService f12590q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f12591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5.a f12592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5.b f12593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f12595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f12596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f12597g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f12598h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f12599i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f12600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Task<i> f12601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f12602l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12603m;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u5.d f12604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f12605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u5.b<u4.a> f12606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f12607d;

        public a(u5.d dVar) {
            this.f12604a = dVar;
        }

        public synchronized void a() {
            if (this.f12605b) {
                return;
            }
            Boolean boolC = c();
            this.f12607d = boolC;
            if (boolC == null) {
                u5.b<u4.a> bVar = new u5.b() { // from class: d6.p
                    @Override // u5.b
                    public final void a(u5.a aVar) {
                        FirebaseMessaging.a aVar2 = this.f28730a;
                        if (aVar2.b()) {
                            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                            com.google.firebase.messaging.g gVar = FirebaseMessaging.f12588o;
                            firebaseMessaging.h();
                        }
                    }
                };
                this.f12606c = bVar;
                this.f12604a.b(u4.a.class, bVar);
            }
            this.f12605b = true;
        }

        public synchronized boolean b() {
            Boolean bool;
            a();
            bool = this.f12607d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f12591a.g();
        }

        public final Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            u4.d dVar = FirebaseMessaging.this.f12591a;
            dVar.a();
            Context context = dVar.f36011a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(u4.d dVar, w5.a aVar, x5.b<g6.g> bVar, x5.b<v5.h> bVar2, y5.b bVar3, TransportFactory transportFactory, u5.d dVar2) {
        dVar.a();
        r rVar = new r(dVar.f36011a);
        e eVar = new e(dVar, rVar, bVar, bVar2, bVar3);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        final int i10 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        final int i11 = 0;
        this.f12603m = false;
        f12589p = transportFactory;
        this.f12591a = dVar;
        this.f12592b = aVar;
        this.f12593c = bVar3;
        this.f12597g = new a(dVar2);
        dVar.a();
        Context context = dVar.f36011a;
        this.f12594d = context;
        l lVar = new l();
        this.f12602l = rVar;
        this.f12599i = executorServiceNewSingleThreadExecutor;
        this.f12595e = eVar;
        this.f12596f = new w(executorServiceNewSingleThreadExecutor);
        this.f12598h = scheduledThreadPoolExecutor;
        this.f12600j = threadPoolExecutor;
        dVar.a();
        Context context2 = dVar.f36011a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(lVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.c(new o(this, i11));
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: d6.n

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f28728d;

            {
                this.f28728d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final boolean z10;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i11) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f28728d;
                        if (firebaseMessaging.f12597g.b()) {
                            firebaseMessaging.h();
                        }
                        break;
                    default:
                        final Context context3 = this.f28728d.f12594d;
                        Context applicationContext = context3.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context3;
                        }
                        if (!applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            try {
                                Context applicationContext2 = context3.getApplicationContext();
                                PackageManager packageManager = applicationContext2.getPackageManager();
                                z10 = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                                break;
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            if (!PlatformVersion.isAtLeastQ()) {
                                Tasks.forResult(null);
                            } else {
                                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                                new Runnable() { // from class: d6.u
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Context context4 = context3;
                                        boolean z11 = z10;
                                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                                        try {
                                            if (Binder.getCallingUid() == context4.getApplicationInfo().uid) {
                                                Context applicationContext3 = context4.getApplicationContext();
                                                if (applicationContext3 == null) {
                                                    applicationContext3 = context4;
                                                }
                                                SharedPreferences.Editor editorEdit = applicationContext3.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                                                editorEdit.putBoolean("proxy_notification_initialized", true);
                                                editorEdit.apply();
                                                NotificationManager notificationManager = (NotificationManager) context4.getSystemService(NotificationManager.class);
                                                if (z11) {
                                                    notificationManager.setNotificationDelegate("com.google.android.gms");
                                                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                                    notificationManager.setNotificationDelegate(null);
                                                }
                                            } else {
                                                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context4.getPackageName());
                                            }
                                        } finally {
                                            taskCompletionSource2.trySetResult(null);
                                        }
                                    }
                                }.run();
                                taskCompletionSource.getTask();
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i12 = i.f12654j;
        Task<i> taskCall = Tasks.call(scheduledThreadPoolExecutor2, new c0(context, scheduledThreadPoolExecutor2, this, rVar, eVar));
        this.f12601k = taskCall;
        taskCall.addOnSuccessListener(scheduledThreadPoolExecutor, new o(this, i10));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: d6.n

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f28728d;

            {
                this.f28728d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final boolean z10;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f28728d;
                        if (firebaseMessaging.f12597g.b()) {
                            firebaseMessaging.h();
                        }
                        break;
                    default:
                        final Context context3 = this.f28728d.f12594d;
                        Context applicationContext = context3.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context3;
                        }
                        if (!applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            try {
                                Context applicationContext2 = context3.getApplicationContext();
                                PackageManager packageManager = applicationContext2.getPackageManager();
                                z10 = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                                break;
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            if (!PlatformVersion.isAtLeastQ()) {
                                Tasks.forResult(null);
                            } else {
                                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                                new Runnable() { // from class: d6.u
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Context context4 = context3;
                                        boolean z11 = z10;
                                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                                        try {
                                            if (Binder.getCallingUid() == context4.getApplicationInfo().uid) {
                                                Context applicationContext3 = context4.getApplicationContext();
                                                if (applicationContext3 == null) {
                                                    applicationContext3 = context4;
                                                }
                                                SharedPreferences.Editor editorEdit = applicationContext3.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                                                editorEdit.putBoolean("proxy_notification_initialized", true);
                                                editorEdit.apply();
                                                NotificationManager notificationManager = (NotificationManager) context4.getSystemService(NotificationManager.class);
                                                if (z11) {
                                                    notificationManager.setNotificationDelegate("com.google.android.gms");
                                                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                                    notificationManager.setNotificationDelegate(null);
                                                }
                                            } else {
                                                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context4.getPackageName());
                                            }
                                        } finally {
                                            taskCompletionSource2.trySetResult(null);
                                        }
                                    }
                                }.run();
                                taskCompletionSource.getTask();
                            }
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static synchronized FirebaseMessaging c() {
        return getInstance(u4.d.b());
    }

    public static synchronized g d(Context context) {
        if (f12588o == null) {
            f12588o = new g(context);
        }
        return f12588o;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(u4.d dVar) {
        FirebaseMessaging firebaseMessaging;
        dVar.a();
        firebaseMessaging = (FirebaseMessaging) dVar.f36014d.a(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public String a() throws IOException {
        Task<String> taskContinueWithTask;
        w5.a aVar = this.f12592b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final g.a aVarF = f();
        if (!j(aVarF)) {
            return aVarF.f12646a;
        }
        final String strB = r.b(this.f12591a);
        w wVar = this.f12596f;
        synchronized (wVar) {
            taskContinueWithTask = wVar.f28742b.get(strB);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strB);
                }
                e eVar = this.f12595e;
                final int i10 = 1;
                taskContinueWithTask = eVar.a(eVar.c(r.b(eVar.f12635a), Marker.ANY_MARKER, new Bundle())).onSuccessTask(this.f12600j, new SuccessContinuation(strB, aVarF, i10) { // from class: d6.m

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ String f28725d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ com.google.firebase.messaging.g.a f28726e;

                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public Task then(Object obj) {
                        FirebaseMessaging firebaseMessaging = this.f28724c;
                        String str = this.f28725d;
                        com.google.firebase.messaging.g.a aVar2 = this.f28726e;
                        String str2 = (String) obj;
                        com.google.firebase.messaging.g gVarD = FirebaseMessaging.d(firebaseMessaging.f12594d);
                        String strE = firebaseMessaging.e();
                        String strA = firebaseMessaging.f12602l.a();
                        synchronized (gVarD) {
                            String strA2 = com.google.firebase.messaging.g.a.a(str2, strA, System.currentTimeMillis());
                            if (strA2 != null) {
                                SharedPreferences.Editor editorEdit = gVarD.f12644a.edit();
                                editorEdit.putString(gVarD.a(strE, str), strA2);
                                editorEdit.commit();
                            }
                        }
                        if (aVar2 == null || !str2.equals(aVar2.f12646a)) {
                            u4.d dVar = firebaseMessaging.f12591a;
                            dVar.a();
                            if ("[DEFAULT]".equals(dVar.f36012b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    StringBuilder sbA = defpackage.a.a("Invoking onNewToken for app: ");
                                    u4.d dVar2 = firebaseMessaging.f12591a;
                                    dVar2.a();
                                    sbA.append(dVar2.f36012b);
                                    Log.d("FirebaseMessaging", sbA.toString());
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new k(firebaseMessaging.f12594d).c(intent);
                            }
                        }
                        return Tasks.forResult(str2);
                    }
                }).continueWithTask(wVar.f28741a, new d6.g(wVar, strB));
                wVar.f28742b.put(strB, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strB);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    public void b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f12590q == null) {
                f12590q = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f12590q.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    public final String e() {
        u4.d dVar = this.f12591a;
        dVar.a();
        return "[DEFAULT]".equals(dVar.f36012b) ? "" : this.f12591a.c();
    }

    public g.a f() {
        g.a aVarB;
        g gVarD = d(this.f12594d);
        String strE = e();
        String strB = r.b(this.f12591a);
        synchronized (gVarD) {
            aVarB = g.a.b(gVarD.f12644a.getString(gVarD.a(strE, strB), null));
        }
        return aVarB;
    }

    public synchronized void g(boolean z10) {
        this.f12603m = z10;
    }

    public final void h() {
        w5.a aVar = this.f12592b;
        if (aVar != null) {
            aVar.b();
        } else if (j(f())) {
            synchronized (this) {
                if (!this.f12603m) {
                    i(0L);
                }
            }
        }
    }

    public synchronized void i(long j10) {
        b(new h(this, Math.min(Math.max(30L, 2 * j10), f12587n)), j10);
        this.f12603m = true;
    }

    public boolean j(g.a aVar) {
        if (aVar != null) {
            if (!(System.currentTimeMillis() > aVar.f12648c + g.a.f12645d || !this.f12602l.a().equals(aVar.f12647b))) {
                return false;
            }
        }
        return true;
    }
}
