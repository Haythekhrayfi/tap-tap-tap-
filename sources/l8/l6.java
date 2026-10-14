package l8;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l6 extends vc.l implements uc.a<jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<y9.q> f32572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k6 f32573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l6(List<? extends y9.q> list, k6 k6Var) {
        super(0);
        this.f32572c = list;
        this.f32573d = k6Var;
    }

    @Override // uc.a
    public jc.w invoke() {
        List<y9.q> list = this.f32572c;
        k6 k6Var = this.f32573d;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            k6Var.f32538c.a(k6Var.f32536a, (y9.q) it.next(), null);
        }
        return jc.w.f31842a;
    }
}
