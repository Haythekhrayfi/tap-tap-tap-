package n8;

import java.util.LinkedHashSet;
import java.util.Objects;
import y9.f7;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends vc.l implements uc.l<Boolean, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9.t f33664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f33665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f7 f33666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t9.t tVar, d dVar, f7 f7Var) {
        super(1);
        this.f33664c = tVar;
        this.f33665d = dVar;
        this.f33666e = f7Var;
    }

    @Override // uc.l
    public jc.w invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        c divTabsAdapter = this.f33664c.getDivTabsAdapter();
        if (divTabsAdapter != null) {
            d dVar = this.f33665d;
            int size = this.f33666e.f40008o.size() - 1;
            int i10 = d.f33639k;
            Objects.requireNonNull(dVar);
            divTabsAdapter.f35730d.setDisabledScrollPages(zBooleanValue ? new LinkedHashSet<>() : kc.t.K(new bd.c(0, size)));
        }
        return jc.w.f31842a;
    }
}
