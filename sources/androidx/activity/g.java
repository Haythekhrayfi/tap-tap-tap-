package androidx.activity;

import android.window.OnBackInvokedCallback;
import androidx.appcompat.app.AppCompatDelegateImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f500b;

    public /* synthetic */ g(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f499a = 2;
        this.f500b = appCompatDelegateImpl;
    }

    public /* synthetic */ g(Runnable runnable, int i10) {
        this.f499a = i10;
        this.f500b = runnable;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f499a) {
            case 0:
                ((Runnable) this.f500b).run();
                break;
            case 1:
                ((Runnable) this.f500b).run();
                break;
            default:
                ((AppCompatDelegateImpl) this.f500b).V();
                break;
        }
    }
}
