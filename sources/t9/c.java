package t9;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import t9.c.g.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c<TAB_DATA extends g.a<ACTION>, TAB_VIEW, ACTION> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9.g f35727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f35728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<ACTION> f35729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f35730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f35731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f35732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u.a f35733g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f35736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC0418c<ACTION> f35737k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<ViewGroup, c<TAB_DATA, TAB_VIEW, ACTION>.e> f35734h = new q.a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map<Integer, c<TAB_DATA, TAB_VIEW, ACTION>.e> f35735i = new q.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v1.a f35738l = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f35739m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g<TAB_DATA> f35740n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35741o = false;

    public class a extends v1.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SparseArray<Parcelable> f35742c;

        public a() {
        }

        @Override // v1.a
        public void a(ViewGroup viewGroup, int i10, Object obj) {
            ViewGroup viewGroup2 = (ViewGroup) obj;
            c<TAB_DATA, TAB_VIEW, ACTION>.e eVarRemove = c.this.f35734h.remove(viewGroup2);
            TAB_VIEW tab_view = eVarRemove.f35748d;
            if (tab_view != null) {
                c.this.c(tab_view);
                eVarRemove.f35748d = null;
            }
            c.this.f35735i.remove(Integer.valueOf(i10));
            viewGroup.removeView(viewGroup2);
        }

        @Override // v1.a
        public int b() {
            g<TAB_DATA> gVar = c.this.f35740n;
            if (gVar == null) {
                return 0;
            }
            return ((n8.b) gVar).a().size();
        }

        @Override // v1.a
        public int c(Object obj) {
            return -2;
        }

        @Override // v1.a
        public Object d(ViewGroup viewGroup, int i10) {
            ViewGroup viewGroup2;
            c<TAB_DATA, TAB_VIEW, ACTION>.e eVar = c.this.f35735i.get(Integer.valueOf(i10));
            if (eVar != null) {
                viewGroup2 = eVar.f35745a;
                viewGroup2.getParent();
                int i11 = e9.a.f29114a;
            } else {
                c cVar = c.this;
                ViewGroup viewGroup3 = (ViewGroup) cVar.f35727a.b(cVar.f35736j);
                g.a aVar = (g.a) ((n8.b) c.this.f35740n).a().get(i10);
                c cVar2 = c.this;
                c<TAB_DATA, TAB_VIEW, ACTION>.e eVar2 = new e(viewGroup3, aVar, i10, null);
                cVar2.f35735i.put(Integer.valueOf(i10), eVar2);
                viewGroup2 = viewGroup3;
                eVar = eVar2;
            }
            viewGroup.addView(viewGroup2);
            c.this.f35734h.put(viewGroup2, eVar);
            if (i10 == c.this.f35730d.getCurrentItem()) {
                eVar.a();
            }
            SparseArray<Parcelable> sparseArray = this.f35742c;
            if (sparseArray != null) {
                viewGroup2.restoreHierarchyState(sparseArray);
            }
            return viewGroup2;
        }

        @Override // v1.a
        public boolean e(View view, Object obj) {
            return obj == view;
        }

        @Override // v1.a
        public void f(Parcelable parcelable, ClassLoader classLoader) {
            SparseArray<Parcelable> sparseParcelableArray;
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                bundle.setClassLoader(a.class.getClassLoader());
                sparseParcelableArray = bundle.getSparseParcelableArray("div_tabs_child_states");
            } else {
                sparseParcelableArray = null;
            }
            this.f35742c = sparseParcelableArray;
        }

        @Override // v1.a
        public Parcelable g() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>(c.this.f35734h.size());
            Iterator<ViewGroup> it = c.this.f35734h.keySet().iterator();
            while (it.hasNext()) {
                it.next().saveHierarchyState(sparseArray);
            }
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("div_tabs_child_states", sparseArray);
            return bundle;
        }
    }

    public interface b<ACTION> {

        public interface a<ACTION> {
        }

        void a(int i10, float f10);

        void b(l9.g gVar, String str);

        void c(int i10);

        void d(List<? extends g.a<ACTION>> list, int i10, v9.d dVar, f9.b bVar);

        void e(int i10);

        ViewPager.j getCustomPageChangeListener();

        void setHost(a<ACTION> aVar);

        void setTypefaceProvider(y7.a aVar);
    }

    /* JADX INFO: renamed from: t9.c$c, reason: collision with other inner class name */
    public interface InterfaceC0418c<ACTION> {
        void a(ACTION action, int i10);
    }

    public class d implements b.a<ACTION> {
        public d(a aVar) {
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f35745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TAB_DATA f35746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35747c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TAB_VIEW f35748d;

        /* JADX WARN: Multi-variable type inference failed */
        public e(ViewGroup viewGroup, g.a aVar, int i10, a aVar2) {
            this.f35745a = viewGroup;
            this.f35746b = aVar;
            this.f35747c = i10;
        }

        public void a() {
            if (this.f35748d != null) {
                return;
            }
            this.f35748d = (TAB_VIEW) c.this.a(this.f35745a, this.f35746b, this.f35747c);
        }
    }

    public class f implements ViewPager.k {
        public f(a aVar) {
        }
    }

    public interface g<TAB extends a> {

        public interface a<ACTION> {
            ACTION a();

            Integer b();

            String getTitle();
        }
    }

    public class h implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35751a = 0;

        public h(a aVar) {
        }

        public final void a(int i10) {
            c cVar = c.this;
            u.a aVar = cVar.f35733g;
            if (aVar == null || cVar.f35732f == null) {
                return;
            }
            aVar.a(i10, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            c.this.f35732f.requestLayout();
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
            this.f35751a = i10;
            if (i10 == 0) {
                int currentItem = c.this.f35730d.getCurrentItem();
                a(currentItem);
                c cVar = c.this;
                if (!cVar.f35739m) {
                    cVar.f35729c.c(currentItem);
                }
                c.this.f35739m = false;
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
            u.a aVar;
            if (this.f35751a != 0) {
                c cVar = c.this;
                if (cVar.f35732f != null && (aVar = cVar.f35733g) != null && aVar.b(i10, f10)) {
                    c.this.f35733g.a(i10, f10);
                    if (c.this.f35732f.isInLayout()) {
                        u uVar = c.this.f35732f;
                        Objects.requireNonNull(uVar);
                        uVar.post(new androidx.activity.c(uVar));
                    } else {
                        c.this.f35732f.requestLayout();
                    }
                }
            }
            c cVar2 = c.this;
            if (cVar2.f35739m) {
                return;
            }
            cVar2.f35729c.a(i10, f10);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            c cVar = c.this;
            if (cVar.f35733g == null) {
                cVar.f35730d.requestLayout();
            } else if (this.f35751a == 0) {
                a(i10);
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f35753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f35754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f35755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f35756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f35757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f35758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f35759g;

        public i(int i10, int i11, int i12, boolean z10, boolean z11, String str, String str2) {
            this.f35753a = i10;
            this.f35754b = i11;
            this.f35755c = i12;
            this.f35756d = z10;
            this.f35757e = z11;
            this.f35758f = str;
            this.f35759g = str2;
        }
    }

    public c(l9.g gVar, View view, i iVar, j jVar, p pVar, ViewPager.j jVar2, InterfaceC0418c<ACTION> interfaceC0418c) {
        this.f35727a = gVar;
        this.f35728b = view;
        this.f35731e = jVar;
        this.f35737k = interfaceC0418c;
        d dVar = new d(null);
        String str = iVar.f35758f;
        String str2 = iVar.f35759g;
        this.f35736j = str2;
        b<ACTION> bVar = (b) k9.l.a(view, iVar.f35753a);
        this.f35729c = bVar;
        bVar.setHost(dVar);
        bVar.setTypefaceProvider(pVar.f35841a);
        bVar.b(gVar, str);
        l lVar = (l) k9.l.a(view, iVar.f35754b);
        this.f35730d = lVar;
        lVar.setAdapter(null);
        List<ViewPager.j> list = lVar.T;
        if (list != null) {
            list.clear();
        }
        lVar.b(new h(null));
        ViewPager.j customPageChangeListener = bVar.getCustomPageChangeListener();
        if (customPageChangeListener != null) {
            lVar.b(customPageChangeListener);
        }
        if (jVar2 != null) {
            lVar.b(jVar2);
        }
        lVar.setScrollEnabled(iVar.f35756d);
        lVar.setEdgeScrollEnabled(iVar.f35757e);
        lVar.A(false, new f(null));
        u uVar = (u) k9.l.a(view, iVar.f35755c);
        this.f35732f = uVar;
        u.a aVarA = this.f35731e.a((ViewGroup) gVar.b(str2), new t9.b(this, 0), new t9.b(this, 1));
        this.f35733g = aVarA;
        uVar.setHeightCalculator(aVarA);
    }

    public abstract TAB_VIEW a(ViewGroup viewGroup, TAB_DATA tab_data, int i10);

    public void b(g<TAB_DATA> gVar, v9.d dVar, f9.b bVar) {
        int iMin = Math.min(this.f35730d.getCurrentItem(), ((n8.b) gVar).a().size() - 1);
        this.f35735i.clear();
        this.f35740n = gVar;
        if (this.f35730d.getAdapter() != null) {
            this.f35741o = true;
            try {
                v1.a aVar = this.f35738l;
                synchronized (aVar) {
                    DataSetObserver dataSetObserver = aVar.f36657b;
                    if (dataSetObserver != null) {
                        dataSetObserver.onChanged();
                    }
                }
                aVar.f36656a.notifyChanged();
                this.f35741o = false;
            } catch (Throwable th) {
                this.f35741o = false;
                throw th;
            }
        }
        List<? extends g.a<ACTION>> listA = ((n8.b) gVar).a();
        this.f35729c.d(listA, iMin, dVar, bVar);
        if (this.f35730d.getAdapter() == null) {
            this.f35730d.setAdapter(this.f35738l);
        } else if (!listA.isEmpty() && iMin != -1) {
            this.f35730d.setCurrentItem(iMin);
            this.f35729c.e(iMin);
        }
        u.a aVar2 = this.f35733g;
        if (aVar2 != null) {
            aVar2.d();
        }
        u uVar = this.f35732f;
        if (uVar != null) {
            uVar.requestLayout();
        }
    }

    public abstract void c(TAB_VIEW tab_view);
}
