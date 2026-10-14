package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.yandex.metrica.MetricaService;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1737ji implements Runnable, InterfaceC1663gi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ServiceConnection f16451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f16452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f16453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, InterfaceC1538bi> f16454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f16455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f16456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ServerSocket f16457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Ei f16458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C2046vn f16459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final W0 f16460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final M0.d f16461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Zh f16462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Zh f16463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1638fi f16464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final C2146zn f16465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Vm<Ei, List<Integer>> f16466p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Yh f16467q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1712ii f16468r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f16469s;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ji$a */
    public class a implements ServiceConnection {
        public a(RunnableC1737ji runnableC1737ji) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ji$b */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 100) {
                return;
            }
            RunnableC1737ji.this.c();
            try {
                RunnableC1737ji.this.f16455e.unbindService(RunnableC1737ji.this.f16451a);
            } catch (Throwable unused) {
                RunnableC1737ji.this.f16460j.reportEvent("socket_unbind_has_thrown_exception");
            }
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ji$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC1737ji runnableC1737ji = RunnableC1737ji.this;
            RunnableC1737ji.a(runnableC1737ji, runnableC1737ji.f16458h);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ji$d */
    public class d extends HashMap<String, InterfaceC1538bi> {

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ji$d$a */
        public class a implements InterfaceC1538bi {
            public a() {
            }

            @Override // com.yandex.metrica.impl.ob.InterfaceC1538bi
            public AbstractC1513ai a(Socket socket, Uri uri, C1688hi c1688hi) {
                RunnableC1737ji runnableC1737ji = RunnableC1737ji.this;
                return new Qh(socket, uri, runnableC1737ji, runnableC1737ji.f16458h, RunnableC1737ji.this.f16467q.a(), c1688hi);
            }
        }

        /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ji$d$b */
        public class b implements InterfaceC1538bi {
            public b() {
            }

            @Override // com.yandex.metrica.impl.ob.InterfaceC1538bi
            public AbstractC1513ai a(Socket socket, Uri uri, C1688hi c1688hi) {
                RunnableC1737ji runnableC1737ji = RunnableC1737ji.this;
                return new C1588di(socket, uri, runnableC1737ji, runnableC1737ji.f16458h, c1688hi);
            }
        }

        public d() {
            put("p", new a());
            put(IntegerTokenConverter.CONVERTER_KEY, new b());
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ji$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC1737ji.f(RunnableC1737ji.this);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ji$f */
    public enum f {
        OK,
        SHOULD_RETRY,
        ORDINARY_FAIL
    }

    public RunnableC1737ji(Context context, Qi qi, M0 m10, C2146zn c2146zn, W0 w10, Zh zh, Zh zh2, Yh yh, C1712ii c1712ii, InterfaceC1638fi interfaceC1638fi, Vm<Ei, List<Integer>> vm, String str) {
        this.f16451a = new a(this);
        this.f16452b = new b(Looper.getMainLooper());
        this.f16453c = new c();
        this.f16454d = new d();
        this.f16455e = context;
        this.f16460j = w10;
        this.f16462l = zh;
        this.f16463m = zh2;
        this.f16464n = interfaceC1638fi;
        this.f16466p = vm;
        this.f16465o = c2146zn;
        this.f16467q = yh;
        this.f16468r = c1712ii;
        String str2 = String.format("[YandexUID%sServer]", str);
        this.f16469s = str2;
        this.f16461k = m10.a(new e(), c2146zn.b(), str2);
        b(qi.M());
        Ei ei = this.f16458h;
        if (ei != null) {
            c(ei);
        }
    }

    public RunnableC1737ji(Context context, Qi qi, InterfaceC1638fi interfaceC1638fi, Vm<Ei, List<Integer>> vm, Wh wh, Wh wh2, String str) {
        this(context, qi, P0.i().h(), P0.i().s(), Oh.a(), new Zh("open", wh), new Zh("port_already_in_use", wh2), new Yh(context, qi), new C1712ii(), interfaceC1638fi, vm, str);
    }

    private synchronized f a(Ei ei) {
        f fVar;
        Integer next;
        Throwable th;
        InterfaceC1638fi.a e10;
        Iterator<Integer> it = this.f16466p.a(ei).iterator();
        Integer num = null;
        fVar = f.ORDINARY_FAIL;
        while (this.f16457g == null && it.hasNext()) {
            try {
                next = it.next();
                if (next != null) {
                    try {
                        this.f16457g = this.f16464n.a(next.intValue());
                        fVar = f.OK;
                        this.f16462l.a(this, next.intValue(), ei);
                    } catch (InterfaceC1638fi.a e11) {
                        e10 = e11;
                        String message = e10.getMessage();
                        Throwable cause = e10.getCause();
                        if (cause != null && message != null) {
                            Map<String, Object> mapA = a(next);
                            ((HashMap) mapA).put("exception", Log.getStackTraceString(cause));
                            this.f16460j.reportEvent(b(message), mapA);
                        }
                    } catch (BindException unused) {
                        num = next;
                        fVar = f.SHOULD_RETRY;
                        this.f16463m.a(this, num.intValue(), ei);
                    } catch (Throwable th2) {
                        th = th2;
                        Map<String, Object> mapA2 = a(next);
                        ((HashMap) mapA2).put("exception", Log.getStackTraceString(th));
                        this.f16460j.reportEvent(b("open_error"), mapA2);
                    }
                }
            } catch (InterfaceC1638fi.a e12) {
                next = num;
                e10 = e12;
            } catch (BindException unused2) {
            } catch (Throwable th3) {
                next = num;
                th = th3;
            }
            num = next;
        }
        return fVar;
    }

    private Map<String, Object> a(int i10, C1688hi c1688hi) {
        Map<String, Object> mapA = a(Integer.valueOf(i10));
        HashMap map = (HashMap) mapA;
        map.put("idle_interval", Double.valueOf(this.f16468r.b()));
        map.put("background_interval", Double.valueOf(this.f16468r.a()));
        map.put("request_read_time", Long.valueOf(c1688hi.d()));
        map.put("response_form_time", Long.valueOf(c1688hi.e()));
        map.put("response_send_time", Long.valueOf(c1688hi.f()));
        return mapA;
    }

    private Map<String, Object> a(Integer num) {
        HashMap map = new HashMap();
        map.put("port", num == null ? "" : String.valueOf(num));
        return map;
    }

    public static void a(RunnableC1737ji runnableC1737ji, Ei ei) {
        synchronized (runnableC1737ji) {
            if (ei != null) {
                runnableC1737ji.c(ei);
            }
        }
    }

    private String b(String str) {
        return i.f.a("socket_", str);
    }

    private void b(Ei ei) {
        this.f16458h = ei;
        if (ei != null) {
            this.f16461k.a(ei.f13917e);
        }
    }

    private synchronized void c(Ei ei) {
        if (!this.f16456f && this.f16461k.a(ei.f13918f)) {
            this.f16456f = true;
        }
    }

    public static void f(RunnableC1737ji runnableC1737ji) {
        Objects.requireNonNull(runnableC1737ji);
        Intent intent = new Intent(runnableC1737ji.f16455e, (Class<?>) MetricaService.class);
        intent.setAction("com.yandex.metrica.ACTION_BIND_TO_LOCAL_SERVER");
        try {
            if (!runnableC1737ji.f16455e.bindService(intent, runnableC1737ji.f16451a, 1)) {
                runnableC1737ji.f16460j.reportEvent("socket_bind_has_failed");
            }
        } catch (Throwable unused) {
            runnableC1737ji.f16460j.reportEvent("socket_bind_has_thrown_exception");
        }
        C2046vn c2046vnB = runnableC1737ji.f16465o.b(runnableC1737ji);
        runnableC1737ji.f16459i = c2046vnB;
        c2046vnB.start();
        runnableC1737ji.f16468r.d();
    }

    public void a() {
        this.f16452b.removeMessages(100);
        this.f16468r.e();
    }

    public synchronized void a(Qi qi) {
        Ei eiM = qi.M();
        synchronized (this) {
            if (eiM != null) {
                c(eiM);
            }
        }
    }

    public void a(String str) {
        this.f16460j.reportEvent(b(str));
    }

    public void a(String str, Integer num) {
        this.f16460j.reportEvent(b(str), a(num));
    }

    public void a(String str, String str2) {
        HashMap mapA = com.applovin.impl.mediation.b.a.c.a("uri", str2);
        this.f16460j.reportEvent("socket_" + str, mapA);
    }

    public void a(String str, Throwable th) {
        this.f16460j.reportError(b(str), th);
    }

    public void a(Map<String, Object> map, int i10, C1688hi c1688hi) {
        Map<String, Object> mapA = a(i10, c1688hi);
        ((HashMap) mapA).put("params", map);
        this.f16460j.reportEvent(b("reversed_sync_succeed"), mapA);
    }

    public synchronized void b() {
        if (this.f16456f) {
            a();
            Handler handler = this.f16452b;
            handler.sendMessageDelayed(handler.obtainMessage(100), TimeUnit.SECONDS.toMillis(this.f16458h.f13913a));
            this.f16468r.c();
        }
    }

    public void b(int i10, C1688hi c1688hi) {
        this.f16460j.reportEvent(b("sync_succeed"), a(i10, c1688hi));
    }

    public synchronized void b(Qi qi) {
        this.f16467q.a(qi);
        Ei eiM = qi.M();
        if (eiM != null) {
            this.f16458h = eiM;
            this.f16461k.a(eiM.f13917e);
            c(eiM);
        } else {
            c();
            b((Ei) null);
        }
    }

    public synchronized void c() {
        try {
            this.f16456f = false;
            C2046vn c2046vn = this.f16459i;
            if (c2046vn != null) {
                c2046vn.d();
                this.f16459i = null;
            }
            ServerSocket serverSocket = this.f16457g;
            if (serverSocket != null) {
                serverSocket.close();
                this.f16457g = null;
            }
        } catch (IOException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Socket socketAccept;
        ServerSocket serverSocket;
        synchronized (this) {
            Ei ei = this.f16458h;
            if (ei != null && a(ei) == f.SHOULD_RETRY) {
                this.f16456f = false;
                long j10 = this.f16458h.f13922j;
                C1941rn c1941rn = (C1941rn) this.f16465o.b();
                c1941rn.a(this.f16453c);
                c1941rn.a(this.f16453c, j10, TimeUnit.SECONDS);
                return;
            }
            if (U2.a(26)) {
                TrafficStats.setThreadStatsTag(40230);
            }
            if (this.f16457g != null) {
                while (this.f16456f) {
                    synchronized (this) {
                        socketAccept = null;
                        serverSocket = this.f16456f ? this.f16457g : null;
                    }
                    if (serverSocket != null) {
                        try {
                            socketAccept = serverSocket.accept();
                            C1688hi c1688hi = new C1688hi(new Nm(), new Mm());
                            if (U2.a(26)) {
                                TrafficStats.tagSocket(socketAccept);
                            }
                            new C1563ci(socketAccept, this, this.f16454d, c1688hi).a();
                            if (socketAccept != null) {
                                try {
                                    socketAccept.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable unused2) {
                            if (socketAccept != null) {
                            }
                        }
                    }
                }
            }
        }
    }
}
