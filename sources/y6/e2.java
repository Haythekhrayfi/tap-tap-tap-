package y6;

import com.inscode.autoclicker.service.RecordSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class e2 extends vc.l implements uc.l<Throwable, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecordSettingsLoadActivity f38187c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(RecordSettingsLoadActivity recordSettingsLoadActivity) {
        super(1);
        this.f38187c = recordSettingsLoadActivity;
    }

    @Override // uc.l
    public jc.w invoke(Throwable th) {
        RecordSettingsLoadActivity recordSettingsLoadActivity = this.f38187c;
        recordSettingsLoadActivity.runOnUiThread(new androidx.appcompat.app.s(th, recordSettingsLoadActivity));
        return jc.w.f31842a;
    }
}
