package l8;

import android.os.AsyncTask;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 extends p7.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.a f32901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o8.e f32902b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(i8.k kVar, com.yandex.div.core.view2.divs.a aVar, o8.e eVar) {
        super(kVar);
        this.f32901a = aVar;
        this.f32902b = eVar;
    }

    @Override // z7.c
    public void a() {
        this.f32902b.setGifUrl$div_release(null);
    }

    @Override // z7.c
    public void b(z7.b bVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f32902b.setImage(bVar.f45158a);
            this.f32902b.i();
            return;
        }
        com.yandex.div.core.view2.divs.a aVar = this.f32901a;
        o8.e eVar = this.f32902b;
        int i10 = com.yandex.div.core.view2.divs.a.f13421e;
        Objects.requireNonNull(aVar);
        new com.yandex.div.core.view2.divs.a.b(new WeakReference(eVar), bVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
