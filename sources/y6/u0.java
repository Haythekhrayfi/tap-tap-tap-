package y6;

import com.inscode.autoclicker.service.ManualSettingsLoadActivity;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends vc.l implements uc.l<File, lb.j<? extends Boolean>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ManualSettingsLoadActivity f38395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ManualSettingsLoadActivity manualSettingsLoadActivity) {
        super(1);
        this.f38395c = manualSettingsLoadActivity;
    }

    @Override // uc.l
    public lb.j<? extends Boolean> invoke(File file) {
        File file2 = file;
        fd.j0.i(file2, "it");
        lb.i<Boolean> iVarP = ((s) this.f38395c.f13136c.getValue()).c(this.f38395c, "manual", file2).p();
        x6.b bVar = new x6.b(new s0(this.f38395c), 10);
        pb.b<? super Boolean> bVar2 = rb.a.f35360c;
        pb.a aVar = rb.a.f35359b;
        return iVarP.i(bVar2, bVar, aVar, aVar).r(new p6.a(t0.f38391c, 17));
    }
}
