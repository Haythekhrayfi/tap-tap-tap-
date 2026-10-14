package z6;

import com.inscode.autoclicker.service.combine.CombinationActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends vc.l implements uc.l<List<? extends v6.a>, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinationActivity f45090c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CombinationActivity combinationActivity) {
        super(1);
        this.f45090c = combinationActivity;
    }

    @Override // uc.l
    public jc.w invoke(List<? extends v6.a> list) {
        List<v6.a> listD;
        List<? extends v6.a> list2 = list;
        fd.j0.i(list2, "settings");
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ((v6.a) it.next()).o(System.currentTimeMillis());
        }
        Objects.requireNonNull(CombinationActivity.f13209j);
        t6.a aVar = CombinationActivity.f13210k;
        if (aVar != null && (listD = aVar.d()) != null) {
            listD.addAll(list2);
        }
        this.f45090c.i();
        this.f45090c.f13211c = true;
        return jc.w.f31842a;
    }
}
