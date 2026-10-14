package y6;

import android.app.Activity;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends vc.l implements uc.l<t6.a, me.a<? extends String>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f38105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f38106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f38107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(s sVar, Activity activity, File file) {
        super(1);
        this.f38105c = sVar;
        this.f38106d = activity;
        this.f38107e = file;
    }

    @Override // uc.l
    public me.a<? extends String> invoke(t6.a aVar) {
        t6.a aVar2 = aVar;
        fd.j0.i(aVar2, "it");
        return this.f38105c.a(this.f38106d, this.f38107e, aVar2, aVar2.getName(), "combination").o();
    }
}
