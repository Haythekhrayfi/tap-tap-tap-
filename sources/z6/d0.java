package z6;

import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends vc.l implements uc.l<File, lb.j<? extends Boolean>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinedRecordingsActivity f45043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(CombinedRecordingsActivity combinedRecordingsActivity) {
        super(1);
        this.f45043c = combinedRecordingsActivity;
    }

    @Override // uc.l
    public lb.j<? extends Boolean> invoke(File file) {
        File file2 = file;
        fd.j0.i(file2, "it");
        lb.i<Boolean> iVarP = ((y6.s) this.f45043c.f13233c.getValue()).c(this.f45043c, "combination", file2).p();
        x6.b bVar = new x6.b(new b0(this.f45043c), 15);
        pb.b<? super Boolean> bVar2 = rb.a.f35360c;
        pb.a aVar = rb.a.f35359b;
        return iVarP.i(bVar2, bVar, aVar, aVar).r(new p6.a(c0.f45039c, 27));
    }
}
