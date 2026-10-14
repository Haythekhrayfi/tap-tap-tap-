package t9;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import fd.j0;
import java.util.List;
import y9.f7;
import y9.q2;
import y9.x1;

/* JADX INFO: loaded from: classes2.dex */
public class q<ACTION> extends e implements t9.c.b<ACTION> {
    public t9.c.b.a<ACTION> I;
    public List<? extends t9.c.g.a<ACTION>> J;
    public l9.g K;
    public String L;
    public f7.f M;
    public b N;
    public boolean O;

    public class a implements e.c {
        public a() {
        }

        @Override // t9.e.c
        public void a(e.f fVar) {
        }

        @Override // t9.e.c
        public void b(e.f fVar) {
            t9.c.b.a<ACTION> aVar = q.this.I;
            if (aVar == null) {
                return;
            }
            t9.c.this.f35730d.setCurrentItem(fVar.f35810b);
        }

        @Override // t9.e.c
        public void c(e.f fVar) {
            q qVar = q.this;
            if (qVar.I == null) {
                return;
            }
            int i10 = fVar.f35810b;
            List<? extends t9.c.g.a<ACTION>> list = qVar.J;
            if (list != null) {
                t9.c.g.a<ACTION> aVar = list.get(i10);
                ACTION actionA = aVar == null ? null : aVar.a();
                if (actionA != null) {
                    t9.c.this.f35737k.a(actionA, i10);
                }
            }
        }
    }

    public interface b {
    }

    public static class c implements l9.f<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f35843a;

        public c(Context context) {
            this.f35843a = context;
        }

        @Override // l9.f
        public View a() {
            return new s(this.f35843a);
        }
    }

    public q(Context context) {
        this(context, null, 0);
    }

    public q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public q(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.O = false;
        setTabMode(0);
        setTabIndicatorHeight(0);
        setOnTabSelectedListener(new a());
        l9.d dVar = new l9.d();
        dVar.f33033a.put("TabTitlesLayoutView.TAB_HEADER", new c(getContext()));
        this.K = dVar;
        this.L = "TabTitlesLayoutView.TAB_HEADER";
    }

    @Override // t9.c.b
    public void a(int i10, float f10) {
    }

    @Override // t9.c.b
    public void b(l9.g gVar, String str) {
        this.K = gVar;
        this.L = str;
    }

    @Override // t9.c.b
    public void c(int i10) {
        e.f fVar;
        if (getSelectedTabPosition() == i10 || (fVar = this.f35761c.get(i10)) == null) {
            return;
        }
        fVar.a();
    }

    @Override // t9.c.b
    public void d(List<? extends t9.c.g.a<ACTION>> list, int i10, v9.d dVar, f9.b bVar) {
        p7.d dVarE;
        this.J = list;
        q();
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            i10 = 0;
        }
        int i11 = 0;
        while (i11 < size) {
            e.f fVarO = o();
            fVarO.b(list.get(i11).getTitle());
            s sVar = fVarO.f35812d;
            f7.f fVar = this.M;
            if (fVar != null) {
                j0.i(sVar, "<this>");
                j0.i(dVar, "resolver");
                j0.i(bVar, "subscriber");
                n8.s sVar2 = new n8.s(fVar, dVar, sVar);
                bVar.d(fVar.f40046h.e(dVar, sVar2));
                bVar.d(fVar.f40047i.e(dVar, sVar2));
                v9.b<Long> bVar2 = fVar.f40054p;
                if (bVar2 != null && (dVarE = bVar2.e(dVar, sVar2)) != null) {
                    bVar.d(dVarE);
                }
                sVar2.invoke(null);
                sVar.setIncludeFontPadding(false);
                x1 x1Var = fVar.f40055q;
                n8.t tVar = new n8.t(sVar, x1Var, dVar, sVar.getResources().getDisplayMetrics());
                bVar.d(x1Var.f44033b.e(dVar, tVar));
                bVar.d(x1Var.f44034c.e(dVar, tVar));
                bVar.d(x1Var.f44035d.e(dVar, tVar));
                bVar.d(x1Var.f44032a.e(dVar, tVar));
                tVar.invoke(null);
                v9.b<q2> bVar3 = fVar.f40050l;
                if (bVar3 == null) {
                    bVar3 = fVar.f40048j;
                }
                bVar.d(bVar3.f(dVar, new n8.q(sVar)));
                v9.b<q2> bVar4 = fVar.f40040b;
                if (bVar4 == null) {
                    bVar4 = fVar.f40048j;
                }
                bVar.d(bVar4.f(dVar, new n8.r(sVar)));
            }
            g(fVarO, i11 == i10);
            i11++;
        }
    }

    @Override // t9.e, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.O = true;
        }
        return zDispatchTouchEvent;
    }

    @Override // t9.c.b
    public void e(int i10) {
        e.f fVar;
        if (getSelectedTabPosition() == i10 || (fVar = this.f35761c.get(i10)) == null) {
            return;
        }
        fVar.a();
    }

    @Override // t9.c.b
    public ViewPager.j getCustomPageChangeListener() {
        e.g pageChangeListener = getPageChangeListener();
        pageChangeListener.f35815c = 0;
        pageChangeListener.f35814b = 0;
        return pageChangeListener;
    }

    @Override // t9.e
    public s m(Context context) {
        return (s) this.K.b(this.L);
    }

    @Override // t9.e, android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        b bVar = this.N;
        if (bVar == null || !this.O) {
            return;
        }
        com.applovin.exoplayer2.a.e eVar = (com.applovin.exoplayer2.a.e) bVar;
        n8.d dVar = (n8.d) eVar.f3947d;
        i8.k kVar = (i8.k) eVar.f3948e;
        int i14 = n8.d.f33639k;
        j0.i(dVar, "this$0");
        j0.i(kVar, "$divView");
        dVar.f33645f.s(kVar);
        this.O = false;
    }

    @Override // t9.c.b
    public void setHost(t9.c.b.a<ACTION> aVar) {
        this.I = aVar;
    }

    public void setOnScrollChangedListener(b bVar) {
        this.N = bVar;
    }

    public void setTabTitleStyle(f7.f fVar) {
        this.M = fVar;
    }

    @Override // t9.c.b
    public void setTypefaceProvider(y7.a aVar) {
        this.f35770l = aVar;
    }
}
