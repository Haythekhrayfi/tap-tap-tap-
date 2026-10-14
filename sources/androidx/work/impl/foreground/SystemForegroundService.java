package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.s;
import androidx.work.impl.WorkDatabase;
import j2.b;
import java.util.Objects;
import java.util.UUID;
import x1.m;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends s implements androidx.work.impl.foreground.a.InterfaceC0050a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f3189h = m.e("SystemFgService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f3190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.work.impl.foreground.a f3192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public NotificationManager f3193g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f3194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Notification f3195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f3196e;

        public a(int i10, Notification notification, int i11) {
            this.f3194c = i10;
            this.f3195d = notification;
            this.f3196e = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f3194c, this.f3195d, this.f3196e);
            } else {
                SystemForegroundService.this.startForeground(this.f3194c, this.f3195d);
            }
        }
    }

    public final void a() {
        this.f3190d = new Handler(Looper.getMainLooper());
        this.f3193g = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f3192f = aVar;
        if (aVar.f3208l != null) {
            m.c().b(androidx.work.impl.foreground.a.f3198m, "A callback already exists.", new Throwable[0]);
        } else {
            aVar.f3208l = this;
        }
    }

    public void b(int i10, int i11, Notification notification) {
        this.f3190d.post(new a(i10, notification, i11));
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3192f.g();
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f3191e) {
            m.c().d(f3189h, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f3192f.g();
            a();
            this.f3191e = false;
        }
        if (intent == null) {
            return 3;
        }
        androidx.work.impl.foreground.a aVar = this.f3192f;
        Objects.requireNonNull(aVar);
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m.c().d(androidx.work.impl.foreground.a.f3198m, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = aVar.f3200d.f38010c;
            ((b) aVar.f3201e).f31695a.execute(new f2.b(aVar, workDatabase, stringExtra));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                m.c().d(androidx.work.impl.foreground.a.f3198m, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                    return 3;
                }
                k kVar = aVar.f3200d;
                UUID uuidFromString = UUID.fromString(stringExtra2);
                Objects.requireNonNull(kVar);
                ((b) kVar.f38011d).f31695a.execute(new h2.a(kVar, uuidFromString));
                return 3;
            }
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            m.c().d(androidx.work.impl.foreground.a.f3198m, "Stopping foreground service", new Throwable[0]);
            androidx.work.impl.foreground.a.InterfaceC0050a interfaceC0050a = aVar.f3208l;
            if (interfaceC0050a == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0050a;
            systemForegroundService.f3191e = true;
            m.c().a(f3189h, "All commands completed.", new Throwable[0]);
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        aVar.e(intent);
        return 3;
    }
}
