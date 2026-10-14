package z6;

import android.content.Intent;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends vc.l implements uc.l<Boolean, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinedRecordingsActivity f45103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t6.a f45104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(CombinedRecordingsActivity combinedRecordingsActivity, t6.a aVar) {
        super(1);
        this.f45103c = combinedRecordingsActivity;
        this.f45104d = aVar;
    }

    @Override // uc.l
    public jc.w invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f45103c.f13234d = this.f45104d;
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            t6.a aVar = this.f45104d;
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("text/*");
            intent.putExtra("android.intent.extra.TITLE", aVar.getName() + ".cm");
            ma.h.f33410y.a().j();
            this.f45103c.startActivityForResult(intent, CombinedRecordingsActivity.f13232m);
        }
        return jc.w.f31842a;
    }
}
