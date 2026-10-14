package z6;

import com.inscode.autoclicker.service.combine.CombinationActivity;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends vc.l implements uc.l<List<? extends v6.a>, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f45052c = new g();

    public g() {
        super(1);
    }

    @Override // uc.l
    public jc.w invoke(List<? extends v6.a> list) {
        List<? extends v6.a> list2 = list;
        fd.j0.i(list2, "it");
        Objects.requireNonNull(CombinationActivity.f13209j);
        t6.a aVar = CombinationActivity.f13210k;
        if (aVar != null) {
            aVar.j(kc.t.J(list2));
        }
        return jc.w.f31842a;
    }
}
