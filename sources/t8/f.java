package t8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f35714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f35715d;

    public f(View view, g gVar) {
        this.f35714c = view;
        this.f35715d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35715d.f35717b.clear();
    }
}
