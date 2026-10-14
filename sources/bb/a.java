package bb;

import android.os.Bundle;
import androidx.fragment.app.a0;
import fd.j0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements a0, androidx.activity.result.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc.a f3460c;

    @Override // androidx.activity.result.a
    public void a(Object obj) {
        uc.a aVar = this.f3460c;
        Integer num = (Integer) obj;
        j0.i(aVar, "$doOnDelete");
        if (num != null && num.intValue() == 1347566) {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.a0
    public void b(String str, Bundle bundle) {
        uc.a aVar = this.f3460c;
        j0.i(aVar, "$action");
        j0.i(str, "requestKey");
        j0.i(bundle, "bundle");
        if (j0.d(str, "REQUEST_ACCOUNT_DELETE") && bundle.getInt("RESULT") == 13627834) {
            aVar.invoke();
        }
    }
}
