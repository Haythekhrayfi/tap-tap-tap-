package y6;

import com.inscode.autoclicker.service.ManualSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends vc.l implements uc.l<Throwable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38384c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ManualSettingsLoadActivity manualSettingsLoadActivity) {
        super(1);
        this.f38384c = manualSettingsLoadActivity;
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        ManualSettingsLoadActivity manualSettingsLoadActivity = this.f38384c;
        manualSettingsLoadActivity.runOnUiThread(new androidx.appcompat.app.s(th, manualSettingsLoadActivity));
        return jc.w.f31842a;
    }
}
