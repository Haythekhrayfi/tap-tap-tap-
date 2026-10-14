package y6;

import android.content.Intent;
import com.inscode.autoclicker.service.RecordSettingsLoadActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 extends vc.l implements uc.l<Boolean, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecordSettingsLoadActivity f38293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v6.a f38294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(RecordSettingsLoadActivity recordSettingsLoadActivity, v6.a aVar) {
        super(1);
        this.f38293c = recordSettingsLoadActivity;
        this.f38294d = aVar;
    }

    @Override // uc.l
    public jc.w invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f38293c.f13178d = this.f38294d;
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            v6.a aVar = this.f38294d;
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("text/*");
            intent.putExtra("android.intent.extra.TITLE", aVar.getName() + ".cm");
            ma.h.f33410y.a().j();
            this.f38293c.startActivityForResult(intent, RecordSettingsLoadActivity.f13176m);
        }
        return jc.w.f31842a;
    }
}
