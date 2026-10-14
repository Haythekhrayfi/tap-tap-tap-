package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class b2 extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.f f32278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(o8.f fVar) {
        super(1);
        this.f32278c = fVar;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        int i10;
        long jLongValue = l10.longValue();
        o8.f fVar = this.f32278c;
        long j10 = jLongValue >> 31;
        if (j10 == 0 || j10 == -1) {
            i10 = (int) jLongValue;
        } else {
            int i11 = e9.a.f29114a;
            i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        fVar.setColumnCount(i10);
        return jc.w.f31842a;
    }
}
