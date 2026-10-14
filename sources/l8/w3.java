package l8;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import y9.n8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w3<VH extends RecyclerView.c0> extends RecyclerView.g<VH> implements f9.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f32930h = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i8.k f32931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<y9.k> f32932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<kc.z<y9.k>> f32933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<y9.k> f32934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<y9.k, Boolean> f32935g;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public static final boolean a(a aVar, y9.k kVar, i8.k kVar2) {
            Objects.requireNonNull(aVar);
            return kVar.a().getVisibility().b(kVar2.getExpressionResolver()) != n8.GONE;
        }
    }

    public static final class b extends vc.l implements uc.l<n8, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w3<VH> f32936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kc.z<y9.k> f32937d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(w3<VH> w3Var, kc.z<? extends y9.k> zVar) {
            super(1);
            this.f32936c = w3Var;
            this.f32937d = zVar;
        }

        @Override // uc.l
        public jc.w invoke(n8 n8Var) {
            n8 n8Var2 = n8Var;
            fd.j0.i(n8Var2, "it");
            w3<VH> w3Var = this.f32936c;
            kc.z<y9.k> zVar = this.f32937d;
            Boolean bool = w3Var.f32935g.get(zVar.f32013b);
            boolean zBooleanValue = bool == null ? false : bool.booleanValue();
            Objects.requireNonNull(w3.f32930h);
            boolean z10 = n8Var2 != n8.GONE;
            if (!zBooleanValue && z10) {
                List<kc.z<y9.k>> list = w3Var.f32933e;
                Iterator<kc.z<y9.k>> it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    }
                    if (it.next().f32012a > zVar.f32012a) {
                        break;
                    }
                    i10++;
                }
                Integer numValueOf = Integer.valueOf(i10);
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                int size = numValueOf == null ? list.size() : numValueOf.intValue();
                list.add(size, zVar);
                w3Var.notifyItemInserted(size);
            } else if (zBooleanValue && !z10) {
                int iIndexOf = w3Var.f32933e.indexOf(zVar);
                w3Var.f32933e.remove(iIndexOf);
                w3Var.notifyItemRemoved(iIndexOf);
            }
            w3Var.f32935g.put(zVar.f32013b, Boolean.valueOf(z10));
            return jc.w.f31842a;
        }
    }

    public w3(List<? extends y9.k> list, i8.k kVar) {
        fd.j0.i(list, "divs");
        fd.j0.i(kVar, "div2View");
        this.f32931c = kVar;
        this.f32932d = kc.t.J(list);
        ArrayList arrayList = new ArrayList();
        this.f32933e = arrayList;
        Objects.requireNonNull(f32930h);
        this.f32934f = new v3(arrayList);
        this.f32935g = new LinkedHashMap();
        f();
    }

    public final boolean c(s7.g gVar) {
        int i10;
        fd.j0.i(gVar, "divPatchCache");
        o7.a dataTag = this.f32931c.getDataTag();
        fd.j0.i(dataTag, "tag");
        if (gVar.f35477a.getOrDefault(dataTag, null) == null) {
            return false;
        }
        int size = 0;
        boolean z10 = false;
        int i11 = 0;
        while (size < this.f32932d.size()) {
            y9.k kVar = this.f32932d.get(size);
            String id2 = kVar.a().getId();
            List<y9.k> listA = id2 == null ? null : gVar.a(this.f32931c.getDataTag(), id2);
            boolean zD = fd.j0.d(this.f32935g.get(kVar), Boolean.TRUE);
            if (listA != null) {
                this.f32932d.remove(size);
                if (zD) {
                    notifyItemRemoved(i11);
                }
                this.f32932d.addAll(size, listA);
                if (listA.isEmpty()) {
                    i10 = 0;
                } else {
                    Iterator<T> it = listA.iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        if (a.a(f32930h, (y9.k) it.next(), this.f32931c) && (i10 = i10 + 1) < 0) {
                            kc.l.h();
                            throw null;
                        }
                    }
                }
                notifyItemRangeInserted(i11, i10);
                size += listA.size() - 1;
                i11 += i10 - 1;
                z10 = true;
            }
            if (zD) {
                i11++;
            }
            size++;
        }
        f();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        List<y9.k> list = this.f32932d;
        fd.j0.i(list, "<this>");
        Iterator it = new kc.a0(new kc.u(list)).iterator();
        while (true) {
            kc.b0 b0Var = (kc.b0) it;
            if (!b0Var.hasNext()) {
                return;
            }
            kc.z zVar = (kc.z) b0Var.next();
            d(((y9.k) zVar.f32013b).a().getVisibility().e(this.f32931c.getExpressionResolver(), new b(this, zVar)));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void f() {
        this.f32933e.clear();
        this.f32935g.clear();
        List<y9.k> list = this.f32932d;
        fd.j0.i(list, "<this>");
        Iterator it = new kc.a0(new kc.u(list)).iterator();
        while (true) {
            kc.b0 b0Var = (kc.b0) it;
            if (!b0Var.hasNext()) {
                return;
            }
            kc.z<y9.k> zVar = (kc.z) b0Var.next();
            boolean zA = a.a(f32930h, (y9.k) zVar.f32013b, this.f32931c);
            this.f32935g.put((y9.k) zVar.f32013b, Boolean.valueOf(zA));
            if (zA) {
                this.f32933e.add(zVar);
            }
        }
    }
}
