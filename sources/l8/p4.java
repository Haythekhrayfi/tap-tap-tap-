package l8;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.ListIterator;
import y9.s6;

/* JADX INFO: loaded from: classes2.dex */
public final class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f32739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p7.h f32740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y7.a f32741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w7.b f32742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q8.e f32743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f32744f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q8.d f32745g;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f32746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o8.p f32747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ p4 f32748e;

        public a(View view, o8.p pVar, p4 p4Var) {
            this.f32746c = view;
            this.f32747d = pVar;
            this.f32748e = p4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            q8.d dVar;
            q8.d dVar2;
            if (this.f32747d.getActiveTickMarkDrawable() == null && this.f32747d.getInactiveTickMarkDrawable() == null) {
                return;
            }
            float maxValue = this.f32747d.getMaxValue() - this.f32747d.getMinValue();
            Drawable activeTickMarkDrawable = this.f32747d.getActiveTickMarkDrawable();
            boolean z10 = false;
            int intrinsicWidth = activeTickMarkDrawable == null ? 0 : activeTickMarkDrawable.getIntrinsicWidth();
            Drawable inactiveTickMarkDrawable = this.f32747d.getInactiveTickMarkDrawable();
            if (Math.max(intrinsicWidth, inactiveTickMarkDrawable == null ? 0 : inactiveTickMarkDrawable.getIntrinsicWidth()) * maxValue <= this.f32747d.getWidth() || (dVar = this.f32748e.f32745g) == null) {
                return;
            }
            ListIterator<Throwable> listIterator = dVar.f34811e.listIterator();
            while (listIterator.hasNext()) {
                if (fd.j0.d(listIterator.next().getMessage(), "Slider ticks overlap each other.")) {
                    z10 = true;
                }
            }
            if (z10 || (dVar2 = this.f32748e.f32745g) == null) {
                return;
            }
            dVar2.b(new Throwable("Slider ticks overlap each other."));
        }
    }

    public p4(v vVar, p7.h hVar, y7.a aVar, w7.b bVar, q8.e eVar, boolean z10) {
        fd.j0.i(vVar, "baseBinder");
        fd.j0.i(hVar, "logger");
        fd.j0.i(aVar, "typefaceProvider");
        fd.j0.i(bVar, "variableBinder");
        fd.j0.i(eVar, "errorCollectors");
        this.f32739a = vVar;
        this.f32740b = hVar;
        this.f32741c = aVar;
        this.f32742d = bVar;
        this.f32743e = eVar;
        this.f32744f = z10;
    }

    public final void a(r9.d dVar, v9.d dVar2, s6.e eVar) {
        s9.b bVar;
        if (eVar == null) {
            bVar = null;
        } else {
            DisplayMetrics displayMetrics = dVar.getResources().getDisplayMetrics();
            fd.j0.h(displayMetrics, "resources.displayMetrics");
            bVar = new s9.b(u1.a.d(eVar, displayMetrics, this.f32741c, dVar2));
        }
        dVar.setThumbSecondTextDrawable(bVar);
    }

    public final void b(r9.d dVar, v9.d dVar2, s6.e eVar) {
        s9.b bVar;
        if (eVar == null) {
            bVar = null;
        } else {
            DisplayMetrics displayMetrics = dVar.getResources().getDisplayMetrics();
            fd.j0.h(displayMetrics, "resources.displayMetrics");
            bVar = new s9.b(u1.a.d(eVar, displayMetrics, this.f32741c, dVar2));
        }
        dVar.setThumbTextDrawable(bVar);
    }

    public final void c(o8.p pVar) {
        if (!this.f32744f || this.f32745g == null) {
            return;
        }
        p0.x.a(pVar, new a(pVar, pVar, this));
    }
}
