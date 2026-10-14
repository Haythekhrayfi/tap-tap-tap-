package r8;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import fd.j0;
import o8.l;
import o8.m;
import vc.g;
import y9.t2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35288a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: r8.b$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0400a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f35289a;

            static {
                int[] iArr = new int[t2.j.values().length];
                iArr[t2.j.DEFAULT.ordinal()] = 1;
                iArr[t2.j.PAGING.ordinal()] = 2;
                f35289a = iArr;
            }
        }

        public a() {
        }

        public a(g gVar) {
        }
    }

    /* JADX INFO: renamed from: r8.b$b, reason: collision with other inner class name */
    public static final class C0401b extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f35290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r8.a f35291c;

        /* JADX INFO: renamed from: r8.b$b$a */
        public static final class a extends t {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f35292a;

            public a(Context context) {
                super(context);
                this.f35292a = 50.0f;
            }

            @Override // androidx.recyclerview.widget.t
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                j0.i(displayMetrics, "displayMetrics");
                return this.f35292a / displayMetrics.densityDpi;
            }

            @Override // androidx.recyclerview.widget.t
            public int getHorizontalSnapPreference() {
                return -1;
            }

            @Override // androidx.recyclerview.widget.t
            public int getVerticalSnapPreference() {
                return -1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0401b(m mVar, r8.a aVar) {
            super(null);
            j0.i(mVar, "view");
            j0.i(aVar, "direction");
            this.f35290b = mVar;
            this.f35291c = aVar;
        }

        @Override // r8.b
        public int a() {
            return r8.c.a(this.f35290b, this.f35291c);
        }

        @Override // r8.b
        public int b() {
            RecyclerView.o layoutManager = this.f35290b.getLayoutManager();
            if (layoutManager == null) {
                return 0;
            }
            return layoutManager.getItemCount();
        }

        @Override // r8.b
        public void c(int i10) {
            int iB = b();
            if (i10 < 0 || i10 >= iB) {
                int i11 = e9.a.f29114a;
                return;
            }
            a aVar = new a(this.f35290b.getContext());
            aVar.setTargetPosition(i10);
            RecyclerView.o layoutManager = this.f35290b.getLayoutManager();
            if (layoutManager == null) {
                return;
            }
            layoutManager.startSmoothScroll(aVar);
        }
    }

    public static final class c extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f35293b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l lVar) {
            super(null);
            j0.i(lVar, "view");
            this.f35293b = lVar;
        }

        @Override // r8.b
        public int a() {
            return this.f35293b.getViewPager().getCurrentItem();
        }

        @Override // r8.b
        public int b() {
            RecyclerView.g adapter = this.f35293b.getViewPager().getAdapter();
            if (adapter == null) {
                return 0;
            }
            return adapter.getItemCount();
        }

        @Override // r8.b
        public void c(int i10) {
            int iB = b();
            if (i10 < 0 || i10 >= iB) {
                int i11 = e9.a.f29114a;
            } else {
                this.f35293b.getViewPager().e(i10, true);
            }
        }
    }

    public static final class d extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f35294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r8.a f35295c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m mVar, r8.a aVar) {
            super(null);
            j0.i(mVar, "view");
            j0.i(aVar, "direction");
            this.f35294b = mVar;
            this.f35295c = aVar;
        }

        @Override // r8.b
        public int a() {
            return r8.c.a(this.f35294b, this.f35295c);
        }

        @Override // r8.b
        public int b() {
            RecyclerView.o layoutManager = this.f35294b.getLayoutManager();
            if (layoutManager == null) {
                return 0;
            }
            return layoutManager.getItemCount();
        }

        @Override // r8.b
        public void c(int i10) {
            int iB = b();
            if (i10 < 0 || i10 >= iB) {
                int i11 = e9.a.f29114a;
            } else {
                this.f35294b.smoothScrollToPosition(i10);
            }
        }
    }

    public static final class e extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t9.t f35296b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(t9.t tVar) {
            super(null);
            j0.i(tVar, "view");
            this.f35296b = tVar;
        }

        @Override // r8.b
        public int a() {
            return this.f35296b.getViewPager().getCurrentItem();
        }

        @Override // r8.b
        public int b() {
            v1.a adapter = this.f35296b.getViewPager().getAdapter();
            if (adapter == null) {
                return 0;
            }
            return adapter.b();
        }

        @Override // r8.b
        public void c(int i10) {
            int iB = b();
            if (i10 < 0 || i10 >= iB) {
                int i11 = e9.a.f29114a;
                return;
            }
            t9.l viewPager = this.f35296b.getViewPager();
            viewPager.f2958x = false;
            viewPager.z(i10, true, false, 0);
        }
    }

    public b() {
    }

    public b(g gVar) {
    }

    public abstract int a();

    public abstract int b();

    public abstract void c(int i10);
}
