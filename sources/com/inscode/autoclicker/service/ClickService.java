package com.inscode.autoclicker.service;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Path;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.app.s;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.ui.prepare.PrepareActivity;
import fd.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import jc.w;
import kc.c0;
import kc.m;
import r6.k;
import vc.b0;
import vc.l;
import y6.a3;
import y6.l1;
import y6.u2;

/* JADX INFO: loaded from: classes2.dex */
public final class ClickService extends AccessibilityService {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f13099n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static ClickService f13100o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gc.a<y6.b> f13101c = new gc.a<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jc.e f13102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jc.e f13103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final nb.a f13104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nb.a f13105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f13106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jc.e f13107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jc.e f13108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jc.e f13109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f13110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f13111m;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GestureDescription f13112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.inscode.autoclicker.utils.b f13113b;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public b(GestureDescription gestureDescription, com.inscode.autoclicker.utils.b bVar) {
            this.f13112a = gestureDescription;
            this.f13113b = bVar;
        }

        public /* synthetic */ b(GestureDescription gestureDescription, com.inscode.autoclicker.utils.b bVar, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? null : gestureDescription, (i10 & 2) != 0 ? null : bVar);
        }
    }

    public static final class c extends l implements uc.a<AudioManager> {
        public c() {
            super(0);
        }

        @Override // uc.a
        public AudioManager invoke() {
            Object systemService = ClickService.this.getSystemService("audio");
            j0.g(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return (AudioManager) systemService;
        }
    }

    public static final class d extends l implements uc.l<Throwable, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f13115c = new d();

        public d() {
            super(1);
        }

        @Override // uc.l
        public w invoke(Throwable th) {
            Throwable th2 = th;
            j0.i(th2, "it");
            xe.a.f37601c.b("[ClickService] Error: PrepareBus: " + th2, new Object[0]);
            return w.f31842a;
        }
    }

    public static final class e extends l implements uc.l<b, w> {
        public e() {
            super(1);
        }

        @Override // uc.l
        public w invoke(b bVar) {
            b bVar2 = bVar;
            if (((r6.e) ClickService.this.f13103e.getValue()).n()) {
                ClickService clickService = ClickService.this;
                clickService.f13106h.post(new s(clickService, bVar2));
            } else {
                ClickService.a(ClickService.this, bVar2);
            }
            return w.f31842a;
        }
    }

    public static final class f extends BroadcastReceiver {
        public f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!j0.d(intent != null ? intent.getAction() : null, "android.intent.action.SCREEN_OFF")) {
                if (j0.d(intent != null ? intent.getAction() : null, "android.intent.action.SCREEN_ON")) {
                    ClickService.this.f13106h.removeCallbacksAndMessages(null);
                }
            } else {
                ClickService.this.f13101c.d(l1.f38284a);
                if (((r6.e) ClickService.this.f13103e.getValue()).m()) {
                    ClickService.this.f13106h.removeCallbacksAndMessages(null);
                    ClickService clickService = ClickService.this;
                    clickService.f13106h.postDelayed(new y6.f(clickService), AbstractComponentTracker.LINGERING_TIMEOUT);
                }
            }
        }
    }

    public static final class g extends l implements uc.a<q6.b> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13121f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13118c = componentCallbacks;
            this.f13119d = str;
            this.f13120e = aVar;
            this.f13121f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, q6.b] */
        @Override // uc.a
        public final q6.b invoke() {
            return fd.f.d(this.f13118c).f37311a.c(new yd.h(this.f13119d, b0.a(q6.b.class), this.f13120e, this.f13121f));
        }
    }

    public static final class h extends l implements uc.a<r6.e> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13122c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13123d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13124e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13125f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13122c = componentCallbacks;
            this.f13123d = str;
            this.f13124e = aVar;
            this.f13125f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, r6.e] */
        @Override // uc.a
        public final r6.e invoke() {
            return fd.f.d(this.f13122c).f37311a.c(new yd.h(this.f13123d, b0.a(r6.e.class), this.f13124e, this.f13125f));
        }
    }

    public static final class i extends l implements uc.a<a3> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13128e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13129f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13126c = componentCallbacks;
            this.f13127d = str;
            this.f13128e = aVar;
            this.f13129f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, y6.a3] */
        @Override // uc.a
        public final a3 invoke() {
            return fd.f.d(this.f13126c).f37311a.c(new yd.h(this.f13127d, b0.a(a3.class), this.f13128e, this.f13129f));
        }
    }

    public static final class j extends l implements uc.a<u2> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f13130c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13131d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ de.a f13132e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ uc.a f13133f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, String str, de.a aVar, uc.a aVar2) {
            super(0);
            this.f13130c = componentCallbacks;
            this.f13131d = str;
            this.f13132e = aVar;
            this.f13133f = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, y6.u2] */
        @Override // uc.a
        public final u2 invoke() {
            return fd.f.d(this.f13130c).f37311a.c(new yd.h(this.f13131d, b0.a(u2.class), this.f13132e, this.f13133f));
        }
    }

    public ClickService() {
        ae.b bVar = ae.b.f348c;
        this.f13102d = jc.f.b(new g(this, "", null, bVar));
        this.f13103e = jc.f.b(new h(this, "", null, bVar));
        this.f13104f = new nb.a();
        this.f13105g = new nb.a();
        this.f13106h = new Handler(Looper.getMainLooper());
        this.f13107i = jc.f.b(new c());
        this.f13108j = jc.f.b(new i(this, "", null, bVar));
        this.f13109k = jc.f.b(new j(this, "", null, bVar));
        this.f13110l = new f();
    }

    public static final void a(ClickService clickService, b bVar) {
        Objects.requireNonNull(clickService);
        if (bVar == null) {
            return;
        }
        try {
            GestureDescription gestureDescription = bVar.f13112a;
            if ((gestureDescription != null) && gestureDescription != null) {
                y6.a.f38093c.a(clickService, gestureDescription, new y6.e(clickService), clickService.f13106h);
                return;
            }
            com.inscode.autoclicker.utils.b bVar2 = bVar.f13113b;
            if (bVar2 != null) {
                int type = bVar2.getType();
                if (type == com.inscode.autoclicker.utils.b.BACK_BUTTON.getType()) {
                    clickService.performGlobalAction(1);
                } else if (type == com.inscode.autoclicker.utils.b.APPS_BUTTON.getType()) {
                    clickService.performGlobalAction(3);
                } else if (type == com.inscode.autoclicker.utils.b.SCREENSHOT_BUTTON.getType()) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        clickService.performGlobalAction(9);
                    }
                } else if (type == com.inscode.autoclicker.utils.b.HOME_BUTTON.getType()) {
                    clickService.performGlobalAction(2);
                }
            }
            clickService.c().a();
        } catch (Exception e10) {
            xe.a.f37601c.b(d0.b.a(e10, d0.c.a("[ClickService] Dispatch Exception: ", e10, ' ')), new Object[0]);
            e10.printStackTrace();
            clickService.c().a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x018c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final b b(List<r6.d> list, boolean z10) {
        int i10;
        int iNextIndex;
        GestureDescription.Builder builder = new GestureDescription.Builder();
        Iterator<T> it = list.iterator();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = 2;
            GestureDescription gestureDescription = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            if (!it.hasNext()) {
                return new b(builder.build(), objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0);
            }
            Object next = it.next();
            int i14 = i12 + 1;
            if (i12 < 0) {
                kc.l.i();
                throw null;
            }
            r6.d dVar = (r6.d) next;
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it2 = bd.e.h(i11, 2).iterator();
            while (it2.hasNext()) {
                ((c0) it2).a();
                arrayList.add(new Path());
            }
            List<r6.c> listA = dVar.a();
            ArrayList<r6.c> arrayList2 = new ArrayList(m.j(listA, 10));
            Iterator<T> it3 = listA.iterator();
            while (it3.hasNext()) {
                arrayList2.add(r6.c.a((r6.c) it3.next(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, 0L, 0, 0, 31));
            }
            int i15 = 5;
            if (z10) {
                for (r6.c cVar : arrayList2) {
                    float fE = cVar.e();
                    bd.c cVar2 = new bd.c(-5, 5);
                    zc.c.a aVar = zc.c.f45275c;
                    cVar.g(fE + bd.e.f(cVar2, aVar));
                    cVar.h(cVar.f() + bd.e.f(new bd.c(-5, 5), aVar));
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList2) {
                Integer numValueOf = Integer.valueOf(((r6.c) obj).b());
                Object arrayList3 = linkedHashMap.get(numValueOf);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(numValueOf, arrayList3);
                }
                ((List) arrayList3).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                List listSubList = (List) entry.getValue();
                int i16 = 6;
                int i17 = 1;
                if (!(listSubList instanceof Collection) || !listSubList.isEmpty()) {
                    Iterator it4 = listSubList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            i10 = i11;
                            break;
                        }
                        if ((((r6.c) it4.next()).d() == 6 ? 1 : i11) != 0) {
                            i10 = 1;
                            break;
                        }
                    }
                } else {
                    i10 = i11;
                    break;
                }
                if (i10 != 0) {
                    ListIterator listIterator = listSubList.listIterator(listSubList.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            iNextIndex = -1;
                            break;
                        }
                        if ((((r6.c) listIterator.previous()).d() == 6 ? 1 : i11) != 0) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    }
                    listSubList = listSubList.subList(i11, iNextIndex);
                }
                Path path = (Path) arrayList.get(iIntValue);
                int i18 = i11;
                for (Object obj2 : listSubList) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kc.l.i();
                        throw null;
                    }
                    r6.c cVar3 = (r6.c) obj2;
                    int iD = cVar3.d();
                    if (iD != i17) {
                        if (iD == i16) {
                            if (iIntValue > 0) {
                                path.lineTo(cVar3.e(), cVar3.f());
                            }
                        } else if (iD == i15) {
                            if (iIntValue > 0) {
                                path.moveTo(cVar3.e(), cVar3.f());
                            }
                        } else if (iD != 0) {
                            com.inscode.autoclicker.utils.b bVar = com.inscode.autoclicker.utils.b.BACK_BUTTON;
                            if (iD == bVar.getType()) {
                                return new b(objArr4 == true ? 1 : 0, bVar, i17, objArr3 == true ? 1 : 0);
                            }
                            com.inscode.autoclicker.utils.b bVar2 = com.inscode.autoclicker.utils.b.APPS_BUTTON;
                            if (iD == bVar2.getType()) {
                                return new b(objArr6 == true ? 1 : 0, bVar2, i17, objArr5 == true ? 1 : 0);
                            }
                            com.inscode.autoclicker.utils.b bVar3 = com.inscode.autoclicker.utils.b.SCREENSHOT_BUTTON;
                            if (iD == bVar3.getType()) {
                                return new b(objArr8 == true ? 1 : 0, bVar3, i17, objArr7 == true ? 1 : 0);
                            }
                            com.inscode.autoclicker.utils.b bVar4 = com.inscode.autoclicker.utils.b.HOME_BUTTON;
                            if (iD == bVar4.getType()) {
                                return new b(objArr10 == true ? 1 : 0, bVar4, i17, objArr9 == true ? 1 : 0);
                            }
                            if (iD == com.inscode.autoclicker.utils.b.NONE.getType()) {
                                return new b(gestureDescription, objArr12 == true ? 1 : 0, 3, objArr11 == true ? 1 : 0);
                            }
                            if (i19 < listSubList.size()) {
                                r6.c cVar4 = (r6.c) listSubList.get(i19);
                                path.quadTo(cVar3.e(), cVar3.f(), cVar4.e(), cVar4.f());
                            } else {
                                path.lineTo(cVar3.e(), cVar3.f());
                            }
                        } else if (iIntValue == 0) {
                            path.moveTo(cVar3.e(), cVar3.f());
                        }
                    }
                    i18 = i19;
                    i15 = 5;
                    i16 = 6;
                    i17 = 1;
                }
                float fMax = Math.max(1.0f, (dVar.c() * 0.9f) / ((float) dVar.d()));
                Path path2 = (Path) arrayList.get(iIntValue);
                if (!path2.isEmpty()) {
                    builder.addStroke(new GestureDescription.StrokeDescription(path2, 0L, (long) fMax));
                }
                i11 = 0;
                i15 = 5;
            }
            i12 = i14;
        }
    }

    public final q6.b c() {
        return (q6.b) this.f13102d.getValue();
    }

    public final void d() {
        this.f13105g.d();
        e();
    }

    public final void e() {
        gc.c<Object> cVar = c().f34782b;
        lb.l lVar = fc.a.f29534b;
        nb.b bVarE = ec.a.e(cVar.u(lVar).p(lVar).o(new d0.a(this)), d.f13115c, null, new e(), 2);
        p6.b.a(bVarE, "$receiver", this.f13105g, "compositeDisposable", bVarE);
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        j0.i(accessibilityEvent, "event");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            f13100o = this;
            if (PrepareActivity.Companion.getSTARTED_BY_USER()) {
                startActivity(new Intent(this, (Class<?>) PrepareActivity.class).addFlags(268435456));
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            registerReceiver(this.f13110l, intentFilter);
            e();
        } catch (Exception e10) {
            xe.a.f37601c.b("[ClickService] Error onCreate: " + e10, new Object[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        xe.a.f37601c.b("[ClickService] AccessibilityService destroy.", new Object[0]);
        this.f13105g.d();
        this.f13104f.d();
        super.onDestroy();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
        xe.a.f37601c.b("[ClickService] AccessibilityService onInterrupt.", new Object[0]);
    }

    @Override // android.accessibilityservice.AccessibilityService
    public boolean onKeyEvent(KeyEvent keyEvent) {
        if (!(((u2) this.f13109k.getValue()).f38398b != k.NONE)) {
            return super.onKeyEvent(keyEvent);
        }
        if (!((r6.e) this.f13103e.getValue()).o()) {
            return super.onKeyEvent(keyEvent);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ClickService] OnKeyEvent: ");
        sb2.append(keyEvent);
        sb2.append(' ');
        sb2.append(keyEvent != null ? Long.valueOf(keyEvent.getDownTime()) : null);
        sb2.append(' ');
        sb2.append(keyEvent != null ? Long.valueOf(keyEvent.getEventTime()) : null);
        xe.a.c cVar = xe.a.f37601c;
        cVar.a(sb2.toString(), new Object[0]);
        if (!(keyEvent != null && keyEvent.getKeyCode() == 24)) {
            return super.onKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0) {
            this.f13111m = keyEvent.getEventTime();
        }
        if (keyEvent.getAction() == 1) {
            if (keyEvent.getEventTime() - this.f13111m > 700) {
                ((a3) this.f13108j.getValue()).f38104a.e();
                cVar.a("Long press detected", new Object[0]);
            } else {
                cVar.a("Normal press - adjusting volume", new Object[0]);
                ((AudioManager) this.f13107i.getValue()).adjustStreamVolume(3, 1, 5);
            }
            this.f13111m = 0L;
        }
        return true;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        xe.a.f37601c.b("[ClickService] Low Memory detected.", new Object[0]);
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onServiceConnected() {
        super.onServiceConnected();
        try {
            f13100o = this;
            if (PrepareActivity.Companion.getSTARTED_BY_USER()) {
                startActivity(new Intent(this, (Class<?>) PrepareActivity.class).addFlags(268435456));
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            registerReceiver(this.f13110l, intentFilter);
            e();
        } catch (Exception e10) {
            xe.a.f37601c.b("[ClickService] Error onServiceConnected: " + e10, new Object[0]);
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        xe.a.f37601c.a(android.support.v4.media.a.a("Trim memory level: ", i10), new Object[0]);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        StringBuilder sbA = defpackage.a.a("[ClickService] AccessibilityService onUnbind: ");
        sbA.append(intent != null ? intent.getAction() : null);
        sbA.append(' ');
        sbA.append(intent != null ? intent.getType() : null);
        sbA.append(' ');
        sbA.append(intent != null ? intent.getType() : null);
        xe.a.f37601c.b(sbA.toString(), new Object[0]);
        return super.onUnbind(intent);
    }
}
