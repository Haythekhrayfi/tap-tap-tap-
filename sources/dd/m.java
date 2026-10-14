package dd;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends vc.l implements uc.l<Integer, Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i10) {
        super(1);
        this.f28950c = i10;
    }

    @Override // uc.l
    public Object invoke(Integer num) {
        num.intValue();
        throw new IndexOutOfBoundsException(h0.f.a(defpackage.a.a("Sequence doesn't contain element at index "), this.f28950c, CoreConstants.DOT));
    }
}
