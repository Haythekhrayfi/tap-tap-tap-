package com.yandex.metrica.impl.ob;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1669h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f16238f = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f16239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f16240b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Thread f16241c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f16242d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f16243e = new a();

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1669h.this.f16242d.set(true);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h$b */
    public interface b {
        void a();
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.h$c */
    public class c extends Thread {
        public c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z10 = false;
            int i10 = 0;
            while (!isInterrupted()) {
                if (!z10) {
                    C1669h.this.f16242d.set(false);
                    C1669h.this.f16240b.post(C1669h.this.f16243e);
                    i10 = 0;
                }
                try {
                    Thread.sleep(C1669h.f16238f);
                    if (C1669h.this.f16242d.get()) {
                        z10 = false;
                    } else {
                        i10++;
                        if (i10 == 4 && !Debug.isDebuggerConnected()) {
                            C1669h.this.b();
                        }
                        z10 = true;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public C1669h(b bVar) {
        this.f16239a = bVar;
    }

    public void b() {
        this.f16239a.a();
    }

    public void c() {
        try {
            this.f16241c.setName("CR-WatchDog");
        } catch (SecurityException unused) {
        }
        this.f16241c.start();
    }
}
