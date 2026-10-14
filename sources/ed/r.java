package ed;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends vc.l implements uc.p<CharSequence, Integer, jc.h<? extends Integer, ? extends Integer>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ char[] f29157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f29158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(char[] cArr, boolean z10) {
        super(2);
        this.f29157c = cArr;
        this.f29158d = z10;
    }

    @Override // uc.p
    public jc.h<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
        CharSequence charSequence2 = charSequence;
        int iIntValue = num.intValue();
        j0.i(charSequence2, "$this$$receiver");
        int iF = u.F(charSequence2, this.f29157c, iIntValue, this.f29158d);
        if (iF < 0) {
            return null;
        }
        return new jc.h<>(Integer.valueOf(iF), 1);
    }
}
