package y6;

import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 extends vc.l implements uc.l<jc.w, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u6.a f38202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38204e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(u6.a aVar, String str, ManualSettingsLoadActivity manualSettingsLoadActivity) {
        super(1);
        this.f38202c = aVar;
        this.f38203d = str;
        this.f38204e = manualSettingsLoadActivity;
    }

    @Override // uc.l
    public jc.w invoke(jc.w wVar) {
        this.f38202c.k(this.f38203d);
        ManualSettingsLoadActivity manualSettingsLoadActivity = this.f38204e;
        int i10 = ManualSettingsLoadActivity.f13134n;
        manualSettingsLoadActivity.updateUi();
        ManualSettingsLoadActivity manualSettingsLoadActivity2 = this.f38204e;
        u6.a aVar = this.f38202c;
        a7.a aVarI = manualSettingsLoadActivity2.i();
        Objects.requireNonNull(aVarI);
        fd.j0.i(aVar, "settings");
        nb.b bVarF = ec.a.f(aVarI.f160b.d(aVar).n(fc.a.f29534b).i(mb.a.a()), null, new z0(manualSettingsLoadActivity2), 1);
        p6.b.a(bVarF, "$receiver", manualSettingsLoadActivity2.f13142i, "compositeDisposable", bVarF);
        return jc.w.f31842a;
    }
}
