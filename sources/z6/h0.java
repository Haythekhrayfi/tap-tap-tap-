package z6;

import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends vc.l implements uc.l<jc.w, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinedRecordingsActivity f45055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t6.a f45056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(CombinedRecordingsActivity combinedRecordingsActivity, t6.a aVar) {
        super(1);
        this.f45055c = combinedRecordingsActivity;
        this.f45056d = aVar;
    }

    @Override // uc.l
    public jc.w invoke(jc.w wVar) {
        this.f45055c.f13236f.remove(this.f45056d);
        return jc.w.f31842a;
    }
}
