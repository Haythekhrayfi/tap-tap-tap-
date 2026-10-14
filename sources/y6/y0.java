package y6;

import com.inscode.autoclicker.service.ManualSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends vc.l implements uc.l<jc.w, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u6.a f38432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(ManualSettingsLoadActivity manualSettingsLoadActivity, u6.a aVar) {
        super(1);
        this.f38431c = manualSettingsLoadActivity;
        this.f38432d = aVar;
    }

    @Override // uc.l
    public jc.w invoke(jc.w wVar) {
        this.f38431c.f13139f.remove(this.f38432d);
        xe.a.f37601c.a("[MANUAL_SETTINGS] Removed settings: " + this.f38432d.getName(), new Object[0]);
        return jc.w.f31842a;
    }
}
