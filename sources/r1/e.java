package r1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public class e extends i0 {

    public class a extends l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f35081a;

        public a(e eVar, Rect rect) {
            this.f35081a = rect;
        }

        @Override // r1.l.f
        public Rect a(l lVar) {
            return this.f35081a;
        }
    }

    public class b implements l.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f35082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f35083b;

        public b(e eVar, View view, ArrayList arrayList) {
            this.f35082a = view;
            this.f35083b = arrayList;
        }

        @Override // r1.l.g
        public void onTransitionCancel(l lVar) {
        }

        @Override // r1.l.g
        public void onTransitionEnd(l lVar) {
            lVar.removeListener(this);
            this.f35082a.setVisibility(8);
            int size = this.f35083b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f35083b.get(i10)).setVisibility(0);
            }
        }

        @Override // r1.l.g
        public void onTransitionPause(l lVar) {
        }

        @Override // r1.l.g
        public void onTransitionResume(l lVar) {
        }

        @Override // r1.l.g
        public void onTransitionStart(l lVar) {
            lVar.removeListener(this);
            lVar.addListener(this);
        }
    }

    public class c extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f35084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f35085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f35086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f35087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f35088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f35089f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f35084a = obj;
            this.f35085b = arrayList;
            this.f35086c = obj2;
            this.f35087d = arrayList2;
            this.f35088e = obj3;
            this.f35089f = arrayList3;
        }

        @Override // r1.m, r1.l.g
        public void onTransitionEnd(l lVar) {
            lVar.removeListener(this);
        }

        @Override // r1.m, r1.l.g
        public void onTransitionStart(l lVar) {
            Object obj = this.f35084a;
            if (obj != null) {
                e.this.u(obj, this.f35085b, null);
            }
            Object obj2 = this.f35086c;
            if (obj2 != null) {
                e.this.u(obj2, this.f35087d, null);
            }
            Object obj3 = this.f35088e;
            if (obj3 != null) {
                e.this.u(obj3, this.f35089f, null);
            }
        }
    }

    public class d implements l0.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f35091a;

        public d(e eVar, l lVar) {
            this.f35091a = lVar;
        }

        @Override // l0.d.a
        public void a() {
            this.f35091a.cancel();
        }
    }

    /* JADX INFO: renamed from: r1.e$e, reason: collision with other inner class name */
    public class C0397e implements l.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f35092a;

        public C0397e(e eVar, Runnable runnable) {
            this.f35092a = runnable;
        }

        @Override // r1.l.g
        public void onTransitionCancel(l lVar) {
        }

        @Override // r1.l.g
        public void onTransitionEnd(l lVar) {
            this.f35092a.run();
        }

        @Override // r1.l.g
        public void onTransitionPause(l lVar) {
        }

        @Override // r1.l.g
        public void onTransitionResume(l lVar) {
        }

        @Override // r1.l.g
        public void onTransitionStart(l lVar) {
        }
    }

    public class f extends l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f35093a;

        public f(e eVar, Rect rect) {
            this.f35093a = rect;
        }

        @Override // r1.l.f
        public Rect a(l lVar) {
            Rect rect = this.f35093a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f35093a;
        }
    }

    public static boolean t(l lVar) {
        return (i0.i(lVar.getTargetIds()) && i0.i(lVar.getTargetNames()) && i0.i(lVar.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.i0
    public void a(Object obj, View view) {
        ((l) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.i0
    public void b(Object obj, ArrayList<View> arrayList) {
        l lVar = (l) obj;
        if (lVar == null) {
            return;
        }
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int iD = pVar.d();
            while (i10 < iD) {
                b(pVar.c(i10), arrayList);
                i10++;
            }
            return;
        }
        if (t(lVar) || !i0.i(lVar.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            lVar.addTarget(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.i0
    public void c(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (l) obj);
    }

    @Override // androidx.fragment.app.i0
    public boolean e(Object obj) {
        return obj instanceof l;
    }

    @Override // androidx.fragment.app.i0
    public Object f(Object obj) {
        if (obj != null) {
            return ((l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.i0
    public Object j(Object obj, Object obj2, Object obj3) {
        l lVar = (l) obj;
        l lVar2 = (l) obj2;
        l lVar3 = (l) obj3;
        if (lVar != null && lVar2 != null) {
            p pVar = new p();
            pVar.b(lVar);
            pVar.b(lVar2);
            pVar.g(1);
            lVar = pVar;
        } else if (lVar == null) {
            lVar = lVar2 != null ? lVar2 : null;
        }
        if (lVar3 == null) {
            return lVar;
        }
        p pVar2 = new p();
        if (lVar != null) {
            pVar2.b(lVar);
        }
        pVar2.b(lVar3);
        return pVar2;
    }

    @Override // androidx.fragment.app.i0
    public Object k(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.b((l) obj);
        }
        pVar.b((l) obj2);
        return pVar;
    }

    @Override // androidx.fragment.app.i0
    public void l(Object obj, View view, ArrayList<View> arrayList) {
        ((l) obj).addListener(new b(this, view, arrayList));
    }

    @Override // androidx.fragment.app.i0
    public void m(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((l) obj).addListener(new c(obj2, arrayList, null, null, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.i0
    public void n(Object obj, Rect rect) {
        ((l) obj).setEpicenterCallback(new f(this, rect));
    }

    @Override // androidx.fragment.app.i0
    public void o(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((l) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    @Override // androidx.fragment.app.i0
    public void p(Fragment fragment, Object obj, l0.d dVar, Runnable runnable) {
        l lVar = (l) obj;
        dVar.b(new d(this, lVar));
        lVar.addListener(new C0397e(this, runnable));
    }

    @Override // androidx.fragment.app.i0
    public void q(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        List<View> targets = pVar.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i0.d(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    @Override // androidx.fragment.app.i0
    public void r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.getTargets().clear();
            pVar.getTargets().addAll(arrayList2);
            u(pVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.i0
    public Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.b((l) obj);
        return pVar;
    }

    public void u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        l lVar = (l) obj;
        int i10 = 0;
        if (lVar instanceof p) {
            p pVar = (p) lVar;
            int iD = pVar.d();
            while (i10 < iD) {
                u(pVar.c(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (t(lVar)) {
            return;
        }
        List<View> targets = lVar.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                lVar.addTarget(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                lVar.removeTarget(arrayList.get(size2));
            }
        }
    }
}
