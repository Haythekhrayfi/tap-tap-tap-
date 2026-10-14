package l8;

import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8.k f32536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y9.r4 f32537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f32538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewPager2.g f32539d;

    public final class a extends ViewPager2.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final kc.f<Integer> f32541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k6 f32542c;

        public a(k6 k6Var) {
            fd.j0.i(k6Var, "this$0");
            this.f32542c = k6Var;
            this.f32540a = -1;
            this.f32541b = new kc.f<>();
        }

        public final void a() {
            while (!this.f32541b.isEmpty()) {
                int iIntValue = this.f32541b.i().intValue();
                e9.c cVar = e9.c.f29122a;
                k6 k6Var = this.f32542c;
                y9.k kVar = k6Var.f32537b.f42306o.get(iIntValue);
                Objects.requireNonNull(k6Var);
                List<y9.q> listJ = kVar.a().j();
                if (listJ != null) {
                    k6Var.f32536a.r(new l6(listJ, k6Var));
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void onPageScrollStateChanged(int i10) {
            if (i10 == 0) {
                a();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void onPageSelected(int i10) {
            e9.c cVar = e9.c.f29122a;
            if (this.f32540a == i10) {
                return;
            }
            this.f32541b.add(Integer.valueOf(i10));
            if (this.f32540a == -1) {
                a();
            }
            this.f32540a = i10;
        }
    }

    public k6(i8.k kVar, y9.r4 r4Var, j jVar) {
        fd.j0.i(kVar, "divView");
        fd.j0.i(r4Var, "div");
        fd.j0.i(jVar, "divActionBinder");
        this.f32536a = kVar;
        this.f32537b = r4Var;
        this.f32538c = jVar;
    }
}
