package j8;

import android.view.View;
import android.view.ViewGroup;
import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kc.t;
import r1.m;
import r1.n;
import r1.p;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8.k f31716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<C0323b> f31717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<C0323b> f31718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31719d;

    public static abstract class a {

        /* JADX INFO: renamed from: j8.b$a$a, reason: collision with other inner class name */
        public static final class C0322a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f31720a;

            public C0322a(int i10) {
                super(null);
                this.f31720a = i10;
            }
        }

        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    /* JADX INFO: renamed from: j8.b$b, reason: collision with other inner class name */
    public static final class C0323b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r1.l f31721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f31722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a.C0322a> f31723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<a.C0322a> f31724d;

        public C0323b(r1.l lVar, View view, List<a.C0322a> list, List<a.C0322a> list2) {
            j0.i(lVar, "transition");
            j0.i(view, "target");
            j0.i(list, "changes");
            j0.i(list2, "savedChanges");
            this.f31721a = lVar;
            this.f31722b = view;
            this.f31723c = list;
            this.f31724d = list2;
        }
    }

    public static final class c extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r1.l f31725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f31726b;

        public c(r1.l lVar, b bVar) {
            this.f31725a = lVar;
            this.f31726b = bVar;
        }

        @Override // r1.m, r1.l.g
        public void onTransitionEnd(r1.l lVar) {
            j0.i(lVar, "transition");
            this.f31726b.f31718c.clear();
            this.f31725a.removeListener(this);
        }
    }

    public b(i8.k kVar) {
        j0.i(kVar, "divView");
        this.f31716a = kVar;
        this.f31717b = new ArrayList();
        this.f31718c = new ArrayList();
    }

    public final void a(ViewGroup viewGroup, boolean z10) {
        if (z10) {
            n.b(viewGroup);
        }
        p pVar = new p();
        Iterator<T> it = this.f31717b.iterator();
        while (it.hasNext()) {
            pVar.b(((C0323b) it.next()).f31721a);
        }
        pVar.addListener(new c(pVar, this));
        n.a(viewGroup, pVar);
        for (C0323b c0323b : this.f31717b) {
            for (a.C0322a c0322a : c0323b.f31723c) {
                View view = c0323b.f31722b;
                Objects.requireNonNull(c0322a);
                j0.i(view, "view");
                view.setVisibility(c0322a.f31720a);
                c0323b.f31724d.add(c0322a);
            }
        }
        this.f31718c.clear();
        this.f31718c.addAll(this.f31717b);
        this.f31717b.clear();
    }

    public final List<a.C0322a> b(List<C0323b> list, View view) {
        ArrayList arrayList = new ArrayList();
        for (C0323b c0323b : list) {
            a.C0322a c0322a = j0.d(c0323b.f31722b, view) ? (a.C0322a) t.y(c0323b.f31724d) : null;
            if (c0322a != null) {
                arrayList.add(c0322a);
            }
        }
        return arrayList;
    }
}
