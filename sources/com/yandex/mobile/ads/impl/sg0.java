package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class sg0 implements mn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25084a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s71 f25086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25087d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final z20 f25089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final k6 f25090g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a30 f25092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f25094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f25095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f25096m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f25085b = new b(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f25088e = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i01 f25091h = i01.b();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f25097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f25098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f25099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f25100d;

        public a(int i10, long j10, String str) {
            this.f25097a = str;
            this.f25098b = j10;
            this.f25099c = i10;
        }
    }

    public static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            sg0 sg0Var;
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                sg0 sg0Var2 = (sg0) ((WeakReference) pair.first).get();
                if (sg0Var2 != null) {
                    a aVar = (a) pair.second;
                    x60.d("handleMessage, clazz = %s", sg0Var2.f25087d);
                    la1 la1VarA = sg0.a(sg0Var2, aVar);
                    sg0.a(sg0Var2, aVar, la1VarA);
                    if (!(la1VarA.e() == la1.a.f22656b)) {
                        aVar.f25100d = null;
                        sg0Var2.b();
                        return;
                    } else {
                        sg0Var2.f25088e.remove(aVar);
                        if (sg0Var2.f25088e.isEmpty()) {
                            sg0Var2.a(la1VarA.c());
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (i10 == 2 && (sg0Var = (sg0) ((WeakReference) message.obj).get()) != null) {
                x60.d("mNoticeTrackingChecker mNotTrackedNotices.size = %d, clazz = %s", Integer.valueOf(sg0Var.f25088e.size()), sg0Var.f25087d);
                int size = sg0Var.f25088e.size();
                for (int i11 = 0; i11 < size; i11++) {
                    a aVar2 = (a) sg0Var.f25088e.get(i11);
                    la1 la1VarA2 = sg0.a(sg0Var, aVar2);
                    if (la1VarA2.e() == la1.a.f22656b) {
                        if (aVar2.f25100d == null) {
                            aVar2.f25100d = Long.valueOf(SystemClock.elapsedRealtime());
                        }
                        if (SystemClock.elapsedRealtime() - aVar2.f25100d.longValue() >= aVar2.f25098b) {
                            sg0Var.f25085b.sendMessage(Message.obtain(sg0Var.f25085b, 1, new Pair(new WeakReference(sg0Var), aVar2)));
                        }
                        sg0Var.b(la1VarA2.d());
                    } else {
                        aVar2.f25100d = null;
                        sg0Var.a(la1VarA2);
                    }
                }
                if (sg0.d(sg0Var)) {
                    sg0Var.f25085b.sendMessageDelayed(Message.obtain(sg0Var.f25085b, 2, new WeakReference(sg0Var)), 200L);
                }
            }
        }
    }

    public sg0(Context context, k2 k2Var, z20 z20Var, s71 s71Var, String str) {
        this.f25084a = context;
        this.f25086c = s71Var;
        this.f25089f = z20Var;
        this.f25087d = str;
        this.f25090g = new k6(context, k2Var);
    }

    public static la1 a(sg0 sg0Var, a aVar) {
        la1 la1VarB = sg0Var.f25086c.b(aVar.f25099c);
        x60.d("validateTrackingState(), validationResult = %s", la1VarB.e().a());
        return la1VarB;
    }

    public static void a(sg0 sg0Var, a aVar, la1 la1Var) {
        synchronized (sg0Var) {
            if (la1Var.e() == la1.a.f22656b) {
                sg0Var.f25090g.a(aVar.f25097a);
            } else {
                sg0Var.a(la1Var);
            }
        }
    }

    public static boolean d(sg0 sg0Var) {
        boolean z10;
        synchronized (sg0Var) {
            z10 = sg0Var.f25088e.size() > 0;
        }
        return z10;
    }

    @Override // com.yandex.mobile.ads.impl.mn0
    public final synchronized void a() {
        StringBuilder sbA = v60.a("stopTracking(), clazz = ");
        sbA.append(this.f25087d);
        x60.d(sbA.toString(), new Object[0]);
        this.f25085b.removeMessages(2);
        this.f25085b.removeMessages(1);
        Iterator it = this.f25088e.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f25100d = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.mn0
    public final synchronized void a(Intent intent, boolean z10) {
        byte b10 = 0;
        x60.d("handleIntent(), intent = %s, isAdVisible = %b, clazz = %s", intent, Boolean.valueOf(z10), this.f25087d);
        String action = intent.getAction();
        Objects.requireNonNull(action);
        int iHashCode = action.hashCode();
        if (iHashCode != -2128145023) {
            if (iHashCode != -1454123155) {
                b10 = (iHashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) ? (byte) 2 : (byte) -1;
            } else if (action.equals("android.intent.action.SCREEN_ON")) {
                b10 = 1;
            }
        } else if (!action.equals("android.intent.action.SCREEN_OFF")) {
        }
        if (b10 == 0) {
            a();
        } else if ((b10 == 1 || b10 == 2) && z10) {
            b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mn0
    public final synchronized void a(AdResponse adResponse, List<g11> list) {
        StringBuilder sbA = v60.a("updateNotices(), clazz = ");
        sbA.append(this.f25087d);
        x60.d(sbA.toString(), new Object[0]);
        this.f25089f.a(adResponse);
        this.f25088e.clear();
        this.f25094k = 0;
        this.f25093j = false;
        this.f25095l = false;
        this.f25096m = false;
        a();
        synchronized (this) {
            for (g11 g11Var : list) {
                String strB = g11Var.b();
                long jA = g11Var.a();
                this.f25088e.add(new a(g11Var.c(), jA, strB));
            }
        }
    }

    public final synchronized void a(fw0.b bVar) {
        HashMap map = new HashMap();
        map.put("failure_tracked", Boolean.valueOf(this.f25093j));
        this.f25089f.a(bVar, map);
        a30 a30Var = this.f25092i;
        if (a30Var != null) {
            a30Var.f();
        }
    }

    public final synchronized void a(la1 la1Var) {
        int i10 = this.f25094k + 1;
        this.f25094k = i10;
        if (i10 == 20) {
            this.f25089f.b(la1Var);
            this.f25093j = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.mn0
    public final void a(v20 v20Var) {
        this.f25092i = v20Var;
    }

    @Override // com.yandex.mobile.ads.impl.mn0
    public final synchronized void b() {
        boolean z10;
        StringBuilder sbA = v60.a("startTrackingIfNeeded(), clazz = ");
        sbA.append(this.f25087d);
        x60.d(sbA.toString(), new Object[0]);
        if (kq0.a().b(this.f25084a)) {
            Collection[] collectionArr = {this.f25088e};
            int i10 = 0;
            while (true) {
                if (i10 < 1) {
                    Collection collection = collectionArr[i10];
                    if (collection != null && !collection.isEmpty()) {
                        i10++;
                    }
                    z10 = true;
                    break;
                }
                z10 = false;
                break;
            }
            if (!z10) {
                synchronized (this) {
                    if ((this.f25088e.size() > 0) && !this.f25085b.hasMessages(2)) {
                        b bVar = this.f25085b;
                        bVar.sendMessage(Message.obtain(bVar, 2, new WeakReference(this)));
                    }
                }
            }
        }
    }

    public final synchronized void b(fw0.b bVar) {
        if (!this.f25095l) {
            this.f25089f.a(bVar);
            x60.d("Ad binding successful", new Object[0]);
            this.f25095l = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x002d A[SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.mn0
    public final synchronized void c() {
        fw0.b bVarC;
        ArrayList arrayList;
        la1 la1VarB;
        la1.a aVar;
        boolean z10;
        x60.d("forceTracking(), mNotTrackedNotices.size = %d, clazz = %s", Integer.valueOf(this.f25088e.size()), this.f25087d);
        a();
        bVarC = fw0.b.f20896w;
        arrayList = new ArrayList();
        this.f25096m = false;
        for (a aVar2 : this.f25088e) {
            nz0 nz0VarA = this.f25091h.a(this.f25084a);
            la1VarB = nz0VarA != null ? nz0VarA.H() : false ? this.f25086c.b(aVar2.f25099c) : this.f25086c.a(aVar2.f25099c);
            x60.d("validateTrackingState(), validationResult = %s", la1VarB.e().a());
            synchronized (this) {
                synchronized (this) {
                    la1.a aVarE = la1VarB.e();
                    aVar = la1.a.f22656b;
                    if (aVarE == aVar) {
                        this.f25090g.a(aVar2.f25097a);
                    } else {
                        a(la1VarB);
                    }
                }
            }
            if (la1VarB.e() == aVar) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(aVar2);
                bVarC = la1VarB.c();
                b(la1VarB.d());
            }
        }
        if (!arrayList.isEmpty()) {
            this.f25088e.removeAll(arrayList);
            if (this.f25088e.isEmpty()) {
                a(bVarC);
            }
        }
        b();
        return;
        if (!this.f25096m) {
            if (!(la1VarB.e() == aVar)) {
                this.f25089f.a(la1VarB);
                this.f25096m = true;
            }
        }
        if (la1VarB.e() == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.add(aVar2);
            bVarC = la1VarB.c();
            b(la1VarB.d());
        }
    }
}
