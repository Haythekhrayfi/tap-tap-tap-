package t9;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f35720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j.b f35721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.a f35722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<o> f35723d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35724e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f35725f = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    public a(ViewGroup viewGroup, j.b bVar, j.a aVar) {
        this.f35720a = viewGroup;
        this.f35721b = bVar;
        this.f35722c = aVar;
    }

    @Override // t9.u.a
    public void a(int i10, float f10) {
        this.f35724e = i10;
        this.f35725f = f10;
    }

    @Override // t9.u.a
    public int c(int i10, int i11) {
        o oVar = this.f35723d.get(i10);
        if (oVar == null) {
            Object obj = ((b) this.f35722c).f35726a.f35740n;
            int size = obj == null ? 0 : ((n8.b) obj).a().size();
            if (size == 0) {
                return 0;
            }
            o oVar2 = new o(size, new com.applovin.exoplayer2.a.o(this, View.MeasureSpec.getSize(i10)));
            this.f35723d.put(i10, oVar2);
            oVar = oVar2;
        }
        return e(oVar, this.f35724e, this.f35725f);
    }

    @Override // t9.u.a
    public void d() {
        this.f35723d.clear();
    }

    public abstract int e(o oVar, int i10, float f10);
}
