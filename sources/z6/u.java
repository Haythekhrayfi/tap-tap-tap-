package z6;

import android.content.res.Resources;
import com.inscode.autoclicker.service.combine.CombinedRecordingsActivity;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CombinedRecordingsActivity f45139c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(CombinedRecordingsActivity combinedRecordingsActivity) {
        super(1);
        this.f45139c = combinedRecordingsActivity;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        String str2 = str;
        fd.j0.i(str2, "name");
        t6.a aVar = new t6.a(null, null, 0L, 0L, 0, 0L, 63, null);
        aVar.h(str2);
        aVar.m(System.currentTimeMillis());
        CombinedRecordingsActivity combinedRecordingsActivity = this.f45139c;
        int i10 = CombinedRecordingsActivity.f13231l;
        combinedRecordingsActivity.updateUi();
        CombinedRecordingsActivity combinedRecordingsActivity2 = this.f45139c;
        Objects.requireNonNull(combinedRecordingsActivity2);
        aVar.m(System.currentTimeMillis());
        aVar.i(Resources.getSystem().getConfiguration().orientation);
        r rVarH = combinedRecordingsActivity2.h();
        Objects.requireNonNull(rVarH);
        fd.j0.i(aVar, "settings");
        nb.b bVarC = ec.a.c(rVarH.f45129b.d(aVar).n(fc.a.f29534b).i(mb.a.a()), i0.f45059c, new j0(combinedRecordingsActivity2));
        p6.b.a(bVarC, "$receiver", combinedRecordingsActivity2.f13238h, "compositeDisposable", bVarC);
        return jc.w.f31842a;
    }
}
