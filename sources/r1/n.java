package r1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.inscode.autoclicker.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static l f35115a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadLocal<WeakReference<q.a<ViewGroup, ArrayList<l>>>> f35116b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ArrayList<ViewGroup> f35117c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public l f35118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ViewGroup f35119d;

        /* JADX INFO: renamed from: r1.n$a$a, reason: collision with other inner class name */
        public class C0398a extends m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q.a f35120a;

            public C0398a(q.a aVar) {
                this.f35120a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // r1.m, r1.l.g
            public void onTransitionEnd(l lVar) {
                ((ArrayList) this.f35120a.get(a.this.f35119d)).remove(lVar);
                lVar.removeListener(this);
            }
        }

        public a(l lVar, ViewGroup viewGroup) {
            this.f35118c = lVar;
            this.f35119d = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f35119d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f35119d.removeOnAttachStateChangeListener(this);
            if (!n.f35117c.remove(this.f35119d)) {
                return true;
            }
            q.a<ViewGroup, ArrayList<l>> aVarC = n.c();
            ArrayList<l> arrayList = aVarC.get(this.f35119d);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarC.put(this.f35119d, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f35118c);
            this.f35118c.addListener(new C0398a(aVarC));
            this.f35118c.captureValues(this.f35119d, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).resume(this.f35119d);
                }
            }
            this.f35118c.playTransition(this.f35119d);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f35119d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f35119d.removeOnAttachStateChangeListener(this);
            n.f35117c.remove(this.f35119d);
            ArrayList<l> arrayList = n.c().get(this.f35119d);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<l> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.f35119d);
                }
            }
            this.f35118c.clearValues(true);
        }
    }

    public n() {
        new q.a();
        new q.a();
    }

    public static void a(ViewGroup viewGroup, l lVar) {
        if (f35117c.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (e0.g.c(viewGroup)) {
            f35117c.add(viewGroup);
            if (lVar == null) {
                lVar = f35115a;
            }
            l lVarClone = lVar.clone();
            d(viewGroup, lVarClone);
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (lVarClone != null) {
                a aVar = new a(lVarClone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    public static void b(ViewGroup viewGroup) {
        f35117c.remove(viewGroup);
        ArrayList<l> orDefault = c().getOrDefault(viewGroup, null);
        if (orDefault == null || orDefault.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(orDefault);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((l) arrayList.get(size)).forceToEnd(viewGroup);
        }
    }

    public static q.a<ViewGroup, ArrayList<l>> c() {
        q.a<ViewGroup, ArrayList<l>> aVar;
        WeakReference<q.a<ViewGroup, ArrayList<l>>> weakReference = f35116b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        q.a<ViewGroup, ArrayList<l>> aVar2 = new q.a<>();
        f35116b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    public static void d(ViewGroup viewGroup, l lVar) {
        Runnable runnable;
        ArrayList<l> orDefault = c().getOrDefault(viewGroup, null);
        if (orDefault != null && orDefault.size() > 0) {
            Iterator<l> it = orDefault.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.captureValues(viewGroup, true);
        }
        j jVar = (j) viewGroup.getTag(R.id.transition_current_scene);
        if (jVar == null || j.b(jVar.f35097b) != jVar || (runnable = jVar.f35099d) == null) {
            return;
        }
        runnable.run();
    }
}
