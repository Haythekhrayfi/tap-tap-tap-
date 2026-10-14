package y6;

import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s2 extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecordSettingsLoadActivity f38387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v6.a f38388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(RecordSettingsLoadActivity recordSettingsLoadActivity, v6.a aVar) {
        super(1);
        this.f38387c = recordSettingsLoadActivity;
        this.f38388d = aVar;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        String str2 = str;
        fd.j0.i(str2, "name");
        RecordSettingsLoadActivity recordSettingsLoadActivity = this.f38387c;
        int i10 = RecordSettingsLoadActivity.f13175l;
        v6.a aVar = recordSettingsLoadActivity.i().f28802c;
        if (fd.j0.d(aVar.getName(), this.f38388d.getName())) {
            aVar.j(str2);
        }
        d7.g gVarI = this.f38387c.i();
        v6.a aVar2 = this.f38388d;
        Objects.requireNonNull(gVarI);
        fd.j0.i(aVar2, "settings");
        ec.a.f(gVarI.f28801b.remove(aVar2.getName()).n(fc.a.f29534b).i(mb.a.a()), null, new r2(this.f38388d, str2, this.f38387c), 1);
        return jc.w.f31842a;
    }
}
