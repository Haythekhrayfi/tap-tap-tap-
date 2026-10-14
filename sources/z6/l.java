package z6;

import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.combine.CombinationActivity;
import com.inscode.autoclicker.ui.dialogs.ModeSettingsDialogs;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends vc.l implements uc.l<List<? extends v6.a>, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f45101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CombinationActivity f45102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z10, CombinationActivity combinationActivity) {
        super(1);
        this.f45101c = z10;
        this.f45102d = combinationActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc.l
    public jc.w invoke(List<? extends v6.a> list) {
        List<? extends v6.a> list2 = list;
        if (!list2.isEmpty()) {
            ModeSettingsDialogs.Companion companion = ModeSettingsDialogs.Companion;
            r6.e eVar = (r6.e) this.f45102d.f13213e.getValue();
            CombinationActivity combinationActivity = this.f45102d;
            companion.showLoadRecordingsDialog(combinationActivity, eVar, list2, new k(combinationActivity));
        } else if (this.f45101c) {
            u1.a.s(this.f45102d, R.string.no_saved_recordings, 0, 2);
        }
        return jc.w.f31842a;
    }
}
