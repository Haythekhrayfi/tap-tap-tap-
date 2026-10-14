package com.yandex.metrica.impl.ob;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1603e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LocalServerSocket f16029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f16030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1727j8 f16031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Um<String> f16032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f16033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<Um<String>> f16034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Thread f16035h;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e8$a */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (C1603e8.this.f16030c) {
                try {
                    LocalSocket localSocketAccept = C1603e8.this.f16029b.accept();
                    byte[] bArr = new byte[256];
                    int i10 = localSocketAccept.getInputStream().read(bArr);
                    localSocketAccept.close();
                    byte[] bArr2 = new byte[i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    C1603e8.a(C1603e8.this, new String(bArr2));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e8$b */
    public class b implements Um<String> {
        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            CrashpadServiceHelper.setUpServiceHelper(str);
        }
    }

    public C1603e8(String str, String str2) {
        this(str, str2, C1727j8.a(), new b());
    }

    public C1603e8(String str, String str2, C1727j8 c1727j8, Um<String> um) {
        this.f16030c = false;
        this.f16034g = new LinkedList();
        this.f16035h = new a();
        this.f16028a = str;
        this.f16033f = str2;
        this.f16031d = c1727j8;
        this.f16032e = um;
    }

    public static void a(C1603e8 c1603e8, String str) {
        synchronized (c1603e8) {
            Iterator<Um<String>> it = c1603e8.f16034g.iterator();
            while (it.hasNext()) {
                it.next().b(str);
            }
        }
    }

    public void a(Um<String> um) {
        synchronized (this) {
            this.f16034g.add(um);
        }
        if (this.f16030c || this.f16033f == null) {
            return;
        }
        synchronized (this) {
            if (!this.f16030c) {
                try {
                    if (this.f16031d.b()) {
                        this.f16029b = new LocalServerSocket(this.f16028a);
                        this.f16030c = true;
                        this.f16032e.b(this.f16033f);
                        this.f16035h.start();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public synchronized void b(Um<String> um) {
        this.f16034g.remove(um);
    }
}
