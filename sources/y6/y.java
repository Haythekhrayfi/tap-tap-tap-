package y6;

import android.app.Activity;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends vc.l implements uc.l<v6.a, me.a<? extends String>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f38428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f38429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f38430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(s sVar, Activity activity, File file) {
        super(1);
        this.f38428c = sVar;
        this.f38429d = activity;
        this.f38430e = file;
    }

    @Override // uc.l
    public me.a<? extends String> invoke(v6.a aVar) {
        v6.a aVar2 = aVar;
        fd.j0.i(aVar2, "it");
        return this.f38428c.a(this.f38429d, this.f38430e, aVar2, aVar2.getName(), "record").o();
    }
}
