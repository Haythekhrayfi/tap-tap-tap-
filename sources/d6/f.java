package d6;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class f extends Service {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f28688h = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f28689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Binder f28690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f28691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28693g;

    public class a implements g0.a {
        public a() {
        }
    }

    public f() {
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory("Firebase-Messaging-Intent-Handle");
        f6.a aVar = f6.a.HIGH_SPEED;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), namedThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f28689c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f28691e = new Object();
        this.f28693g = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            f0.a(intent);
        }
        synchronized (this.f28691e) {
            int i10 = this.f28693g - 1;
            this.f28693g = i10;
            if (i10 == 0) {
                stopSelfResult(this.f28692f);
            }
        }
    }

    public Intent b(Intent intent) {
        return intent;
    }

    public abstract void c(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f28690d == null) {
            this.f28690d = new g0(new a());
        }
        return this.f28690d;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f28689c.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.f28691e) {
            this.f28692f = i11;
            this.f28693g++;
        }
        Intent intentB = b(intent);
        if (intentB == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f28689c.execute(new androidx.emoji2.text.f(this, intentB, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(e.f28679d, new OnCompleteListener() { // from class: d6.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                this.f28667a.a(intent);
            }
        });
        return 3;
    }
}
