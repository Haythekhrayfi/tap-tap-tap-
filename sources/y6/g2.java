package y6;

import com.inscode.autoclicker.service.RecordSettingsLoadActivity;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class g2 extends vc.l implements uc.l<File, lb.j<? extends Boolean>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecordSettingsLoadActivity f38196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(RecordSettingsLoadActivity recordSettingsLoadActivity) {
        super(1);
        this.f38196c = recordSettingsLoadActivity;
    }

    @Override // uc.l
    public lb.j<? extends Boolean> invoke(File file) {
        File file2 = file;
        fd.j0.i(file2, "it");
        lb.i<Boolean> iVarP = ((s) this.f38196c.f13177c.getValue()).c(this.f38196c, "record", file2).p();
        x6.b bVar = new x6.b(new e2(this.f38196c), 12);
        pb.b<? super Boolean> bVar2 = rb.a.f35360c;
        pb.a aVar = rb.a.f35359b;
        return iVarP.i(bVar2, bVar, aVar, aVar).r(new p6.a(f2.f38191c, 22));
    }
}
