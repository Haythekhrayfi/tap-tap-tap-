package d6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class h0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f28705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f28706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue<a> f28707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g0 f28708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28709f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f28710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TaskCompletionSource<Void> f28711b = new TaskCompletionSource<>();

        public a(Intent intent) {
            this.f28710a = intent;
        }

        public void a() {
            this.f28711b.trySetResult(null);
        }
    }

    public h0(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f28707d = new ArrayDeque();
        this.f28709f = false;
        Context applicationContext = context.getApplicationContext();
        this.f28704a = applicationContext;
        this.f28705b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f28706c = scheduledThreadPoolExecutor;
    }

    public final void a() {
        while (!this.f28707d.isEmpty()) {
            this.f28707d.poll().a();
        }
    }

    public final synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f28707d.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            g0 g0Var = this.f28708e;
            if (g0Var == null || !g0Var.isBinderAlive()) {
                d();
                return;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
            }
            this.f28708e.a(this.f28707d.poll());
        }
    }

    public synchronized Task<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        ScheduledExecutorService scheduledExecutorService = this.f28706c;
        aVar.f28711b.getTask().addOnCompleteListener(scheduledExecutorService, new e0(scheduledExecutorService.schedule(new androidx.activity.c(aVar), (aVar.f28710a.getFlags() & 268435456) != 0 ? f0.f28695a : 9000L, TimeUnit.MILLISECONDS)));
        this.f28707d.add(aVar);
        b();
        return aVar.f28711b.getTask();
    }

    public final void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sbA = defpackage.a.a("binder is dead. start connection? ");
            sbA.append(!this.f28709f);
            Log.d("FirebaseMessaging", sbA.toString());
        }
        if (this.f28709f) {
            return;
        }
        this.f28709f = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f28704a, this.f28705b, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        this.f28709f = false;
        a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f28709f = false;
        if (iBinder instanceof g0) {
            this.f28708e = (g0) iBinder;
            b();
            return;
        }
        Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
        a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }
}
