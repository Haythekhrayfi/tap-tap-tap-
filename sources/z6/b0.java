package z6;

import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends vc.l implements uc.l<Throwable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinedRecordingsActivity f45036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(CombinedRecordingsActivity combinedRecordingsActivity) {
        super(1);
        this.f45036c = combinedRecordingsActivity;
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        CombinedRecordingsActivity combinedRecordingsActivity = this.f45036c;
        combinedRecordingsActivity.runOnUiThread(new androidx.appcompat.app.s(th, combinedRecordingsActivity));
        return jc.w.f31842a;
    }
}
