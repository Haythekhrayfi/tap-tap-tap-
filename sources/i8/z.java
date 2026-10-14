package i8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.inscode.autoclicker.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7.g f31495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f31496b;

    public static final class a extends vc.l implements uc.l<Bitmap, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q8.d f31497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ uc.l<Drawable, jc.w> f31498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ z f31499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f31500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ uc.l<Bitmap, jc.w> f31501g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q8.d dVar, uc.l<? super Drawable, jc.w> lVar, z zVar, int i10, uc.l<? super Bitmap, jc.w> lVar2) {
            super(1);
            this.f31497c = dVar;
            this.f31498d = lVar;
            this.f31499e = zVar;
            this.f31500f = i10;
            this.f31501g = lVar2;
        }

        @Override // uc.l
        public jc.w invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (bitmap2 == null) {
                this.f31497c.b(new Throwable("Preview doesn't contain base64 image"));
                this.f31498d.invoke(this.f31499e.f31495a.a(this.f31500f));
            } else {
                this.f31501g.invoke(bitmap2);
            }
            return jc.w.f31842a;
        }
    }

    public z(p7.g gVar, ExecutorService executorService) {
        fd.j0.i(gVar, "imageStubProvider");
        fd.j0.i(executorService, "executorService");
        this.f31495a = gVar;
        this.f31496b = executorService;
    }

    public void a(o8.w wVar, q8.d dVar, String str, int i10, boolean z10, uc.l<? super Drawable, jc.w> lVar, uc.l<? super Bitmap, jc.w> lVar2) {
        fd.j0.i(dVar, "errorCollector");
        Object objSubmit = null;
        if (str != null) {
            a aVar = new a(dVar, lVar, this, i10, lVar2);
            u8.w wVar2 = (u8.w) wVar;
            Future<?> loadingTask = wVar2.getLoadingTask();
            if (loadingTask != null) {
                loadingTask.cancel(true);
            }
            p7.b bVar = new p7.b(str, z10, new a0(aVar, wVar));
            if (z10) {
                bVar.run();
            } else {
                objSubmit = this.f31496b.submit(bVar);
            }
            if (objSubmit != null) {
                wVar2.setTag(R.id.bitmap_load_references_tag, objSubmit);
            }
            objSubmit = jc.w.f31842a;
        }
        if (objSubmit == null) {
            lVar.invoke(this.f31495a.a(i10));
        }
    }
}
