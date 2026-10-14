package y6;

import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class l2 extends vc.l implements uc.l<jc.w, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecordSettingsLoadActivity f38285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(RecordSettingsLoadActivity recordSettingsLoadActivity) {
        super(1);
        this.f38285c = recordSettingsLoadActivity;
    }

    @Override // uc.l
    public jc.w invoke(jc.w wVar) {
        RecordSettingsLoadActivity recordSettingsLoadActivity = this.f38285c;
        String string = recordSettingsLoadActivity.getString(R.string.settings_saved);
        fd.j0.h(string, "getString(R.string.settings_saved)");
        RecordSettingsLoadActivity.h(recordSettingsLoadActivity, string);
        this.f38285c.updateUi();
        RecordSettingsLoadActivity.k(this.f38285c, false, 1);
        return jc.w.f31842a;
    }
}
