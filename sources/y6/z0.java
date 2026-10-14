package y6;

import com.inscode.autoclicker.R;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends vc.l implements uc.l<jc.w, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38435c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ManualSettingsLoadActivity manualSettingsLoadActivity) {
        super(1);
        this.f38435c = manualSettingsLoadActivity;
    }

    @Override // uc.l
    public jc.w invoke(jc.w wVar) {
        ManualSettingsLoadActivity manualSettingsLoadActivity = this.f38435c;
        String string = manualSettingsLoadActivity.getString(R.string.settings_saved);
        fd.j0.h(string, "getString(R.string.settings_saved)");
        ManualSettingsLoadActivity.h(manualSettingsLoadActivity, string);
        this.f38435c.updateUi();
        ManualSettingsLoadActivity.k(this.f38435c, false, 1);
        return jc.w.f31842a;
    }
}
