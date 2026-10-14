package fb;

import com.google.android.play.core.tasks.OnSuccessListener;
import fd.j0;
import uc.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f29526b;

    public /* synthetic */ c(l lVar, int i10) {
        this.f29525a = i10;
        this.f29526b = lVar;
    }

    @Override // com.google.android.play.core.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.f29525a) {
            case 0:
                l lVar = this.f29526b;
                j0.i(lVar, "$tmp0");
                lVar.invoke(obj);
                break;
            default:
                l lVar2 = this.f29526b;
                j0.i(lVar2, "$tmp0");
                lVar2.invoke(obj);
                break;
        }
    }
}
