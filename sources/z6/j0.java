package z6;

import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends vc.l implements uc.l<jc.w, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinedRecordingsActivity f45087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(CombinedRecordingsActivity combinedRecordingsActivity) {
        super(1);
        this.f45087c = combinedRecordingsActivity;
    }

    @Override // uc.l
    public jc.w invoke(jc.w wVar) {
        u1.a.s(this.f45087c, R.string.settings_saved, 0, 2);
        CombinedRecordingsActivity combinedRecordingsActivity = this.f45087c;
        int i10 = CombinedRecordingsActivity.f13231l;
        combinedRecordingsActivity.updateUi();
        return jc.w.f31842a;
    }
}
