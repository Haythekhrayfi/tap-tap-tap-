package y6;

import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r2 extends vc.l implements uc.l<jc.w, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v6.a f38373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ RecordSettingsLoadActivity f38375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(v6.a aVar, String str, RecordSettingsLoadActivity recordSettingsLoadActivity) {
        super(1);
        this.f38373c = aVar;
        this.f38374d = str;
        this.f38375e = recordSettingsLoadActivity;
    }

    @Override // uc.l
    public jc.w invoke(jc.w wVar) {
        this.f38373c.j(this.f38374d);
        RecordSettingsLoadActivity recordSettingsLoadActivity = this.f38375e;
        int i10 = RecordSettingsLoadActivity.f13175l;
        recordSettingsLoadActivity.updateUi();
        RecordSettingsLoadActivity recordSettingsLoadActivity2 = this.f38375e;
        v6.a aVar = this.f38373c;
        d7.g gVarI = recordSettingsLoadActivity2.i();
        Objects.requireNonNull(gVarI);
        fd.j0.i(aVar, "settings");
        nb.b bVarF = ec.a.f(gVarI.f28801b.d(aVar).n(fc.a.f29534b).i(mb.a.a()), null, new l2(recordSettingsLoadActivity2), 1);
        p6.b.a(bVarF, "$receiver", recordSettingsLoadActivity2.f13182h, "compositeDisposable", bVarF);
        return jc.w.f31842a;
    }
}
