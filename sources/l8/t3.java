package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class t3 implements p7.d, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f32857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc.l<Object, jc.w> f32858e;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f32859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ uc.l f32860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ View f32861e;

        public a(View view, uc.l lVar, View view2) {
            this.f32859c = view;
            this.f32860d = lVar;
            this.f32861e = view2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f32860d.invoke(Integer.valueOf(this.f32861e.getWidth()));
        }
    }

    public t3(View view, uc.l<Object, jc.w> lVar) {
        this.f32857d = view;
        this.f32858e = lVar;
        this.f32856c = view.getWidth();
        view.addOnLayoutChangeListener(this);
        p0.x.a(view, new a(view, lVar, view));
    }

    @Override // p7.d, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.f32857d.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        fd.j0.i(view, "v");
        int width = view.getWidth();
        if (this.f32856c == width) {
            return;
        }
        this.f32856c = width;
        this.f32858e.invoke(Integer.valueOf(width));
    }
}
