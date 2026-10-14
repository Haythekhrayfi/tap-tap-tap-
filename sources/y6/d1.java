package y6;

import android.content.Intent;
import com.inscode.autoclicker.service.ManualSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends vc.l implements uc.l<Boolean, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u6.a f38183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ManualSettingsLoadActivity manualSettingsLoadActivity, u6.a aVar) {
        super(1);
        this.f38182c = manualSettingsLoadActivity;
        this.f38183d = aVar;
    }

    @Override // uc.l
    public jc.w invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f38182c.f13137d = this.f38183d;
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            u6.a aVar = this.f38183d;
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("text/*");
            intent.putExtra("android.intent.extra.TITLE", aVar.getName() + ".cm");
            ma.h.f33410y.a().j();
            this.f38182c.startActivityForResult(intent, ManualSettingsLoadActivity.f13135o);
        }
        return jc.w.f31842a;
    }
}
