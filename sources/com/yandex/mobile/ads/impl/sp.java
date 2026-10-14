package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class sp implements z7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e20 f25152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r90 f25153b;

    public static final class a implements e20.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f25154a;

        public a(ImageView imageView) {
            this.f25154a = imageView;
        }

        @Override // com.yandex.mobile.ads.impl.gx0.a
        public final void a(bi1 bi1Var) {
        }

        @Override // com.yandex.mobile.ads.impl.e20.d
        public final void a(e20.c cVar, boolean z10) {
            Bitmap bitmapB = cVar.b();
            if (bitmapB != null) {
                this.f25154a.setImageBitmap(bitmapB);
            }
        }
    }

    public static final class b implements e20.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z7.c f25155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f25156b;

        public b(String str, z7.c cVar) {
            this.f25155a = cVar;
            this.f25156b = str;
        }

        @Override // com.yandex.mobile.ads.impl.gx0.a
        public final void a(bi1 bi1Var) {
            this.f25155a.a();
        }

        @Override // com.yandex.mobile.ads.impl.e20.d
        public final void a(e20.c cVar, boolean z10) {
            Bitmap bitmapB = cVar.b();
            if (bitmapB != null) {
                this.f25155a.b(new z7.b(bitmapB, Uri.parse(this.f25156b), z10 ? z7.a.MEMORY : z7.a.NETWORK));
            }
        }
    }

    public sp(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        e20 e20VarA = hn0.c(context).a();
        fd.j0.h(e20VarA, "getInstance(context).imageLoader");
        this.f25152a = e20VarA;
        this.f25153b = new r90();
    }

    private final z7.e a(String str, z7.c cVar) {
        vc.a0 a0Var = new vc.a0();
        this.f25153b.a(new io1(a0Var, this, str, cVar));
        return new dq1(a0Var, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(vc.a0 a0Var) {
        fd.j0.i(a0Var, "$imageContainer");
        e20.c cVar = (e20.c) a0Var.f36988c;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.yandex.mobile.ads.impl.e20$c] */
    public static final void a(vc.a0 a0Var, sp spVar, String str, ImageView imageView) {
        fd.j0.i(a0Var, "$imageContainer");
        fd.j0.i(spVar, "this$0");
        fd.j0.i(str, "$imageUrl");
        fd.j0.i(imageView, "$imageView");
        a0Var.f36988c = spVar.f25152a.a(str, new a(imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, com.yandex.mobile.ads.impl.e20$c] */
    public static final void a(vc.a0 a0Var, sp spVar, String str, z7.c cVar) {
        fd.j0.i(a0Var, "$imageContainer");
        fd.j0.i(spVar, "this$0");
        fd.j0.i(str, "$imageUrl");
        fd.j0.i(cVar, "$callback");
        a0Var.f36988c = spVar.f25152a.a(str, new b(str, cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(vc.a0 a0Var) {
        fd.j0.i(a0Var, "$imageContainer");
        e20.c cVar = (e20.c) a0Var.f36988c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final z7.e loadImage(String str, ImageView imageView) {
        fd.j0.i(str, "imageUrl");
        fd.j0.i(imageView, "imageView");
        vc.a0 a0Var = new vc.a0();
        this.f25153b.a(new io1(a0Var, this, str, imageView));
        return new dq1(a0Var, 1);
    }

    @Override // z7.d
    public final z7.e loadImage(String str, z7.c cVar) {
        fd.j0.i(str, "imageUrl");
        fd.j0.i(cVar, "callback");
        return a(str, cVar);
    }

    @Override // z7.d
    public z7.e loadImage(String str, z7.c cVar, int i10) {
        return loadImage(str, cVar);
    }

    @Override // z7.d
    public final z7.e loadImageBytes(String str, z7.c cVar) {
        fd.j0.i(str, "imageUrl");
        fd.j0.i(cVar, "callback");
        return a(str, cVar);
    }

    @Override // z7.d
    public z7.e loadImageBytes(String str, z7.c cVar, int i10) {
        return loadImageBytes(str, cVar);
    }
}
