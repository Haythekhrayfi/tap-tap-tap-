package y6;

import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u6.a f38210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ManualSettingsLoadActivity manualSettingsLoadActivity, u6.a aVar) {
        super(1);
        this.f38209c = manualSettingsLoadActivity;
        this.f38210d = aVar;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        String str2 = str;
        fd.j0.i(str2, "name");
        ManualSettingsLoadActivity manualSettingsLoadActivity = this.f38209c;
        int i10 = ManualSettingsLoadActivity.f13134n;
        u6.a aVar = manualSettingsLoadActivity.i().f161c;
        if (fd.j0.d(aVar.getName(), this.f38210d.getName())) {
            aVar.k(str2);
        }
        a7.a aVarI = this.f38209c.i();
        u6.a aVar2 = this.f38210d;
        Objects.requireNonNull(aVarI);
        fd.j0.i(aVar2, "settings");
        ec.a.f(aVarI.f160b.remove(aVar2.getName()).n(fc.a.f29534b).i(mb.a.a()), null, new h1(this.f38210d, str2, this.f38209c), 1);
        return jc.w.f31842a;
    }
}
