package y6;

import android.app.Activity;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends vc.l implements uc.l<u6.a, me.a<? extends String>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f38400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Activity f38401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ File f38402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s sVar, Activity activity, File file) {
        super(1);
        this.f38400c = sVar;
        this.f38401d = activity;
        this.f38402e = file;
    }

    @Override // uc.l
    public me.a<? extends String> invoke(u6.a aVar) {
        u6.a aVar2 = aVar;
        fd.j0.i(aVar2, "it");
        return this.f38400c.a(this.f38401d, this.f38402e, aVar2, aVar2.getName(), "manual").o();
    }
}
