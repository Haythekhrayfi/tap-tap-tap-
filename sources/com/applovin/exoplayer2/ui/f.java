package com.applovin.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.classic.Level;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.l.ab;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.t;
import com.applovin.sdk.R;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends FrameLayout {
    private final Drawable A;
    private final Drawable B;
    private final float C;
    private final float D;
    private final String E;
    private final String F;
    private an G;
    private com.applovin.exoplayer2.i H;
    private c I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private long V;
    private long[] W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f8072a;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    private boolean[] f8073aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private long[] f8074ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    private boolean[] f8075ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    private long f8076ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    private long f8077ae;
    private long af;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<d> f8078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f8079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f8080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View f8081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f8082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View f8083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View f8084h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ImageView f8085i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImageView f8086j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f8087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final TextView f8088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final TextView f8089m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final k f8090n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final StringBuilder f8091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Formatter f8092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ba.a f8093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ba.c f8094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f8095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f8096t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Drawable f8097u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Drawable f8098v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Drawable f8099w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f8100x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f8101y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f8102z;

    public static final class a {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public final class b implements View.OnClickListener, an.d, k.a {
        private b() {
        }

        @Override // com.applovin.exoplayer2.an.d, com.applovin.exoplayer2.an.b
        public void a(an anVar, an.c cVar) {
            if (cVar.a(4, 5)) {
                f.this.f();
            }
            if (cVar.a(4, 5, 7)) {
                f.this.k();
            }
            if (cVar.a(8)) {
                f.this.h();
            }
            if (cVar.a(9)) {
                f.this.i();
            }
            if (cVar.a(8, 9, 11, 0, 13)) {
                f.this.g();
            }
            if (cVar.a(11, 0)) {
                f.this.j();
            }
        }

        @Override // com.applovin.exoplayer2.ui.k.a
        public void a(k kVar, long j10) {
            f.this.M = true;
            if (f.this.f8089m != null) {
                f.this.f8089m.setText(ai.a(f.this.f8091o, f.this.f8092p, j10));
            }
        }

        @Override // com.applovin.exoplayer2.ui.k.a
        public void a(k kVar, long j10, boolean z10) {
            f.this.M = false;
            if (z10 || f.this.G == null) {
                return;
            }
            f fVar = f.this;
            fVar.a(fVar.G, j10);
        }

        @Override // com.applovin.exoplayer2.ui.k.a
        public void b(k kVar, long j10) {
            if (f.this.f8089m != null) {
                f.this.f8089m.setText(ai.a(f.this.f8091o, f.this.f8092p, j10));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            an anVar = f.this.G;
            if (anVar == null) {
                return;
            }
            if (f.this.f8080d == view) {
                f.this.H.c(anVar);
                return;
            }
            if (f.this.f8079c == view) {
                f.this.H.b(anVar);
                return;
            }
            if (f.this.f8083g == view) {
                if (anVar.t() != 4) {
                    f.this.H.e(anVar);
                    return;
                }
                return;
            }
            if (f.this.f8084h == view) {
                f.this.H.d(anVar);
                return;
            }
            if (f.this.f8081e == view) {
                f.this.b(anVar);
                return;
            }
            if (f.this.f8082f == view) {
                f.this.c(anVar);
            } else if (f.this.f8085i == view) {
                f.this.H.a(anVar, ab.a(anVar.y(), f.this.P));
            } else if (f.this.f8086j == view) {
                f.this.H.b(anVar, !anVar.z());
            }
        }
    }

    public interface c {
        void a(long j10, long j11);
    }

    public interface d {
        void a(int i10);
    }

    static {
        t.a("goog.exo.ui");
    }

    public f(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int resourceId = R.layout.applovin_exo_player_control_view;
        this.N = Level.TRACE_INT;
        final int i11 = 0;
        this.P = 0;
        this.O = 200;
        this.V = -9223372036854775807L;
        final int i12 = 1;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinPlayerControlView, i10, 0);
            try {
                this.N = typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_show_timeout, this.N);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerControlView_al_controller_layout_id, resourceId);
                this.P = a(typedArrayObtainStyledAttributes, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_rewind_button, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_fastforward_button, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_previous_button, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_next_button, this.T);
                this.U = typedArrayObtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerControlView_al_show_shuffle_button, this.U);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.AppLovinPlayerControlView_al_time_bar_min_update_interval, this.O));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f8078b = new CopyOnWriteArrayList<>();
        this.f8093q = new ba.a();
        this.f8094r = new ba.c();
        StringBuilder sb2 = new StringBuilder();
        this.f8091o = sb2;
        this.f8092p = new Formatter(sb2, Locale.getDefault());
        this.W = new long[0];
        this.f8073aa = new boolean[0];
        this.f8074ab = new long[0];
        this.f8075ac = new boolean[0];
        b bVar = new b();
        this.f8072a = bVar;
        this.H = new com.applovin.exoplayer2.j();
        this.f8095s = new Runnable(this) { // from class: com.applovin.exoplayer2.ui.n

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f f8182d;

            {
                this.f8182d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f8182d.k();
                        break;
                    default:
                        this.f8182d.b();
                        break;
                }
            }
        };
        this.f8096t = new Runnable(this) { // from class: com.applovin.exoplayer2.ui.n

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f f8182d;

            {
                this.f8182d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.f8182d.k();
                        break;
                    default:
                        this.f8182d.b();
                        break;
                }
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        int i13 = R.id.al_exo_progress;
        k kVar = (k) findViewById(i13);
        View viewFindViewById = findViewById(R.id.al_exo_progress_placeholder);
        k kVar2 = kVar;
        if (kVar != null) {
            this.f8090n = kVar2;
        } else if (viewFindViewById != null) {
            com.applovin.exoplayer2.ui.d dVar = new com.applovin.exoplayer2.ui.d(context, null, 0, attributeSet2);
            dVar.setId(i13);
            dVar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(dVar, iIndexOfChild);
            kVar2 = dVar;
            this.f8090n = kVar2;
        } else {
            this.f8090n = null;
        }
        this.f8088l = (TextView) findViewById(R.id.al_exo_duration);
        this.f8089m = (TextView) findViewById(R.id.al_exo_position);
        k kVar3 = this.f8090n;
        if (kVar3 != null) {
            kVar3.a(bVar);
        }
        View viewFindViewById2 = findViewById(R.id.al_exo_play);
        this.f8081e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(bVar);
        }
        View viewFindViewById3 = findViewById(R.id.al_exo_pause);
        this.f8082f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(bVar);
        }
        View viewFindViewById4 = findViewById(R.id.al_exo_prev);
        this.f8079c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(bVar);
        }
        View viewFindViewById5 = findViewById(R.id.al_exo_next);
        this.f8080d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(bVar);
        }
        View viewFindViewById6 = findViewById(R.id.al_exo_rew);
        this.f8084h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(bVar);
        }
        View viewFindViewById7 = findViewById(R.id.al_exo_ffwd);
        this.f8083g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.al_exo_repeat_toggle);
        this.f8085i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_shuffle);
        this.f8086j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View viewFindViewById8 = findViewById(R.id.al_exo_vr);
        this.f8087k = viewFindViewById8;
        setShowVrButton(false);
        a(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.C = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.D = resources.getInteger(R.integer.al_exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.f8097u = resources.getDrawable(R.drawable.al_exo_controls_repeat_off);
        this.f8098v = resources.getDrawable(R.drawable.al_exo_controls_repeat_one);
        this.f8099w = resources.getDrawable(R.drawable.al_exo_controls_repeat_all);
        this.A = resources.getDrawable(R.drawable.al_exo_controls_shuffle_on);
        this.B = resources.getDrawable(R.drawable.al_exo_controls_shuffle_off);
        this.f8100x = resources.getString(R.string.al_exo_controls_repeat_off_description);
        this.f8101y = resources.getString(R.string.al_exo_controls_repeat_one_description);
        this.f8102z = resources.getString(R.string.al_exo_controls_repeat_all_description);
        this.E = resources.getString(R.string.al_exo_controls_shuffle_on_description);
        this.F = resources.getString(R.string.al_exo_controls_shuffle_off_description);
    }

    private static int a(TypedArray typedArray, int i10) {
        return typedArray.getInt(R.styleable.AppLovinPlayerControlView_al_repeat_toggle_modes, i10);
    }

    private void a(an anVar) {
        int iT = anVar.t();
        if (iT == 1 || iT == 4 || !anVar.x()) {
            b(anVar);
        } else {
            c(anVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(an anVar, long j10) {
        int iG;
        ba baVarS = anVar.S();
        if (this.L && !baVarS.d()) {
            int iB = baVarS.b();
            iG = 0;
            while (true) {
                long jC = baVarS.a(iG, this.f8094r).c();
                if (j10 < jC) {
                    break;
                }
                if (iG == iB - 1) {
                    j10 = jC;
                    break;
                } else {
                    j10 -= jC;
                    iG++;
                }
            }
        } else {
            iG = anVar.G();
        }
        a(anVar, iG, j10);
        k();
    }

    private void a(boolean z10, boolean z11, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.C : this.D);
        view.setVisibility(z10 ? 0 : 8);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean a(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    private boolean a(an anVar, int i10, long j10) {
        return this.H.a(anVar, i10, j10);
    }

    private static boolean a(ba baVar, ba.c cVar) {
        if (baVar.b() > 100) {
            return false;
        }
        int iB = baVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            if (baVar.a(i10, cVar).f4704o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(an anVar) {
        int iT = anVar.t();
        if (iT == 1) {
            this.H.a(anVar);
        } else if (iT == 4) {
            a(anVar, anVar.G(), -9223372036854775807L);
        }
        this.H.a(anVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(an anVar) {
        this.H.a(anVar, false);
    }

    private void d() {
        removeCallbacks(this.f8096t);
        if (this.N <= 0) {
            this.V = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i10 = this.N;
        this.V = jUptimeMillis + ((long) i10);
        if (this.J) {
            postDelayed(this.f8096t, i10);
        }
    }

    private void e() {
        f();
        g();
        h();
        i();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (c() && this.J) {
            boolean zN = n();
            View view = this.f8081e;
            boolean z13 = true;
            if (view != null) {
                z10 = (zN && view.isFocused()) | false;
                if (ai.f7595a < 21) {
                    z12 = z10;
                } else {
                    z12 = zN && a.a(this.f8081e);
                }
                z11 = z12 | false;
                this.f8081e.setVisibility(zN ? 8 : 0);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.f8082f;
            if (view2 != null) {
                z10 |= !zN && view2.isFocused();
                if (ai.f7595a < 21) {
                    z13 = z10;
                } else if (zN || !a.a(this.f8082f)) {
                    z13 = false;
                }
                z11 |= z13;
                this.f8082f.setVisibility(zN ? 0 : 8);
            }
            if (z10) {
                l();
            }
            if (z11) {
                m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        boolean z10;
        boolean zA;
        boolean z11;
        boolean z12;
        if (c() && this.J) {
            an anVar = this.G;
            boolean z13 = false;
            if (anVar != null) {
                boolean zA2 = anVar.a(4);
                boolean zA3 = anVar.a(6);
                z12 = anVar.a(10) && this.H.a();
                if (anVar.a(11) && this.H.b()) {
                    z13 = true;
                }
                zA = anVar.a(8);
                z10 = z13;
                z13 = zA3;
                z11 = zA2;
            } else {
                z10 = false;
                zA = false;
                z11 = false;
                z12 = false;
            }
            a(this.S, z13, this.f8079c);
            a(this.Q, z12, this.f8084h);
            a(this.R, z10, this.f8083g);
            a(this.T, zA, this.f8080d);
            k kVar = this.f8090n;
            if (kVar != null) {
                kVar.setEnabled(z11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (c() && this.J && (imageView = this.f8085i) != null) {
            if (this.P == 0) {
                a(false, false, (View) imageView);
                return;
            }
            an anVar = this.G;
            if (anVar == null) {
                a(true, false, (View) imageView);
                this.f8085i.setImageDrawable(this.f8097u);
                this.f8085i.setContentDescription(this.f8100x);
                return;
            }
            a(true, true, (View) imageView);
            int iY = anVar.y();
            if (iY == 0) {
                this.f8085i.setImageDrawable(this.f8097u);
                imageView2 = this.f8085i;
                str = this.f8100x;
            } else {
                if (iY != 1) {
                    if (iY == 2) {
                        this.f8085i.setImageDrawable(this.f8099w);
                        imageView2 = this.f8085i;
                        str = this.f8102z;
                    }
                    this.f8085i.setVisibility(0);
                }
                this.f8085i.setImageDrawable(this.f8098v);
                imageView2 = this.f8085i;
                str = this.f8101y;
            }
            imageView2.setContentDescription(str);
            this.f8085i.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (c() && this.J && (imageView = this.f8086j) != null) {
            an anVar = this.G;
            if (!this.U) {
                a(false, false, (View) imageView);
                return;
            }
            if (anVar != null) {
                a(true, true, (View) imageView);
                this.f8086j.setImageDrawable(anVar.z() ? this.A : this.B);
                imageView2 = this.f8086j;
                if (anVar.z()) {
                    str = this.E;
                }
                imageView2.setContentDescription(str);
            }
            a(true, false, (View) imageView);
            this.f8086j.setImageDrawable(this.B);
            imageView2 = this.f8086j;
            str = this.F;
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3 A[SYNTHETIC] */
    public void j() {
        long j10;
        int i10;
        ba.c cVar;
        long jC;
        long[] jArr;
        int length;
        an anVar = this.G;
        if (anVar == null) {
            return;
        }
        boolean z10 = true;
        this.L = this.K && a(anVar.S(), this.f8094r);
        long j11 = 0;
        this.f8076ad = 0L;
        ba baVarS = anVar.S();
        if (baVarS.d()) {
            j10 = 0;
            i10 = 0;
        } else {
            int iG = anVar.G();
            boolean z11 = this.L;
            int i11 = z11 ? 0 : iG;
            int iB = z11 ? baVarS.b() - 1 : iG;
            long j12 = 0;
            i10 = 0;
            while (i11 <= iB) {
                if (i11 == iG) {
                    this.f8076ad = com.applovin.exoplayer2.h.a(j12);
                }
                baVarS.a(i11, this.f8094r);
                ba.c cVar2 = this.f8094r;
                if (cVar2.f4704o == -9223372036854775807L) {
                    com.applovin.exoplayer2.l.a.b(this.L ^ z10);
                    break;
                }
                int i12 = cVar2.f4705p;
                while (true) {
                    cVar = this.f8094r;
                    if (i12 <= cVar.f4706q) {
                        baVarS.a(i12, this.f8093q);
                        int iE = this.f8093q.e();
                        int iD = this.f8093q.d();
                        while (iE < iD) {
                            long jA = this.f8093q.a(iE);
                            if (jA == Long.MIN_VALUE) {
                                long j13 = this.f8093q.f4679d;
                                if (j13 != -9223372036854775807L) {
                                    jA = j13;
                                    jC = this.f8093q.c() + jA;
                                    if (jC >= j11) {
                                        jArr = this.W;
                                        if (i10 == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.W = Arrays.copyOf(jArr, length);
                                            this.f8073aa = Arrays.copyOf(this.f8073aa, length);
                                        }
                                        this.W[i10] = com.applovin.exoplayer2.h.a(jC + j12);
                                        this.f8073aa[i10] = this.f8093q.c(iE);
                                        i10++;
                                    }
                                }
                            } else {
                                jC = this.f8093q.c() + jA;
                                if (jC >= j11) {
                                    jArr = this.W;
                                    if (i10 == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.W = Arrays.copyOf(jArr, length);
                                        this.f8073aa = Arrays.copyOf(this.f8073aa, length);
                                    }
                                    this.W[i10] = com.applovin.exoplayer2.h.a(jC + j12);
                                    this.f8073aa[i10] = this.f8093q.c(iE);
                                    i10++;
                                }
                            }
                            iE++;
                            j11 = 0;
                        }
                        i12++;
                        j11 = 0;
                    }
                }
                j12 += cVar.f4704o;
                i11++;
                z10 = true;
                j11 = 0;
            }
            j10 = j12;
        }
        long jA2 = com.applovin.exoplayer2.h.a(j10);
        TextView textView = this.f8088l;
        if (textView != null) {
            textView.setText(ai.a(this.f8091o, this.f8092p, jA2));
        }
        k kVar = this.f8090n;
        if (kVar != null) {
            kVar.setDuration(jA2);
            int length2 = this.f8074ab.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.W;
            if (i13 > jArr2.length) {
                this.W = Arrays.copyOf(jArr2, i13);
                this.f8073aa = Arrays.copyOf(this.f8073aa, i13);
            }
            System.arraycopy(this.f8074ab, 0, this.W, i10, length2);
            System.arraycopy(this.f8075ac, 0, this.f8073aa, i10, length2);
            this.f8090n.a(this.W, this.f8073aa, i13);
        }
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long jO;
        if (c() && this.J) {
            an anVar = this.G;
            long jN = 0;
            if (anVar != null) {
                jN = this.f8076ad + anVar.N();
                jO = this.f8076ad + anVar.O();
            } else {
                jO = 0;
            }
            boolean z10 = jN != this.f8077ae;
            boolean z11 = jO != this.af;
            this.f8077ae = jN;
            this.af = jO;
            TextView textView = this.f8089m;
            if (textView != null && !this.M && z10) {
                textView.setText(ai.a(this.f8091o, this.f8092p, jN));
            }
            k kVar = this.f8090n;
            if (kVar != null) {
                kVar.setPosition(jN);
                this.f8090n.setBufferedPosition(jO);
            }
            c cVar = this.I;
            if (cVar != null && (z10 || z11)) {
                cVar.a(jN, jO);
            }
            removeCallbacks(this.f8095s);
            int iT = anVar == null ? 1 : anVar.t();
            if (anVar == null || !anVar.a()) {
                if (iT == 4 || iT == 1) {
                    return;
                }
                postDelayed(this.f8095s, 1000L);
                return;
            }
            k kVar2 = this.f8090n;
            long jMin = Math.min(kVar2 != null ? kVar2.getPreferredUpdateDelay() : 1000L, 1000 - (jN % 1000));
            float f10 = anVar.D().f4253b;
            postDelayed(this.f8095s, ai.a(f10 > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? (long) (jMin / f10) : 1000L, this.O, 1000L));
        }
    }

    private void l() {
        View view;
        View view2;
        boolean zN = n();
        if (!zN && (view2 = this.f8081e) != null) {
            view2.requestFocus();
        } else {
            if (!zN || (view = this.f8082f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void m() {
        View view;
        View view2;
        boolean zN = n();
        if (!zN && (view2 = this.f8081e) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (!zN || (view = this.f8082f) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private boolean n() {
        an anVar = this.G;
        return (anVar == null || anVar.t() == 4 || this.G.t() == 1 || !this.G.x()) ? false : true;
    }

    public void a() {
        if (!c()) {
            setVisibility(0);
            Iterator<d> it = this.f8078b.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            e();
            l();
            m();
        }
        d();
    }

    public void a(d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.f8078b.add(dVar);
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        an anVar = this.G;
        if (anVar == null || !a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (anVar.t() == 4) {
                return true;
            }
            this.H.e(anVar);
            return true;
        }
        if (keyCode == 89) {
            this.H.d(anVar);
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            a(anVar);
            return true;
        }
        if (keyCode == 87) {
            this.H.c(anVar);
            return true;
        }
        if (keyCode == 88) {
            this.H.b(anVar);
            return true;
        }
        if (keyCode == 126) {
            b(anVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        c(anVar);
        return true;
    }

    public void b() {
        if (c()) {
            setVisibility(8);
            Iterator<d> it = this.f8078b.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            removeCallbacks(this.f8095s);
            removeCallbacks(this.f8096t);
            this.V = -9223372036854775807L;
        }
    }

    public void b(d dVar) {
        this.f8078b.remove(dVar);
    }

    public boolean c() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f8096t);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public an getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public boolean getShowShuffleButton() {
        return this.U;
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public boolean getShowVrButton() {
        View view = this.f8087k;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j10 = this.V;
        if (j10 != -9223372036854775807L) {
            long jUptimeMillis = j10 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                b();
            } else {
                postDelayed(this.f8096t, jUptimeMillis);
            }
        } else if (c()) {
            d();
        }
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.f8095s);
        removeCallbacks(this.f8096t);
    }

    @Deprecated
    public void setControlDispatcher(com.applovin.exoplayer2.i iVar) {
        if (this.H != iVar) {
            this.H = iVar;
            g();
        }
    }

    public void setPlayer(an anVar) {
        boolean z10 = true;
        com.applovin.exoplayer2.l.a.b(Looper.myLooper() == Looper.getMainLooper());
        if (anVar != null && anVar.r() != Looper.getMainLooper()) {
            z10 = false;
        }
        com.applovin.exoplayer2.l.a.a(z10);
        an anVar2 = this.G;
        if (anVar2 == anVar) {
            return;
        }
        if (anVar2 != null) {
            anVar2.b(this.f8072a);
        }
        this.G = anVar;
        if (anVar != null) {
            anVar.a(this.f8072a);
        }
        e();
    }

    public void setProgressUpdateListener(c cVar) {
        this.I = cVar;
    }

    public void setRepeatToggleModes(int i10) {
        int i11;
        com.applovin.exoplayer2.i iVar;
        an anVar;
        this.P = i10;
        an anVar2 = this.G;
        if (anVar2 != null) {
            int iY = anVar2.y();
            if (i10 != 0 || iY == 0) {
                i11 = 2;
                if (i10 == 1 && iY == 2) {
                    this.H.a(this.G, 1);
                } else if (i10 == 2 && iY == 1) {
                    iVar = this.H;
                    anVar = this.G;
                }
            } else {
                iVar = this.H;
                anVar = this.G;
                i11 = 0;
            }
            iVar.a(anVar, i11);
        }
        h();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.R = z10;
        g();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.K = z10;
        j();
    }

    public void setShowNextButton(boolean z10) {
        this.T = z10;
        g();
    }

    public void setShowPreviousButton(boolean z10) {
        this.S = z10;
        g();
    }

    public void setShowRewindButton(boolean z10) {
        this.Q = z10;
        g();
    }

    public void setShowShuffleButton(boolean z10) {
        this.U = z10;
        i();
    }

    public void setShowTimeoutMs(int i10) {
        this.N = i10;
        if (c()) {
            d();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.f8087k;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.O = ai.a(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f8087k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            a(getShowVrButton(), onClickListener != null, this.f8087k);
        }
    }
}
