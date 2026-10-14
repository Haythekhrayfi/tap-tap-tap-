package i8;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import y9.l1;
import y9.o8;

/* JADX INFO: loaded from: classes2.dex */
public class q0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f31409h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f31410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f31411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f31412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f31413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap<View, y9.k> f31414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f31415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f31416g;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    public static final class b extends vc.l implements uc.l<Map<g, ? extends o8>, jc.w> {
        public b() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(Map<g, ? extends o8> map) {
            Map<g, ? extends o8> map2 = map;
            fd.j0.i(map2, "emptyToken");
            q0.this.f31412c.removeCallbacksAndMessages(map2);
            return jc.w.f31842a;
        }
    }

    public static final class c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f31418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l1 f31419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q0 f31420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ View f31421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ y9.k f31422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List f31423h;

        public c(k kVar, l1 l1Var, q0 q0Var, View view, y9.k kVar2, List list) {
            this.f31418c = kVar;
            this.f31419d = l1Var;
            this.f31420e = q0Var;
            this.f31421f = view;
            this.f31422g = kVar2;
            this.f31423h = list;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            fd.j0.i(view, "view");
            view.removeOnLayoutChangeListener(this);
            if (fd.j0.d(this.f31418c.getDivData(), this.f31419d)) {
                q0.a(this.f31420e, this.f31418c, this.f31421f, this.f31422g, this.f31423h);
            }
        }
    }

    static {
        new a(null);
    }

    public q0(z0 z0Var, n0 n0Var) {
        fd.j0.i(z0Var, "viewVisibilityCalculator");
        fd.j0.i(n0Var, "visibilityActionDispatcher");
        this.f31410a = z0Var;
        this.f31411b = n0Var;
        this.f31412c = new Handler(Looper.getMainLooper());
        this.f31413d = new t0();
        this.f31414e = new WeakHashMap<>();
        this.f31416g = new androidx.activity.c(this);
    }

    public static final void a(q0 q0Var, k kVar, View view, y9.k kVar2, List list) {
        Objects.requireNonNull(q0Var);
        e9.a.b();
        z0 z0Var = q0Var.f31410a;
        Objects.requireNonNull(z0Var);
        fd.j0.i(view, "view");
        int iHeight = (view.isShown() && view.getGlobalVisibleRect(z0Var.f31502a)) ? ((z0Var.f31502a.height() * z0Var.f31502a.width()) * 100) / (view.getHeight() * view.getWidth()) : 0;
        if (iHeight > 0) {
            q0Var.f31414e.put(view, kVar2);
        } else {
            q0Var.f31414e.remove(view);
        }
        if (!q0Var.f31415f) {
            q0Var.f31415f = true;
            q0Var.f31412c.post(q0Var.f31416g);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long lValueOf = Long.valueOf(((o8) obj).f41860g.b(kVar.getExpressionResolver()).longValue());
            Object arrayList = linkedHashMap.get(lValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            List list2 = (List) entry.getValue();
            ArrayList<o8> arrayList2 = new ArrayList(list2.size());
            for (Object obj2 : list2) {
                if (q0Var.c(kVar, view, (o8) obj2, iHeight)) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                HashMap map = new HashMap(arrayList2.size(), 1.0f);
                for (o8 o8Var : arrayList2) {
                    g gVarF = x1.q.f(kVar, o8Var);
                    e9.c cVar = e9.c.f29122a;
                    jc.h hVar = new jc.h(gVarF, o8Var);
                    map.put(hVar.f31811c, hVar.f31812d);
                }
                Map<g, o8> mapSynchronizedMap = Collections.synchronizedMap(map);
                t0 t0Var = q0Var.f31413d;
                fd.j0.h(mapSynchronizedMap, "logIds");
                Objects.requireNonNull(t0Var);
                fd.j0.i(mapSynchronizedMap, "logIds");
                k9.j<Map<g, o8>> jVar = t0Var.f31439a;
                synchronized (jVar.f31953a) {
                    jVar.f31953a.add(mapSynchronizedMap);
                }
                Handler handler = q0Var.f31412c;
                r0 r0Var = new r0(q0Var, kVar, view, mapSynchronizedMap);
                if (Build.VERSION.SDK_INT >= 28) {
                    handler.postDelayed(r0Var, mapSynchronizedMap, jLongValue);
                } else {
                    Message messageObtain = Message.obtain(handler, r0Var);
                    messageObtain.obj = mapSynchronizedMap;
                    handler.sendMessageDelayed(messageObtain, jLongValue);
                }
            }
        }
    }

    public final void b(g gVar) {
        Object next;
        e9.c cVar = e9.c.f29122a;
        t0 t0Var = this.f31413d;
        b bVar = new b();
        Objects.requireNonNull(t0Var);
        k9.j<Map<g, o8>> jVar = t0Var.f31439a;
        ArrayList arrayList = new ArrayList();
        synchronized (jVar.f31953a) {
            arrayList.addAll(jVar.f31953a);
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Map) next).remove(gVar) != null));
        Map<g, ? extends o8> map = (Map) next;
        if (map != null && map.isEmpty()) {
            bVar.invoke(map);
            k9.j<Map<g, o8>> jVar2 = t0Var.f31439a;
            synchronized (jVar2.f31953a) {
                jVar2.f31953a.remove(map);
            }
        }
    }

    public final boolean c(k kVar, View view, o8 o8Var, int i10) {
        g gVar;
        Object next;
        Set setKeySet;
        boolean z10 = ((long) i10) >= o8Var.f41861h.b(kVar.getExpressionResolver()).longValue();
        g gVarF = x1.q.f(kVar, o8Var);
        t0 t0Var = this.f31413d;
        Objects.requireNonNull(t0Var);
        fd.j0.i(gVarF, "logId");
        k9.j<Map<g, o8>> jVar = t0Var.f31439a;
        ArrayList arrayList = new ArrayList();
        synchronized (jVar.f31953a) {
            arrayList.addAll(jVar.f31953a);
        }
        Iterator it = arrayList.iterator();
        do {
            gVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Map) next).containsKey(gVarF));
        Map map = (Map) next;
        if (map != null && (setKeySet = map.keySet()) != null) {
            Object[] array = setKeySet.toArray(new g[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            g[] gVarArr = (g[]) array;
            int length = gVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                g gVar2 = gVarArr[i11];
                i11++;
                if (fd.j0.d(gVar2, gVarF)) {
                    gVar = gVar2;
                    break;
                }
            }
        }
        if (view != null && gVar == null && z10) {
            return true;
        }
        if ((view == null || gVar != null || z10) && ((view == null || gVar == null || !z10) && ((view != null && gVar != null && !z10) || (view == null && gVar != null)))) {
            b(gVar);
        }
        return false;
    }

    public void d(k kVar, View view, y9.k kVar2, List<? extends o8> list) {
        fd.j0.i(kVar, Action.SCOPE_ATTRIBUTE);
        fd.j0.i(kVar2, "div");
        fd.j0.i(list, "visibilityActions");
        if (list.isEmpty()) {
            return;
        }
        l1 divData = kVar.getDivData();
        if (view == null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                c(kVar, view, (o8) it.next(), 0);
            }
            return;
        }
        fd.j0.i(view, "<this>");
        if ((x1.q.g(view) == null) && !view.isLayoutRequested()) {
            if (fd.j0.d(kVar.getDivData(), divData)) {
                a(this, kVar, view, kVar2, list);
            }
        } else {
            View viewG = x1.q.g(view);
            if (viewG == null) {
                return;
            }
            viewG.addOnLayoutChangeListener(new c(kVar, divData, this, view, kVar2, list));
        }
    }
}
